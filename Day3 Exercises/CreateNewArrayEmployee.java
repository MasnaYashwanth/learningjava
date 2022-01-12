package Training;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


	public class CreateNewArrayEmployee {
		public static void main(String args[]){

			CreateNewArray e1=new CreateNewArray(21507,"Yashvanth",10000);
			CreateNewArray e2=new CreateNewArray(21509,"Yashwanth",10000);
			List<CreateNewArray> array=new ArrayList<CreateNewArray>();
				array.add(e1);
				array.add(e2);
			Iterator<CreateNewArray> data=array.iterator();
			
			while(data.hasNext()){
				CreateNewArray emp=(CreateNewArray)data.next();
				System.out.println(emp.EmpId+" "+ emp.EmpName+" "+ emp.EmpSal);
}
}
}