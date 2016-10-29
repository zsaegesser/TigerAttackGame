public class Tiger{
    private int tigerx=5;
    private int tigery=5;
    private int tigerx2=4;
    private int tigery2=0;
    private int tigerx3=0;
    private int tigery3=4;
    //private Map m =new Map();
    // make random move x3 and y3
    public void RandomMovementX(){

        //this.tigerx= m.getTigerX();
        //this.tigery=m.getTigerX();
        int choice= (int)((Math.random()*2)+1);
        if (choice==1){
            if (tigerx < 5){
                tigerx++;
            }
            else 
                tigerx--;
        }
        else{
            if (tigerx > 1){
                tigerx--;
            }
            else
                tigerx++;
        }
        //m.setTigerX(tigerx);
        //m.setTigerY(tigery);
    }

    public void RandomMovementY(){

        int choice1= (int)((Math.random()*2)+1);
        if (choice1==1){
            if (tigery < 5){
                tigery++;
            }
            else 
                tigery--;
        }
        else{
            if (tigery > 1){
                tigery--;
            }
            else
                tigery++;
        }

    }

    public void RandomMovementX2(){

        int choice= (int)((Math.random()*2)+1);
        if (choice==1){
            if (tigerx2 < 5){
                tigerx2++;
            }
            else 
                tigerx2--;
        }
        else{
            if (tigerx2 > 1){
                tigerx2--;
            }
            else
                tigerx2++;
        }

    }

    public void RandomMovementY2(){

        int choice1= (int)((Math.random()*2)+1);
        if (choice1==1){
            if (tigery2 < 5){
                tigery2++;
            }
            else 
                tigery2--;
        }
        else{
            if (tigery2 > 1){
                tigery2--;
            }
            else
                tigery2++;
        }
    }
    public void RandomMovementX3(){

        //this.tigerx= m.getTigerX();
        //this.tigery=m.getTigerX();
        int choice= (int)((Math.random()*2)+1);
        if (choice==1){
            if (tigerx3 < 5){
                tigerx3++;
            }
            else 
                tigerx3--;
        }
        else{
            if (tigerx3 > 1){
                tigerx3--;
            }
            else
                tigerx3++;
        }
        //m.setTigerX(tigerx);
        //m.setTigerY(tigery);
    }

    public void RandomMovementY3(){

        int choice1= (int)((Math.random()*2)+1);
        if (choice1==1){
            if (tigery3 < 5){
                tigery3++;
            }
            else 
                tigery3--;
        }
        else{
            if (tigery3 > 1){
                tigery3--;
            }
            else
                tigery3++;
        }

    }

    public int getXCoor(){
        return tigerx;
    }

    public int getYCoor(){
        return tigery;
    }

    public void setXCoor(int tigera){
        tigerx=tigera;
    }

    public void setYCoor(int tigerb){
        tigery=tigerb;
    }

    public int getX2Coor(){
        return tigerx2;
    }

    public int getY2Coor(){
        return tigery2;
    }
    public int getX3Coor(){
        return tigerx3;
    }

    public int getY3Coor(){
        return tigery3;
    }
    public void setX3Coor(int tigera3){
        tigerx3=tigera3;
    }

    public void setY3Coor(int tigerb3){
        tigery3=tigerb3;
    }
    public void setX2Coor(int tigera2){
        tigerx2=tigera2;
    }

    public void setY2Coor(int tigerb2){
        tigery2=tigerb2;
    }
}