package lesson2.operator.exec1;

public class Exercise {
   public static void main(String[] args) {
      /*int x=10;
      int y=5;
      int z=2;

        if (x!=y){
            System.err.println("1");
        }
        if(x>y){
            System.err.println("2");
        }
        if(x%y==0){
            System.err.println("3");
        }*/

        boolean p,q;
        p = false;
        q = true;

        if(p&&q){
            q= false;
        }else{
            if(!q)
            System.out.println(p);
            if(p==q)
            System.out.println(p||q);
        }

        System.out.println(q);




    }
}
