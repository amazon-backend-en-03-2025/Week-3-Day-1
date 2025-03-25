import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyJavaAssistant {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, whats your age?");
        int name;
        try {
            name = sc.nextInt();
        }
//        catch (InputMismatchException e){
//            System.out.println("It must be an integer");
//            sc.nextLine();
//            name = sc.nextInt();
//        }
        catch (Exception e) {
            System.out.println("Dunno why but there is an exception");
            System.out.println(e.getClass());
            name = 999;
        }


        System.out.println(name);


        FileReader fr = new FileReader("log.txt");

    }
}
