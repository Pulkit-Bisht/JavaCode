package com.Oodles.jwt_token.controller;

import com.Oodles.jwt_token.model.CreatedToken;
import com.Oodles.jwt_token.model.MyUserName;
import com.Oodles.jwt_token.service.HelloDetailsService;
import com.Oodles.jwt_token.util.TokenGenerate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenGenerate tokenGenerate;

    @Autowired
    private HelloDetailsService helloDetailsService;


  @RequestMapping(value = "/token",method = RequestMethod.POST)

    public ResponseEntity<?> generateToken(@RequestBody MyUserName myUserName) throws Exception {

        System.out.println(myUserName);
        try {
            this.authenticationManager.
                    authenticate(new UsernamePasswordAuthenticationToken(myUserName.getUsername(),myUserName.getPassword()));
        }
        catch (UsernameNotFoundException e){
            e.printStackTrace();
            throw new Exception("Bad Credential");
        }
        catch (BadCredentialsException e){
            e.printStackTrace();
            throw new Exception("Hello");
        }
        UserDetails userDetails= this.helloDetailsService.loadUserByUsername(myUserName.getUsername());
        String token=this.tokenGenerate.generateToken(userDetails);
        System.out.println("My Token "+token);

        return ResponseEntity.ok(new CreatedToken(token));

    }
}
