package VendingMachineState;

import VmEnum.Coin;
import VmModel.Item;
import VmModel.VendingMachine;

import java.util.List;

public class HasMoneyState implements VmState {

    public HasMoneyState(){
        System.out.println("Vending machine in has money state");
    }


    @Override
    public void clickOnInsertCoinButton(VendingMachine vm) throws Exception {
        throw new Exception("Already clicked");
    }

    @Override
    public void insertCoin(VendingMachine vm, Coin coin) throws Exception {
        System.out.println("Accept coin");
        vm.getCoinList().add(coin);
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vm) throws Exception {
        vm.setVendingMachineState(new ProductSelectionState());
    }

    @Override
    public void chooseProduct(VendingMachine vm, int code) throws Exception {
        throw new Exception("Select product selection button first");
    }

    @Override
    public int getChange(int money) throws Exception {
        throw new Exception("Can't get change in Has money state");
    }

    @Override
    public Item dispenseProduct(VendingMachine vm, int code) throws Exception {
        throw new Exception("Can't dispense product in has money state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vm) throws Exception {
        System.out.println("Refunding money");
        vm.setVendingMachineState(new IdleState(vm));
        return vm.getCoinList();
    }

    @Override
    public void updateInventory(VendingMachine vm, Item item, int code) throws Exception {
        throw new Exception("Can't update inventory in has money state");
    }
}
