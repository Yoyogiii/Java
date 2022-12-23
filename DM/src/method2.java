import java.util.Scanner;
public class method2 {
        public static int add(int x, int y){
           int z=x+y;
            return z;
        }
        public static int sub(int x, int y){
            int z=x-y;
            return z;
        }
    public static int mul(int x, int y){
        int z=x*y;
        return z;
    }
    public static int div(int x, int y){
        int z=x/y;
        return z;
    }

        public static void main(String[] args) {
            Scanner y=new Scanner(System.in);
            System.out.println("Choose any One");
            System.out.println("1.add,2.sub,3.mul,4.div");
            int a=y.nextInt(); //a=4
            switch (a)
            {
                case 1:
                    int b=add(5,5);
                    System.out.println(b);
                    break;

                case 2:
                    int c=sub(5,10);
                    System.out.println(c);
                    break;
                case 3:
                    int d=mul(5,5);
                    System.out.println(d);
                    break;
                case 4:
                    int e=div(20,5);
                    System.out.println(e);
                    break;
                default:
                    System.out.println("Invalid");

        }
        }

}
