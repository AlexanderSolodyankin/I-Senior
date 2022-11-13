package service;

import models.product.personal_computer.PersonalComputer;
import models.product.personal_computer.pc_acsesuar.ComputerBlock;
import models.product.personal_computer.pc_acsesuar.Display;
import models.product.personal_computer.pc_acsesuar.Keyboard;
import models.product.personal_computer.pc_acsesuar.Mous;
import models.product.personal_computer.pc_complection.*;
import models.product.phone.Phone;
import models.product.phone.SDCard;

import java.util.Random;

public class SetParameter {
    static private Random ran = new Random();


    static private Phone setParameterPhone() {
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

    static private SDCard setParameterSDCard(){
        SDCard sdCard = new SDCard();

        String[] brand = new String[3];
        brand[0] = "KingStone";
        brand[1] = "Corsair";
        brand[2] = "HyperX";
        sdCard.setName(brand[ran.nextInt(brand.length)]);
        sdCard.setVolum(ran.nextInt(5120000) + 64);
        sdCard.setPrice((double) (ran.nextInt(15000)+ 500) / 2);

        return sdCard;
    }

    static private CPU setParameterCPU(){
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

    static private HDD setParametrHDD(){
        String[] name = new String[5];
        name[0] = "Westorn Digital";
        name[1] = "Sigate";
        name[2] = "Maxtor";
        name[3] = "Kingstone";
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

    static private GPU setParameterGPU(){
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

    static private RAM setParameterRAM(){
        String[] brand = new String[3];
        brand[0] = "KingStone";
        brand[1] = "Corsair";
        brand[2] = "HyperX";

        String[] model = new String[3];
        model[0] = "MD-400";
        model[1] = "RPX - " + ran.nextInt(9999) + 1000;
        model[2] = "SuperVolume X" + ran.nextInt(10) + 1;

        RAM  ram = new RAM();
        ram.setBrand(brand[ran.nextInt(brand.length)]);
        ram.setModel(model[ran.nextInt(model.length)]);
        ram.setPurity(ran.nextInt(99999)+ 10000);
        ram.setVolume((ran.nextInt(120) + 1) * 1024);
        ram.setPrice((double) (ran.nextInt(65000) + 500) / 2);

        return ram;
    }

    static private MotherBoard setParameterMotherBoard(){

        String[] name = new String[10];
        name[0] = "BioStar";
        name[1] = "Asus";
        name[2] = "Gigabyte";
        name[3] = "Intel";
        name[4] = "ASRock";
        name[5] = "IBM";
        name[6] = "VIA";
        name[7] = "Dell";
        name[8] = "Tyan";
        name[9] = "Supermicro";

        String[] model = new String[3];
        model[0] = "GPS - " +
                ran.nextInt(10) + ""+
                ran.nextInt(10) + ""+
                ran.nextInt(10) + " " +
                (ran.nextBoolean()?
                        "USB" + ran.nextInt(4)+2 + " " :
                        ran.nextBoolean()? "RDX" : "");
        model[1] = "BR - " + (ran.nextInt(9999) + 1000);
        model[2] = "Macros MSI " + ran.nextInt(999) + 100;

        MotherBoard board = new MotherBoard();
        board.setName(name[ran.nextInt(name.length)]);
        board.setModel(model[ran.nextInt(model.length)]);
        board.setPort(ran.nextInt(16) + 2);
        board.setPrice((double)(ran.nextInt(150000) + 500) / 2 );

        if(ran.nextBoolean()){
            board.setCpu(setParameterCPU());
        }else board.setCpu(null);
        if(ran.nextBoolean()){
            board.setRam(setParameterRAM());
        }else board.setRam(null);
        if(ran.nextBoolean()){
            board.setVideoCard(setParameterGPU());
        }else board.setVideoCard(null);

        board.setPrice(board.getPrice() +
                ((board.getCpu()!= null)? board.getCpu().getPrice() : 0) +
                (board.getRam() != null? board.getRam().getPrice() : 0) +
                (board.getVideoCard() != null? board.getVideoCard().getPrice(): 0));

        return board;
    }

    static private PowerBlock setParametrPW_B(){

        PowerBlock blockPW = new PowerBlock();

        blockPW.setPower(ran.nextInt(2500) + 150);
        blockPW.setPin(ran.nextBoolean()? 8 : 6);
        blockPW.setCountPin(ran.nextBoolean()? 1:
                            ran.nextBoolean()? 2:
                            ran.nextBoolean()? 4 : 6);
        blockPW.setPrice((double) (ran.nextInt(50000) + 1000) / 2);

        String[] names = new String[10];
        names[0] = "Thermaltake";
        names[1] = "Sea Sonic";
        names[2] = "Chieftec";
        names[3] = "Cougar";
        names[4] = "Zalman";
        names[5] = "ENERMAX";
        names[6] = "BE QUIET!";
        names[7] = "Corsair";
        names[8] = "DeepCool";
        names[9] = "FSP";

        blockPW.setName(names[ran.nextInt(names.length)] +
                " PW:" + blockPW.getPower() +
                " PIN" + blockPW.getPin() +
                "/" + blockPW.getCountPin());

        return blockPW;
    }

    static private ComputerBlock setParameterPC_Block(){
        ComputerBlock blockPC = new ComputerBlock();
        blockPC.setBoard(setParameterMotherBoard());
        blockPC.setPowerBlock(setParametrPW_B());
        blockPC.setDisk(setParametrHDD());
        blockPC.setPrice(blockPC.getPowerBlock().getPrice() +
                blockPC.getDisk().getPrice()+
                blockPC.getBoard().getPrice()
                );
        return blockPC;
    }

    static private Display setPArametrMonitor(){

        Display monitor = new Display();
        monitor.setHeith(ran.nextInt(9001) + 600);
        monitor.setWidth(ran.nextInt(9001) + 800);

        String[] name = new String[10];
        name[0] = "Acer";
        name[1] = "MSI";
        name[2] = "LG";
        name[3] = "Samsung";
        name[4] = "Philips";
        name[5] = "AOC";
        name[6] = "ASUS";
        name[7] = "HP";
        name[8] = "Dell";
        name[9] = "ViewSonic";

        String[] models = new String[10];
        models[0] = "V" + (ran.nextInt(900)+ 100) + "w";
        models[1] = "W" + (ran.nextInt(9000)+ 1000) + "S";
        models[2] = "WarX" + (ran.nextInt(9000)+ 1000) + "Color";
        models[3] = "BRX " + (ran.nextInt(90)+ 10) + " Pixel";
        models[4] = "Big " + (ran.nextInt(90)+ 30) + " Pixel";

        monitor.setName(name[ran.nextInt(name.length)]);
        monitor.setModel(models[ran.nextInt(models.length)] +
                " " + monitor.getWidth() + "X" + monitor.getHeith());

        monitor.setPrice((double) (ran.nextInt(90000) + 2000) / 2);

        return monitor;
    }

    static private Keyboard setParameterKey(){

        Keyboard keyboard = new Keyboard();

        String[] names = new String[5];
        names[0] = "A4Tech";
        names[1] = "OKLICK";
        names[2] = "Logitech";
        names[3] = "Gembird";
        names[4] = "HyperX";

        keyboard.setName(names[ran.nextInt(names.length)]);
        keyboard.setCountKey(
                ( ran.nextBoolean()? 64 : (ran.nextBoolean()? 109 : 109 + (ran.nextInt(50) + 10)))
        );

        keyboard.setPrice((double) (ran.nextInt(14000) + 200) / 2);

        return keyboard;
    }

    static private Mous setParameterMous(){
        Mous mous = new Mous();

        String[] names = new String[5];
        names[0] = "A4Tech";
        names[1] = "OKLICK";
        names[2] = "Logitech";
        names[3] = "Gembird";
        names[4] = "HyperX";
        mous.setName(names[ran.nextInt(names.length)]);
        mous.setPrice((double) (ran.nextInt(14000) + 200) / 2);
        return mous;
    }

    static private PersonalComputer setParameterPC(){
        PersonalComputer computer = new PersonalComputer();
        computer.setBlock(setParameterPC_Block());
        computer.setMonitor(setPArametrMonitor());
        computer.setKeyboard(setParameterKey());
        computer.setMous(setParameterMous());
        computer.setPrice(
                computer.getBlock().getPrice()+
                        computer.getKeyboard().getPrice()+
                        computer.getMous().getPrice()+
                        computer.getMonitor().getPrice()
        );
        return computer;
    }










}
