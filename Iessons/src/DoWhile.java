import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        /*int value = scanner.nextInt(); // числовой ввод следующего числа
        while (value!=5){
            System.out.println("Введите 5 ");
            value = scanner.nextInt();
        }
        System.out.println("Вы ввели 5");
         */
        //В хорошей программе не должно быть дублирования кода
        int value; // ! КОГДА МЫ ДЕКЛАРИРУЕМ ПЕРЕМЕННУЮ ПРОГРАММА ВИДЕТ ТОЛЬКО ТО ЧТО В ФИГУРНЫХ СКОБКАХ => ТИП ПЕРЕМЕННОЙ НУЖНО УКАЗАТЬ ЗАРАНЕЕ
        // Сейчас она видна в пределах скобок Main => программа будет видеть ее и в цикле
        do{
            System.out.println("Введите 5 ");
            value = scanner.nextInt();
        }while (value!=5);
        //цикл doWhile гарантирует хотябы однократное выполнение действия
        // while - сначала проверяет инструкции а потом выполняет действие а doWhile сначало выполняет действие а потом проверяет условие
        System.out.println("Вы ввели 5");
    }
}
