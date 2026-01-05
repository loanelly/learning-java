package lesn30;

public class TestLsn30 {
    public static void main(String[] args){
        // Урок 30 - приметивные типы данных
        int x = 11;// Приметивный тип - 32 бита
        short y = 12; // 16 бит
        byte z = 1; // -127 до 127
        long w = 1l;//64 бита
        double a = 1.1;//64 бита но толко вещественные числа
        float b = 12.2f;// 32 бита но толко вещественные числа

        //преобразование---------------------------------------------

        long l = 121212l;//неявное
        int x1 = (int)l;//явное
        System.out.println(x1);
        long newA = Math.round(a);
        System.out.println(newA);
        
    }
}
