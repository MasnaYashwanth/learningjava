package Training;
public class Shape {
    public static void main(String[] args) {

        double width = 5, length = 7;
        Shape rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting area: " + rectangle.area()
                + "\nResulting perimeter: " + rectangle.perimeter() + "\n");
        
        double width1 = 5, length1 = 5;
        Shape Square = new Square(width1, length1);
        System.out.println("Square width: " + width1 + " and length: " + length1
                + "\nResulting area: " + Square.area()
                + "\nResulting perimeter: " + Square.perimeter() + "\n");

        double a = 5, b = 4, c = 3;
        Shape triangle = new Triangle(a,b,c);
        System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c
                + "\nResulting Area: " + triangle.area()
                + "\nResulting Perimeter: " + triangle.perimeter() + "\n");
    }

	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
}