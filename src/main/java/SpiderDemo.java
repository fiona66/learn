import com.google.gson.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;

/**
 * Created by yanglu on 5/4/17.
 */
public class SpiderDemo {

    public static void main(String[] args) throws ParseException, IOException {
        try {
            //解析Url获取Document对象
            Document document = Jsoup.connect("http://www.tianxun.com/flight/ajax_intl_list_v3.php?sessionKey=118abec3-15e4-45ae-b4f6-85ce1b9c6ba5&token=JCVyBlYKJwUidVEDcncLCXVUJiIEd1dyUnZSBSB3cQEFdAonIScHdyQFIA9XdiEJD3JwBQBUXSdydycKVAInclB1AQh2cgZbV1lxCVRwJwYndlACAQMGCQYnUVUEcyFw&page=1&tripType=OW&sort=0&depCityCode=KBR&dstCityCode=CSHA&departDate=2017-06-03&returnDate=&abtest=1&_=1493898717707").get();
            //获取网页源码文本内容
            System.out.println(document.toString());
            String json = document.text();
//            JSONObject json_test = new JSONObject(json);
            Gson gson=new Gson();
            HashMap res = gson.fromJson(json, HashMap.class);
            Object value1 =res.get("error");
            Double value2 = (Double) value1;
            Integer value3 = value2.intValue();
            System.out.println(value3);

            //获取指定class的内容指定tag的元素
//            Elements liElements = document.getElementsByClass("content").get(0).getElementsByTag("li");
//            for (int i = 0; i < liElements.size(); i++) {
//                System.out.println(i + ". " + liElements.get(i).text());
//            }
        } catch (IOException e) {
            System.out.println("解析出错！");
            e.printStackTrace();
        }
    }
}
