package info.inetsolv;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path(value="/emp")
public interface EmployeeServiceInter {
	
	@GET
	@Path(value="/allemp")
	@Produces(value={ "application/json","application/xml" })
	public List<Employee> getAllEmployee();
}
