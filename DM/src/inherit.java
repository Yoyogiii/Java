import java.util.Scanner;

class multi{
    public  int cal_mul(int x, int y){
        return x*y;
    }
}
class divi extends  multi{
    public  int cal_div(int x, int y){
        return x/y;
    }
}
class modu extends divi {
    public  int cal_mo(int x, int y){
        return x%y;
    }
}
class addi extends modu {
    public  int cal_add(int x, int y){
        return x+y;
    }
}

class cal extends addi{

        public  int cal_sub(int x, int y){
            return x+y;
        }
    }

public class inherit {
    public static void main(String[] args) {
        cal c=new cal();
        int a=c.cal_sub(10,5);
        int b=c.cal_add(10,10);
        int d=c.cal_mo(10,10);
        int e=c.cal_div(10,5);
        int f=c.cal_mul(5,2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}