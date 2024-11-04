import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // 1. Вывести имя пользователя 3 раза
        String userName = getUserName();
        for (int i = 0; i < 3; i++) {
            System.out.println(userName);
        }

        // 2. Вывести все четные числа от 0 до 100 включительно
        int number = 0;
        while (number <= 100) {
            System.out.println(number);
            number += 2; // Переход к следующему четному числу
        }
    }

    private static String getUserName() {
        String userName = "User"; // Замените на логику получения имени пользователя
        try {
            userName = System.getProperty("user.name");
        } catch (SecurityException e) {
            System.out.println("Не удалось получить имя пользователя.");
        }
        return userName;
    }
}