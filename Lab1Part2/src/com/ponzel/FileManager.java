package com.ponzel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileManager {
    public static String read(Path path) throws IOException {
        String content = Files.readString(path, StandardCharsets.UTF_8);
        return content;
    }
    public static void write(String encodedContent) throws IOException {
        FileOutputStream out = new FileOutputStream("C:\\Users\\maksy\\OneDrive\\Документы\\3.2курс\\lab1.part1\\armyBase64.txt");
        out.write(encodedContent.getBytes());
        System.out.print("Write is done");
    }
}
