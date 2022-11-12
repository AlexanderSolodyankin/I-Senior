import models.product.personal_computer.pc_complection.CPU;
import models.product.phone.Phone;
import service.SetParametr;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println();

        Phone phone = (Phone) SetParametr.setParametr("phone");
        System.out.println(phone);
        CPU cpu = (CPU)SetParametr.setParametr("cpu");
        System.out.println(cpu);





    }



}
