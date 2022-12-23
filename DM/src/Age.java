import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        int num;
        Scanner a = new Scanner(System.in);
        System.out.println("Select Your Age");
        int age = a.nextInt();
        if (age >60)
        {
           num=3;
        }
        else if (age>30 && age<=60) //35 >30 && 35<=60
        {
            num=2;
        }
        else {
            num=1;
        }
        switch (num) {
            case 1:
                System.out.println("Focus on your job");
                break;
            case 2:
                System.out.println("Study Hard");
                break;
            case 3:
                System.out.println("Enjoy Your Life");
                break;
            default:
                System.out.println("invalid");
        }
    }
}