import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {

                ArrayList<String> cars = new ArrayList<String>();
                cars.add("Volvo");
                cars.add("BMW");
                cars.add("Ford");
                cars.add("Mazda");
                System.out.println(cars);
                System.out.println(cars.get(3));
                System.out.println(cars.size());
                System.out.println(cars.isEmpty());
                cars.remove(3);
                System.out.println(cars);
            }
        }

