import java.util.Arrays;

public class ExamLes2 {
    public static void main(String[] args) {
        char[] line = {'р','а','б','о','т','а','н','е','в','о','л','к'};
        char[] line2 = new char[0];


        for (int i = 0; i < line.length; i++) {
            int flag = 0;
            char sim = line[i];
            for (int j = 0; j < line.length ; j++) {
                if(sim == line[j] && j != i){
                    flag++;
                    System.out.println("Есть похожий символ");
                }
            }
            if(flag == 0){
                line2 = getArray(line2, line[i]);
            }
        }
        System.out.println(Arrays.toString(line2));
    }

    public static char[] getArray(char[] array, char sim){
        char[] newArray = new char[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = sim;

        return newArray;
    }
}
