package info.inetsolv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepo employeeRepo;
	
	public void save(Employee employee) {
		employeeRepo.save(employee);
	}
}
