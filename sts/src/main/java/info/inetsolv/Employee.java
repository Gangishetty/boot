package info.inetsolv;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="employee_tbl",schema="system")
@SequenceGenerator(name="EMP_SEQ_ENO",sequenceName="EMP_SEQ_ENO",allocationSize=1,initialValue=1)
public class Employee {
		@Id
		@GeneratedValue(generator="EMP_SEQ_ENO",strategy=GenerationType.SEQUENCE)
		private Integer eno;
		private String name;
		private Double salary;
		
		public Employee() {
			super();
		}
		public Employee(Integer eno, String name, Double salary) {
			super();
			this.eno = eno;
			this.name = name;
			this.salary = salary;
		}
		public Integer getEno() {
			return eno;
		}
		public void setEno(Integer eno) {
			this.eno = eno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Double getSalary() {
			return salary;
		}
		public void setSalary(Double salary) {
			this.salary = salary;
		}
		
}
