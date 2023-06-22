
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<>();
        while(true){
            int line = Integer.valueOf(scanner.nextLine());
            if(line < 0){
                break;
            }
            input.add(line);
        }
        input.stream()
                .filter(s -> s >= 1 && s <= 5)
                .forEach(s -> System.out.println(s));

    }
}
