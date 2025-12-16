import java.util.Scanner; // импортируем сканер

public class Input {
    public static void main(String[] args){
        String str = "StringObj"; // обьект класса стринг
        String n = new String("String");//правильное создание обьектов класса
        Scanner s = new Scanner(System.in); // класс сканер лежит в покете java.util его нужно сначала подключить(библиотека)
        // стринг лежит в java.leng который импорт заранее
        // в параметры класса сканер задаем входной поток
        System.out.println("Введите что-нибудь");
        String string = s.nextLine(); //  считает с клавиатуры следующею стрчку при помощи метода от скана
        System.out.println("Вы ввели " + string);
        System.out.println("Ввеите какое-нибудь число");
        int x = s.nextInt();
        System.out.println("Вы ввели "+x);

    }
}
