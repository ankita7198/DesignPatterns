package VendingMachineState;

import VmEnum.Coin;
import VmModel.Item;
import VmModel.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements VmState {

    public IdleState(){
        System.out.println("Currently Vending machine is in IdleState");
    }

    public IdleState(VendingMachine vm){
        System.out.println("Currently Vending machine is in IdleState");
        vm.setCoinList(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vm) throws Exception {
        vm.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void insertCoin(VendingMachine vm, Coin coin) throws Exception {
        throw new Exception("You can't insert coin in idle state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vm) throws Exception {
        throw new Exception("First you need to click on insert coin button");
    }

    @Override
    public void chooseProduct(VendingMachine vm, int code) throws Exception {
        throw new Exception("You can't choose product in idle state");
    }

    @Override
    public int getChange(int money) throws Exception {
        throw new Exception("You can't get change in idle state");
    }

    @Override
    public Item dispenseProduct(VendingMachine vm, int code) throws Exception {
        throw new Exception("Can't dispense product in idle state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vm) throws Exception {
        throw new Exception("Can't refund money in idle state");
    }

    @Override
    public void updateInventory(VendingMachine vm, Item item, int code) throws Exception {
        vm.getInventory().addItem(item,code);
    }
}
