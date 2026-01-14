package lesn34;

public class Animal {
    public int id;

    public Animal(){
        //Фикс ошибки с классом Dog
    }
    public Animal(int id){
        this.id = id;
    }
    public String toString(){
        return String.valueOf(id);// Мы конвертируем числовое id в строку
    }
    public void eat(){
        System.out.println("Animal is eating  .  .  .  ");
    }
}
