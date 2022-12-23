import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        int i;
        int j;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The Value of i");
        i = Integer.parseInt(br.readLine());
        System.out.println(i);
    }
}
