package com.store.sec.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//@Configuration
//@EnableWebSecurity
public class SecConf extends WebSecurityConfigurerAdapter{
/*

	//private UserDetailsService userDetailsService;

	@Autowired
	UserDetailsService userDetailsService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.userDetailsService(userDetailsService)
		.passwordEncoder(bCryptPasswordEncoder);
			
		
//		.inMemoryAuthentication()
//			.withUser("moi")
//			.password("{noop}moi")
//			.roles("admin")
//			.and()
//			.withUser("toi")
//			.password("{noop}toi")
//			.roles("user");
	}
	


	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// les admin lance post et delete,put
		//les user ne doivent pas utiliser poste , delete...
		http
		.authorizeRequests()
		.antMatchers("/api/**").permitAll()
		.anyRequest().authenticated()
		.and()
		.formLogin().permitAll();
	}
	
	
*/
}
