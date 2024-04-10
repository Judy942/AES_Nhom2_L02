package sendfile.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileReadWrite {
    
    
    
    static String ReadFile(String File){
        String content = "";
        try {
            FileReader fileReader = new FileReader(new File(File));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content += line + "\n";
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException ex) {
            ex .printStackTrace();
            System.out.println("Xay ra loi khi doc file");
        }
        
        return content;
    }
    
    static void WriteFile(String File , String content){
        try{
       
            FileWriter fileWriter = new FileWriter(new File(File));
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(content);
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Xay ra loi khi ghi file");
        }
    }
    
    public static void main(String[] args) {
        
    }
}
