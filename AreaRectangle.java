import java.util.Scanner;
class AreaRectangle {
public static void main(String[] args) {
	Scanner get= new Scanner(System.in);
	float length;
	float width;
	float area;
	System.out.println("Enter the Length of Rectangle");
	length=get.nextFloat();
	System.out.println("Enter the width of Rectangle");
	width=get.nextFloat();
	area=length*width;
	System.out.print("The area of Rectangle is " + area);
}
}
