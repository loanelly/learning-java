package leson28.lesn28;
//import leson28.lesn28.Person;
public class Test {
    public static void main(String[] args) {
        Person person2 = new Person();
        person2.name = "Light";
        // Ошибки нет без импорта т.к и Тест и Персон в одном пакете(Папке)
        // Даже при модификаторе дефолт
        protPerson p1 = new protPerson();
        System.out.println(p1.name);
    }
}
