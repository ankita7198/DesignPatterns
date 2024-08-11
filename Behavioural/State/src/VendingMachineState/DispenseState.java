package VendingMachineState;

import VmEnum.Coin;
import VmModel.Item;
import VmModel.VendingMachine;

import java.util.List;

public class DispenseState implements VmState {

    public DispenseState(VendingMachine vm, int code) throws Exception {
        System.out.println("In dispense state");
        dispenseProduct(vm,code);
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vm) throws Exception {
        throw new Exception("Already clicked");
    }

    @Override
    public void insertCoin(VendingMachine vm, Coin coin) throws Exception {
        throw new Exception("Already inserted");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vm) throws Exception {
        throw new Exception("Already selected");
    }

    @Override
    public void chooseProduct(VendingMachine vm, int code) throws Exception {
        throw new Exception("Already chosen");
    }

    @Override
    public int getChange(int money) throws Exception {
        throw new Exception("Change can't be done in dispense state");
    }

    @Override
    public Item dispenseProduct(VendingMachine vm, int code) throws Exception {
        System.out.println("Dispensing product");
        Item item = vm.getInventory().getItem(code);
        vm.getInventory().updateSoldOutItem(code);
        vm.setVendingMachineState(new IdleState(vm));
        return item;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vm) throws Exception {
        throw new Exception("Can't refund at dispense state");
    }

    @Override
    public void updateInventory(VendingMachine vm, Item item, int code) throws Exception {
        throw new Exception("Can't update inventory at dispense state");
    }
}
