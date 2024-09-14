import javax.swing.*;
import java.awt.*;

class calculator extends JFrame {
    public static void main(String[] args) {

        calculator frame = new calculator("Calculator");
        frame.setVisible(true);
    }

    // generate window
    calculator(String title){
        setTitle(title);
        setBounds(100, 100, 320, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // generate textbox and input character
        JTextField text = new JTextField();
        text.setForeground(Color.GREEN);
        text.setBackground(Color.BLACK);
        text.setCaretColor(Color.GREEN);
        text.setFont(new Font("Meiryo", Font.ITALIC, 20));
        text.setBounds(10, 10, 280, 40);
        add(text);

        // set button size
        int buttonSize = 70;

        // generate button
        for (int i=1; i<=9; i++) {
            JButton button = new JButton(String.valueOf(i));
            int x = 10+((i-1)%3)*(buttonSize+1);
            int y = 60+((i-1)/3)*(buttonSize+1);
            button.setBounds(x, y, buttonSize, buttonSize);
            add(button);
        }
    }
}
