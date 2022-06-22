package src.com.coffee.domain.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import src.com.coffee.domain.user.domain.User;

@Repository
public interface UserDao extends JpaRepository<User, String>{

}
