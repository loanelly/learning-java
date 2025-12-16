public class WhileLoops {
    public static void main(String[] args){
        boolean t = true;//boolean только тру и фолс
        boolean z = 5>=7;// или выражения если верно выведет тру если нет фолс
        System.out.println(z);
        // чтобы проверить равны ли значения нужно два знака равно как в питоне типо 5 == 5?
        int value = 0;
        boolean a = value>5;
        while (value<5){ // в круглых скобках условие в фигурных скобках тело
            System.out.println("Пиздаблятская " + value );
            value = value + 1;

        }
    }
}
