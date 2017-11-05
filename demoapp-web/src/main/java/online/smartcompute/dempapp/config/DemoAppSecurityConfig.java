package online.smartcompute.dempapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.ldap.DefaultSpringSecurityContextSource;

//@Configuration
//@EnableWebSecurity
public class DemoAppSecurityConfig extends WebSecurityConfigurerAdapter {
	//
	// @Autowired
	// public void registerGlobalAuthentication(AuthenticationManagerBuilder auth)
	// throws Exception {
	// DefaultSpringSecurityContextSource context = new
	// DefaultSpringSecurityContextSource(
	// "ldap://localhost:10389/dc=example,dc=com");
	// context.afterPropertiesSet();
	//
	// auth.ldapAuthentication().contextSource(context).userSearchFilter("uid={0}").userSearchBase("ou=people");
	// }
	//
	// @Override
	// protected void configure(HttpSecurity http) throws Exception {
	// http.csrf().disable().authorizeRequests().anyRequest().authenticated().and().formLogin().permitAll();
	// }

}
