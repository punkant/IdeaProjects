import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Антон
 * Date: 24.11.12
 * Time: 13:07
 * To change this template use File | Settings | File Templates.
 */
public class Polygon {
    public ArrayList<myPoint> points;
    public Polygon (){
        points = new ArrayList<myPoint>();
    }
    public void insert(myPoint point){
        points.add(point);
    }
}
