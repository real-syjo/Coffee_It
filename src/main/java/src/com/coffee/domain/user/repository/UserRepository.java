package src.com.coffee.domain.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import src.com.coffee.domain.user.domain.User;


@Repository
public interface UserRepository extends JpaRepository<User, String>{
//	public User findByUsername(String username);
}
