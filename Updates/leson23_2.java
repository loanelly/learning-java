public class leson23_2 {
    public static void main(String[] args){
        // Урок 23 строки углубленно
        System.out.println("Hello");// println - напечатать с новой строки
        System.out.print("Hello again"); // Печатает в ту же строку
        System.out.print("Здарова");
        System.out.println("Nothing");
        System.out.printf("This is a string, %s","NICE"); // %value - в функции printf заменится на значение после запятой (NICE)
        // %s - строки
        // %d - цифры
        // %f - число вещественное (с запятой)
        System.out.printf("Values %s - %d" , "n" , 10 ); // Параметры записываем по порядку
        // Так - же можно их форматировать
        System.out.printf("Число размером в 100 символов - %100d",100); // Т.к оно отфарматированно выведет число со 100 ячейками независимо от значения d
        System.out.print("LLL \n");// Принтлн - работает как энтер, точно так-же работает \n
        System.out.printf("Число размером в 100 символов - %-100d",100); // Ячейки отобразятся справа а не слева
        System.out.printf("String %.2f \n", 45.323444); // Форматирование(с округлением) вещественных чисел
        System.out.printf("String %.3f \n", 45.323444);
        System.out.printf("String %.4f \n", 45.323444);
        // % [10] [.42]
    }
}
