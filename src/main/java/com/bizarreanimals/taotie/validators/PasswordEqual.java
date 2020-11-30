package com.bizarreanimals.taotie.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Constraint(validatedBy = PasswordEqualValidator.class)
public @interface PasswordEqual {

    int min() default 4;

    int max() default 6;

    String message() default "密码不相等";

    Class<?>[] groups() default {};

    Class<? extends Payload>[]  payload() default {};
}

/**
 *  注解只是个"标记"，具体的逻辑需要交由具体的关联类去实现。
 *  通过 @Constraint(validatedBy = PasswordEqualValidator.class) 指定类
 */