import java.awt.*;

public class Triangle	{
    private PointPlan[] sommets ;

    public Triangle(){

    }

    public Triangle(PointPlan p1, PointPlan p2, PointPlan p3)	{
        this.sommets = new PointPlan[3];

        this.sommets[0] = p1;
        this.sommets[1] = p2;
        this.sommets[2] = p3;
    }

    public Triangle(PointPlan[] tabPoints)	{
        this.sommets = new PointPlan[3];
        this.sommets[0] = tabPoints.getPoint(0);
        this.sommets[1] = tabPoints.getPoint(1);
        this.sommets[2] = tabPoints.getPoint(2);

    }

    public void setPoint(PointPlan p, int i) {
        this.sommets[i] = p;
    }

    public Point getPoint(int i) {
        return this.sommets[i];
    }
    public String toString(){
        return "p1 : " + this.sommets[0].toString() + " p2 : " + this.sommets[1].toString() + " p3 : " + this.sommets[2].toString();
        
    }

    public void translate(int dx, int dy)	{
        for (int i = 0; i<this.sommets.length; i++){
            this.sommets[i].translater(dx, dy);
        }
    }

}