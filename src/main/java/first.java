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
        System.out.println("output of even numbers");
        int c = 0;
        while (c < 10){
            c++;
            if ((c%2) !=0) continue;
            System.out.println(c);

        }
        System.out.println("Bubble sort");
        int [] nums = { 2, 8, 4, 148, 97, 874, 44, 12};
        int temp;
        boolean sorted = false;

        while (!sorted){ // делать пока это тру
            sorted = true;
            for (int i = 0; i < nums.length -1; i++) {
                if (nums[i] > nums[i+1]){
                    temp = nums[i]; // временно заменяю первый индекс что бы не пропал
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                    sorted = false; // что бы ещё раз прогнать цикл
                }
            }

        }
        for (int i : nums){ // для вывода массива что бы не перебирать массив
            System.out.println(i);
        }

        System.out.println("Cars in my garage");
        car bmw = new car(150, 200, "e36");

        bmw.getName();
        bmw.getPower();
        bmw.getSpeed();
    }

}
