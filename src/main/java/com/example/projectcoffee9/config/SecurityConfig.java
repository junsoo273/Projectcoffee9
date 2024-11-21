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
        // In-Memory 사용자 정보 설정
        UserDetails user = User.withUsername("admin") // 사용자 이름
                .password("{noop}1234") // 비밀번호 (noop은 비밀번호 암호화 비활성화)
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
                .formLogin(form -> form
                        .loginPage("/login") // 사용자 정의 로그인 페이지 설정
                        .defaultSuccessUrl("/", true) // 로그인 성공 시 루트로 이동
                        .permitAll() // 로그인 페이지 접근 허용
                )
                .logout(logout -> logout
                        .logoutUrl("/logout") // 로그아웃 URL 설정
                        .logoutSuccessUrl("/login") // 로그아웃 후 로그인 페이지로 이동
                        .permitAll() // 로그아웃 URL 접근 허용
                );
        return http.build();
    }
}
