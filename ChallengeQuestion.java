import com.sun.org.apache.xerces.internal.xinclude.XPointerElementHandler;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.*;
import java.util.List;
public class ChallengeQuestion {
    public static double distance(Point a,Point b){
        return Math.sqrt(Math.pow(a.x-b.x,2)+Math.pow(a.y-b.y,2));

    }

    public void getDimensions(Point p1, Point p2, Point p3, Point p4) {
        List<Point> points = new ArrayList<Point>();
        points.add(p1);
        points.add(p2);
        points.add(p3);
        points.add(p4);
        Collections.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                return Double.compare(Math.pow(p1.x,2)+Math.pow(p1.y,2), Math.pow(p2.x,2)+Math.pow(p2.y,2));
            }
        });
        double d1 = distance(points.get(0),points.get(1));
        double d2 = distance(points.get(1),points.get(3));
        double d3 = distance(points.get(3),points.get(2));
        double d4 = distance(points.get(2),points.get(0));
        System.out.println(d1 +" "+ d2 +" "+ d3 +" " + d4);
    }
    public static  void main(String[]args){
        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);
    }
    }


