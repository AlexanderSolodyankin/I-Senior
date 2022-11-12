package service;

import models.product.personal_computer.pc_complection.CPU;
import models.product.personal_computer.pc_complection.GPU;
import models.product.personal_computer.pc_complection.HDD;
import models.product.phone.Phone;

import java.util.Random;

public class SetParametr {
    static private Random ran = new Random();

    public static Object setParametr(String setProduct) {
       if (setProduct.equals("phone")){
           return setParametrPhone();
       }else if(setProduct.equals("cpu")){
            return setParametrCPU();
       }
        return null;
    }

    static private Phone setParametrPhone() {
        String[] names = new String[10];
        names[0] = "iPhone"; names[1] = "Samsung"; names[2] = "XiaMi"; names[3] = "Nokia";
        names[4] = "Siemens"; names[5] = "Fly"; names[6] = "Asus"; names[7] = "Very Zone";
        names[8] = "Philips";names[9] = "Astra";

        String[] models = new String[10];
        models[0] = "Redmi A10";models[1] = "6330"; models[2] = "RDB - 6700"; models[3] = "V6900";
        models[4] = "MGT 8000"; models[5] = "Redmi note 9"; models[6] = "Bl - 518"; models[7] = "BL - 760";
        models[8] = "N - 900"; models[9] = "2130 Plan";

        String[] color = new String[7];
        color[0] = "Red"; color[1] = "Blue"; color[2] = "White"; color[3] = "Yellow"; color[4] = "Green";
        color[5] = "Violet"; color[6] = "Orang";

       Phone phone = new Phone(names[ran.nextInt(names.length)],
                models[ran.nextInt(models.length)],
                color[ran.nextInt(color.length)],
                ran.nextInt(150000) + 5000);
        return phone;
    }

    static private CPU setParametrCPU(){
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
    static private HDD setParametr(){
        String[] name = new String[5];
        name[0] = "Westorn Digital"; name[1] = "Sigate";
        name[2] = "Maxtor"; name[3] = "Kingstone";
        name[4] = "Gigabyte";

        String[] models = new String[5];
        models[0] = "IDE - ATA";
        models[1] = "IDE - SATA";
        models[2] = "IDE _ SSD";
        models[3] = "IDE - M1 SATA";
        models[4] = "SSD - M2";

        HDD hardDisk = new HDD();
        hardDisk.setName(name[ran.nextInt(name.length)]);
        hardDisk.setModel(models[ran.nextInt(name.length)]);
        hardDisk.setVolume(ran.nextInt(2000) + 20);
        hardDisk.setPrice(((double) ran.nextInt(30000) + 500) / 2.0);

        return hardDisk;
    }

    static private GPU setParametrGPU(){
        String[] brand = new String[2];
        brand[0] = "NVidea";
        brand[1] = "Radion";

        String[] models = new String[5];
        models[0] = "HD - " + ran.nextInt(10) +""+
                ran.nextInt(10) +""+
                ran.nextInt(10) +""+
                ran.nextInt(10) ;
        models[1] = "GeForce " + ran.nextInt(10) +""+
                ran.nextInt(10) +""+
                ran.nextInt(10) +""+
                ran.nextInt(10) + (ran.nextBoolean()? "TI": "");
        models[2] = "TNT For Byte " + ran.nextInt(10000) + 1000;
        models[3] = "RTX " + ran.nextInt(999) + 100;
        models[4] = "S3";

        GPU gpu = new GPU();
        gpu.setName(brand[ran.nextInt(brand.length)]);
        gpu.setModel(models[ran.nextInt(models.length)]);
        gpu.setgRAM(ran.nextInt(37888) + 500);
        gpu.setPrice(ran.nextInt(1500000) + 2000);
        return gpu;
    }

}
