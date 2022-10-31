import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        Игровая площадка левый и правый берег ну и лодка
        String[] left = {"Пастух","Волк","Коза","Капуста"};
        String[] boat = {"Пусто","Пусто"};
        String[] right = {"Пусто","Пусто","Пусто","Пусто"};

//        Теперь подготовим какие-то возможности.
        boolean boatPoint = true; // Перемычка для определения местоположения лодки
        boolean wins = false;
        boolean fools = false;



        System.out.println("Игра Началась");
        while (true){
            if(wins){
                System.out.println("Вы выиграли!!!");
                break;
            }
            if (boatPoint){
                System.out.println("Вы находитесь на левом берегу. Введите цифру для действия.");
                System.out.println();
                for (int i = 0; i < left.length; i++) {
                    if(left[i] != "Пусто"){
                        System.out.println(left[i] + " { " + i + " } ");
                    }
                }
                System.out.println("Отправить лодку введите { 9 }");

                int key = scan.nextInt();
                if(key < left.length){
                    for (int i = 0; i < boat.length; i++) {
                        if(boat[i] == "Пусто") {
                            String check = boat[i];
                            boat[i] = left[key];
                            left[key] = check;
                            break;
                        }
                    }
                }
                if(key == 9) {
                    if (key == 9 && (boat[0] == "Пастух" || boat[1] == "Пастух")) {
                        boatPoint = false;
                        for (int i = 0; i < boat.length; i++) {
                            for (int j = 0; j < right.length; j++) {
                                if (right[j] == "Пусто") {
                                    String chek = right[j];
                                    right[j] = boat[i];
                                    boat[i] = chek;
                                    break;
                                }
                            }
                        }
                        System.out.println("Лодка переплыла на другой берег и высадила всех на правый берег ");

                    } else {
                        System.out.println("Без пастуха лодка не поплывет!!!");
                        System.out.println("Кого высадить из лодки что бы посадить пастуха?");
                        for (int i = 0; i < boat.length; i++) {
                            System.out.println(boat[i] + " { " + i + " } ");
                        }
                        key = scan.nextInt();
                        if (key < boat.length) {
                            for (int i = 0; i < left.length; i++) {
                                if (left[i] == "Пусто") {
                                    String check = boat[key];
                                    boat[key] = left[i];
                                    left[i] = check;
                                    break;
                                }
                            }
                        }
                    }
                }
            }else {
                System.out.println("Вы находитесь на правом берегу. Введите цифру для действия.");
                System.out.println();



                for (int i = 0; i < right.length; i++) {
                    if(right[i] != "Пусто"){
                        System.out.println(right[i] + " { " + i + " } ");
                    }
                }
                System.out.println("Отправить лодку введите { 9 }");

                int key = scan.nextInt();
                if(key < right.length){
                    for (int i = 0; i < boat.length; i++) {
                        if(boat[i] == "Пусто") {
                            String check = boat[i];
                            boat[i] = right[key];
                            right[key] = check;
                            break;
                        }
                    }
                }
                if(key == 9) {
                    if (key == 9 && (boat[0] == "Пастух" || boat[1] == "Пастух")) {
                        boatPoint = true;
                        for (int i = 0; i < boat.length; i++) {
                            for (int j = 0; j < left.length; j++) {
                                if (left[j] == "Пусто") {
                                    String chek = left[j];
                                    left[j] = boat[i];
                                    boat[i] = chek;
                                    break;
                                }
                            }
                        }
                        System.out.println("Лодка переплыла на другой берег и высадила всех на левый берег ");
                    } else {
                        System.out.println("Без пастуха лодка не поплывет!!!");
                        System.out.println("Кого высадить из лодки что бы посадить пастуха?");
                        for (int i = 0; i < boat.length; i++) {
                            System.out.println(boat[i] + " { " + i + " } ");
                        }
                        key = scan.nextInt();
                        if (key < boat.length) {
                            for (int i = 0; i < right.length; i++) {
                                if (right[i] == "Пусто") {
                                    String check = boat[key];
                                    boat[key] = right[i];
                                    right[i] = check;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
                int checkWin = 0;
            for (int i = 0; i < right.length; i++) {
                if(right[i].equals("Пастух")) checkWin++;
                if(right[i].equals("Волк")) checkWin++;
                if(right[i].equals("Коза")) checkWin++;
                if(right[i].equals("Капуста")) checkWin++;

            }
            if(checkWin == 4)  wins = true;

           int wolf = 0;
           int shephard = 0;
           int goat = 0;
           int cabbege = 0;
            for (int i = 0; i < left.length; i++) {
                if(left[i].equals("Пастух")) shephard = 1;
                if(left[i].equals("Волк")) wolf = 1;
                if(left[i].equals("Коза")) goat = 1;
                if(left[i].equals("Капуста")) cabbege = 1;
            }
            if(shephard == 0 && (wolf == 1 && goat == 1)){
                System.err.println("Волк съел Козу Вы проиграли!!!!");
                break;
            }
            if(shephard == 0 && (cabbege == 1 && goat == 1)){
                System.err.println("Коза съела капусту Вы проиграли!!!!");
                break;
            }
            wolf = 0;
            shephard = 0;
            goat = 0;
            cabbege = 0;
            for (int i = 0; i < right.length; i++) {
                if(right[i].equals("Пастух")) shephard = 1;
                if(right[i].equals("Волк")) wolf = 1;
                if(right[i].equals("Коза")) goat = 1;
                if(right[i].equals("Капуста")) cabbege = 1;
            }
            if(shephard == 0 && (wolf == 1 && goat == 1)){
                System.err.println("Волк съел Козу Вы проиграли!!!!");
                break;
            }
            if(shephard == 0 && (cabbege == 1 && goat == 1)){
                System.err.println("Коза съела капусту Вы проиграли!!!!");
                break;
            }





        }
    }
}
