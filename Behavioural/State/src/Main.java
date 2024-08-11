import VendingMachineState.VmState;
import VmEnum.Coin;
import VmEnum.ItemType;
import VmModel.Item;
import VmModel.ItemShelf;
import VmModel.VendingMachine;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        VendingMachine vm = new VendingMachine();

        try{
            System.out.println("Filling up the inventory!");
            fillInventory(vm);
            displayInventory(vm);

            VmState vmState = vm.getVendingMachineState();
            vmState.clickOnInsertCoinButton(vm);

            vmState = vm.getVendingMachineState();
            vmState.insertCoin(vm, Coin.NICKEL);
            vmState.insertCoin(vm, Coin.QUARTER);

            System.out.println(" ------------------------------ ");
            System.out.println(" Clicking on product insert button ");
            System.out.println(" ------------------------------ ");
            vmState.clickOnStartProductSelectionButton(vm);

            vmState = vm.getVendingMachineState();
            vmState.chooseProduct(vm,103);

            System.out.println(" ------------------------------ ");
            System.out.println(" ------------------------------ ");
            System.out.println(" ------------------------------ ");
            System.out.println(" ------------------------------ ");
            displayInventory(vm);

        }
        catch(Exception e){
            System.out.println("Caught yaa");
        }

    }

    public static void fillInventory(VendingMachine vm){
        ItemShelf[] itemShelf = vm.getInventory().getInventory();
        for(int i = 0 ; i < itemShelf.length ; i++ ){
            Item item = new Item();
            if( i < 3){
                item.setItemType(ItemType.COKE);
                item.setPrice(12);
            }
            else if( i < 5 ){
                item.setItemType(ItemType.PEPSI);
                item.setPrice(9);
            }
            else if( i < 7 ){
                item.setItemType(ItemType.JUICE);
                item.setPrice(13);
            }
            else {
                item.setItemType(ItemType.SODA);
                item.setPrice(7);
            }
            itemShelf[i].setItem(item);
            itemShelf[i].setSoldOut(false);
        }
    }

    public static void displayInventory(VendingMachine vm){
        ItemShelf[] itemShelf = vm.getInventory().getInventory();
        for (ItemShelf shelf : itemShelf) {
            System.out.println(
                    "Code : " + shelf.getCode() +
                    " , Item : " + shelf.getItem().getItemType() +
                    " , Price : " + shelf.getItem().getPrice() +
                    " , isAvailable " + !shelf.isSoldOut()
            );
        }
    }
}
