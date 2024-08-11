package VendingMachineState;

import VmEnum.Coin;
import VmModel.Item;
import VmModel.VendingMachine;

import java.util.List;

//better to create an abstract class as this violates interface segregation principle
public interface VmState {
    public void clickOnInsertCoinButton(VendingMachine vm) throws Exception;
    public void insertCoin(VendingMachine vm, Coin coin) throws Exception;
    public void clickOnStartProductSelectionButton(VendingMachine vm) throws Exception;
    public void chooseProduct(VendingMachine vm, int code) throws Exception;
    public int getChange(int money) throws Exception;
    public Item dispenseProduct(VendingMachine vm, int code) throws Exception;
    public List<Coin> refundFullMoney(VendingMachine vm) throws Exception;
    public void updateInventory(VendingMachine vm, Item item, int code) throws Exception;
}
