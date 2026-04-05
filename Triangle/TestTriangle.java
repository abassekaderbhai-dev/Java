public class TestTriangle{

    public static void main(String[] args){
        PointPlan p1 = new PointPlan(3.4, 7.2);
        PointPlan p2 = new PointPlan(5.1, 8.5);
        PointPlan p3 = new PointPlan(1.9, 2.6);

        Triangle t1 = new Triangle(p1, p2, p3);
        System.out.println(t1.toString());
        t1.translate(10, 15);
        System.out.println(t1.toString());

    }
}