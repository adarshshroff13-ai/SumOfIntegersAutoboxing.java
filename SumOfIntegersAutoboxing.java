import java.util.ArrayList;
import java.util.Scanner;

public class SumOfIntegersAutoboxing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers separated by spaces:");
        String inputLine = sc.nextLine();

        String[] inputs = inputLine.split(" ");

        for (String str : inputs) {
          
            int num = Integer.parseInt(str);
            numbers.add(num);
        }

        int sum = 0;
        for (Integer n : numbers) {
            sum += n;
        }

        System.out.println("The sum of entered integers is: " + sum);

        sc.close();
    }
}
