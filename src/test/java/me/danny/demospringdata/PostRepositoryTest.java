package me.danny.demospringdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PostRepositoryTest {

    @Autowired
    PostRepository postRepository;

    @Test
    @Rollback(false)  // rollback 방지 ( Transitional
    public void curdRepository(){
        //Given
        Post post = new Post();
        post.setTitle("Hello spring boot");
        assertTrue(post.getId()==null);

        // When
        Post newPost = postRepository.save(post);

        // Then
        assertTrue(newPost.getId().longValue()>0L);

        //when
        List<Post> posts = postRepository.findAll();

        assertTrue(posts.size() == 1);
        assertTrue(posts.contains(post));

        //When
        Page<Post> page = postRepository.findByTitleContains("spring",PageRequest.of(0,10));
        //        Page<Post> page = postRepository.findAll(PageRequest.of(0,10));
        assertTrue(page.getTotalElements()== 1L);
        assertEquals(page.getNumber(),0);
        assertEquals(page.getSize() , 10);
        assertEquals(page.getNumberOfElements(), 1);

    }
}