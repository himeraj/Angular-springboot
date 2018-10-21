package com.raj.demo.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/employees"})
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> findAll(){
        return employeeService.findAll();
    }
    
    @PostMapping("/save")
    public void save(@RequestBody Employee e) {
    	employeeService.save(e);
    }
    
    @PostMapping("/update")
    public void update(@RequestBody Employee e) {
    	employeeService.update(e);
    }
    
    @GetMapping("/delete")
    public String delete(@RequestParam int eId) {
    	return employeeService.delete(eId);
    }
}
