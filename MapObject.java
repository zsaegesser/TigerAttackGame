
public class MapObject
{
    private String[][] defi = new String[6][6];
    //private Map m= new Map();
    //private Inventory in=new Inventory();//m.getInventory();
    
    
    public MapObject(){
        defi[0][0]= "You are in a clearing. There is a cliff to the west and impassable mountains to the north.";
        defi[1][0]= "You are in a thin forest. There are impassable mountains to the north.";
        defi[2][0]= "You see a giant rock. A sign describes it as ‘Heavy Sasha Rock’. There are impassable mountains to the north.";
        defi[3][0]= "You are in a thick forest. There are impassable mountains to the north.";
        defi[4][0]="You are on a pond. There is an old trail leading east. There are impassable mountains to the north.";
        defi[5][0]="You see a shed. There is a shovel in the shed. Take the shovel. There are impassable mountains to the north and a lake to the east.";
        defi[0][1]="You are in a forest. There is a cliff to the west.";
        defi[1][1]="You are in a forest.";
        defi[2][1]="You are in a rocky clearing. The rocks seem to become more present to the east.";
        defi[3][1]="You see large gorge. A sign labels it as ‘Garen Gorge.'";
        defi[4][1]="You find a house. The door appears to be locked.";
        defi[5][1]="You are in a forest. There is a small trail leading north. There is a lake to the east.";
        defi[0][2]= "You are in a valley. There is a cliff to the west.";
        defi[1][2]= "You are deep in the valley. You see fields of wheat all around.";
        defi[2][2] = "In the edge of the valley you find a big X painted in black paint.";
        defi[3][2] = "You are in a clearing. To the north you see a gorge.";
        defi[4][2] = "You are in a swampy area. You look down to see a sign that says ‘Master Kennen Swamp’.";
        defi[5][2] = "To the east there is giant lake. You look in and can’t see the bottom.";
        defi[0][3] = "You are at the skirts of a valley where you find 3 giant rocks . The rocks are numbered 1,2, and 4.";
        defi[1][3] = "You look around to see a sea of green grass. ";
        defi[2][3] = "You look to the east and see giant pillars.";
        defi[3][3] = "You find yourself surrounded by a sea of beutiful white granite columns. The columns seem to form a large circle. In the center of this circle, the floor is engaved. It reads 'You stand apon the sacred ground dedicated to the Master of the Wise and Lazy, Amit Joshipura'. The temple is peaceful. You get the feeling that this temple should be left undisturbed.";
        defi[4][3] = "You look around the tall green grass and find an X.";
        defi[5][3] = "You are on a small beach. You see a large lake to the east.";
        defi[0][4] = "You see a mound with an X on it. There is a cliff to the west.";
        defi[1][4] = "You see a sign that says 'Bushell Bush'. It appears to be a blooming strawberry bush that is full of knowledge and gaming skills.";
        defi[2][4] = "You are in a forest.";
        defi[3][4] = "You are by a small pond in a clearing.";
        defi[4][4] = "You are in a thick forest. ";
        defi[5][4] = "You are at a beach with a lake to the east. This area is very rocky.";
        defi[0][5] = "You are in a forest with a lake to the south and a cliff to the west. ";
        defi[1][5] = "You are near the top of a cliff with a lake to the south. You peer over and watch the powerful waves rip at the rocks below";
        defi[2][5] = "You are on a hill with a lake to the south.";
        defi[3][5] = "You are on a beach with a lake to the south. You find a small key in the sand. It seems out of place and you decide to take it.";
        defi[4][5] = "You are on a beach with a lake to the south.";
        defi[5][5] = "You are at the entrance to a tiger’s den with a lake to the east and south.";
        
       
    }

    public String getDef(int x, int y){
        return defi[x][y];
    }

    //public void chestChange(){
    //    if(in.getShovel()){
    //        if(in.getChestKey())
    //            defi[2][2] = "You find an X and start digging. You find a chest and open with the key. Inside is another key.";
    //        else
    //            defi[2][2]= "You find an X and start digging. You find a chest. The chest is locked and is too heavy to carry.";
    //    }
    //}

    /*public void shovelChange(){
        if(in.getShovel())
            defi[5][0] = "You are at the shed";
    }

    public void shovelChangeBack(){
        if(in.getShovel()==false){
            defi[0][4]= "You find an X and start digging. You hit a rock and the shovel breaks.";
            defi[4][3]= "You find an X and start digging. You hit a rock and the shovel breaks.";
            defi[5][0]= "You are at the shed. You take another shovel";
        }
    }

    public void houseChange(){
        if(in.getHouseKey()==false){
            if(in.getChestKey())
                defi[4][1]= "You are at the house. This key does not unlock the door";
        }
    }*/
    
    public void changeDef(int x, int y, String newDef){
        defi[x][y] = newDef;
    }
}