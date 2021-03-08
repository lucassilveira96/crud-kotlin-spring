package com.silveiradeveloper.crudkotlinspring.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.provisioning.InMemoryUserDetailsManager

@Configuration
@EnableWebSecurity
class WebSecurityConfiguration : WebSecurityConfigurerAdapter() {

    override fun configure(http: HttpSecurity) {
            http.httpBasic()
    }

    @Bean
    override fun userDetailsService(): UserDetailsService {
        val admin = User.withDefaultPasswordEncoder()
            .username("admin")
            .password("12345000")
            .roles("ADMIN")
            .build()

        val lucas = User.withDefaultPasswordEncoder()
            .username("lucas")
            .password("lucas")
            .roles("USER")
            .build()
        return InMemoryUserDetailsManager(admin,lucas)
    }


}
