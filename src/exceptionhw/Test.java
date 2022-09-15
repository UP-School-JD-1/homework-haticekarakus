package exceptionhw;

public class Test {

	public static void main(String[] args) throws SalaryPaidOnBankException {
		HR hr = new HR();
		int n = 10;
		Employee[] employees = new Employee[n];
		for (int i = 0; i < n; i++)
			employees[i] = hr.getAnEmployee();

		for (Employee e : employees) {
			System.out.println(e);
		}
		try {
			for (Employee e : employees) {
				if (e.calculateSalary() > 7000) {
					throw new SalaryPaidOnBankException(e.name + " Please get your money from bank office");
				}
			}
		} catch (SalaryPaidOnBankException e2) {
			// System.out.println(e2.getMessage());
			e2.printStackTrace();
		}

	}
}
