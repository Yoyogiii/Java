import java.util.Scanner;

public class circle {
    public static void area(int r)
    {
        double a=3.14*r*r;//3.14*5*5
        System.out.println("Area of the circle is"+a);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of radius");
        int rad=sc.nextInt();//value is store in rad=5
        area(rad);//area(5)
    }
}
