package me.danny.demospringdata;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import java.util.Date;
import java.util.Set;

@Entity
@Setter
@Getter
public class Account {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    private String password;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created = new Date();

    @Transient
    private String yes;

//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name="street", column = @Column(name="home_street"))
//    })
//    private Address homeAddress;        //composite한 type을 mapping
//
//    @Embedded
//    private Address officeAddress;

    @OneToMany
    private Set<Study> studySet;

}
