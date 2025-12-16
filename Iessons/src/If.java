public class If {
    public static void main(String[] args){
        if(5==5){ // Если условие в круглых скобках верно то выполн Body
            System.out.println("Да верно");
        }else{ // если условие дало фолс
            System.out.println("Нет не верно");
        }
        int myInt = 15;
        if(myInt<10){ // Если условие в круглых скобках верно то выполн Body
            System.out.println("Да верно");
        }else if(myInt>20){ // продолжение тогоже иф цикла сверху
            System.out.println("Нет не верно");
        }else{
            System.out.println("Не подходит под данные условия");
        }
        // Взаимоисключающие случаи будут работать сверху вниз => Если работает условие 1 то остальные условия мы не проверяем
        if(myInt<20){ // Если условие в круглых скобках верно то выполн Body
            System.out.println("1!");
        }else if(myInt<40) { // продолжение тогоже иф цикла сверху
            System.out.println("2");
        }
    }
}
