package src.com.coffee.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="member")
public class TestMember {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String userid;
	
	private String password;
	private String email;
	
	public TestMember(String string, String string2, String string3) {
		
	}
}
