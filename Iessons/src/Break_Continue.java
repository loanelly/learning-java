public class Break_Continue {
    public static void main(String[] args){ // args от arguments общепринятое стандартное имя для переменной в классе мейн
        // оператор Break выходит из цикла
       /* int i = 0;
        while (true){// Если в вайле тру то это бесконечный цикл
            if(i==15){
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Мы вышли из цикла");
        */
        for(int i = 0 ;i<=15;i++){
            if(i%2==0){
                continue; // если выполняется continue то то что снизу не выполняется, цикл вернется к своему началу
            }
            System.out.println("Это нечетное число-"+i);
        }
    }
}
