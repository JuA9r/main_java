import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CombinedApp {
    public static void main(String[] args) {
        CombinedApp app = new CombinedApp();
        app.createAndShowGUI();
    }

    public void createAndShowGUI() {
        JFrame frame = new JFrame("Sample");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // ボタンを配置するパネル
        JPanel buttonPanel = new JPanel(new GridLayout(3, 3));
        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.addActionListener(new ButtonAction(i));
            buttonPanel.add(button);
        }

        // テキストフィールドを配置するパネル
        JPanel textPanel = new JPanel();
        JTextField textField = new JTextField();
        textField.setColumns(20);
        textPanel.add(textField);

        // フレームにパネルを追加
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.add(textPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    static class ButtonAction implements ActionListener {
        private final int number;

        public ButtonAction(int number) {
            this.number = number;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button Pressed: " + number);
        }
    }
}
