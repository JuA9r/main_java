import javax.swing.*;

public class ButtonAct {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ActListenerSample");
        JButton button = new JButton("Submit");

        button.setBounds(10, 10, 100, 20);

        frame.setLayout(null);
        frame.getContentPane().add(button);
        frame.setSize(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
