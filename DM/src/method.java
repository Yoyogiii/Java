class trial
{
    static int add(int x, int y){
        int z=x+y;
        return z;
     }
    static int sub(int x, int y){
        int z=x-y;
        return z;
    }
    static int mul(int x, int y){
        int z=x*y;
        return z;
    }
    static int div(int x, int y){
        int z=x/y;
        return z;
    }
}
public class method{
    public static void main(String[] args) {
        int a=trial.add(20,20);
        int b=trial.sub(40,20);
        int c=trial.mul(2,20);
        int d=trial.div(20,4);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
