package lesn36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    // Урок 36 - чтение из файла
    public static void main(String[] args) throws FileNotFoundException {// Добавим искл
        Scanner scannn = new Scanner(System.in);
        String input = scannn.nextLine();
        // код для скана следующей строки

        ///Скан файла///
        String seporator = File.separator;// КОНСТ разделитель системы на которой запущен код
        String path = "/Users"+ seporator +"lonly/Documents/updates/src/lesn36/thisFileHere/File";// Типо так только в каждом разделителе
        // В каждой ос свой разделитель укажем его
        File file = new File(path); // Обьект который будет являться сущностью файла

        Scanner scanner = new Scanner(file); // Выдаст ошибку потому что нет искл(если файл не найден) main

        String line = (scanner.nextLine()); // Скан следующей строки

        String[] numbersString = line.split(" ");// В аргументах указываем признак того по чему будем делать split
        System.out.println(Arrays.toString(numbersString)); // Вывод массива в строку
        int[] numbers = new int[3]; // То куда будем записывать
        int counter = 0;
        for (String number: numbersString) {
            numbers [counter++] = Integer.parseInt(number);
        }
        System.out.println(numbers);// Хэш код обьекта
        System.out.println(Arrays.toString(numbers));
        /*while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine()); // Скан всех строк!
        }*/
        scanner.close();// Чтобы не было лишнего

        //Если файл лежит в папке проэкта

        File fileTest2 = new File("Test2");
    }
}
