package com.bizarreanimals.taotie.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Banner {

    @Id
    private long id;
    private String name;
    private String description;
    private String img;
    private String title;
}

// 让模型类变成数据库中的一张表
