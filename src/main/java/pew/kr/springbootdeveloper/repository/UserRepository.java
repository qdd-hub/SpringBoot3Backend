package pew.kr.springbootdeveloper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pew.kr.springbootdeveloper.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
