package exceptionhw;

public class SalaryPaidOnBankException extends Exception{
	//private int salary;
	
	//public SalaryPaidOnBankException(String message, int salary) {
		//super(message);
		//this.salary=salary;
	//}
	
	public SalaryPaidOnBankException(String message) {
		super(message);
	}
	
//	public double getSalary() {
//		return salary;
//	}
}
