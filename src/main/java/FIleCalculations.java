import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FIleCalculations {
    public static void main(String[] args) {
        try {
            Path pathToFile = Paths.get("src/main/resources/dataset_91033.txt");
            List<String> contents = Files.readAllLines(pathToFile);

            int finalCount =
                    contents.stream()
                        .mapToInt(Integer::parseInt)
                        .sum();

            System.out.println("Count: " + finalCount);
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
