
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test the method here
        System.out.println("type file name with extension (\"newfile.txt\")");
        String fileName = scanner.nextLine();
        read(fileName).stream().forEach(line -> System.out.println(line));
    }

    public static List<String> read(String file) {
        ArrayList<String> list = new ArrayList<>();
        try {
            Files.lines(Paths.get(file)).forEach(line -> list.add(line));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return list;
    }

}
