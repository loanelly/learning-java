package lesn29;
// Полеморфизм - способность метода обрабатывать данные разных типов
public class Polemorfizm {
    public static void main(String[] args){
       /* Animal animal = new Animal();
        Dog dog1 = new Dog();

        dog1.eat();
        animal.eat();
        System.out.println(animal.toString());

        Animal animalDog = new Dog();
        //animalDog.bark; - Мы не можем обратиться к методу барк т.к Анимал не налледует класс дог
        dog1.Bark();
        animalDog.eat();// Всегда вызывается метод который определен в потомке

        */
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();

        Test(animal);// Вызовем метод тест
        Test(cat);
        Test(dog);
    }
    public static void Test(Animal animal){
        animal.eat();
    }
}
