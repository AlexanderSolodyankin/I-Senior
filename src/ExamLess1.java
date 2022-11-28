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
        int cup1 = 200;
        int cup2 = 500;
        int cup3 = 1000;
        int cup4 = 2000;
        int cup5 = 5000;

        if(num <= 60000) {
            for (int i = 0; i < (num / cup1) ; i++) {
                for (int j = 0; j < (num / cup2) ; j++) {
                    for (int k = 0; k < (num / cup3) ; k++) {
                        for (int l = 0; l < (num / cup4) ; l++) {
                            for (int m = 0; m < (num / cup5) ; m++) {
                                int sum = (cup5 * m) + (cup4 * l) + (cup3 * k) + (cup2 * j) + (cup1 * i);
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
