import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FIleCalculations {
    public static void main(String[] args) {
        try (BufferedReader reader =
              Files.newBufferedReader(Paths.get("../resources/dataset_91033.txt"))) {

            int sum = 
              reader.lines()
                .mapToInt(Integer::parseInt)
                .sum();

            System.out.println("Sum: " + sum);
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
