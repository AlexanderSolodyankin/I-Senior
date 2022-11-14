import models.product.dres.Boots;
import models.product.personal_computer.PersonalComputer;
import models.product.personal_computer.pc_complection.CPU;
import models.product.phone.Phone;
import service.Sels;
import service.SetParameter;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Phone telephone = (Phone) SetParameter.setParametr();
        System.out.println(telephone);

    }
}
