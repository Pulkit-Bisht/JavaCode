package com.myproject.configuration;

import com.myproject.service.impl.PersonAuth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class PersonConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    PersonFilter jwtFilter;
    @Autowired
    private PersonAuth personAuth;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(personAuth);
    }
    private static final String[] AUTH_WHITELIST = {
            "/swagger-resources/**",
            "/swagger-ui.html",
            "/v2/api-docs",
            "/webjars/**"
    };
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers(AUTH_WHITELIST);
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        //Because we permit token url for everyone and hence we
        //write to some logic for generate the token
        //For this we need dependency know as=> jjwt
        //if upper than java 8 require one more dependency => jaxb-api
        //For Token generate util class require
        http.csrf().disable().cors().disable().
                authorizeRequests().antMatchers("/token").permitAll().
                anyRequest().authenticated().and().sessionManagement().
                sessionCreationPolicy(SessionCreationPolicy.STATELESS);

        http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);

    }

    @Bean
    public PasswordEncoder passwordEncoder()

    {
        return NoOpPasswordEncoder.getInstance();
    }
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception{
        return super.authenticationManagerBean();
    }
}
