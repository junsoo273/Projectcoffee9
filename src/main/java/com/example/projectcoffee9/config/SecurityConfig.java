package com.example.projectcoffee9.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails user = User.withUsername("admin") // 사용자 이름
                .password("{noop}1234") // 비밀번호 (noop은 암호화를 비활성화)
                .roles("USER") // 역할 지정
                .build();
        return new InMemoryUserDetailsManager(user);
    }

    @Bean
    public org.springframework.security.web.SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // CSRF 비활성화
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().authenticated() // 모든 요청에 인증 필요
                )
                .formLogin(form -> form.defaultSuccessUrl("/", true)) // 기본 로그인 화면 활성화
                .httpBasic(httpBasic -> {}); // HTTP Basic 인증 활성화
        return http.build();
    }
}
