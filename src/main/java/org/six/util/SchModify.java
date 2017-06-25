package org.six.util;

import javax.swing.*;

/**
 * Created by yanglu on 6/23/17.
 */
public class SchModify {
    private JPanel SchModify;
    private JButton btnUpdate;
    private JButton btnReset;

    public static void main(String[] args) {
        JFrame frame = new JFrame("SchModify");
        frame.setContentPane(new SchModify().SchModify);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
