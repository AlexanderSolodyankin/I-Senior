package models.product.personal_computer.pc_acsesuar;

import models.product.personal_computer.pc_complection.HDD;
import models.product.personal_computer.pc_complection.MotherBoard;
import models.product.personal_computer.pc_complection.PowerBlock;
import service.Sels;

public class ComputerBlock implements Sels {
    private MotherBoard board;
    private PowerBlock powerBlock;
    private HDD disk;

    public ComputerBlock(MotherBoard board, PowerBlock powerBlock, HDD disk) {
        this.board = board;
        this.powerBlock = powerBlock;
        this.disk = disk;
    }

    public MotherBoard getBoard() {
        return board;
    }

    public void setBoard(MotherBoard board) {
        this.board = board;
    }

    public PowerBlock getPowerBlock() {
        return powerBlock;
    }

    public void setPowerBlock(PowerBlock powerBlock) {
        this.powerBlock = powerBlock;
    }

    public HDD getDisk() {
        return disk;
    }

    public void setDisk(HDD disk) {
        this.disk = disk;
    }

    @Override
    public String toString() {
        return "ComputerBlock{" +
                "board=" + board +
                ", powerBlock=" + powerBlock +
                ", disk=" + disk +
                '}'+ "\n";
    }

    @Override
    public void sels() {

    }
}
