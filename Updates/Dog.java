public class Dog extends Animal {
    // Класс дог наследует класс animal
    // Класс animal является родителем класса дог
    public void walking(){
        System.out.println("Вы гуляете с собакой");
    }
    public void bark(){
        System.out.println("Гав-гав");
    }
    public void eat(){ // Переопределяем метод в классе animal
        System.out.println("Я ем собачий корм, хрум-хрум");
    }
    String name = "Bella";
    public void showName(){
        System.out.println(name);
    }
}
