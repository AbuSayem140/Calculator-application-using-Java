import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;


public class JAbout extends JFrame {
    private Container c;
    private Font f;
    private JLabel label;

    JAbout()
    {

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(300,60,340,300);
        this.setTitle("Information");
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);

        f = new Font("Arial",Font.BOLD,18);

        label = new JLabel("BUBT");
        label.setBounds(120, 10, 200, 50);
        label.setFont(f);
        c.add(label);

        label = new JLabel("Depertment of CSE");
        label.setBounds(60, 35, 200, 50);
        label.setFont(f);
        c.add(label);

        label = new JLabel("Project Name: Basic Calculator");
        label.setBounds(20, 60, 300, 50);
        label.setFont(f);
        c.add(label);

        label = new JLabel("==================================================================");
        label.setBounds(0, 90, 400, 50);
        label.setFont(f);
        c.add(label);

        label = new JLabel("Name : Md. Abu Sayem");
        label.setBounds(20, 110, 300, 50);
        label.setFont(f);
        c.add(label);

        label = new JLabel("ID : 21225103140");
        label.setBounds(20, 140, 300, 50);
        label.setFont(f);
        c.add(label);

        label = new JLabel("Intake : 49");
        label.setBounds(20, 170, 300, 50);
        label.setFont(f);
        c.add(label);

    }
    public static void main(String[] args) {
        JAbout fAbout = new JAbout();
        fAbout.setVisible(true);
        
    }
    
}
