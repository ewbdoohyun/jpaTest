package me.danny.demospringdata;

import org.springframework.data.jpa.repository.Query;

import java.util.List;

// 일부만 쓰고 싶을
public interface CommentRepository extends MyRepository<Comment, Long> {

    Comment save(Comment comment);

    List<Comment> findAll();

    @Query("SELECT c FROM Comment AS c")
    List<Comment> findByTitleContains(String keyword);
}
