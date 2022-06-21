package src.com.coffee.domain.user.domain;

public class User {
	//postgresql 연동 test
	private String key_id;
	private String key_nm;
	
	public User(String key_id, String key_nm) {
		super();
		this.key_id = key_id;
		this.key_nm = key_nm;
	}

	public User() {
	}

	public String getKey_id() {
		return key_id;
	}

	public void setKey_id(String key_id) {
		this.key_id = key_id;
	}

	public String getKey_nm() {
		return key_nm;
	}

	public void setKey_nm(String key_nm) {
		this.key_nm = key_nm;
	}

	@Override
	public String toString() {
		return "User [key_id=" + key_id + ", key_nm=" + key_nm + "]";
	}
	
}
