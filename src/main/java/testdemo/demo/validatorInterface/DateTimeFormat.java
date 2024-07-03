package testdemo.demo.validatorInterface;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import testdemo.demo.validator.DateTimeFormatValidator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = DateTimeFormatValidator.class)
@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface DateTimeFormat {

    String message() default "Invalid date format";

    String pattern() default "dd-MM-yyyy HH:mm";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
