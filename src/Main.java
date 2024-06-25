import javax.swing.JFrame;
import javax.swing.ImageIcon;

class Sample extends JFrame{
    public static void main(String[] args){
        Sample frame = new Sample("title");
        frame.setVisible(true);
    }

    Sample(String title){
        setTitle("title");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon("./icon.png");
        setIconImage(icon.getImage());
    }
}

