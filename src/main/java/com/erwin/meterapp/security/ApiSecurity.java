package com.erwin.meterapp.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class ApiSecurity extends WebSecurityConfigurerAdapter {
    // I know, very insecure, for now this serves its purpose to speed up development
    private final String password = "GtsGLTb9kLpWxBQRwb4S6XzKgC9qvFUseDTyKFKDV4GRkA6VPkHxkSqXUV6eP4vGW6taR3wy7G7PjY4Mxwf3QDaA9cYY3jkTE8z2tbHnKQ89xev3j9becfqRf2uCnLqKuC5a7gw5hnwBRDTTYFkdnkEBAzmfy4U4sePWzNjfdcrkASmCLDZ6kZJeRuVXqjn5hR3jbqK2mfE7J9kXfbrsb2uPxDGz3sP9tyV2684haZu8qUSNE94HqgzgdSbPtfP5";

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests().anyRequest().authenticated()
                .and()
                .httpBasic();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth)
            throws Exception {
        auth.inMemoryAuthentication()
                .withUser("ApiUser")
                .password("{noop}" + this.password)
                .roles("USER");
    }
}