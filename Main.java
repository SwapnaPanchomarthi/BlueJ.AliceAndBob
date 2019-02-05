/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        System.out.println("Please enter your name");
       
        String name;
        Scanner sc = new Scanner(System.in);
        name=sc.nextLine();
        
        System.out.println("The name of candidate1 is : " + name);
        if ((name.equals("Alice"))||(name.equals("Bob"))) {
            System.out.println("Hello "+ name);
        
        
        }
    }
}
