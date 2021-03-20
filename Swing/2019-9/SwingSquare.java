import javax.swing.*;
import java.awt.event.*;

public class SwingSquare implements ActionListener {
    JFrame f;
    JButton b1;
    JTextField f1;

    SwingSquare() {
        f = new JFrame();
        JLabel l1 = new JLabel("Enter a number");
        f1 = new JTextField();
        b1 = new JButton("Make Square");
        b1.setBounds(200, 150, 150, 20);

        l1.setBounds(20, 20, 200, 20);
        f1.setBounds(250, 20, 300, 20);
        b1.addActionListener(this);
        f.add(l1);
        f.add(f1);
        f.add(b1);

        f.setSize(600, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String x = f1.getText();
        try {
            int num = Integer.parseInt(x);
            f1.setText(String.valueOf(num * num));
        } catch (Exception err) {
            System.out.println(err);
        }

    }

    public static void main(String[] args) {
        new SwingSquare();
    }
}
