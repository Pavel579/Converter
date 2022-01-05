import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        // Поехали!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int command;
        StepTracker stepTracker = new StepTracker();


        while (true) {
            try {
                printMenu();
                command = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                command = 0;
            }

            try {
                if (command == 1) {
                    //Ввод данных с клавиатуры
                    System.out.print("Введите название месяца > ");
                    String month = br.readLine();
                    System.out.print("Введите номер дня > ");
                    int day = Integer.parseInt(br.readLine());
                    System.out.print("Введите кол-во шагов > ");
                    int step = Integer.parseInt(br.readLine());

                    stepTracker.saveStepsPerDay(month, day, step);

                } else if (command == 2) {
                    System.out.print("Введите месяц за который необходимо показать статистику > ");
                    String month = br.readLine();
                    stepTracker.printStatistic(month);
                } else if (command == 3) {
                    System.out.print("Введите число целевых шагов > ");
                    int targetSteps = Integer.parseInt(br.readLine());
                    stepTracker.setTargetSteps(targetSteps);
                } else if (command == 4) {
                    System.out.println("До свидания!");
                    break;
                } else {
                    System.out.println("Такой команды не существует, введите число от 1 до 4");
                    System.out.println();
                }

            } catch (NumberFormatException e) {
                System.out.println("Неверный формат данных. Введите целое число.");
                System.out.println();
            }
        }
    }

    //Метод печати основного меню на экран
    public static void printMenu() {
        System.out.println("***** Основное меню! *****");
        System.out.println("1. Введите количество шагов за определённый день");
        System.out.println("2. Напечатать статистику за определённый месяц");
        System.out.println("3. Изменить цель по количеству шагов в день");
        System.out.println("4. Выйти из приложения");
        System.out.print("Введите номер команды > ");
    }
}

