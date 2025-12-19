public class lession21 {
    public static void main(String[] args){
        // Урок 21 - Ключевое слово static
        Human h1 = new Human("Bob",22);
        h1.setName("Tom");

        // static - переменные методы классов

        Human.description = "Nice";
        Human.getDescription();
        Human.description = "bad";
        h1.description = "Bad";
        h1.getAllFiled();
        Human h2 = new Human("Sandy",33);

        // Мы исользуем статические переменные если нам нужно воспоользоваться классом без создания обьекта

        //как пример - обьекты класса math
        System.out.println(Math.pow(2,4));
        System.out.println(Math.PI);// Нам не нужно обращаться к пи пи - константа и она единственная у класса

        h1.printNumberOfPeople();
        // =
        h2.printNumberOfPeople();
        //Т.к для всех обьектов переменная одна
    }
}
class Human{

    private String name; // Не принадлежат классу Human инцилизируются только в методах
    private int age;
    public static String description;// Статическая переменная - теперь чтобы ее вызвать не нужно создавать обьект класса она уже пренадлежит классу
    private static int countHumans;

    public Human(String name , int age){
        this.name = name;
        this.age = age;
        System.out.println("Привет из третьего конструктора");
        countHumans++;
    }
    // Чтобы работал только 1 нужно его прописать а все остальные удалить
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public static void getDescription(){
        System.out.println(description);
    }
    public void getAllFiled(){
        System.out.println(name+" "+age+"" + description);
    }
    public void printNumberOfPeople(){
        System.out.println("NumberOfPeople= "+ countHumans);// так как переменная статик и не зависит от обьектов она будет равна для h1 и h2
    }
}
