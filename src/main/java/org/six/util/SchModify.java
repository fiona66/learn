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
public class SchModify {
    private JPanel SchModify;
    private JButton btnUpdate;
    private JButton btnReset;
    private JTextField updateSid;
    private JTextField newName;
    private JTextField newSubject;
    private JTextField newGrade;
    private JTextField newBirth;
    private JButton startUpdate;

    public SchModify() {

        startUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = updateSid.getText();
                String sql = "select * from student_system where sid='" + id + "'";
                querySql(sql);
            }
        });

        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateSid.setText("");
                newName.setText("");
                newSubject.setText("");
                newGrade.setText("");
                newBirth.setText("");
            }
        });

        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = JOptionPane.showConfirmDialog(null, "确定要修改吗?", "修改提示",JOptionPane.YES_NO_OPTION);
                String nid = updateSid.getText();
                String nname = newName.getText();
                String nsubject = newSubject.getText();
                String ngrade = newGrade.getText();
                String nbirth = newBirth.getText();
                try {
                    SqlExecutor sqlExecutor = new SqlExecutor();
                    if(n==0){
                        String sql = "UPDATE `student_system` SET name ='"+nname+"',subject='"+nsubject+"',grade='"+ngrade+"',birth='"+nbirth+"' WHERE sid = '"+nid+"';";
                        sqlExecutor.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null, "修改成功", "修改结果",JOptionPane.WARNING_MESSAGE);
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (ParseException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SchModify");
        frame.setContentPane(new SchModify().SchModify);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void querySql(String sql){
        try {
            SqlExecutor sqlExecutor = new SqlExecutor();
            List<StudentInformation> ret= sqlExecutor.query(sql);
            StudentInformation studentInformation =ret.get(0);
            updateSid.setText(String.valueOf(studentInformation.getSid()));
            newName.setText(studentInformation.getName());
            newSubject.setText(studentInformation.getSubject());
            newGrade.setText(studentInformation.getGrade());
            newBirth.setText(studentInformation.getBirth());
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
    }
}
