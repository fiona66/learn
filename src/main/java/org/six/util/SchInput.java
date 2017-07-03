package org.six.util;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;

/**
 * Created by yanglu on 6/23/17.
 */
public class SchInput {
    private JButton btnUpdate;
    private JButton btnReset;
    private JTextField sid;
    private JTextField name;
    private JTextField subject;
    private JTextField grade;
    private JTextField birth;
    private JPanel SchInput;
    private JTextField errorMessage;
    private JTextField gender;

    public SchInput() {
        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = sid.getText();
                String sname = name.getText();
                String ssubject = subject.getText();
                String sgrade = grade.getText();
                String sbirth = birth.getText();
                String sgender = gender.getText();

                if (id.equals("") || sname.equals("") || ssubject.equals("") || sgrade.equals("") || sbirth.equals("")||gender.equals("")) {
                    errorMessage.setVisible(true);
                    errorMessage.setText("输入内容不允许为空");
                }else {
                    String sql = "insert into student_system(sid,name,gender,subject,grade,birth) values ("+id+",'"+sname+"','"+sgender+"','"+ssubject+"','"+sgrade+"','"+sbirth+"');";
                    insertSql(sql);
                }
            }
        });



        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sid.setText("");
                name.setText("");
                subject.setText("");
                grade.setText("");
                birth.setText("");
                gender.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SchInput");
        frame.setContentPane(new SchInput().SchInput);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void insertSql(String sql){
        try {
            SqlExecutor sqlExecutor = new SqlExecutor();
            int ret = sqlExecutor.executeUpdate(sql);
            if(ret==1){
                System.out.println("success");
            }
            System.out.println("failure");

        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
