public class lesson24 {
    public static void main(String[] args){
        //Урок 24 класс обьект и метод toString
        String string = "Hello";
        Human h1 = new Human("Lola",23);
        h1.toString(); // Если ввести h1. то мы увдем все методы доставшиеся от класса object
        // toString возвращает HashCode - уникальный номер
        System.out.println(h1); // То же самое что вызвать метод тутринг (h1.toString())
        // Все классы в джаве наследуются от класса обджект
    }
}
class Human{
    private String name;
    private int age;

    // создадим конструктор

    public Human(String name, int age){
        this.age = age;
        this.name = name;
    }

    // Переопределим метод тустринг

    public String toString(){
        return name + "," + age;
    }
}
