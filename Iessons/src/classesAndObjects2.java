public class classesAndObjects2 {
    public static void main(String[] args){ // метод main

    persons personA = new persons();
    //18 lession - инкапсуляция
    // Плохо то,что мы обращаемся к полям через точку
    // Данные должны быть скрыты от пользователя

    // Если бы он обращался не на прямую а через методы то мы могли бы поставить условия

    // Создадим методы посредники Еттер и Геттер
    personA.setN("Ангелина");
    personA.setAges(22);
    personA.speak();
    System.out.println("Выводим возраст в мейн методе"+personA.getAges());
    personA.getName();
    // Теперь внутри методов мы можем менять нейм допустим на логин и пользователь не заметит этого
        //потому что мы меняем внутреннею логику класса

}
}
class persons{
    //public String names;
    // У класса могут быть
    // 1-данные (поля)
    // 2-Действия которые он может совершать(Методы)
    private String names;// 2 ячейки под данные/2 у каждого обьекта класса person
    private int ages; // private значит что это поле теперь доступно только в пределах этого класса

    public void setN(String username){ // Setter задает значение
        if (username.isEmpty()){//  Если срока пустая то ис емпти выведет тру если что-то есть то фолс
            System.out.println("Ты ввел пустое имя");
        }else{
            names = username;
        } //  В сеттере мы инкапсулируем нужную логику для проверки
    }

    public String getName() { // Будет возвращаться строка
        return names;
    }
    public void setAges(int userAGEs){
        if (userAGEs < 1){ages = userAGEs;
        }else {System.out.println("Ты ввел некоректный возраст");}
    }
    public int getAges(){
        return ages;
    }
    void calculateYearsToRetirement(){
        int years = 65 - ages;
        System.out.println("Количество лет до пенсии: "+years);



    }

    // Если нам нужно чтобы метод что-нибуть возвращал в мейн(считал) то нам нужно указать тип данных

    int CalculateYearsToRetirement(){
        int years = 65 - ages;
        return years;
        // После ретерна нет смысла что либо писать если нет условий (он не в цикле)
    }
    // Создадим метод в обьекте
    void speak(){ // метод speak
        System.out.println("Меня зовут "+names+" мне "+ages+" лет");
        //  Теперь у каждого обьекта класса person есть метод speak
    }
    void speak3(){ // метод speak 3 раза



        // void это тип данных котоый ничего не возвращает в main




        for (int i = 0;i<3;i++) {
            System.out.println("Меня зовут " + names + " мне " + ages + " лет");
            //  Теперь у каждого обьекта класса person есть метод speak
        }
    }
    void sayHello(){
        System.out.println("Привет!");
    }
    // урок 17:
    // У каждого метода есть параметр, часть в скобках () но часто методу чтобы выполниться нужно доп значение
    //Создадим метод setName
    void setName(String username){// username это переменная, она может называться как угодно
        names = username; // Имя каждого обьекта будет заменено на username
    }
    void setAge(int ageNew){// Недоконца понимаю почему он класса void а хотя, он ничего не возвращает, в принципе ок)
        ages = ageNew;
    }
    void setNameAndAge(String username, int ageN ){//параметров может быть сколько угодно
        ages = ageN;
        names = username; // Имя каждого обьекта будет заменено на username
    }

}
