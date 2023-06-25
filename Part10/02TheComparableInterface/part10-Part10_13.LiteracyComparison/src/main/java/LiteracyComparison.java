
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        
        try{
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .sorted((a, b) -> a[5].compareTo(b[5]))
                    .forEach(s -> System.out.println(s[3] + " (" + s[4] + "), " + s[2].split(" ")[1].trim() + ", " + s[5]));
        }catch(Exception e){
            System.out.println("Wrong");
        }

    }
    
    
}
