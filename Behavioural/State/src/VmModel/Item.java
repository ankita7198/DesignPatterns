package VmModel;

import VmEnum.ItemType;

public class Item {

    ItemType itemType;
    double price;

    public ItemType getItemType(){
        return itemType;
    }

    public void setItemType(ItemType itemType){
        this.itemType = itemType;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

}
