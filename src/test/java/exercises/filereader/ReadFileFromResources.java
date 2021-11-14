package exercises.filereader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ReadFileFromResources {

    public static void main(String[] args) {

        ReadFileFromResources readFileFromResources = new ReadFileFromResources();
        String fileName = "test.txt";
        String brokenName = "ert.com";
        InputStream is = readFileFromResources.getFileFromResourceAsStream(fileName);
        printInputStream(is);
    }

    public InputStream getFileFromResourceAsStream(String fileName) {
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(fileName);
        if (inputStream == null) {
            throw new IllegalArgumentException("file is not found :-( //" + fileName);
        } else {
            return inputStream;
        }
    }

    public static void printInputStream(InputStream is) {
        try (InputStreamReader streamReader = new InputStreamReader(is, StandardCharsets.UTF_8);
             BufferedReader reader = new BufferedReader(streamReader)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
