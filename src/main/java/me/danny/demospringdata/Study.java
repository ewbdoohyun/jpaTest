package me.danny.demospringdata;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Study {

    @Id @GeneratedValue
    private  Long id;

    @Column(nullable = false, unique = true)
    private String username;


//    private String password;

}
