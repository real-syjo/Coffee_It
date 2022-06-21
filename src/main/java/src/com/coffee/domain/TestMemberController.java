package src.com.coffee.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestMemberController {
	@Autowired
	private TestMemberDao memberDao;
	
	@GetMapping("/test")
	public String index() {
		memberDao.save(new TestMember("m001", "1234", "test@gmail.com"));
		
		return "test";
	}
	
}
