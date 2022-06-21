package src.com.coffee.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestMemberDao extends JpaRepository<TestMember, String>{

}
