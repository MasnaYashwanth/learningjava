package Training;

/** Create a product class The properties are ProID, ProName, ProPrice
display the information and ProPrice will be added additional tax of GST .*/

public class ProductDetails {
// initializing the Properties
int ProID;
String ProName;
double Price;
double GST;
// creating tax method
public double ProPrice() {
return Price + GST;
}
}