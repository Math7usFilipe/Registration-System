package FileManagers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import user.User;

public class UserFileWrite {
    
    public static void saveUserToFileTxt(User user, Integer userIndex){

        //cria caminho para a pasta chamada "users"
        String pathToSave = "C:\\studyspace\\programming\\oriented_programming\\sistema de cadastro via CLI\\cli_registration_system\\users";

        File directory = new File(pathToSave);
        if(!directory.exists()){
            directory.mkdirs();
        }

        //gerando nome do arquivo
        String fileName = userIndex + "-" + user.getName().replaceAll("\\s+", "");

        File file = new File(directory, fileName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            writer.write("1 - Name: " + user.getName());
            writer.newLine();
            writer.write("2 - Email: " + user.getEmail());
            writer.newLine();
            writer.write("3 - Age: " + user.getAge());
            writer.newLine();
            writer.write("4 - Height" + user.getHeight());
            writer.newLine();
            writer.newLine();

            System.out.println("User data saved sucessfully!");
        } catch (Exception e) {
            System.out.println("Error when saving: " + e.getMessage());
        }
    }
}
