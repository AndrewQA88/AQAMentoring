package exercises.filereader;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReadFileFromResources {

    public static void main(String[] args) {

        ReadFileFromResources readFileFromResources = new ReadFileFromResources();
        File fileSafe = new File("files" + File.separator + "test.txt");
        String filePath = fileSafe.getPath();
        String brokenPath = "ert.com";
        InputStream is = readFileFromResources.getFileFromResourceAsStream(filePath);
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
     /* try with resources.
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
    }*/

    public static void printInputStream(InputStream is) {
        InputStreamReader streamReader = new InputStreamReader(is, StandardCharsets.UTF_8);
        try {
            BufferedReader reader = new BufferedReader(streamReader);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                streamReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
