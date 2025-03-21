package com.farrel.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

class FileHelperTest {
    @Test
    void testPom() {
        try {
            String pomXml = FileHelper.readFileCleanUp("pom.xml");
            System.out.println(pomXml);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void testFileNotFound() {
        Assertions.assertThrows(FileNotFoundException.class, () -> {
            String pomXml = FileHelper.readFileCleanUp("dummy.xml");
            System.out.println(pomXml);
        });
    }
}