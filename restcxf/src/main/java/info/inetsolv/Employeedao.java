package info.inetsolv;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Employeedao extends CrudRepository<Employee, Integer> {

	

}
