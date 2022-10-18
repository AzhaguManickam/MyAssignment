package week1.day2;

public class empDetails {
	public void empName() {
	String EmpName="Manickam";
	System.out.println("Employee Name ="+ EmpName);
	}
	public void empId() {
		int empId=100;
		System.out.println("Employee ID ="+ empId);
	}
	 public void empAddress() {
	String empAddress="18/7/316 Kmarajar Nagar Surandai-9";
	System.out.println("Employee Address ="+ empAddress);
	}
	public  void empSalary() {
		double empSalary=5555.55;
		System.out.println("Employee Salary ="+ empSalary);
		
	}
	private void empPhoneNumber() {
		long empPhoneNumber=9080525057L;
		System.out.println("Employee PhoneNumber ="+ empPhoneNumber);
	}
	public static void main(String[] args) {
		empDetails Details=new empDetails();
		Details.empName();
		Details.empId();
		Details.empAddress();
		Details.empSalary();
		Details.empPhoneNumber();
	}

}
