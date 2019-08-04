package com.awstest.services.entity.securityhandlers;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/*@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
//@EnableJpaRepositories(basePackageClasses = UserRepository.class)
@Configuration*/
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//	@Autowired
//	private CustomUserDetailsService userDetailsService;

	/*
	 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
	 * Exception {
	 * 
	 * auth.inMemoryAuthentication().withUser("vikas").password("Hello").roles(
	 * "ADMIN").and().withUser("paul") .password("Hello").roles("USER");
	 * 
	 * // auth.userDetailsService(userDetailsService).passwordEncoder( //
	 * getPasswordEncoder()); }
	 * 
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * 
	 * //http.csrf().;
	 * http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
	 * }
	 */
}
