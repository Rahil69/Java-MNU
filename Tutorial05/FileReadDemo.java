/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.mavenproject4;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.File;     
import java.util.Scanner;
// Import the File class

public class FileReadDemo {
    public static void main(String[] args) {
        // TODO: read "notes.txt" using Files.readString(Path.of(...)),
        // catching IOException and printing a friendly error.
        Path filePath = Path.of("C:\\Users\\Student\\Desktop\\read.txt");
        try{
            
                String content = Files.readString(filePath);
                System.out.println(content);
            
        }catch(IOException e){
            System.out.println("An Error occured.");
        }
    }
}


