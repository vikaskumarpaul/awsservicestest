package com.awstest.services.entity.securityhandlers;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
public class ApplicationSecurity extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		/**
		 * Define Basic authetication with username and password and since we are not
		 * encrypting the password so we need to put{noop} before the password to know
		 * the spring that this is a plain text password not encrypted on. By default
		 * Spring expect eccoded password
		 * 
		 *
		 * auth.inMemoryAuthentication().withUser("Vikas").password("{noop}paul").
		 * authorities("admin").and()
		 * .withUser("Hello").password("{noop}HELLO").authorities("admin");
		 */

		String user = "select username,password,enabled from users where username = ? ";
		String authority = "select username,authority from authorities where username = ?";

		auth.jdbcAuthentication().dataSource(dataSource).passwordEncoder(NoOpPasswordEncoder.getInstance())
				.usersByUsernameQuery(user).authoritiesByUsernameQuery(authority);

	}

}
