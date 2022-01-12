package Training;

public class EmployeeYashwanth {
	
	public int empid;
	public String empname;
	public int empsal;
	private int salcal;
	
	public void display() {
		
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empsal);
	}
	public void salcal() {
		salcal= empsal-2000;
		System.out.println(salcal);
		
	}
	public class manager extends EmployeeYashwanth{
		
		public void salcal() {
			salcal= empsal-2000;
			System.out.println(salcal);
		}
	}
	public class developer extends EmployeeYashwanth{
		
		public void salcal() {
			salcal= empsal-2000;
			System.out.println(salcal);
		}
	}
	public class tester extends EmployeeYashwanth{
		
		public void salcal() {
			salcal= empsal-2000;
			System.out.println(salcal);
		}
	}
	public static void main(String[] args) {
		EmployeeYashwanth emp = new EmployeeYashwanth();
		 tester tes=emp.new tester();
		 emp.empid=21509;
		 emp.empname="yashwanth";
		 emp.empsal=12000;
		 emp.salcal();
		 emp.display();
		 
		
	}

}