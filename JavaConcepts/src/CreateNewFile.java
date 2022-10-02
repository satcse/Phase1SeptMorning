import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateNewFile {
    public static void main(String[] args) throws IOException{
        createFileUsingFileClass();
        createFileUsingFileOutputStreamClass();
        createFileUsingNIO();
    }

    private static void createFileUsingFileClass() throws IOException {
        File file = new File("C:\\Users\\sathi\\Downloads\\fileDemo.txt");

        if(file.createNewFile())
        {
            System.out.println("File is created");
        }
        else
        {
            System.out.println("File already exists");
        }
    }

    private static void createFileUsingFileOutputStreamClass() throws IOException {
        String data = "Test data using File Output Stream Class";
        FileOutputStream out = new FileOutputStream("C:\\Users\\sathi\\Downloads\\fileDemoFOS.txt");
        out.write(data.getBytes());
        out.close();

    }

    private static void createFileUsingNIO() throws IOException {
        String data="Test data for file creation using NIO";
        Files.write(Paths.get("C:\\Users\\sathi\\Downloads\\fileDemoNIO.txt"),data.getBytes());
        List<String> lines = Arrays.asList("1st Line","2nd Line");

        List<String> linesOld = new ArrayList<>();
        linesOld.add("1st Line");
        linesOld.add("2nd Line");

        Files.write(Paths.get("C:\\Users\\sathi\\Downloads\\fileDemoNIO2.txt"), lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
    }
}
