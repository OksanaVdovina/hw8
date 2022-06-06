import java.time.LocalDate;

public class Main {

    // ЗАДАНИЕ 1
    public static void printIsLeapYear(int a) {
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println(a + " - високосный год");
        } else {
            System.out.println(a + " - невисокосный год");
        }
    }

    // ЗАДАНИЕ 2
    public static void printApplicationVersion (int a, int b) {
        int currentYear = LocalDate.now().getYear();
        if (a == 1) {
            if (b < currentYear) {
                System.out.println("Установите lite-версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            if (b < currentYear) {
                System.out.println("Установите lite-версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
    }

    // ЗАДАНИЕ 3
    public static int calculateNumberOfDays (int a) {
        int numberOfDays = (a - 20)/40 + 2;
        if (a <= 20) {
            return 1;
        } else {
            return numberOfDays;
        }
    }

    public static void main(String[] args) {

        // ЗАДАНИЕ 1

        System.out.println("Задание 1:");
        int year = 1999;
        printIsLeapYear(year);

        // ЗАДАНИЕ 2

        System.out.println("Задание 2:");
        int clientOS = 1;
        int clientDeviceYear = 2013;
        printApplicationVersion(clientOS, clientDeviceYear);

        // ЗАДАНИЕ 3

        System.out.println("Задание 3:");
        int deliveryDistance = 100;
        int numberOfDays = calculateNumberOfDays(deliveryDistance);
        System.out.println("На доставку потребуется дней:" + numberOfDays);
    }
}