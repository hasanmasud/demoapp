package online.smartcompute.demoapp.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Home redirection to swagger api documentation
 */
@Controller
public class HomeController {
	@RequestMapping(value = { "/", "/home" })
	public String index() {
		return "redirect:swagger-ui.html";
	}
}
