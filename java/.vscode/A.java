

public class A{
    static int x=10;
    private static A a1;
    @SuppressWarnings("unused")
    int y=20;
    public static void main(String[] args) {
        A.a1=new A();
       
         
         
         System.out.println(A.x);
          System.out.println(a1.y);
         System.out.println(A.x);


    }
    public void test(){
        System.out.println(200);
    }
}