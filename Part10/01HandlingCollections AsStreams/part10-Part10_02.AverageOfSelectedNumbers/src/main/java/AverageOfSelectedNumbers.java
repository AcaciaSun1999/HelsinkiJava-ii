
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        
        ArrayList<String>input = new ArrayList<>();
        while(true){
            String line = scanner.nextLine();
            if(line.equals("end")){
                break;
            }
            input.add(line);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String select = scanner.nextLine();
        
        if(select.equals("n")){
            double average = input.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(n -> n < 0)
                .average()
                .getAsDouble();
            System.out.println("Average of the negative numbers: " + average);
        }
        if(select.equals("p")){
            double average = input.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter((n -> n >= 0))
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + average);
        }
        
        

    }
}
