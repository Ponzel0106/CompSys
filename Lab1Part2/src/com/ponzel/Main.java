package com.ponzel;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\maksy\\OneDrive\\Документы\\3.2курс\\lab1.part1\\army.txt");
        String content = "";
        try {
            content =  FileManager.read(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String encodedContent = Base64Encode.encode(content);
        try{
            FileManager.write(encodedContent);
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
