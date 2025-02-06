package refactorizacion;

public class Employee {
	String name;
	int CompanyYears;
	
	/**
	 * Constructor of Employee's class
	 * @param name
	 * @param years
	 */
	public Employee(String name, int years) {
		this.name = name;
		this.CompanyYears = years;
	}
	
	/**
	 * Getter employee's name
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Getter of years in company
	 * @return CompanyYears
	 */
	public int getYears() {
		return CompanyYears;
	}
	
	/**
	 * Setter employee's name 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Setter of years in company
	 * @param years
	 */
	public void setYears(int years) {
		this.CompanyYears = years;
	}
	
	@Override
	public String toString() {
		return name + ", Years in company: " + CompanyYears;
	}
	
}
