package software.ulpgc.kata7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MainFrame extends JFrame implements ActionListener {
    private JButton jButton;
    private  JPanel jPanel;
    private Random coin = new Random();
    private JLabel jLabel;
    public MainFrame() throws HeadlessException{
        jButton = new JButton("Click for flip.");
        jButton.setSize(200, 40);
        jButton.addActionListener(this);
        this.add(jButton);

        jLabel = new JLabel();
        jLabel.setSize(100, 100);
        this.add(jLabel);

        this.setTitle("Coin flip");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int a = coin.nextInt(0, 2);
        if (a == 1){
            jLabel.setText("Head");
        }
        else if(a == 0){
            jLabel.setText("Tail");
        }
    }
}
