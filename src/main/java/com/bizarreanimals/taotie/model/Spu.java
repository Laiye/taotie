package com.bizarreanimals.taotie.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Spu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String subtitle;

//    @ManyToMany
//    private List<Theme> themeList;
}
