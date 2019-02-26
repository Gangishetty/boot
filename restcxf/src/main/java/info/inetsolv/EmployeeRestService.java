package info.inetsolv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeRestService implements EmployeeServiceInter {
	@Autowired
	private Employeedao employeedao;

	@Override
	public List<Employee> getAllEmployee() {
		return (List<Employee>) employeedao.findAll();
		 
	}

}
