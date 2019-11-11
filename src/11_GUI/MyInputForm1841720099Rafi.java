/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyInputForm;

/**
 *
 * @author Ivan Abdurrafie
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class MyInputForm1841720099Rafi extends JFrame{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton button;
    private JButton button1;
    private JPanel panel;

    public MyInputForm1841720099Rafi() {
        createTextFieldRafi();
        createButtonRafi();
        createPanelRafi();  
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
    }

    private void createTextFieldRafi() {
        aLabel = new JLabel("Nilai A: ");
        bLabel = new JLabel("Nilai B: ");
        cLabel = new JLabel("Hasil  : ");
        
        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
    }

    private void createButtonRafi() {
        button = new JButton("Calculate");
        button1 = new JButton("+");
        class AddInterestListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a*b;
                cLabel.setText("Hasil  : "+c);
            }
            
        }
        class Perkalian implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a+b;
                cLabel.setText("Hasil  : "+c);
            }
            
        }
        ActionListener listener = new AddInterestListener();
        ActionListener listener1 = new Perkalian();
        button.addActionListener(listener);
        button1.addActionListener(listener1);
    }

    private void createPanelRafi() {
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(cLabel);
        panel.add(button);
        panel.add(button1);
        panel.add(cLabel);
        add(panel);
    }
    public static void main(String[] args) {
        JFrame frame = new MyInputForm1841720099Rafi();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
    
    
}
