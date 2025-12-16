public class ClassesAndObjects { // public class - это основной класс в программе
    //Может быть только 1 и его имя должно соответствовать имени java файла
    public static void main(String[] args){ // метод main
        // Класс это шаблон(общее понятие)
        // Что-то конкретное это обьект класса
        person one = new person();
        one.name = "Роман";
        one.age = 18;

        person person2 = new person();
        person2.name = "Лилия";
        person2.age = 19;
        System.out.println("Меня зовут "+person2.name+" мне "+person2.age+" лет");

        //Вызовим метод speak
        person2.speak();
        // Вызовим этот же метод у 1 обьекта
        one.speak();
        person2.speak3();
        person2.sayHello();
        person2.calculateYearsToRetirement();



        int year1 = person2.CalculateYearsToRetirement();// Создадим переменную которая вернет нам возраст до пенсии с помощью метода в классе
        System.out.println("Человеку 2 до пенсии "+ year1 + " лет");

        // 17 lession:
        person2.setName("Бруда");
        System.out.println(person2.name);// прверим изменилось ли имя person2
        // Забыл что есть метод speak который мы прописали в классе person
        person2.speak();
        // круто, ща попробую возрост прописать
        person2.setAge(25);// меняем возраст на 25
        person2.speak();
        //при этом в эти методы можно вставлять не только значения но и переменные, главное чтобы тип переменной подходил
        String nameNextAgain = "Василиса";
        person2.setName(nameNextAgain);
        person2.speak();
        //Вызовем метод с 2 условиями
        person2.setNameAndAge(nameNextAgain,22);
        person2.speak();
        //18 lession - инкапсуляция
        // Плохо то,что мы обращаемся к полям через точку
        // Данные должны быть скрыты от пользователя

        // Если бы он обращался не на прямую а через методы то мы могли бы поставить условия

        // Создадим методы посредники Еттер и Геттер


    }
}
class person{
    // У класса могут быть
    // 1-данные (поля)
    // 2-Действия которые он может совершать(Методы)
    String name;// 2 ячейки под данные/2 у каждого обьекта класса person
    int age; // private значит что это поле теперь доступно только в пределах этого класса
    void calculateYearsToRetirement(){
        int years = 65 - age;
        System.out.println("Количество лет до пенсии: "+years);



    }

    // Если нам нужно чтобы метод что-нибуть возвращал в мейн(считал) то нам нужно указать тип данных

    int CalculateYearsToRetirement(){
        int years = 65 - age;
        return years;
        // После ретерна нет смысла что либо писать если нет условий (он не в цикле)
    }
    // Создадим метод в обьекте
    void speak(){ // метод speak
        System.out.println("Меня зовут "+name+" мне "+age+" лет");
        //  Теперь у каждого обьекта класса person есть метод speak
    }
    void speak3(){ // метод speak 3 раза



        // void это тип данных котоый ничего не возвращает в main




        for (int i = 0;i<3;i++) {
            System.out.println("Меня зовут " + name + " мне " + age + " лет");
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
        name = username; // Имя каждого обьекта будет заменено на username
    }
    void setAge(int ageNew){// Недоконца понимаю почему он класса void а хотя, он ничего не возвращает, в принципе ок)
        age = ageNew;
    }
    void setNameAndAge(String username, int ageN ){//параметров может быть сколько угодно
        age = ageN;
        name = username; // Имя каждого обьекта будет заменено на username
    }

}
class test {} // вспомогательный класс, таких может быть сколько угодно
