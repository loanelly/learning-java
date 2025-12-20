public class lesson22 {
    //Ключевое слово final - используется для того чтобы обозначить переменную которая в дальнейшем не будет изменяться
    // final - Константа
    public static void main(String args){
        //new Test(10);
        // Константы можно декларировать и в методе
        final int HASH = 5;
        System.out.println(HASH);
    }
}
class Test{
    public static final int CONSTANT = 10; // Все константы как правило пиутся с заглавной буквы

    // Если переменная CONST(константа) не будет static(будет создаваться для каждого класса заново) мы сталкнемся с лишними потерями памяти
    /*
    public Test(int CONSTANT){ // Сеттером задаем константу
        this.CONSTANT = CONSTANT;
    }
     */
    /*
    public void setCONSTANT(int x){
        this.CONSTANT = x; // Мы не можем изменить значение константы т.к задали ее в методе test
    }
     */

}
