package me.danny.demospringdata;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@ToString
public class Post {

    @Id @GeneratedValue
    private  long id;

    private String title;

    @OneToMany
    private Set<Comment> comments = new HashSet<>();


    public void addComment(Comment comment){
        this.getComments().add(comment);
//        comment.setPost(this);
    }
}
