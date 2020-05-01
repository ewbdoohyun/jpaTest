package me.danny.demospringdata;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Component
@Transactional
public class JpaRunner implements ApplicationRunner {

    @Autowired
    PostRepository postRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        new Post();

//        TypedQuery<Post> query = entityManager.createQuery("SELECT p from Post as p",Post.class);
//        List<Post> posts = query.getResultList();
//        posts.forEach(System.out::println);
//
//        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
//

//        postRepository.
//        entityManager.persist(account);
    }
    }
