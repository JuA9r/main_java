import javax.swing.*;
import java.awt.*;

class memo extends JFrame{
    public static void main(String[] args){

        memo frame = new memo("Memo");

        frame.setSize(500, 350);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    memo(String title){
        setTitle(title);
        setBounds(100, 100, 500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        panel.setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setPreferredSize(new Dimension(480, 310));
        textArea.setFont(new Font("Meiryo", Font.ITALIC, 17));

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        panel.add(scrollPane, BorderLayout.CENTER);

        Container contentPane = getContentPane();
        contentPane.add(panel, BorderLayout.CENTER);
    }
}