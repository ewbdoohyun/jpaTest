package me.danny.demospringdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CommentRepositoryTest {

    @Autowired
    CommentRepository commentRepository;

    @Test
    public void crud(){
        Comment comment = new Comment();
        comment.setComment("Hello comment");
        commentRepository.save(comment);

        // 값이 없어도 비어있는 collection이 나옴.
        List<Comment> comments = commentRepository.findAll();
        assertEquals(comments.size(),1);

        long count = commentRepository.count();
        assertEquals(count,1L);

        //단일은 Optional을 쓰도록 하자
        Optional<Comment> byId = commentRepository.findById(100L);

        assertFalse(byId.isPresent());

    }
}