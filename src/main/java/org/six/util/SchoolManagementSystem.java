package org.six.util;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by yanglu on 6/19/17.
 */
public class SchoolManagementSystem {


    private JPanel SchoolManagement;
    private JComboBox comboBox1;

    public SchoolManagementSystem() {
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SchoolManagementSystem");
        frame.setContentPane(new SchoolManagementSystem().SchoolManagement);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
