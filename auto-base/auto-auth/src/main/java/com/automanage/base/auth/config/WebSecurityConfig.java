package com.automanage.base.auth.config;

import org.springframework.boot.actuate.autoconfigure.security.servlet.EndpointRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
         http//放行所有监控endpoints
            .authorizeRequests().requestMatchers(EndpointRequest.toAnyEndpoint()).permitAll()
        .and()//获取公钥请求放行
            .authorizeRequests().antMatchers("/rsa/publicKey","/oauth/logout").permitAll()
            //其它请求都要经过登录认证
            .anyRequest().authenticated()
        //跨站请求伪造禁用
        .and().csrf().disable();
    }

    /**
     *  AuthenticationManager：对用户的未授信凭据进行认证，认证通过则返回授信状态的凭据
     *  如果不配置SpringBoot会自动配置一个AuthenticationManager,覆盖掉内存中的用户
     */
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Bean
    public PasswordEncoder passwordEncoder()  {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
}
