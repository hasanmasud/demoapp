package online.smartcompute.dempapp.config;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

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
