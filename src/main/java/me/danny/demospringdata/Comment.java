package me.danny.demospringdata;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Comment {

    @Id @GeneratedValue
    private Long id;

    private String title;

//    @OneToMany(mappedBy = "post")
//    private Set<Comment> comments = new HashSet<>();
}