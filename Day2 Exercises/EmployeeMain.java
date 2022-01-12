package Training;

public class EmployeeMain {


	     public static void main(String[] args)
	     {
	          Manager m1 = new Manager("yashwanth",3000,150,300);
	          System.out.println("Manager's salary = "+ m1.getSalary() + ".");
	          Developer d1 = new Developer("yashwa",2000,100,200);
	          System.out.println("Developer's salary = "+ d1.getSalary() + ".");
	          Tester t1 = new Tester("yash",1000,50,100);
	          System.out.println("Tester's salary = "+ t1.getSalary() + ".");
	     }

}
