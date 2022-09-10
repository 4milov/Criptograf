import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ChoiceOne {
    public void choiceOne(){
        System.out.println("Введите адрес к файлу для его зашифровки");
        Scanner scanner = new Scanner(System.in);
        String pathNotEncrypted = scanner.nextLine();
        System.out.println("Введите ключ шифрования");
        int key = Integer.parseInt(scanner.nextLine());
        String prefix = "_encrypt";
        int index = pathNotEncrypted.lastIndexOf(".");
        CipherCaesar cipher = new CipherCaesar();
        String pathEncrypted = pathNotEncrypted.substring(0,index) +
                        prefix + pathNotEncrypted.substring(index);
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(pathNotEncrypted));
             BufferedWriter writer = Files.newBufferedWriter(Paths.get(pathEncrypted))){
            while(reader.ready()){
                String readLine = reader.readLine();
                String message = cipher.encrypt(readLine, key);
                writer.write(message + System.lineSeparator());
            }
        } catch (IOException ioex){
            ioex.printStackTrace();
        }
        System.out.println("Содержимое файла зашифровано.");
    }
}