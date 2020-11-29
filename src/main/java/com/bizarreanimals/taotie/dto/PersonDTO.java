package com.bizarreanimals.taotie.dto;

// 数据传输对象

import lombok.*;

@Getter
@Setter
public class PersonDTO {
    @NonNull
    private String name;
    private Integer age;
}
