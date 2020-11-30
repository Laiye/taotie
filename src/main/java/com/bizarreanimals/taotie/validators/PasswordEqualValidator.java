package com.bizarreanimals.taotie.validators;

import com.bizarreanimals.taotie.dto.PersonDTO;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordEqualValidator implements ConstraintValidator<PasswordEqual, PersonDTO> {

    @Override
    public boolean isValid(PersonDTO personDTO, ConstraintValidatorContext constraintValidatorContext) {
        // 示例代码，并不严谨。
        String password1 = personDTO.getPassword1();
        String password2 = personDTO.getPassword2();
        boolean match = password1.equals(password2);
        return match;
    }
}


// 第一个参数：自定义注解的类型
// 第二个参数：自定义注解修饰的目标的类型