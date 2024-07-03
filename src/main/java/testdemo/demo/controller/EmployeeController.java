package testdemo.demo.controller;


import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import testdemo.demo.dto.model.EmployeeDTO;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping
    public String getEmployee(){
        return "Welcome to employee";
    }

    @PostMapping
    public ResponseEntity<EmployeeDTO> saveEmployee(@Valid @RequestBody EmployeeDTO employee){
        return ResponseEntity.ok(employee);
    }
}
