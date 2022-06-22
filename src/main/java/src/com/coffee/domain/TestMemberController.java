package src.com.coffee.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestMemberController {
	@Autowired
	private TestMemberDao memberDao;
	
	@GetMapping("/test")
	public String index() {
		System.out.println("@@@@@ /test 호출 성공 @@@@@");
		//memberDao.save(new TestMember("m002", "1234", "test@gmail.com"));
		
		return "test";
	}
	
}
