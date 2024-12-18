package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import user.User;

public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //caminho do arquivo
        String path = "C:\\\\studyspace\\\\programming\\\\oriented_programming\\\\sistema de cadastro via CLI\\\\cli_registration_system\\\\options.txt";
        //lendo e imprimindo arquivo
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        String name = sc.nextLine();
        String email = sc.nextLine();
        int age = sc.nextInt();
        double height = sc.nextDouble();

        User user = new User(name, email, age, height);

        System.out.println(user);

        sc.close();

    }
}
