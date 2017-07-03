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
public class SchDelete {
    private JTextField id;
    private JTextField grade;
    private JTextField name;
    private JTextField subject;
    private JTextField birth;
    private JButton btnDelete;
    private JPanel SchDelete;

    public SchDelete() {
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sid = id.getText();
                String sql="select * from student_system where sid='"+sid+"'";
                querySql(sql);
                int n = JOptionPane.showConfirmDialog(null, "确定要删除吗?", "删除提示",JOptionPane.YES_NO_OPTION);
                if(n==0){
                    // 点击是
                    String sql1="delete from student_system where sid = '"+sid+"';";
                    SqlExecutor sqlExecutor = new SqlExecutor();
                    try {
                        sqlExecutor.executeUpdate(sql1);
                        JOptionPane.showMessageDialog(null, "删除成功", "删除结果",JOptionPane.WARNING_MESSAGE);
                        id.setText("");
                        name.setText("");
                        subject.setText("");
                        grade.setText("");
                        birth.setText("");
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    } catch (ParseException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SchDelete");
        frame.setContentPane(new SchDelete().SchDelete);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void querySql(String sql){
        try {
            SqlExecutor sqlExecutor = new SqlExecutor();
            List<StudentInformation> ret= sqlExecutor.query(sql);
            System.out.println(ret);
            StudentInformation studentInformation =ret.get(0);
            id.setText(String.valueOf(studentInformation.getSid()));
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

}
