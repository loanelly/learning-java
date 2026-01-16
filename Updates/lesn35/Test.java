package lesn35;

interface AbleToEat {
    public void eat();
}
// Сзодадим интерфейс и заставим класс Animal реализовывать его методы

class Animal implements AbleToEat{

    @Override
    public void eat(){
        System.out.println("Animal is eating  .  .  .");
    }
}
class OterAnimal extends Animal{
    public void eat(){
        System.out.println("Other animal is eating now . . .");
    }
}

public class Test {
    public static void main(String args){
        //  Урок 35 - Анонимные классы  .  .  .

        Animal animal = new Animal();
        animal.eat();

        OterAnimal oat = new OterAnimal();
        oat.eat();
        //Чтобы сделать то же что в OtherAnimal но без внедрения нового класса можно использовать ананимный класс

        Animal anonAnimal = new Animal(){
            // тут можно переопределять или добавлять методы
            // Наследуется от Animal
            public void eat(){
                System.out.println("Who is eating ?");
            }
        };
        anonAnimal.eat();

        // Можно использовать Интерфейс в анонимном классе

        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
            // Анонимный интерфейс и его метод Eat
            System.out.println("Someone is eating  .  .  .");
            }
        };
        ableToEat.eat();
        // Создать обьект этого раза можно только 1 раз
    }
}
