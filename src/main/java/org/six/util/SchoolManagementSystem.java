package org.six.util;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

/**
 * Created by yanglu on 6/19/17.
 */
public class SchoolManagementSystem {


    private JPanel SchoolManagement;
    private JButton btnQueryAll;
    private JTextArea textArea1;

    public SchoolManagementSystem() {
        btnQueryAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sql="select * from student_system;";
                SqlExecutor sqlExecutor = new SqlExecutor();
                String A ="";
                try {
                    List<StudentInformation> ret= sqlExecutor.query(sql);
                    for(int i=0;i<ret.size();i++){
//                        String sql1 = "select * from student_system where id="+i;
//                        List<StudentInformation> ret1=sqlExecutor.query(sql1);
                        String B = ret.get(i).toString()+"\n";
                        A = A+B;
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (ParseException e1) {
                    e1.printStackTrace();
                }
                textArea1.setText(A);
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
