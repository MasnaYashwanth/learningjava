package Training;
import java.util.ArrayList;
  public class SecondElementReplace {
    public static void main(String[] args){
  ArrayList<String>  color = new ArrayList<String>();

  color.add("Violet");
  color.add("Indigo");
  color.add("Blue");
  color.add("Green");
  color.add("Yellow");
  color.add("Orange");
  color.add("Red");

  System.out.println("Original array list: " + color);
  String new_color = "Black";
  color.set(1,new_color);

  int num=color.size();
  //System.out.println("Replaced array list: " + new_color);//
  System.out.println("Second element is replaced with Black.");
  for(int i=0;i<num;i++)
    System.out.println(color.get(i));
  }
}