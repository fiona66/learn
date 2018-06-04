package org.six.util;
import java.io.*;
import java.io.FileWriter;
import java.nio.CharBuffer;

/**
 * Created by yanglu on 7/6/17.
 */
public class PrintTxt {

    public void addTxt(int data[]) {
        try {
            File writename = new File("/Users/yanglu/Downloads/test.txt");
            FileWriter out = new FileWriter(writename);
            for (int i = 0; i < data.length; i++) {
                out.write(data[i]+"\n");
            }
            out.close();

            DataInputStream in = new DataInputStream(new FileInputStream("/Users/yanglu/Downloads/test.txt"));
            for (int i = data.length - 1; i >= 0; i--) {
                data[i] = Integer.parseInt(in.readLine());
            }
            for (int i=0;i<data.length;i++) {
                System.out.print(" " + data[i]);
            }
            System.out.println();
            in.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }
    }
}
