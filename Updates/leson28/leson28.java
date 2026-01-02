package leson28;
import leson28.lesn28.Person;
import leson28.lesn28.protPerson;
public class leson28 extends protPerson{
    /*public static void main(String args){
        // Урок 28 модификаторы доступа
        //public, privat, default protected
        //public - разрешает доступ к полю классу или методу везде в этом проэкте
        //privat - разрешает только в пределах класса в котором дикларированно
        //default(все что деолт доступно в пределах этого пакета) - включается по умолчанию если ничего не писать
        //protected - доступны в пределах одного пакета как деф НО доступны всем подклассом даже если они вне этого пакета
        //Класс может быть либо публичным либо дефолт/в одном джава файле долен быть 0<x<2 джава паблик класс
        Person person1 = new Person();
        person1.name = "Light";
        protPerson p2 = new protPerson();
        System.out.println(p2.name);
    }*/
    public leson28(){
        name = "Tom";
    }
}
