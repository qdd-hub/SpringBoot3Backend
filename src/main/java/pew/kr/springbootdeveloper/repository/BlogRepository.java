package pew.kr.springbootdeveloper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pew.kr.springbootdeveloper.domain.Article;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
