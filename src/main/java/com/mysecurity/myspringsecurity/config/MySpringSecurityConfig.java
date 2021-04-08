package com.mysecurity.myspringsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class MySpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        System.out.println("Using default configure(HttpSecurity). If subclassed this will potentially override subclass configure(HttpSecurity).");

        http.authorizeRequests()
            .antMatchers("welcome").authenticated()
            .antMatchers("myAccounts").authenticated()
            .antMatchers("contactUs").permitAll().and()
            .formLogin().and()
            .httpBasic();
    }
}
