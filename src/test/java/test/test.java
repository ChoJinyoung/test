package test;

import java.io.BufferedInputStream;
import java.net.URL;
import java.util.ArrayList;
 
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
 
public class test {
 
    public final static String PHARM_URL = "http://openapi.tago.go.kr/openapi/service/TrainInfoService/getVhcleKndList";
    public final static String KEY = "rf8h5nHqKpp9A%2Babq%2FQxu9vBC4N9S82ZPguUarHzZevdW2BEl7fks1Vx2DQHWVaEZ1nfgZfQKwucluBjFwo7qw%3D%3D";
 
    public test() {
        try {
            apiParserSearch();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
 
    
    /**
     * 
     * @throws Exception
     */
    public void apiParserSearch() throws Exception {
        URL url = new URL( PHARM_URL+"?ServiceKey="+KEY);
        
        XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
        factory.setNamespaceAware(true);
        XmlPullParser xpp = factory.newPullParser();
        BufferedInputStream bis = new BufferedInputStream(url.openStream());
        xpp.setInput(bis, "utf-8");
        
        String tag = null;
        int event_type = xpp.getEventType();
        
        ArrayList<String> list = new ArrayList<String>();
        
        String nodename = null;
        while (event_type != XmlPullParser.END_DOCUMENT) {
            if (event_type == XmlPullParser.START_TAG) {
                tag = xpp.getName();
            } else if (event_type == XmlPullParser.TEXT) {
                /**
                 * 약국의 주소만 가져와본다.
                 */
                if(tag.equals("vehiclekndid")){
                    nodename = xpp.getText();
                }
            } else if (event_type == XmlPullParser.END_TAG) {
                tag = xpp.getName();
                if (tag.equals("item")) {
                    list.add(nodename);
                }
            }
 
            event_type = xpp.next();
        }
        printList(list);
    }
    
    /**
     * 결과 값을 출력해본다.
     * @param list
     */
    private void printList(ArrayList<String> list){
        for(String entity : list){
            System.out.println(entity);
        }
        
        
    }
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new test();
    }
 
}

