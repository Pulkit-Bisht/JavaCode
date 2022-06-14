package com.Oodles.jwt_token.config;


import com.Oodles.jwt_token.service.HelloDetailsService;
import com.Oodles.jwt_token.util.TokenGenerate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Component
public class HelloFilter extends OncePerRequestFilter {

    @Autowired
    HelloDetailsService helloDetailsService;
    @Autowired
    TokenGenerate tokenGenerate;
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        //get jwt(Header)
        //Start with bearer
        //then validate

        String requestHeader = request.getHeader("Authorization");
        String username = null;
        String jwtToken = null;

//Null and Format Check
        if (requestHeader != null && requestHeader.startsWith("Bearer ")) {
            jwtToken = requestHeader.substring(7);
            try {
                username=this.tokenGenerate.getUserNameFromToken(jwtToken);

            } catch (Exception e) {
                e.printStackTrace();
            }
            //User details

            UserDetails userDetails= this.helloDetailsService.loadUserByUsername(username);


            //validate security

            if (username!=null && SecurityContextHolder.getContext().getAuthentication()==null){
                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken=new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());

                usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
            }
            else {
                System.out.println("Token is not validated");
            }


        }
        filterChain.doFilter(request,response);
    }
}
