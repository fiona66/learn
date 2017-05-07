package org.six.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.text.ParseException;

/**
 * Created by yanglu on 5/5/17.
 */
public class RedoDemo {
    public static void main(String[] args) throws ParseException,IOException {
        try {
            Document document = Jsoup.connect("http://www.duitang.com").get();
            System.out.println(document.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
