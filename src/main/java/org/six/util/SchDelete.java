package org.six.util;

import javax.swing.*;

/**
 * Created by yanglu on 6/23/17.
 */
public class SchDelete {
    private JTextField 学号;
    private JTextField 年级;
    private JTextField 姓名;
    private JTextField 专业;
    private JTextField 出生;
    private JButton btnDelete;
    private JPanel SchDelete;

    public static void main(String[] args) {
        JFrame frame = new JFrame("SchDelete");
        frame.setContentPane(new SchDelete().SchDelete);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
