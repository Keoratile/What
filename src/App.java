import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner obj = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = obj.nextLine();

        // convert the user input into a lower case regardless of the format.
        if(name.toLowerCase().contains("j")) {
            System.out.println("the name " + name + " comtains letter j");
        } else {
            System.out.println("the name " + name + " does not comtain letter j");
        }
    }
}
