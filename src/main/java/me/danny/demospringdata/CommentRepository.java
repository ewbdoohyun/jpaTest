package me.danny.demospringdata;

import java.util.List;

// 일부만 쓰고 싶을 때
public interface CommentRepository extends MyRepository<Comment, Long> {

    Comment save(Comment comment);

    List<Comment> findAll();
}
