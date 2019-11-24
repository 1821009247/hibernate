package com.shenlanhaiyu.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_user")
public class user {
    @Id
    private Integer id;
    private String name;
    private String password;
}
