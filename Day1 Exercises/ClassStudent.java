package Training;

/** Create student class having stdID , stdName, stdClass and 
display the information of two objects*/

public class ClassStudent {
	  // initializing the attributes
             int stdID;
    		 String stdName;
    		 String stdClass;  
    
public static void main(String[] args) {

        // creating object of class Student
        ClassStudent st1 = new ClassStudent();
        ClassStudent st2 = new ClassStudent();
        st1.stdID= 21507;
        st1.stdName="Yashvanth";
        st1.stdClass="ETG";
        st2.stdID= 21509;
        st2.stdName="Yashwanth";
        st2.stdClass="ETG";
        // displaying the  students details
        System.out.println(st1.stdID + " "+ st1.stdName + " "+ st1.stdClass);
        System.out.println(st2.stdID + " "+ st2.stdName + " "+ st2.stdClass);
        
    }
  }