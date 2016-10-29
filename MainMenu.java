import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MainMenu extends JFrame implements ActionListener
{
    private JButton oneTiger = new JButton("Easy (1 Tiger) Game");
    private JButton twoTiger= new JButton("Medium (2 Tigers) Game");
    private JButton threeTiger= new JButton("Hard(3 Tigers) Game");
    private JButton quit = new JButton("Quit");
    //private JComboBox options = new JComboBox(new String[] {"1 Tiger","2 Tigers","3 Tigers"});
    
    public MainMenu(){
        threeTiger.addActionListener(this);
        twoTiger.addActionListener(this);
        oneTiger.addActionListener(this);
        quit.addActionListener(this);
        Panel p1 = new Panel();
        p1.setLayout(new GridLayout(4, 1));
        p1.add(oneTiger);
        p1.add(twoTiger);
        p1.add(threeTiger);
        p1.add(quit);
        add(p1);
        //add(twoTiger,BorderLayout.CENTER);
        //add(threeTiger,BorderLayout.CENTER);
        //add(threeTiger,BorderLayout.SOUTH);
        //add(oneTiger,BorderLayout.NORTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
        oneTiger.setForeground(Color.WHITE);
        twoTiger.setForeground(Color.WHITE);
        threeTiger.setForeground(Color.WHITE);
        quit.setForeground(Color.WHITE);
        Font f = new Font("Courier New", Font.BOLD, 20);
        oneTiger.setFont(f);
        twoTiger.setFont(f);
        threeTiger.setFont(f);
        quit.setFont(f);
        oneTiger.setBackground(Color.BLACK);
        twoTiger.setBackground(Color.BLACK);
        threeTiger.setBackground(Color.BLACK);
        this.getContentPane().setBackground(Color.BLACK);
        quit.setBackground(Color.BLACK);
        
        
    }

    public void actionPerformed(ActionEvent e) { 

        if(e.getSource() == threeTiger){
            
            Frame f = new Frame(3);
            setVisible(false);
        }
        else if(e.getSource() == oneTiger) {
            
            Frame f = new Frame(1);
            setVisible(false);
        }
        else if(e.getSource() == twoTiger){
            
            Frame f = new Frame(2);
            setVisible(false);
        }
        else
            System.exit(0);
    }
    
}

