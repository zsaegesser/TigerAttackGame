import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;

public class Frame extends JFrame implements ActionListener
{
    private JButton north = new JButton("North");
    private JButton south = new JButton("South");
    private JButton east = new JButton("East");
    private JButton west = new JButton("West");
    private JButton action = new JButton("Action");
    private JTextArea def = new JTextArea("You are trying to get into the house in the world of 'Tiger Attack' to save yourself from a tiger that is trying to eat you. Press the def button to view the description of the area you are in and press the inv button to view your items. Godspeed...");//directions
    private JButton invB = new JButton("Inv");
    private JButton defB = new JButton("Def");
    private JTextArea roar= new JTextArea("You hear a tiger's growl.");
    private JButton menu = new JButton("Menu");

    private JLabel coords = new JLabel("Coordinates");
    //private MainMenu menu= new MainMenu();
    private Map m= new Map();
    private MapObject k=m.getMapObject(); //new MapObject();
    private Inventory in =m.getInventory();
    
    public Frame(int numTigers){
        
        super("Tiger Attack");
        
        m.setNumTigers(numTigers);
        
        def.setLineWrap(true);
        def.setWrapStyleWord(true);
        setLayout(new BorderLayout(5,10));

        def.setSize(400,400);
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        Panel p3 = new Panel();
        Panel p4 = new Panel();
        Panel p5 =new Panel();

        north.addActionListener(this);
        south.addActionListener(this);
        east.addActionListener(this);
        west.addActionListener(this);
        action.addActionListener(this);
        invB.addActionListener(this);
        defB.addActionListener(this);
        menu.addActionListener(this);

        Box topBox = Box.createHorizontalBox();
        topBox.add(Box.createVerticalStrut(30));
        topBox.add(def);
        p3.add(topBox);
        Box centerBox = Box.createHorizontalBox();
        centerBox.add(Box.createVerticalStrut(30));
        centerBox.add(roar);
        p5.add(centerBox);
        //p4.setLayout(new GridLayout(3,1));
        add(p3,BorderLayout.NORTH);
        //add(coords,BorderLayout.CENTER);
        add(p1,BorderLayout.SOUTH);
        add(p5,BorderLayout.CENTER);
        roar.setVisible(false);
        /*ImageIcon img = new ImageIcon("grid.jpg");
        JLabel lbl = new JLabel(img);
        p2.add(lbl,BorderLayout.CENTER);*/

        p1.setLayout(new GridLayout(3,3));

        p1.add(new JLabel());
        p1.add(north);
        p1.add(new JLabel());
        p1.add(west);
        //p1.add(action);
        p1.add(south);
        p1.add(east);
        p1.add(defB);
        p1.add(menu);
        p1.add(invB);
        Font font = new Font("Courier New", Font.BOLD, 14);
        Font f1 = new Font("Courier New", Font.BOLD, 16);
        Font font2= new Font("Courier New", Font.BOLD, 20);
        
        def.setFont(font);
        defB.setFont(f1);
        invB.setFont(f1);
        north.setFont(f1);
        east.setFont(f1);
        south.setFont(f1);
        west.setFont(f1);
        roar.setFont(font2);
        menu.setFont(f1);
        menu.setForeground(Color.WHITE);
        defB.setForeground(Color.WHITE);
        def.setForeground(Color.WHITE);
        invB.setForeground(Color.WHITE);
        north.setForeground(Color.WHITE);
        south.setForeground(Color.WHITE);
        east.setForeground(Color.WHITE);
        west.setForeground(Color.WHITE);
        roar.setForeground(Color.WHITE);
        this.getContentPane().setBackground(Color.BLACK);
        def.setBackground(Color.BLACK);
        menu.setBackground(Color.BLACK);
        defB.setBackground(Color.BLACK);
        invB.setBackground(Color.BLACK);
        north.setBackground(Color.BLACK);
        east.setBackground(Color.BLACK);
        west.setBackground(Color.BLACK);
        south.setBackground(Color.BLACK);
        roar.setBackground(Color.BLACK);
        // add(p4);
        def.setEditable(false);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public Map getMap(){
        return m;
    }

    public void actionPerformed(ActionEvent e){
        String temp ="";
        if(e.getSource() == menu){
            setVisible(false);
            
            MainMenu mm= new MainMenu();
            
        }
        if(m.getLose()==false){
            if(m.getWin()==false){

                if(e.getSource() == north){
                    //System.out.print(getY());
                    if(m.getlY()-1>=0){

                        m.setlY(m.getlY()-1);

                        if(m.getNumTigers()==1)
                            m.tigers();
                        if(m.getNumTigers()==2)
                            m.twoTigers();
                        if(m.getNumTigers()==3)
                            m.threeTigers();

                        m.items();
                        m.setRoaring(false);
                        m.roar();
                        def.setText(k.getDef(m.getlX(), m.getlY())); // gets the def from map object
                        roar.setVisible(false);

                        if(m.getRoaring())
                            roar.setVisible(true);
                    }
                    else
                        def.setText("You can't go that way");
                } else if(e.getSource() == south){
                    if(m.getlY()+1<=5){

                        m.setlY(m.getlY()+1);
                        if(m.getNumTigers()==1)
                            m.tigers();
                        if(m.getNumTigers()==2)
                            m.twoTigers();
                        if(m.getNumTigers()==3)
                            m.threeTigers();

                        m.items();
                        roar.setVisible(false);
                        m.setRoaring(false);
                        def.setText(k.getDef(m.getlX(), m.getlY()));roar.setVisible(false);
                        m.roar();

                        if(m.getRoaring())
                            roar.setVisible(true);
                    }

                    else
                        def.setText("You can't go that way");
                } else if(e.getSource() == east){
                    if(m.getlX()+1 <=5){

                        m.setlX(m.getlX()+1);
                        if(m.getNumTigers()==1)
                            m.tigers();
                        if(m.getNumTigers()==2)
                            m.twoTigers();
                        if(m.getNumTigers()==3)
                            m.threeTigers();

                        m.items();
                        roar.setVisible(false);
                        m.setRoaring(false);
                        def.setText(k.getDef(m.getlX(), m.getlY()));
                        m.roar();

                        if(m.getRoaring())
                            roar.setVisible(true);
                    }
                    else
                        def.setText("You can't go that way");
                } else if(e.getSource() == west){
                    if(m.getlX()-1>=0){

                        m.setlX(m.getlX()-1);
                        if(m.getNumTigers()==1)
                            m.tigers();
                        if(m.getNumTigers()==2)
                            m.twoTigers();
                        if(m.getNumTigers()==3)
                            m.threeTigers();
                        m.items();

                        roar.setVisible(false);
                        m.setRoaring(false);
                        m.roar();
                        def.setText(k.getDef(m.getlX(), m.getlY()));

                        if(m.getRoaring())
                            roar.setVisible(true);
                    }
                    else
                        def.setText("You can't go that way");
                } else if(e.getSource() == defB){
                    def.setText(k.getDef(m.getlX(), m.getlY()));
                } else if(e.getSource() == invB){
                    if(in.getChestKey()==true)
                        temp = temp + " Chest Key";

                    if(in.getHouseKey()==true)
                        temp = temp + " House Key";

                    if(in.getShovel()==true)
                        temp = temp + " Shovel";
                    if(in.getShovel()==false&&in.getChestKey()==false&&in.getHouseKey()==false)
                        def.setText("You have no items");
                    def.setText(temp);

                }
                if(m.getWin())
                    def.setText("Congratulations you entered the house. You are safe from the tiger. You win!");
                if(m.getLose()){
                    def.setText("A tiger attacked you!");

                }
                repaint();

            }
        }
    }
}