import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        System.out.println("Привет! Это шифратор. Выберите режим: \n" +
                "1 Зашифровать \n" +
                "2 Расшифровать \n" +
                "3 Подобрать ключ \n" +
                "4 Синтаксический анализ \n");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        switch (answer){
            case ("1") -> new ChoiceOne().choiceOne();
            case ("2") -> System.out.println("Расшифровать");
            case ("3") -> System.out.println("Подобрать ключ");
            case ("4") -> System.out.println("Синтаксический анализ");
        }
    }
}
