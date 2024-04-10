package client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {
    
    
    
    static String ReadFile(String File){
        String content = "";
        try {
            try (FileReader fileReader = new FileReader(new File(File)); 
                 BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    content += line + "\n";
                }
            }
        } catch (IOException ex) {
            System.out.println("Xay ra loi khi doc file");
        }
        
        return content;
    }
    
    static void WriteFile(String File , String content){
        try{
       
            try (FileWriter fileWriter = new FileWriter(new File(File)); 
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                bufferedWriter.write(content);
            }
        } catch (IOException e) {
            System.out.println("Xay ra loi khi ghi file");
        }
    }
    
    public static void main(String[] args) {
        
    }
}
