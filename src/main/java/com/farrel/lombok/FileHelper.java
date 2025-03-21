package com.farrel.lombok;

import lombok.Cleanup;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHelper {

    private static final Logger log = LoggerFactory.getLogger(FileHelper.class);

    public static String readFileManualClose(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        FileReader fileReader = null;
        Scanner scanner = null;

        try {
            fileReader = new FileReader(fileName);
            scanner = new Scanner(fileReader);

            while (scanner.hasNextLine())
                stringBuilder.append(scanner.nextLine()).append("\n");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } finally {

            try {
                if (fileReader != null) fileReader.close();
                if (scanner != null) scanner.close();

            } catch (IOException e) {
                log.error(e.getMessage());
            }
        }

        return stringBuilder.toString();
    }

    public static String readFileTryWithResource(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();

        try(FileReader fileReader = new FileReader(fileName)) {

            try (Scanner scanner = new Scanner(fileReader)) {
                while (scanner.hasNextLine())
                    stringBuilder.append(scanner.nextLine()).append("\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return stringBuilder.toString();
    }

    public static String readFileCleanUp(String fileName) throws IOException {
        @Cleanup FileReader fileReader = new FileReader(fileName);
        @Cleanup Scanner scanner = new Scanner(fileReader);

        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNextLine())
            stringBuilder.append(scanner.nextLine()).append("\n");

        return stringBuilder.toString();
    }

//    @SneakyThrows(value = {IOException.class})
//    public static String readFileCleanUpWithNoCheckedException(String fileName) {
//        return readFileCleanUp(fileName);
//    }
}
