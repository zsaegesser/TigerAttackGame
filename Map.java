import java.util.*;
public class Map
{
    private String definition;
    private String item;
    private int lx=0;
    private int ly=0;
    private int tigerx;
    private int tigery;
    private int tigerx2;
    private int tigery2;
    private int tigerx3;
    private int tigery3;
    private boolean foundchest;
    private boolean foundhousekey;
    private boolean win;
    private boolean lose;
    private Inventory inv;
    private MapObject m; 
    private Tiger t;
    private boolean roaring;
    private int numTigers;
    
    public Map(){
        definition="";
        item="";
        lx=0;
        ly=0;
        m= new MapObject();
        inv = new Inventory();
        t=new Tiger();
        lose=false;
        win=false;
        numTigers=0;
    }

    public Map(String adefinition, String aitem,int ax,int ay){
        String definition= adefinition;
        String item =aitem;
        lx=ax;
        ly=ay;
        m= new MapObject();
        inv = new Inventory();
        t=new Tiger();
        lose=false;
        win=false;
        numTigers=0;
    }

    public MapObject getMapObject(){
        return m;
    }

    public Inventory getInventory(){
        return inv;
    }
    public void setNumTigers(int newNumTigers){
        numTigers=newNumTigers;
    }
    public int getNumTigers(){
        return numTigers;
    }

    public void setFoundChest(boolean newfoundchest){
        foundchest= newfoundchest;
    }

    public void setFoundHouseKey(boolean newfoundhousekey){
        foundhousekey=newfoundhousekey;
    }

    public void setWin(boolean newwin){
        win=newwin;
    }

    public void setLose(boolean newLose){
        lose= newLose;
    }

    public boolean getWin(){
        return win;
    }

    public boolean getLose(){
        return lose;
    }

    public boolean getFoundHouseKey(){
        return foundhousekey;
    }

    public boolean getFoundChest(){
        return foundchest;
    }

    public String getDefinition(){
        return definition;
    }

    public String getItem(){
        return item;
    }

    public void setDefinition(String newDefinition){
        definition= newDefinition;
    }

    public void setItem(String newItem){
        item= newItem;
    }

    public void setlX(int newX){
        lx=newX;
    }

    public void setlY(int newY){
        ly=newY;
    }

    public int getlX(){
        return lx;
    }

    public int getlY(){
        return ly;
    }

    public int getTigerX(){
        return tigerx;
    }

    public int getTigerY(){
        return tigery;
    }

    public void setTigerX(int newTigerX){
        tigerx=newTigerX;
    }

    public void setTigerY(int newTigerY){
        tigery= newTigerY;
    }

    public void setRoaring(boolean newRoaring){
        roaring= newRoaring;
    }

    public boolean getRoaring(){
        return roaring;
    }

    public void tigers(){
        t.RandomMovementX();
        t.RandomMovementY();
        
        tigerx=t.getXCoor();
        tigery=t.getYCoor();
        
        //System.out.println("PlayerX "+lx+" PlayerY "+ly); //used for debgging
        //System.out.println("X "+tigerx+" Y "+tigery); 
        if((lx==tigerx&&ly==tigery)|| (lx==tigerx2&&ly==tigery2))
            lose= true; //game over
        else
            lose= false; 
    }
    public void twoTigers(){
        t.RandomMovementX();
        t.RandomMovementY();
        t.RandomMovementX2(); 
        t.RandomMovementY2();
        tigerx=t.getXCoor();
        tigery=t.getYCoor();
        tigerx2=t.getX2Coor();
        tigery2=t.getY2Coor();
        //System.out.println("PlayerX "+lx+" PlayerY "+ly); //used for debgging
        //System.out.println("X "+tigerx+" Y "+tigery); 
        //System.out.println("X2 "+tigerx2+" Y2 "+tigery2);
        if((lx==tigerx&&ly==tigery)|| (lx==tigerx2&&ly==tigery2))
            lose= true; //game over
        else
            lose= false; 
    }
    public void threeTigers(){
        t.RandomMovementX();
        t.RandomMovementY();
        t.RandomMovementX2(); 
        t.RandomMovementY2();
        t.RandomMovementX3();
        t.RandomMovementY3();
        tigerx=t.getXCoor();
        tigery=t.getYCoor();
        tigerx2=t.getX2Coor();
        tigery2=t.getY2Coor();
        tigerx3=t.getX3Coor();
        tigery3=t.getY3Coor();
        //System.out.println("PlayerX "+lx+" PlayerY "+ly); //used for debgging
        //System.out.println("X "+tigerx+" Y "+tigery); 
        //System.out.println("X2 "+tigerx2+" Y2 "+tigery2);
        //System.out.println("X3 "+tigerx3+ " Y3 "+tigery3);
        if((lx==tigerx&&ly==tigery)|| (lx==tigerx2&&ly==tigery2))
            lose= true; //game over
        else
            lose= false; 
    }
    public void roar(){
        tigerx=t.getXCoor();
        tigery=t.getYCoor();
        if((lx+1==tigerx&&ly==tigery)||(lx-1==tigerx&&ly==tigery)||(ly+1==tigery&& lx==tigerx)||(ly-1==tigery&&lx==tigerx)||(lx+1==tigerx&&ly+1==tigery)||(lx-1==tigerx&&ly-1==tigery)||(lx+1==tigerx&&ly-1==tigery)||(lx-1==tigerx&&ly+1==tigery))
            roaring=true;
    }

    public void items(){

        if(lx==5&&ly==0){
            if(inv.getShovel()==false){

                inv.setShovel(true);
                m.changeDef(5,0,"You take a shovel from a shed behind the house");
                //m.shovelChange();

            } else {
                m.changeDef(5,0,"You already have a shovel");
            }
        }
        if(lx==4&&ly==3){
            if(inv.getShovel()){
                inv.setShovel(false);
                m.changeDef(4,3,"You find an X and start digging. Your shovel breaks on a rock");
                //m.shovelChangeBack();
            }
        }
        if(lx==0&&ly==4){
            if(inv.getShovel()){
                inv.setShovel(false);
                m.changeDef(0,4,"You find an X and start digging. Your shovel breaks on a rock.");
                //m.shovelChangeBack();
            }
        }
        if(lx==3 &&ly== 5){
            if(inv.getChestKey()==false){
                inv.setChestKey(true);
                m.changeDef(3, 5, "You find an old looking key");
            }
            else{
                m.changeDef(3, 5, "You already have a Chest Key");
            }
        }
        if(lx==2&&ly== 2){
            if((inv.getShovel() || foundchest) && inv.getChestKey()){
                m.changeDef(2,2,"You dug up a chest and unlock it to find another key. Hallelujah...");
                inv.setHouseKey(true);
            } else if(inv.getShovel() && !(inv.getChestKey())){
                m.changeDef(2,2,"You dig up a chest. It is locked");
                foundchest = true;
            } else if(!(inv.getShovel()) && !foundchest){
                m.changeDef(2,2,"You see an X on the ground. Perhaps you could dig it up with a spade-shaped tool");
            }
        }

        /*if(inv.getShovel()){
        foundchest=true;
        m.changeDef(2,2,"You dig up a chest");
        }
        if(foundchest==true){
        if(inv.getChestKey()){
        foundhousekey=true;
        inv.setHouseKey(true);
        m.changeDef(2,2,"You found a key in the chest");
        //  m.chestChange();
        }
        }
        }*/
        if(lx==4 &&ly==1){
            if(inv.getHouseKey()){
                win=true;
            }
        }
        if(lx==3&&ly==5){
            if(inv.getChestKey()==false){
                inv.setChestKey(true);
            }
        }
    }
}
