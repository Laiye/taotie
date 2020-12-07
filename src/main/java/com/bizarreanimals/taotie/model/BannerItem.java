package com.bizarreanimals.taotie.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "banner_item", schema = "taotie", catalog = "")
@Getter
@Setter
public class BannerItem {

    @Id
    private Long id;
    private String img;
    private String keyword;
    private short type;
    private Date createTime;
    private Date updateTime;
    private Date deleteTime;
    private Long bannerId;
    private String name;
}
