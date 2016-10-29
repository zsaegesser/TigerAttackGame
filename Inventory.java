public class Inventory
{
    private boolean chest;
    private boolean housekey;
    private boolean chestkey;
    private boolean shovel;
    public Inventory(){
        chest=false;
        housekey=false;
        chestkey=false;
        shovel=false;
    }
    
    public boolean getChestKey(){
        return chestkey;
    }

    public boolean getChest(){
        return chest;
    }

    public boolean getHouseKey(){
        return housekey;
    }

    public boolean getShovel(){
        return shovel;
    }

    public void setShovel(boolean newShovel){
        shovel = newShovel;
    }

    public void setHouseKey(boolean newHouseKey){
        housekey= newHouseKey;
    }

    public void setChest(boolean newChest){
        chest=newChest;
    }

    public void setChestKey(boolean newChestKey){
        chestkey=newChestKey;
    }

    
}