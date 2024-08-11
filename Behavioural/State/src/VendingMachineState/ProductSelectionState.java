package VendingMachineState;

import VmEnum.Coin;
import VmModel.Item;
import VmModel.VendingMachine;

import java.util.List;

public class ProductSelectionState implements VmState {

    public ProductSelectionState(){
        System.out.println("Vending machine in product selection state");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vm) throws Exception {
        throw new Exception("Can't do it at product selection state");
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
        Item item = vm.getInventory().getItem(code);
        double totalPaidAmount = 0;
        for(Coin coin : vm.getCoinList()){
            totalPaidAmount = totalPaidAmount + coin.value;
        }

        if(totalPaidAmount < item.getPrice()){
            System.out.println("Insufficient amount");
            refundFullMoney(vm);
            throw new Exception("Insufficient amount");
        }

        else if(totalPaidAmount >= item.getPrice()){
            if(totalPaidAmount > item.getPrice()){
                getChange((int)(totalPaidAmount - item.getPrice()));
            }
            vm.setVendingMachineState(new DispenseState(vm,code));
        }
    }

    @Override
    public int getChange(int money) throws Exception {
        System.out.println("Returned the change in the Coin Dispense Tray: " + money);
        return money;
    }

    @Override
    public Item dispenseProduct(VendingMachine vm, int code) throws Exception {
        throw new Exception("Can't dispense product at selection state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vm) throws Exception {
        System.out.println("Refund full money");
        vm.setVendingMachineState(new IdleState(vm));
        return vm.getCoinList();
    }

    @Override
    public void updateInventory(VendingMachine vm, Item item, int code) throws Exception {
        throw new Exception("Can't update inventory at selection state");
    }
}
