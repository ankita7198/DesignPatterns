package VmModel;

public class Inventory {

    ItemShelf[] itemShelfList;

    public Inventory(int shelfCount){
        this.itemShelfList = new ItemShelf[shelfCount];
        initialEmptyInventory();
    }

    public void initialEmptyInventory(){
        int startCode = 101;
        for(int  i = 0 ; i < itemShelfList.length ; i++ ){
            ItemShelf shelf = new ItemShelf();
            shelf.setSoldOut(true);
            shelf.setCode(startCode);
            itemShelfList[i] = shelf;
            startCode++;
        }
    }

    public ItemShelf[] getInventory(){
        return this.itemShelfList;
    }

    public void addItem(Item item, int code) throws Exception {
        for (ItemShelf itemShelf : itemShelfList) {
            if (itemShelf.code == code) {
                if(itemShelf.isSoldOut()){
                    itemShelf.setItem(item);
                    itemShelf.setSoldOut(false);
                }
                else {
                    throw new Exception("Item Rack is already occupied");
                }
            }
        }
    }

    public Item getItem(int code) throws Exception {
        for(ItemShelf itemShelf : itemShelfList){
            if(itemShelf.getCode() == code){
                if(itemShelf.isSoldOut()){
                    throw new Exception("Item already sold out");
                }
                return itemShelf.getItem();
            }
        }
        throw new Exception("Invalid code");
    }

    public void updateSoldOutItem(int code){
        for(ItemShelf itemShelf : itemShelfList){
            if(itemShelf.getCode() == code){
                itemShelf.setSoldOut(true);
            }
        }
    }
}
