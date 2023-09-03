package employee.management.system;
/**
 *
 * @author prath
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Splash extends JFrame implements ActionListener {
    Splash(){
        
        getContentPane().setBackground(Color.white); //background color of screen
        setLayout(null);
        
        //add heading
        JLabel heading = new JLabel ("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(80, 30,1200, 60);
        heading.setFont(new Font("serif", Font.PLAIN, 60));
        heading.setForeground(Color.RED);
        add(heading);
        
        //add image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50,100,1050,500);
        add(image);
        
        //add button
        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds(400,400,300,70);
        clickhere.setBackground(Color.black);
        clickhere.setForeground(Color.white);
        clickhere.addActionListener(this);
        image.add(clickhere);
        
        //set size of splash screen
        setSize(1170, 650);
        setLocation(50,50);
        setVisible(true);
        
        while(true){
            heading.setVisible(false);
            try{
                Thread.sleep(700);
            } catch(Exception e) {
                
            }
            
            heading.setVisible(true);
            try{
                Thread.sleep(700);
            } catch(Exception e) {
                
            }            
        }
        
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }

    public static void main(String args[]){
        new Splash();
    }
}
