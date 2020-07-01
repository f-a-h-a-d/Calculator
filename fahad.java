import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class fahad extends JFrame{

    private JButton buttondot;
    private JButton button0;
    private JButton buttonequal;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton buttonmul;
    private JButton buttonminus;
    private JButton buttonplus;
    private JButton buttondiv;
    private JButton button9;
    private JButton button8;
    private JButton button7;
    private JTextField ddTextField;
    private JButton CEButton;
    private JButton buttonback;
    private JButton sqrtButton;
    private JButton buttonnon;

    private JPanel panel;
    private JTextField ddTextField2;
    private JLabel label;

    private String value;
    double val = 0;
    int sign = 0;

   public String fun(double ans) {

       String x = Double.toString(ans);
       return x;
   }


     fahad(){

        add(panel);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s = ddTextField.getText();
                s+='1';
                ddTextField.setText(s);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s = ddTextField.getText();
                s+='2';
                ddTextField.setText(s);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s = ddTextField.getText();
                s+='3';
                ddTextField.setText(s);
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s = ddTextField.getText();
                s+='4';
                ddTextField.setText(s);
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s = ddTextField.getText();
                s+='5';
                ddTextField.setText(s);
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s = ddTextField.getText();
                s+='6';
                ddTextField.setText(s);
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s = ddTextField.getText();
                s+='7';
                ddTextField.setText(s);
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s = ddTextField.getText();
                s+='8';
                ddTextField.setText(s);
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s = ddTextField.getText();
                s+='9';
                ddTextField.setText(s);
            }
        });
        buttonplus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s = ddTextField.getText();
                double dot;
                if(s.isEmpty())dot=0;
                else dot = Double.parseDouble(s);

                if(sign==0){
                    val=dot;
                    sign=1;
                    label.setText("+");
                    String se = fun(val);
                    ddTextField2.setText(se);
                    ddTextField.setText("");
                }
                else if(sign==1){
                    val += dot;
                    sign = 1;
                    label.setText("+");
                    String se = fun(val);
                    ddTextField2.setText(se);
                    ddTextField.setText("");
                }
                else if(sign==2){
                    val -= dot;
                    sign = 1;
                    label.setText("+");
                    String se = fun(val);
                    ddTextField2.setText(se);
                    ddTextField.setText("");
                }
                else if(sign==3){
                    val *= dot;
                    sign = 1;
                    label.setText("+");
                    String se = fun(val);
                    ddTextField2.setText(se);
                    ddTextField.setText("");
                }
                else if(sign==4){
                    val /= dot;
                    sign = 1;
                    label.setText("+");
                    String se = fun(val);
                    ddTextField2.setText(se);
                    ddTextField.setText("");
                }

            }
        });
        buttonequal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s = ddTextField.getText();
                double dot;

                if(s.isEmpty())dot=0;
                else dot = Double.parseDouble(s);

                if(dot==0){
                    ddTextField2.setText("");
                    String se = fun(val);
                    ddTextField.setText(se);
                    label.setText("");
                    sign=0;
                    return;
                }

                label.setText("");
                if(sign==0){
                    val=dot;
                    String se = fun(val);
                    ddTextField2.setText("");
                    ddTextField.setText(se);
                }
                else if(sign==1){
                    val += dot;
                    sign = 0;
                    String se = fun(val);
                    ddTextField2.setText("");
                    ddTextField.setText(se);
                }
                else if(sign==2){
                    val -= dot;
                    sign = 0;
                    String se = fun(val);
                    ddTextField2.setText("");
                    ddTextField.setText(se);
                }
                else if(sign==3){
                    val *= dot;
                    sign = 0;

                    String se = fun(val);
                    ddTextField2.setText("");
                    ddTextField.setText(se);
                }
                else if(sign==4){
                    val /= dot;
                    sign = 0;

                    String se = fun(val);
                    ddTextField2.setText("");
                    ddTextField.setText(se);
                }


            }
        });
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s = ddTextField.getText();
                s+='0';
                ddTextField.setText(s);
            }
        });
        buttonminus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s = ddTextField.getText();
                double dot;
                if(s.isEmpty())dot=0;
                else dot = Double.parseDouble(s);

                if(sign==0){
                    val=dot;
                    sign=2;
                    label.setText("-");
                    String se = fun(val);
                    ddTextField2.setText(se);
                    ddTextField.setText("");
                }
                else if(sign==1){
                    val += dot;
                    sign = 2;
                    label.setText("-");
                    String se = fun(val);
                    ddTextField2.setText(se);
                    ddTextField.setText("");
                }
                else if(sign==2){
                    val -= dot;
                    sign = 2;
                    label.setText("-");
                    String se = fun(val);
                    ddTextField2.setText(se);
                    ddTextField.setText("");
                }
                else if(sign==3){
                    val *= dot;
                    sign = 2;
                    label.setText("-");
                    String se = fun(val);
                    ddTextField2.setText(se);
                    ddTextField.setText("");
                }
                else if(sign==4){
                    val /= dot;
                    sign = 2;
                    label.setText("-");
                    String se = fun(val);
                    ddTextField2.setText(se);
                    ddTextField.setText("");
                }

            }
        });
        buttonmul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String s = ddTextField.getText();
                double dot;
                if(s.isEmpty())dot=0;
                else dot = Double.parseDouble(s);

                if(sign==0){
                    val=dot;
                    sign=3;
                    label.setText("*");
                    String se = fun(val);
                    ddTextField2.setText(se);
                    ddTextField.setText("");
                }
                else if(sign==1){
                    val += dot;
                    sign = 3;
                    label.setText("*");
                    String se = fun(val);
                    ddTextField2.setText(se);
                    ddTextField.setText("");
                }
                else if(sign==2){
                    val -= dot;
                    sign = 3;
                    label.setText("*");
                    String se = fun(val);
                    ddTextField2.setText(se);
                    ddTextField.setText("");
                }
                else if(sign==3){
                    val *= dot;
                    sign = 3;
                    label.setText("*");
                    String se = fun(val);
                    ddTextField2.setText(se);
                    ddTextField.setText("");
                }
                else if(sign==4){
                    val /= dot;
                    sign = 3;
                    label.setText("*");
                    String se = fun(val);
                    ddTextField2.setText(se);
                    ddTextField.setText("");
                }
            }
        });
        buttonback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s = ddTextField.getText();
                if(s.isEmpty())
                    s = "";
                else
                s = s.substring(0,s.length()-1);
                ddTextField.setText(s);
            }
        });
        CEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ddTextField2.setText("");
                ddTextField.setText("");
                label.setText("");
                val = 0;
                sign = 0;
            }
        });
        buttondiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s = ddTextField.getText();
                double dot;
                if(s.isEmpty())dot=0;
                else dot = Double.parseDouble(s);

                if(sign==0){
                    val=dot;
                    sign=4;
                    label.setText("/");
                    String se = fun(val);
                    ddTextField2.setText(se);
                    ddTextField.setText("");
                }
                else if(sign==1){
                    val += dot;
                    sign = 4;
                    label.setText("/");
                    String se = fun(val);
                    ddTextField2.setText(se);
                    ddTextField.setText("");
                }
                else if(sign==2){
                    val -= dot;
                    sign = 4;
                    label.setText("/");
                    String se = fun(val);
                    ddTextField2.setText(se);
                    ddTextField.setText("");
                }
                else if(sign==3){
                    val *= dot;
                    sign = 4;
                    label.setText("/");
                    String se = fun(val);
                    ddTextField2.setText(se);
                    ddTextField.setText("");
                }
                else if(sign==4){
                    val /= dot;
                    sign = 4;
                    label.setText("/");
                    String se = fun(val);
                    ddTextField2.setText(se);
                    ddTextField.setText("");
                }

            }
        });
        buttondot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s = ddTextField.getText();
                s+='.';
                ddTextField.setText(s);
            }
        });
        sqrtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s = ddTextField2.getText();
                if(s.isEmpty()){
                    s = ddTextField.getText();
                    if(s.isEmpty())return ;
                }
                else {
                    ddTextField2.setText("");

                }
                label.setText("sqrt");
                double sq = Double.parseDouble(s);
                sq = Math.sqrt(sq*1.0);
                String set = fun(sq);
                ddTextField.setText(set);

            }
        });
        buttonnon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s = ddTextField2.getText();
                if(s.isEmpty()){
                    s = ddTextField.getText();

                    if(s.isEmpty())return;
                }
                else {
                    ddTextField2.setText("");

                }
                label.setText("x^2");
                double sq = Double.parseDouble(s);
                sq = sq * sq;
                String set = fun(sq);
                ddTextField.setText(set);
            }
        });
    }
}
