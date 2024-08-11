package VmModel;

import VendingMachineState.IdleState;
import VendingMachineState.VmState;
import VmEnum.Coin;

import java.util.ArrayList;

public class VendingMachine {
    private VmState vmState;
    private Inventory inventory;
    ArrayList<Coin> coinList ;

    public VendingMachine(){
        vmState = new IdleState();
        inventory = new Inventory(10);
        coinList = new ArrayList<>();
    }

    public VmState getVendingMachineState(){
        return vmState;
    }

    public void setVendingMachineState(VmState vmState){
        this.vmState = vmState;
    }

    public Inventory getInventory(){
        return inventory;
    }

    public void setInventory(Inventory inventory){
        this.inventory = inventory;
    }

    public ArrayList<Coin> getCoinList(){
        return coinList;
    }

    public void setCoinList(ArrayList<Coin> coinList) {
        this.coinList = coinList;
    }
}
