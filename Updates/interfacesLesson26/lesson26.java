package interfacesLesson26;

// ctrl + n - создать generate обьект (win)/(mac) cmd + n

public class lesson26 {
    public static void main(System[] args){
        Animal Animal1 = new Animal(2);
        Animal1.setID(1);
        Animal1.showID();
        Animal1.sleep();
        Human human1 = new Human("Alice");
        human1.showInfo();
        info info1 = new Animal(1);// info - тип переменной / Animal - класс
        info info2 = new Human("Vika"); // Мы можем так делать только когда между типом и классом существует связь
        info1.showInfo();
        info2.showInfo();

        /*Полиморфизм — это способность чего-либо принимать множество форм, что является фундаментальным принципом в разных областях: в программировании (ООП) это возможность использовать один интерфейс для объектов разных классов, которые могут реализовывать его по-своему (например, кнопка «Играть» запускает видео на плеере и музыку на проигрывателе);*/

        outputInfo(info1);
        outputInfo(info2);

        outputInfo(Animal1);
    }
    public static void outputInfo(info info){// Хоть на вход указан обьект класса инфо мы можем подавать обьекты связанные с инфо
        // только потому что они реализуют интерфейс инфо
        info.showInfo();
    }
}
