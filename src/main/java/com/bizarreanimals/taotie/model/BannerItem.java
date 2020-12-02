package com.bizarreanimals.taotie.model;

import javax.persistence.*;

@Entity
@Table(name = "banner_item")
public class BannerItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String img;

    private String keyword;

    private Short type;

    private String name;

    private Long bannerId;
}
