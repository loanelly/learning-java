import java.util.Locale;

public class lesson23 {
    public static void main(String[] args){
        // Урок 23 - строки углубленно

        // В java cуществует 2 типа обьектов
        // 1 тип mutable = изменчивый
        // 2 тип imutable = неизменяемый

        //строки не изменяются (imutable)

        String s = "Hello";
        //s.toUpperCase(Locale.ROOT) // Вызовем метод который должен сделать все буквы заглавными
        // ошибка т.к все операторы класса string возвращают новую строку
        String y = s.toUpperCase(Locale.ROOT);
        System.out.println(y);
        // Нужен новый обьект класса String и тогда все заработает

        // или

        String x = "Hello";
        x = x.toUpperCase(Locale.ROOT);
        System.out.println(y);

        // Сборщик мусора - если на обьект больше не ссылается ни одна переменная метод и т.д то его автаматически удаляет  из памяти сборщик мусора
        String s1 = "Hello";
        String s2 = "my";
        String s3 = "friend";
        String sALL = s1 + s2 + s3;
        System.out.println(sALL);

        // Создадим StringBuilder он mutable

        StringBuilder sb = new StringBuilder("Лемон");// В () Начальное значение строки
        System.out.println(sb.toString());// Метод toString
        sb.append(" мой ");// для того чтобы добавить к билдеру новую строку можно написать апенд
        sb.append("лимончик"); // Метод append - возвращает обьект того класса в котором он был вызван
        System.out.println(sb.toString());
        //Можно еще писать так
        sb.append(" мой ").append("лимончик");
        System.out.println(sb.toString());
    }
}
