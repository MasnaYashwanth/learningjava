package Training;

import java.util.Arrays;
import java.util.List;

public class TwoArrayCompare {

	public static void main(String[] args) {
		 List<String> Firstlist = Arrays.asList("Violet", "Indigo", "Blue","Green","Yellow","Orange","Red");
	     List<String> Secondlist = Arrays.asList("Violet", "Indigo", "Blue","Green","Yellow","Orange","Red");

	     boolean isEqual = Firstlist.equals(Secondlist);
	     System.out.println(isEqual);

	}

}