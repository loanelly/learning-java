import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        /*
        Scanner scanner = new Scanner(System.in);// создаем метод для ввода с клавиатуры
        System.out.println("Введите возраст");
        int age = scanner.nextInt(); // ечеика под возраст
        /*if(age == 10){
            System.out.println("Ты учишся в школе");
        } else if(age == 18){
            System.out.println("Ты закончил школу");
        }
        // напишем код сверху но через оператор switch

        switch (age){ // задаем переменную вокруг которой крутимся
            case 0: // кейсы это ифы, при значении age = 0 выполнить то что ниже
                System.out.println("Ты родился");
                break; // если не писать бреак то выполнятся все кейсы
            case 7:
                System.out.println("Ты пошел в школу");
                break;
            case 18:
                System.out.println("Ты закончил школу");
                break;
            default:// условие которое выполнится если не выполнятся предидущие
                System.out.println("Ни одно из предидущих условий не подощло");
                }
         */
        // также мы можем использовать не только интовые значения но и стринговые:
        Scanner scanner = new Scanner(System.in);// создаем метод для ввода с клавиатуры
        System.out.println("Введите возраст");
        String age = scanner.nextLine(); // ечеика под возраст
        switch (age){ // задаем переменную вокруг которой крутимся
            case "Ноль": // кейсы это ифы, при значении age = 0 выполнить то что ниже
                System.out.println("Ты родился");
                break; // если не писать бреак то выполнятся все кейсы
            case "Семь":
                System.out.println("Ты пошел в школу");
                break;
            case "Восемнадцать":
                System.out.println("Ты закончил школу");
                break;
            default:// условие которое выполнится если не выполнятся предидущие
                System.out.println("Ни одно из предидущих условий не подощло");
        }
        System.out.println("Введите номер");
        //Scanner num = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num){
            case 0:
                System.out.println("Вы ввели 0");
                break;
            case 1:
                System.out.println("Вы ввели 1");
                break;
            default:
                System.out.println("Аргумент не найден");
        }
    }
}
