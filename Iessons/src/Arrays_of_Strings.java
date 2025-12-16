public class Arrays_of_Strings {
    public static void main(String[] args){
        int[] numbers = new int[5];
        numbers[0] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        String[] strings = new String[3]; // создаем массив из строк на 3 ячейки класса стринг
        strings[0] = "Привет";
        strings[1] = "Пока";
        strings[2] = "Java";
        System.out.println(strings[0] + " " + strings[2]);
        // цикл  for each
        for (int i = 0 ; i < strings.length;i++){ // обычный for (выведет каждый эллемент массива)
            System.out.println(strings[i]);
        }
        System.out.println();// пустая строка разделитель
        for (String string:strings){  // 1-Тип данных 2-Имя переменной 3-Массив через который мы хотим проходить
            System.out.println(string);//Выводим переменную из массива
        }
        int[] num = {1,2,3};
        int summ = 0;
        for(int x:num){
            summ = summ +x;
        }
        System.out.println();
        System.out.println(summ);


        int value = 0;
        //String = new String("s");
        String s = null; // оно по умолчанию указывает на null
        System.out.println(s);
    }
}
