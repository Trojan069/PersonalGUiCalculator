import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reader extends JFrame {
    private JButton button1,button2,button3,button4,button5,
    button6,button7,button8,button9,button0,buttonClear,buttonEquals,
    buttonPlus,buttonMinus,buttonDivide,buttonMultiply;
    private JLabel label;
    private JTextField textField;

    private eHandler handler = new eHandler();

    private String result = "";
   // private String result1 = "";
   // private String total = "";

    public Reader(String s){
        super(s);
        setLayout(new FlowLayout());
        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonClear = new JButton("C");

        buttonEquals = new JButton("=");
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonDivide = new JButton("/");
        buttonMultiply = new JButton("*");

        label = new JLabel("Result");
        textField = new JTextField(10);
        textField.setEditable(false);

        add(label);
        add(textField);

        add(button1); add(button2);add(button3);add(buttonPlus);
        add(button4); add(button5);add(button6);add(buttonMinus);
        add(button7);add(button8);add(button9);add(buttonMultiply);
        add(buttonClear);add(button0);

        add(buttonEquals);
        add(buttonDivide);

        button1.addActionListener(handler);
        button2.addActionListener(handler);
        button3.addActionListener(handler);
        button4.addActionListener(handler);
        button5.addActionListener(handler);
        button6.addActionListener(handler);
        button7.addActionListener(handler);
        button8.addActionListener(handler);
        button9.addActionListener(handler);
        button0.addActionListener(handler);
        buttonClear.addActionListener(handler);

//        buttonPlus.addActionListener(handler);
//        buttonMinus.addActionListener(handler);
//        buttonMultiply.addActionListener(handler);
//        buttonDivide.addActionListener(handler);
//        buttonEquals.addActionListener(handler);


    }

    public class eHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                if (e.getSource() == button1){
                    result += "1";
                    textField.setText(result);
                }else if (e.getSource() == button2){
                    result += "2";
                    textField.setText(result);
                }else if (e.getSource() == button3){
                    result += "3";
                    textField.setText(result);
                }else if (e.getSource() == button4){
                    result += "4";
                    textField.setText(result);
                }else if (e.getSource() == button5){
                    result += "5";
                    textField.setText(result);
                }else if (e.getSource() == button6){
                    result += "6";
                    textField.setText(result);
                }else if (e.getSource() == button7){
                    result += "7";
                    textField.setText(result);
                }else if (e.getSource() == button8){
                    result += "8";
                    textField.setText(result);
                }else if (e.getSource() == button9){
                    result += "9";
                    textField.setText(result);
                }else if (e.getSource() == button0){
                    result += "0";
                    textField.setText(result);
                }else if (e.getSource() == buttonClear){
                    textField.setText("");
                    result = "";
                }
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null,"Error please contact administrator!");
            }

        }
    }
}
