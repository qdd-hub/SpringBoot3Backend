package pew.kr.springbootdeveloper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pew.kr.springbootdeveloper.domain.RefreshToken;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    Optional<RefreshToken> findByuserId(Long userId);
    Optional<RefreshToken> findByRefreshToken(String refreshToken);
}
