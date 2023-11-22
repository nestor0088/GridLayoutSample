package gridlayoutsample;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GridLayoutSample {
    static JFrame fr;
    static JPanel p1;
    
    static JButton b1;
    static JButton b2;
    static JButton b3;
    static JButton b4;
    static JButton b5;
    static JButton b6;
    
    static JMenuBar br;
    static JMenu home;
    static JMenu edit;
    static JMenuItem h1;
    static JMenuItem h2;
    static JMenuItem e1;
    
    public static void main(String[] args) {
        fr=new JFrame("GridLayout");
        p1=new JPanel(new GridLayout(3,2));
        
        br=new JMenuBar();
        home=new JMenu("Home");
        edit=new JMenu("Edit");
        
        h1=new JMenuItem("Home Item 1");
        h1.addActionListener(new nestor());
        h2=new JMenuItem("Home Item 2");
        
        e1=new JMenuItem("Edit Item 1");
        
        b1=new JButton("Button 1");
        b1.addActionListener(new nestor());
        b2=new JButton("Button 2");
        b3=new JButton("Button 3");
        b4=new JButton("Button 4");
        b5=new JButton("Button 5");
        b6=new JButton("Button 6");

        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        
        br.add(home);
        br.add(edit);
        
        home.add(h1);
        home.add(h2);
        edit.add(e1);
        
        fr.setJMenuBar(br);
        fr.add(p1);
        fr.setSize(300, 350);
        fr.setLocation(300,350);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     public static class nestor implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(fr,"Thanks for using this App !!!");
        }
     }
}
