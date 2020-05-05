package me.danny.demospringdata;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
@Setter
@Getter
public class Comment {

    @Id @GeneratedValue
    private Long id;

    private String title;

    private String comment;

    private Integer likeCount;

    @ManyToOne
    private Post post;
}
