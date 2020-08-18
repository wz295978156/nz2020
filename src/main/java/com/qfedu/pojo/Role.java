package com.qfedu.pojo;

import lombok.Data;

import java.util.Set;

@Data
public class Role {
    private int rid;
    private String rname;
    private String rdesc;
    private int r_enable;
    private Set<Permission> ps;
}
