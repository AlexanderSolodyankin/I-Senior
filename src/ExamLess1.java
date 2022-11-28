import java.util.Random;
import java.util.Scanner;

public class ExamLess1 {
    public static void main(String[] args) {
        Random ran = new Random();
        System.out.println("Введите желаемую сумму для снятия баланса");
        int num = new Scanner(System.in).nextInt();

        System.out.println(getMoney(num));



    }

    public static String getMoney(int num){

        if(num <= 60000) {
            for (int i = 0; i < (num / 200) ; i++) {
                for (int j = 0; j < (num / 500) ; j++) {
                    for (int k = 0; k < (num / 1000) ; k++) {
                        for (int l = 0; l < (num / 2000) ; l++) {
                            for (int m = 0; m < (num / 5000) ; m++) {
                                int sum = (5000 * m) + (2000 * l) + (1000 * k) + (500 * j) + (200 * i);
                                if (num == sum) {
                                    return "5000:" + m + " 2000: " + l + " 1000: " + k + " 500: " + j + " 200: " + i;
                                }
                            }
                        }
                    }
                }
            }
        }else return "Превышен лимит снятия баланса";

        return "Сумма не доступна для снятия";

    }
}
