package com.bizarreanimals.taotie.dto;

// 数据传输对象

import com.bizarreanimals.taotie.validators.PasswordEqual;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;

@Getter
@Setter
@PasswordEqual
public class PersonDTO {

    @Length(min = 2, max = 10)
    private String name;

    private Integer age;

    @Valid
    private SchoolDTO schoolDTO;

    private String password1;
    private String password2;
}
