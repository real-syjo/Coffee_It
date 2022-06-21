package src.com.coffee.domain.user.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import src.com.coffee.domain.user.domain.User;

@RestController
public class UserApi {

		@RequestMapping(value="/test", method=RequestMethod.GET)
		public ModelAndView getUser() {
			User user = new User();
			
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("user", user);
			
			return modelAndView;
		}
}
