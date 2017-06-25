package org.six.util;

import javax.swing.*;

/**
 * Created by yanglu on 6/23/17.
 */
public class SchInput {
    private JButton btnUpdate;
    private JButton btnReset;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JPanel SchInput;

    public static void main(String[] args) {
        JFrame frame = new JFrame("SchInput");
        frame.setContentPane(new SchInput().SchInput);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
