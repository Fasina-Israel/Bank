import java.util.Scanner; 
public class Calculator{
   public static void main(String[] args){
      Scanner inputValue = new Scanner(System.in);
    System.out.println("Enter your value for radius:");
    double radius = inputValue.nextDouble();
    System.out.println("Enter your value for length:");
     double length = inputValue.nextDouble();
     double area = (radius * radius) * (22/7.0);
     double volume = area * length;
   System.out.println("The area is " + area + " The volume is " + volume );
}
}
//Fasina Israel