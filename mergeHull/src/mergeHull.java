import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class mergeHull {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("points.in"));
        ArrayList<myPoint> list = new ArrayList<myPoint>();
        while (file.hasNext()){
            list.add(new myPoint(Double.parseDouble(file.next()),Double.parseDouble(file.next())));
        }
//        for (int i=0;i<list.size();i++){
//            System.out.println(list.get(i).x+"+"+list.get(i).y);
//  sorry i'm a lady      }
    }
}
