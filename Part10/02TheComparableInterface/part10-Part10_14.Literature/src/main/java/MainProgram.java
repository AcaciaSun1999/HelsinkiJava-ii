
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Books>bookList = new ArrayList<>();
        
        while(true){
            System.out.println("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.println("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());
            bookList.add(new Books(name,age));
        }
        
        Comparator<Books> comparator = Comparator
                .comparing(Books :: getAge)
                .thenComparing(Books :: getName);
        
        Collections.sort(bookList, comparator);
        
        System.out.println(bookList.size() + " books in total.");
        System.out.println("");
        System.out.println("Books: ");
        for(Books e : bookList){
            System.out.println(e);
        }

    }

}
