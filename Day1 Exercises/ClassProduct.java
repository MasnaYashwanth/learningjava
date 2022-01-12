package Training;

/** Create a product class The properties are ProID, ProName, ProPrice
display the information and ProPrice will be added additional tax of GST .*/

public class ClassProduct {
// initializing the Properties
int ProID;
String ProName;
double Price;
double GST;
// creating tax method
public double ProPrice() {
return Price + GST;
}
public static void main(String[] args) {
//creating object for product class
ClassProduct p1 = new ClassProduct();
p1.ProID = 21509;
p1.ProName="phone";
p1.Price=13000;
p1.GST= p1.Price/18;
// displaying the product information
System.out.println(" the product ID is " + p1.ProID + " "+ "the product name is " + p1.ProName + " "+ "the price of phone is " + p1.Price);
System.out.println( "the price of phone After adding the GST Tax Price is " + p1.ProPrice());

}

}