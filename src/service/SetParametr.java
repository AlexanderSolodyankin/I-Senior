package service;

import models.product.personal_computer.pc_complection.CPU;
import models.product.phone.Phone;

import java.util.Random;

public class SetParametr {
    static Random ran = new Random();

    public static Object setParametr(String setProduct) {
       if (setProduct.equals("phone")){
           return setParametrPhone();
       }else if(setProduct.equals("cpu")){
            return setParametrCPU();
       }
        return null;
    }

    static Phone setParametrPhone() {
        String[] names = new String[10];
        names[0] = "iPhone";
        names[1] = "Samsung";
        names[2] = "XiaMi";
        names[3] = "Nokia";
        names[4] = "Siemens";
        names[5] = "Fly";
        names[6] = "Asus";
        names[7] = "Very Zone";
        names[8] = "Philips";
        names[9] = "Astra";

        String[] models = new String[10];
        models[0] = "Redmi A10";
        models[1] = "6330";
        models[2] = "RDB - 6700";
        models[3] = "V6900";
        models[4] = "MGT 8000";
        models[5] = "Redmi note 9";
        models[6] = "Bl - 518";
        models[7] = "BL - 760";
        models[8] = "N - 900";
        models[9] = "2130 Plan";

        String[] color = new String[7];
        color[0] = "Red";
        color[1] = "Blue";
        color[2] = "White";
        color[3] = "Yellow";
        color[4] = "Green";
        color[5] = "Violet";
        color[6] = "Orang";

       Phone phone = new Phone(names[ran.nextInt(names.length)],
                models[ran.nextInt(models.length)],
                color[ran.nextInt(color.length)],
                ran.nextInt(150000) + 5000);
        return phone;
    }

    static CPU setParametrCPU(){
        String[] brand = new String[2];
        brand[0] = "Intel";
        brand[1] = "AMD";

        String[] models = new String[3];
        models[0] = "Socket 486 Core i";
        models[1] = "Socket 775 DualCore i";
        models[2] = "Socket 115" + ran.nextInt(7) + " MultiCore i (" + ran.nextInt(17) + ")";

        CPU cpu = new CPU();
        cpu.setBrand(brand[ran.nextInt(brand.length)]);
        cpu.setModel(models[ran.nextInt(models.length)]);
        cpu.setPurity((double) (ran.nextInt(10) + 1) / 2);
        cpu.setKesh(ran.nextInt(33) + 1);
        cpu.setPrice((double) (ran.nextInt(50000) + 500) / 2.1);

        return cpu;
    }
}
