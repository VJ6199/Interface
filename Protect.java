public class Protect {
    public int a = 10;
    protected int b = 20;
    private int c = 30;
    int d = 40;
   void display(){
       System.out.println(c);
   }

   }
// private cannot be accessed outside Protect class
//default cannot accessible outside package

class details{
    public static void main(String[] args){
        Protect v = new Protect();
        System.out.println(v.a + "," + v.b +"," + v.d);
        v.display();
    }
}
//protected cannot be accessed outside this package and can also be accessed in subclass of another package
//public can be accessed anywhere