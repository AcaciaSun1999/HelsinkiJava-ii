
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String>input = new ArrayList<>();
        while(true){
            String line = scanner.nextLine();
            if(line.equals("")){
                break;
            }
            input.add(line);
        }
        
        input.stream()
                .forEach(s -> System.out.println(s));

    }
}
