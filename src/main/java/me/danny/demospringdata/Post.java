package me.danny.demospringdata;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Primary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
@ToString
@Setter
@Getter
public class Post {

    @Id
    @GeneratedValue
    @Column
    private  Long id;

    @Column
    private String title;

    @OneToMany
    private Set<Comment> comments = new HashSet<>();


}
