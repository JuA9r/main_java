import javax.swing.*;
import java.awt.*;

class calculator extends JFrame {
    public static void main(String[] args) {

        calculator frame = new calculator("Calculator");
        frame.setVisible(true);
    }

    calculator(String title){
        setTitle(title);
        setBounds(100, 100, 320, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JTextField text = new JTextField();
        text.setForeground(Color.GREEN);
        text.setBackground(Color.BLACK);
        text.setCaretColor(Color.GREEN);
        text.setFont(new Font("Meiryo", Font.ITALIC, 20));
        text.setColumns(15);

        panel.add(text);

        Container contentPanel = getContentPane();
        contentPanel.add(panel, BorderLayout.CENTER);
    }
}
