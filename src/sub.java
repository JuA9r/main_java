import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sub {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sample");
        JButton button = new JButton("A");
        
        button.setBounds(150, 150, 100, 100);
        button.addActionListener(new ButtonAction());

        frame.add(button);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class ButtonAction implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked!");
    }
}