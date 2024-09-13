import javax.swing.*;
import java.awt.*;

class calc extends JFrame {
    public static void main(String[] args) {

        memo frame = new memo("Calculator");

        frame.setSize(500, 350);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
