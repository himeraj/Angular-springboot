package com.raj.demo.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeApplication {

	/*@Autowired
	EmployeeService empService;*/
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}
	
	/*@Override
	public void run(String... arg0) throws IOException, URISyntaxException {
        List<Employee> list = this.empService.findAll();
        System.out.println(list.get(0).getDepartment().getDepartmentId());
    }*/
}
