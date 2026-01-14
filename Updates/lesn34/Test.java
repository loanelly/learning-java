package lesn34;

import java.util.*;

public class Test {
    public static void main(String[] args){
        // Урок 34 Wildcards(Generics)
        List<Animal> listOfAnimals = new ArrayList<>();// Массив животных - Любых (Список)
        listOfAnimals.add(new Animal(1));
        listOfAnimals.add(new Animal(1));
        test(listOfAnimals);
        List<Dog> listOfDogs = new ArrayList<>();// Массив животных - Собак (Список)
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        Object object = new Object();// Новый обьект класса Object
    }
    //private static void test(List<? super Animal> list){ // super - Любой класс выше Animal
    /*
    * Иерархия классов файла
    *   Object
    *   Animal
    *    Dog

        */
    private static void test(List<? extends Animal> list){ // Любой наследующий Animal класс
        for (Animal animal:list){ // Если/Пока животное в этом листе
            animal.eat();
        }
    }
    /*
    private static void test(List<?> list){ // Знак ? - можно передавать обьекты любого класса в List
        for (Animal animal:list){ // Если/Пока животное в этом листе
            System.out.println(animal);
        }
    }*/
    /*
    private static void test(List<Animal> list){
        for (Animal animal:list){ // Если/Пока животное в этом листе
            System.out.println(animal);
        }
    }*/
}
