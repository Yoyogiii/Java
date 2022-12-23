import java.util.Scanner;

public class Decision {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.println("Enter the English Mark");
        int Eng= y.nextInt();
        System.out.println("Enter the Tamil Mark");
        int Tam=y.nextInt();
        System.out.println("Enter the Science Mark");
        int Sci=y.nextInt();
        System.out.println("Enter the Maths Mark");
        int Mat=y.nextInt();
        System.out.println("Enter the SocialScience Mark");
        int Ss=y.nextInt();
        System.out.println("The Total mark is");
        int avg=((Eng+Tam+Sci+Mat+Ss)/5);
        System.out.println(avg);
        if(avg>=90)
        {
            System.out.println("Very Good");
        }
        else if(avg>=70 && avg<90)
        {
            System.out.println("Good");
        }
        else {
            System.out.println("Try to get good marks");
        }
    }
}

