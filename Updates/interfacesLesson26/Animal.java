package interfacesLesson26;

public class Animal implements info{ // implements - реалезует
    public int id;// Создадим поле id

    public Animal(int id) {
        this.id = id;
    }

    public void setID(int id){
        this.id = id;
    }
    public void showID(){
        System.out.println("My id is: "+id);
    }
    public void sleep(){
        System.out.println("I'm sleaping");
    }
    public void showInfo(){
        System.out.println("My id is: "+id);
    }
} // Не можем забилдить этот файл т.к нет метода main
