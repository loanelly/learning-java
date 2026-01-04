package lesn29;

public class Dog extends Animal{
    public void Bark(){
        System.out.println("Dog is barking . . . ");
    }
    //Переопределим метод есть для собаки
    @Override //переопределение
    public void eat(){
        System.out.println("Dog is edting . . . ");
    }
}
