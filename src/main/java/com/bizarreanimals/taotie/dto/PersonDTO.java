package com.bizarreanimals.taotie.dto;

// 数据传输对象

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;

@Getter
@Setter
public class PersonDTO {

    @Length(min = 2, max = 10)
    private String name;

    private Integer age;

    @Valid
    private SchoolDTO schoolDTO;
}
