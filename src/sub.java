import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class sub {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sample");
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.setBounds((i-1)%3*100+50, (i-1)/3*100+50, 80, 80);
            button.addActionListener(new ButtonAction(i));
            frame.add(button);
        }

        frame.setVisible(true);
    }
}

class ButtonAction implements ActionListener {
    private final int number;

    public ButtonAction(int number) {
        this.number = number;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Pressed: " + number);
    }
}
