
import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.awt.Font;


public class Calculator extends JFrame implements ActionListener{
    
    private Container c;
    private JButton btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnPlus,btnMin,btnEqual,btnMultiplication,btnDiv,btnDot,btnDel,btnPow,btnRoot,btnPM;
    private JButton btnSin,btnCos,btnTan,btnD;
    private JPanel disPanel;
    private JMenuBar menuBar;
    private JMenu edit,help;
    private JMenuItem lightMode,DarkMode,info;
    private Font f;
    private JTextField input;
    private JLabel op;

    Double num,numRad,ans,num2;int flag;String temp;
    Color backColor = Color.decode("#343434");
    Color forColor = Color.decode("#FFFFFF");


    Calculator()
    {
        initcomponents();
    }
    public void initcomponents()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);


    
        f = new Font("Inter", Font.BOLD, 36);

       disPanel = new JPanel();
       disPanel.setBounds(19, 20, 350, 95);
       disPanel.setBackground(Color.WHITE);
       disPanel.setForeground(Color.BLUE);
       disPanel.setFont(f);
       disPanel.setLayout(null);
       c.add(disPanel);

       input = new JTextField();
       input.setBounds(0, 0, 350, 120);
       input.setBackground(Color.WHITE);
       input.setForeground(Color.BLACK);
       disPanel.add(input);
       input.setLayout(null);
       input.setHorizontalAlignment(JLabel.RIGHT);
       input.setFont(new Font("Inter",Font.BOLD,46));
       input.setEditable(false);
       input.setOpaque(false);


       op = new JLabel();
       op.setBounds(0, 0, 340, 95);
       op.setForeground(Color.decode("#007A14"));
       op.setBackground(Color.decode("#FFFFFF"));
       op.setText("");
       disPanel.add(op);
       op.setLayout(null);
       op.setHorizontalAlignment(JLabel.RIGHT);
       op.setVerticalAlignment(JTextField.TOP);
       op.setFont(new Font("Inter",Font.BOLD,26));
       op.setVisible(false);
       op.setOpaque(false);

     // ======= All Button Start =========

        btnSin = new JButton("Sin");
        btnSin.setBounds(19, 130, 70, 70);
        btnSin.setBackground(Color.DARK_GRAY);
        btnSin.setForeground(Color.PINK);
        btnSin.setFont(new Font("Inter",Font.BOLD,20));
        c.add(btnSin);
       
        btnCos = new JButton("Cos");
        btnCos.setBounds(112, 130, 70, 70);
        btnCos.setBackground(Color.DARK_GRAY);
        btnCos.setForeground(Color.PINK);
        btnCos.setFont(new Font("Inter",Font.BOLD,18));
        c.add(btnCos);
       
        btnTan = new JButton("Tan");
        btnTan.setBounds(205, 130, 70, 70);
        btnTan.setBackground(Color.DARK_GRAY);
        btnTan.setForeground(Color.PINK);
        btnTan.setFont(new Font("Inter",Font.BOLD,20));
        c.add(btnTan);
       
        btnD = new JButton("\u232B");
        btnD.setBounds(298, 130, 70, 70);
        btnD.setBackground(Color.DARK_GRAY);
        btnD.setForeground(forColor);
        btnD.setFont(new Font("Inter",Font.BOLD,20));
        c.add(btnD);
       
       
        btnDel = new JButton("C");
        btnDel.setBounds(19, 220, 70, 70);
        btnDel.setBackground(Color.PINK);
        btnDel.setForeground(Color.BLACK);
        btnDel.setFont(f);
        c.add(btnDel);
       
        btnPow = new JButton("x\u00B2");
        btnPow.setBounds(112, 220, 70, 70);
        btnPow.setBackground(Color.DARK_GRAY);
        btnPow.setForeground(Color.WHITE);
        btnPow.setFont(f);
        c.add(btnPow);
       
        btnRoot = new JButton("\u221A");
        btnRoot.setBounds(205, 220, 70, 70);
        btnRoot.setBackground(Color.DARK_GRAY);
        btnRoot.setForeground(Color.WHITE);
        btnRoot.setFont(f);
        c.add(btnRoot);
       
        btnDiv = new JButton("/");
        btnDiv.setBounds(298, 220, 70, 70);
        btnDiv.setBackground(Color.DARK_GRAY);
        btnDiv.setForeground(Color.GREEN);
        btnDiv.setFont(f);
        c.add(btnDiv);

        btn7 = new JButton("7");
        btn7.setBounds(19, 315, 70, 70);
        btn7.setBackground(backColor);
        btn7.setForeground(forColor);
        btn7.setFont(f);
        c.add(btn7);
        
        btn8 = new JButton("8");
        btn8.setBounds(112, 315, 70, 70);
        btn8.setBackground(backColor);
        btn8.setForeground(forColor);
        btn8.setFont(f);
        c.add(btn8);
        
        btn9 = new JButton("9");
        btn9.setBounds(205, 315, 70, 70);
        btn9.setBackground(backColor);
        btn9.setForeground(forColor);
        btn9.setFont(f);
        c.add(btn9);
        
        btnMultiplication = new JButton("x");
        btnMultiplication.setBounds(298, 315, 70, 70);
        btnMultiplication.setBackground(Color.DARK_GRAY);
        btnMultiplication.setForeground(Color.GREEN);
        btnMultiplication.setFont(f);
        c.add(btnMultiplication);


        btn4 = new JButton("4");
        btn4.setBounds(19, 410, 70, 70);
        btn4.setBackground(backColor);
        btn4.setForeground(forColor);
        btn4.setFont(f);
        c.add(btn4);
        
        btn5 = new JButton("5");
        btn5.setBounds(112, 410, 70, 70);
        btn5.setBackground(backColor);
        btn5.setForeground(forColor);
        btn5.setFont(f);
        c.add(btn5);
        
        
        btn6 = new JButton("6");
        btn6.setBounds(205, 410, 70, 70);
        btn6.setBackground(backColor);
        btn6.setForeground(forColor);
        btn6.setFont(f);
        c.add(btn6);
        
        btnMin = new JButton("-");
        btnMin.setBounds(298, 410, 70, 70);
        btnMin.setBackground(backColor);
        btnMin.setForeground(Color.decode("#66FF7F"));
        btnMin.setFont(f);
        c.add(btnMin); 
        

        
        
        btn1 = new JButton("1");
        btn1.setBounds(19, 505, 70, 70);
        btn1.setBackground(backColor);
        btn1.setForeground(forColor);
        btn1.setFont(f);
        c.add(btn1);
         
        btn2 = new JButton("2");
        btn2.setBounds(112, 505, 70, 70);
        btn2.setBackground(backColor);
        btn2.setForeground(forColor);
        btn2.setFont(f);
        c.add(btn2);
        
        
        btn3 = new JButton("3");
        btn3.setBounds(205, 505, 70, 70);
        btn3.setBackground(backColor);
        btn3.setForeground(forColor);
        btn3.setFont(f);
        c.add(btn3);
        
        btnPlus = new JButton("+");
        btnPlus.setBounds(298, 505, 70, 70);
        btnPlus.setBackground(backColor);
        btnPlus.setForeground(Color.decode("#66FF7F"));
        btnPlus.setFont(f);
        c.add(btnPlus);
        
    
        btn0 = new JButton("0");
        btn0.setBounds(19, 600, 160, 70);
        c.add(btn0);
        btn0.setBackground(backColor);
        btn0.setForeground(forColor);
        btn0.setFont(f);
        
        btnDot = new JButton(".");
        btnDot.setBounds(205, 600, 70, 70);
        c.add(btnDot);
        btnDot.setBackground(backColor);
        btnDot.setForeground(forColor);
        btnDot.setFont(f);
       
        
        btnEqual = new JButton("=");
        btnEqual.setBounds(298, 600, 70, 70);
        c.add(btnEqual);
        btnEqual.setBackground(Color.GREEN);
        btnEqual.setForeground(Color.BLACK);
        btnEqual.setFont(f);
        

        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        edit = new JMenu("Edit");
        help = new JMenu("Help");
        menuBar.add(edit);
        menuBar.add(help);

        lightMode = new JMenuItem("Light");
        DarkMode = new JMenuItem("Dark");
        info = new JMenuItem("Information");


        edit.add(lightMode);
        edit.addSeparator();
        edit.add(DarkMode);
        help.add(info);

        info.addActionListener(this);
        DarkMode.addActionListener(this);
        lightMode.addActionListener(this);


         btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnPlus.addActionListener(this);
        btnMin.addActionListener(this);
        btnEqual.addActionListener(this);
        btnMultiplication.addActionListener(this);
        btnDiv.addActionListener(this);
        btnDot.addActionListener(this);
        btnDel.addActionListener(this);
        btnPow.addActionListener(this);
        btnRoot.addActionListener(this);
        btnSin.addActionListener(this);
        btnCos.addActionListener(this);
        btnTan.addActionListener(this);
        btnD.addActionListener(this);
       
      

    }

      // Creating method for Roundup a long double number into 3 degit 
      String roundNum(double x){
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.CEILING);
        return df.format(x);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
      String s = e.getActionCommand();
      Object source = e.getSource();

      if (source == btn0) {
        input.setText(input.getText()+"0");          
   }
   else if (source == btn1) {
       input.setText(input.getText() + "1");   
     }   
   else if (source == btn2) {
       input.setText(input.getText() + "2");   
     }
   else if (source == btn3) {
       input.setText(input.getText() + "3");   
     }
   else if (source == btn4) {
       input.setText(input.getText() + "4");   
     }
   else if (source == btn5) {
       input.setText(input.getText() + "5");   
     }
   else if (source == btn6) {
       input.setText(input.getText() + "6");   
     }
   else if (source == btn6) {
       input.setText(input.getText() + "6");   
     }
   else if (source == btn7) {
       input.setText(input.getText() + "7");   
     }
   else if (source == btn8) {
       input.setText(input.getText() + "8");   
     }  
   else if (source == btn9) {
       input.setText(input.getText() + "9");   
     }   
   else if (source == btnDot) {
       input.setText(input.getText() + ".");   
     }

         // Arithmatic button source 
      else if (source == btnPlus) {
          
          String temp =input.getText();
          num = Double.parseDouble(temp);  
          input.setText("");
          op.setVisible(true);
          op.setText(temp+" +");
          flag = 1;
        }
       
      else if (source == btnMin) {
          String temp =input.getText();
         num = Double.parseDouble(temp);
         input.setText("");
         op.setVisible(true);
         op.setText(temp+" -");
         flag = 2;
        }
    
      else if (source == btnMultiplication) {
         String temp =input.getText();
         num = Double.parseDouble(temp);
         input.setText("");
         op.setVisible(true);
         op.setText(temp+" x");
         flag = 3;
        }
     
      else if (source == btnDiv) {
          
          String temp =input.getText();
          num = Double.parseDouble(input.getText());
          input.setText("");
          op.setVisible(true);
          op.setText(temp+" /");
          flag = 4;
        }
    
     else if (source == btnSin) {
         
         op.setVisible(true);
         op.setText("sin"); 
         input.setText("");
         flag = 5;
        }
     
     else if (source == btnCos) {

         op.setVisible(true);
         op.setText("cos"); 
         input.setText("");
         flag = 6; 
        }
     
     else if (source == btnTan) {

         op.setVisible(true);
         op.setText("tan"); 
         input.setText("");
         flag = 7; 
        }
     
     // Power 
     else if (source == btnPow) {         
          num = Double.parseDouble(input.getText());
          input.setText(""); 
          op.setVisible(true);
          op.setText(num+" ^");
          flag = 8;
        }
     
     // Root
     else if (source == btnRoot) {

          input.setText("");
          op.setVisible(true);
          op.setText(" \u221A");
          flag = 9; 
        }
     else if (source == btnDel) {
          input.setText("");   
          op.setText("");   
        }
      else if (source == btnD) {
            int length = input.getText().length();
            int number = length - 1;
            if (length > 0) {
                StringBuilder back = new StringBuilder(input.getText());
                back.deleteCharAt(number);
                input.setText(back.toString());
            }
            if (input.getText().endsWith("")) {
            }
        }
   
     
    



        if(e.getSource()==info)
        {
            JAbout frame = new JAbout();
               frame.setVisible(true);
        }
        else if(e.getSource()==DarkMode)
        {
            c.setBackground(Color.BLACK);
        }
        if(e.getSource()==lightMode)
        {
            c.setBackground(Color.DARK_GRAY);
        }
        
    }

    public static void main(String[] args) {
        Calculator frame = new Calculator();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,40,400,770);
        frame.setTitle("Calculator");
        frame.setResizable(false);
    }
   
    
}
