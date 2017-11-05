package online.smartcompute.demoapp.controller;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.ldap.userdetails.LdapUserDetailsImpl;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import online.smartcompute.logging.AppLogger;

@RestController
public class DemoController {

	private static final AppLogger LOGGER = AppLogger.logger(DemoController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "text/plain")
	public String index() {
		UsernamePasswordAuthenticationToken authentication = (UsernamePasswordAuthenticationToken) SecurityContextHolder
				.getContext().getAuthentication();
		LdapUserDetailsImpl principal = (LdapUserDetailsImpl) authentication.getPrincipal();
		return "Spring Security + Spring LDAP Authentication Configuration Example";
	}

	@RequestMapping(value = "hello/{name}", method = RequestMethod.GET, produces = "text/plain")
	public String sayHello(@PathVariable(value = "name", required = true) String name) {
		LOGGER.appendStartLog("sayHello");
		LOGGER.appendInfo("this is a info message");
		return "Hello " + name;
	}

}
