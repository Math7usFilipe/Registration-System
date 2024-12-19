package application;

import java.util.List;
import java.util.Scanner;

import FileManagers.QuestionFileReader;
import FileManagers.UserFileWrite;
import user.User;

public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //--Lendo Arquivo--
        //caminho do arquivo
        String path = "C:\\\\studyspace\\\\programming\\\\oriented_programming\\\\sistema de cadastro via CLI\\\\cli_registration_system\\\\options.txt";
        List<String> questions = QuestionFileReader.readQuestionsFromFile(path);
        for(String q : questions){
            System.out.println(q);
        }
        
        //entrada de dados via CLI
        String name = sc.nextLine();
        String email = sc.nextLine();
        int age = sc.nextInt();
        double height = sc.nextDouble();

        int indexUser = 0;
        if (name != null && email != null && age != 0 && height != 0.0) {
            User user = new User(name, email, age, height);
            indexUser++;

            System.out.println(user);

            UserFileWrite.saveUserToFileTxt(user, indexUser);
        }
        

        

        

        sc.close();
    }
}
