import java.util.ArrayList;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        System.out.println("***Задачки******************");
        System.out.println("***1.Добавить задачки*******");
        System.out.println("***2.Удалить задачки********");
        System.out.println("***3.Выход******************");
        System.out.println("***************************");
        ArrayList<String> task = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите действие");
            int code = sc.nextInt();
            sc.nextLine();
            switch (code) {
                case 1:
                    System.out.println("Введите список своих дел,(введите пустую строку для завершения)");
                    String taskInput;
                    while (!(taskInput = sc.nextLine()).isEmpty()){
                        task.add(taskInput);
                }
                    break;
                case 2:
                    System.out.println("Выберите список дел которые вы сделали");
                    for(int i = 0; i< task.size(); i++){
                        System.out.println((i+1) + ":" + task.get(i));
                    }
                    int taskIndex = sc.nextInt();
                    if(taskIndex >= 1 && taskIndex <= task.size()){
                        task.remove(taskIndex-1);
                        System.out.println("Задачка успешно удален");
                    }else System.out.println("Неправильный номер дела");
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Неправильная команда");
            }
        }
    }
}