public class lession20 {
    public static void main(String[] args){
        // Конструкторы - спциальные методы которые вызываются при создании обьекта
        // Инициализирует отрибуты обьекта
        Human human1 = new Human("Bob"); // Не может человек существовать без имени и возроста
        //human1.setName("Lisa");
        //human1.setAge(19);
        //Нужен чтобы пользователь не смог создавать класс без значений
        // Если значения не заданны - они задаются по умолчанию
        Human human2 = new Human();
    }
}
class Human{

    private String name;
    private int age;

    public  Human(){// У конструктора нет типа возвращаемого меода
        // Имя конструктора = имя класса
        this.name = "Имя по умолчанию";
        System.out.println("Привет из первого конструктора");
    }

    public Human (String name){
        System.out.println("Привет из второго конструктора");
        this.name = name;
    }
    public Human(String name , int age){
        this.name = name;
        this.age = age;
        System.out.println("Привет из третьего конструктора");
    }
    // Чтобы работал только 1 нужно его прописать а все остальные удалить
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
}
