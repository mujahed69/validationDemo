package testdemo.demo.validator;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import testdemo.demo.dto.model.EmployeeDTO;
import testdemo.demo.validatorInterface.DateTimeFormat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class DateTimeFormatValidator implements ConstraintValidator<DateTimeFormat, String> {

    private String pattern;

    @Override
    public void initialize(DateTimeFormat constraintAnnotation) {
        this.pattern = constraintAnnotation.pattern();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true; // null values are validated by @NotNull
        }

        try {
            LocalDateTime.parse(value, DateTimeFormatter.ofPattern(pattern));
            return true;
        } catch (Exception e) {
            return false;
            
        }
    }

    public static List<String> getInvalidFields(Object obj) {
        List<String> invalidFields = new ArrayList<>();
        if (obj instanceof EmployeeDTO) {
            EmployeeDTO employeeDTO = (EmployeeDTO) obj;
            DateTimeFormatValidator validator = new DateTimeFormatValidator();
            if (!validator.isValid(employeeDTO.getDateOfBirth(), null)) {
                invalidFields.add("dateOfBirth");
            }
            if (!validator.isValid(employeeDTO.getJoiningDate(), null)) {
                invalidFields.add("joiningDate");
            }
            if (!validator.isValid(employeeDTO.getPreviousEmployerLWD(), null)) {
                invalidFields.add("previousEmployerLWD");
            }
        }
        return invalidFields;
    }
}
