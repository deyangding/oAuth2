package com.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        //添加客户端信息
        // 使用in-memory存储客户端信息
        clients.inMemory()
                // client_id
                .withClient("clientId")
                // client_secret
//                .secret("1234")
                //解决401 Unauthorized
                //修改认证服务配置，给密码加密
                .secret(passwordEncoder.encode("1234"))
                // 该client允许的授权类型
                .authorizedGrantTypes("authorization_code")
                // 允许的授权范围
                .scopes("all").redirectUris("https://translate.google.cn");
    }
}