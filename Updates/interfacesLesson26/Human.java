package interfacesLesson26;

public class Human implements info {
    public String name;

    public Human(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello my name is "+ name);
    }
    public void showInfo(){
        System.out.println("Hello my name is "+ name);
    }
}
