import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {
        int i=0;
        Scanner y=new Scanner(System.in);
     //   System.out.println("Enter The Number");
        int num=y.nextInt();
        while (i<11)
        {
            System.out.println(num*i);
            i++;
        }
    }
}
//for(int i=0;i<10;i++)