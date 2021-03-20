import java.awt.event.*;
import javax.swing.*;

public class SwingAdder implements ActionListener{
    JFrame f;
    JButton b;
    JTextField tf1,tf2,tf3;
    JLabel l1,l2;
    SwingAdder(){
        f = new JFrame();
        b = new JButton("+");
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        l1 = new JLabel("x :");
        l2 = new JLabel("y :");

        l1.setBounds(20,20,30,20);
        l2.setBounds(20,50,30,20);

        tf1.setBounds(70,20,200,20);
        tf2.setBounds(70,50,200,20); 
        tf3.setBounds(70,100,200,20); 


        b.setBounds(30,150,50,20);
        b.addActionListener(this);

        f.add(l1);
        f.add(l2);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(b);
        f.setSize(600,500);
        f.setLayout(null);
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        try {
            String str1 = tf1.getText();
            String str2 = tf2.getText();

        int x = Integer.parseInt(str1);
        int y = Integer.parseInt(str2);

        tf3.setText(String.valueOf(x+y));
        } catch (Exception err) {
            System.out.println(err);
        }
    }

    public static void main(String[] args) {
        new SwingAdder();
    }
}
