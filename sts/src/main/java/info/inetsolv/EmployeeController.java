package info.inetsolv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path="emp")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String displayForm(Model model) {
		model.addAttribute("employee", new Employee());
		return "form";
		}
	
	@RequestMapping(method=RequestMethod.POST)
	public String saveEmployee(Employee employee) {
		employeeService.save(employee);
		return "success";
		
		}
}
