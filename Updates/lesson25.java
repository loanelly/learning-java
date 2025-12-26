public class lesson25 {
    // Урок 25 - наследование, часть 2 так же вместе с этим файлом нужен javaclass:
    // animal
    // dog
    public static void main(String[] args){
       Animal animal = new Animal(); // создадим обьект класса animal
        animal.eat();
        animal.sleep();
        // собака это тоже animal(более конкретное понятие)
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        // Собака может иметь свои методы
        dog.bark();
        dog.walking();
        // Также мы можем переопределять методы родителей
        dog.eat();
        dog.showName();
    }
}
