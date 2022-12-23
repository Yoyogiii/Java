import java.util.Scanner;
class circle1 {
    int rad;
    public void abc(int radius){ //rad=radius=a
        this.rad=radius; //rad=radius=5
    }
    public int bcd(){
        return rad;
    }
    public float area()
    {
        float z=3.14f*rad*rad;
        return z;
    }
}
public class getter_setter {
    public static void main(String[] args) {
        circle1 c=new circle1();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Radius");
        int a= sc.nextInt();
        c.abc(a);
        c.area();
        System.out.println(c.bcd());
        System.out.println(c.area());


    }
}

