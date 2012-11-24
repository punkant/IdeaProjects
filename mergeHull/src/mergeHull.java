import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class mergeHull {
    private static ArrayList<myPoint> list = new ArrayList<myPoint>();
    //recursion part of algo
    private static Polygon mergeHull(int l,int r){
        if ((r-l) == 0) {
            Polygon polygon = new Polygon();
            polygon.insert(list.get(r));
            return polygon;
        } else {
            int m = (r - l)/2;
            Polygon left = mergeHull(l,l+m);
            Polygon right = mergeHull(l + m + 1, r);
            return mergePolygons(left,right);
        }
    }
    //merging poligons
    private static Polygon mergePolygons(Polygon left,Polygon right){
        return new Polygon();
    }

    public static void main(String[] args) throws FileNotFoundException {
        //reading and sorting list of points from left to right
        Scanner file = new Scanner(new File("points.in"));
        while (file.hasNext()){
            list.add(new myPoint(Double.parseDouble(file.next()),Double.parseDouble(file.next())));
        }
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).x+"+"+list.get(i).y);
        }
    }
}
