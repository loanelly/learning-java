package lesn33;

import java.util.*; // Импорт всех java util для их стабильной работы


public class Test {
    // урок 32 - введение в параметризацию(Generics)
    public static void main(String[] args){
        ////////////JAVA5/////////////////
        List animals = new ArrayList();
        animals.add("Cat");
        animals.add("Dog"); // 1
        animals.add("Frog");
        String animal = (String) animals.get(1); // downcasting
        System.out.println(animal);
        ///// С ПОЯВЛЕНИЕМ ДЖЕНЕРИКОВ /////
        List<String> animals2 = new ArrayList<String>();// Generic - динамический массив в который можно положить только обьекты класса string
        animals2.add("Cat");
        animals2.add("Dog");
        animals2.add("Fish");

        String animal2 = animals2.get(1);
        ////////////JAVA7/////////////////
        List<String> argss = new ArrayList<>(); // Тот же самый Genetic но можно тегать String 1 раз УРА ДЖАВЕ 7!!!
    }
}
//List animalss = new Animal();