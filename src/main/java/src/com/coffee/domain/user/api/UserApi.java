package src.com.coffee.domain.user.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import src.com.coffee.domain.user.dao.UserDao;

@Controller
public class UserApi {
	@Autowired
	private UserDao userDao;
	
	@GetMapping("/joinForm")
	public String joinForm() {
		System.out.println("@@@ /joinForm 호출 성공 @@@");
		
		return "joinForm";
	}
	
}
