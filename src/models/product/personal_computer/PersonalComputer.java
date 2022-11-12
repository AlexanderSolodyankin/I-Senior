package models.product.personal_computer;

import models.product.personal_computer.pc_acsesuar.ComputerBlock;
import models.product.personal_computer.pc_acsesuar.Display;
import models.product.personal_computer.pc_acsesuar.Keyboard;
import models.product.personal_computer.pc_acsesuar.Mous;
import service.Sels;

public class PersonalComputer implements Sels {
    private ComputerBlock block;
    private Display monitor;
    private Keyboard keyboard;
    private Mous mous;

    public PersonalComputer(ComputerBlock block, Display monitor, Keyboard keyboard, Mous mous) {
        this.block = block;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mous = mous;
    }

    public ComputerBlock getBlock() {
        return block;
    }

    public void setBlock(ComputerBlock block) {
        this.block = block;
    }

    public Display getMonitor() {
        return monitor;
    }

    public void setMonitor(Display monitor) {
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mous getMous() {
        return mous;
    }

    public void setMous(Mous mous) {
        this.mous = mous;
    }

    @Override
    public String toString() {
        return "PersonalComputer{" +
                "block=" + block +
                ", monitor=" + monitor +
                ", keyboard=" + keyboard +
                ", mous=" + mous +
                '}' + "\n";
    }

    @Override
    public void sels() {

    }
}
