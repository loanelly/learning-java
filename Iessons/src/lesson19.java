// Ключевое слово This
public class lesson19 {
    public static void main(String[] args){
        Human human1 = new Human();
        human1.age19 = 22;
        human1.name19 = "Фиалка";
        human1.getInfo();
        Human human2 = new Human();
        human2.age19 = 23;
        human2.name19 = "Кира";
        human2.getInfo();

    }
}
class Human{// Классы создаются без ()
    String name19;
    int age19;

    public void SetName19(String usname){ // Методы всегда имеют () иногда со значениями внутри
        name19 = usname;
    }
    public String GetName19(){
        return name19;
    }
    public void setAge19(int age19) {// 2 переменных 1 принадлежит оьекту вторая методу
        // В таком случае  пишем this.value и оно берет самую близкую переменную к этой
        this.age19 = age19;
    }

    // Чтобы внутри класса обратиться к переменным класса нужно написать this.value

    public int GetAge19(){
        return age19;
    }
    public void getInfo(){
        System.out.println("Меня зоут "+ name19+" мне "+age19+" лет");
    }
}
// This - нужен чтобы присваивать атрибуту класса значение переменной
