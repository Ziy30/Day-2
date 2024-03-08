package LESSON.lesson2.operator.exec1;

public class exec2 {
    public static void main(String[] args) {
        double x1, y1, z1, x2, y2, z2, d;

        double xdiff, ydiff, zdiff;
        
        x1=2.0; y1=1.0; z1=3.0;
        x2=0.0; y2=0.0; z2=6.0;
      
        xdiff = Math.pow(x1 - x2, 2);
        ydiff = Math.pow(y1 - y2, 2);
        zdiff= Math.pow(z1 - z2, 2);
        d = Math.sqrt((xdiff + ydiff + zdiff));

        System.out.println("the distance between 2-points is " + d );
        System.out.println("The rounding off to : "+Math.ceil(d));
      
    }


}
