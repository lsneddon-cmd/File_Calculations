import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FIleCalculations {
    public static void main(String[] args) {
        try (BufferedReader reader =
              Files.newBufferedReader(Paths.get("../resources/dataset_91033.txt"))) {
            // int finalCount =
            //         reader.readAllLines.stream()
            //             .mapToInt(Integer::parseInt)
            //             .sum();
            String val;
            int sum = 0;

            while ((val = reader.readLine()) != null) {
              sum += Integer.parseInt(val);
            }

            System.out.println("Sum: " + sum);
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
