package FileManagers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class QuestionFileReader {
    
    public static List<String> readQuestionsFromFile(String filePath){
        List<String> questions = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line = br.readLine();
            while (line != null) {
                questions.add(line);
                line = br.readLine();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return questions;
    }
}
