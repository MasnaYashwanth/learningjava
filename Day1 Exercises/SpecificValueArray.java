package Training;

public class SpecificValueArray {

	public static void main(String[] args) {
		int[] num = {1, 2, 3, 4, 5};
	    int toFind = 8;
	    boolean found = false;

	    for (int n : num) {
	      if (n == toFind) {
	        found = true;
	        break;
	      }
	    }
	    
	    if(found)
	      System.out.println(toFind + " is Found.");
	    else
	      System.out.println(toFind + " is not Found.");
	}
}
