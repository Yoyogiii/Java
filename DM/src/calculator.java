import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
class check {
    public static int cal(int x, int y, int w) {
        System.out.println("Enter Value addition");
        int add = x + y + w;
        return add;
    }
    public static int cal(int x, int y) {
        System.out.println(" subraction");
        int sub = x - y;
        return sub;
    }
    public static int cal(int p, int q, int r, int s) {
        System.out.println(" multiplication");
        int mul = p * q * r * s;
        return mul;
    }
    public static double cal(int p) {
        int o = 100;
        System.out.println(" Division");
        int div = p / o;
        return div;
    }
}

public class calculator {
        public static void main(String[] args) {   //main
            System.out.println(check.cal(5,20,20));
            System.out.println(check.cal(50,20));
            System.out.println(check.cal(2,2,2,2));
            System.out.println(check.cal(10));
        }
}



