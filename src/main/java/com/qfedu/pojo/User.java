package com.qfedu.pojo;

import lombok.Data;

import java.util.Set;

@Data
public class User {
    private int uid;
    private String username;
    private String password;
    private String addr;
    private String email;
    private int tel;
    private Set<Role> rs;
}
