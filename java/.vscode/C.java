public class C{

    private static C a1;
    static int x=13;
    int z=99;
    public static void main(String[] args) {
        int y=12;
        C.a1=new C();
        a1.test();
    
        System.out.println(y);
        System.out.println(x);
     
    }
    public void test(){
        System.out.println(x);
        System.out.println(z);
    }

    
    
}