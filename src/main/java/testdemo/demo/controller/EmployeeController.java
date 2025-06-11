package testdemo.demo.controller;


import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import testdemo.demo.dto.model.EmployeeDTO;
import testdemo.demo.dto.model.SaleRecordDto;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping
    public String getEmployee(){
        return "Welcome to employee";
    }

//    @PostMapping
//    public ResponseEntity<EmployeeDTO> saveEmployee(@Valid @RequestBody EmployeeDTO employee){
//        return ResponseEntity.ok(employee);
//    }

    @PostMapping(
            path = "/v2/sale",
            consumes = MediaType.APPLICATION_XML_VALUE,
            produces = {MediaType.APPLICATION_XML_VALUE}  // po
    )
    public SaleRecordDto processUser(@RequestBody SaleRecordDto saleRecordDto) {
        // You can add business logic here
        return saleRecordDto; // Echoes back the user in requested format
    }
}
