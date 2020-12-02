package com.bizarreanimals.taotie.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "banner")
public class Banner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 32)
    private String name;

    @Transient
    private String description;

    private String img;

    private String title;

    @OneToMany(mappedBy = "banner", fetch = FetchType.EAGER)
    @org.hibernate.annotations.ForeignKey(name = "null")
//    @JoinColumn(name = "bannerId")
    private List<BannerItem> items;

}

// 让模型类变成数据库中的一张表
