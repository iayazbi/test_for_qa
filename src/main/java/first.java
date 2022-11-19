import java.util.Scanner;
import java.io.IOException;
public class first {

    public static void main (String[] args) throws IOException {
        String  b = "Apple";

        System.out.println("What kind of fruit do I like?");
        System.out.print("Try to guess:");

        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();

        if (a.equalsIgnoreCase(b)){ //проверяет equalsIgnoreCase string \\
            System.out.println("Excellent");
        }
        else{
            System.out.println("Try to next time");
        }
        System.out.println("Input your number");
        int c = 0;
        while (c < 10){
            c++;
            if ((c%2) !=0) continue;
            System.out.println(c);

        }
    }

}
