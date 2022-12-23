class vehicle
{
    public static void car() {
        System.out.println("BMW");
        System.out.println("Price is 20lakh");
        System.out.println("Colour is Black");
    }
    public static void bike(){
        System.out.println("KTM");
        System.out.println("Price is 2lakh");
        System.out.println("Colour is Orange");
    }
}
class Food
{
    public static void bellhotel() {
        System.out.println("Menu is");
        System.out.println("chicken");
        System.out.println("dosai");
    }
    public static void IndianFood(){
        System.out.println("Menu is");
        System.out.println("Rotti");
    }

}
public class object1 {
    public static void main(String[] args) {
        vehicle a = new vehicle();
        Food b = new Food();
       // a.car();
        a.bike();
      //  b.bellhotel();
        b.IndianFood();


    }
}
