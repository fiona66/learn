package org.six.util;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

/**
 * Created by yanglu on 6/23/17.
 */
public class SchQuery {
    private JPanel schquery;
    private JButton btnOK;
    private JButton btnClose;
    private JTextField sid;
    private JTextField name;
    private JTextField subject;
    private JTextField grade;
    private JTextField birth;

    public SchQuery() {
        btnOK.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = sid.getText();
                String sname = name.getText();
                if(id!=null && !id.equals("")){
                    String sql="select * from student_system where sid='"+id+"'";
                    querySql(sql);
                }else {
                    String sql1 = "select * from student_system where name = '"+sname+"'";
                    querySql(sql1);
                }
            }
        }
        );

        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sid.setText("");
                name.setText("");
                subject.setText("");
                grade.setText("");
                birth.setText("");
            }
        });
    }
    public void querySql(String sql){
        try {
            SqlExecutor sqlExecutor = new SqlExecutor();
            List<StudentInformation> ret= sqlExecutor.query(sql);
            System.out.println(ret);
            StudentInformation studentInformation =ret.get(0);
            sid.setText(String.valueOf(studentInformation.getSid()));
            name.setText(studentInformation.getName());
            subject.setText(studentInformation.getSubject());
            grade.setText(studentInformation.getGrade());
            birth.setText(studentInformation.getBirth());
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SchQuery");
        frame.setContentPane(new SchQuery().schquery);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
