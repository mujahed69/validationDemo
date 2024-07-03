package testdemo.demo.dto.model;

import lombok.Data;
import testdemo.demo.validatorInterface.DateTimeFormat;


@Data
public class EmployeeDTO {

    private Long id;
    private String name;

    @DateTimeFormat(message = "Date of birth should be in dd-MM-yyyy HH:mm format")
    private String dateOfBirth;

    @DateTimeFormat(message = "Joining date should be in dd-MM-yyyy HH:mm format")
    private String joiningDate;

    @DateTimeFormat(message = "Previous employer last working date should be in dd-MM-yyyy HH:mm format")
    private String previousEmployerLWD;

}
