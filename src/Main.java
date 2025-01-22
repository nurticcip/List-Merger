import java.awt.Point;

public class Main {
    public static void main(String[] args) {
    //hello
   /*
   jkjdlajdjajdl
   alksdjaldlajdja
    */
        System.out.println("hello");
        System.out.print("hello"+"\n");
        System.out.print("world");
        System.out.println("\u2122");
        System.out.println();

        final int x=30;
        final int y;
        y=20;

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 && b2);

        String str = "   ait   ";
        System.out.println(str.toUpperCase());
        System.out.println(str.endsWith("!"));
        System.out.println(str.trim());

        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        if(s1 == s2)
            System.out.println("Yaay "+s1 + " and " + s2+" are the same");

        if(s1 == s3)
            System.out.println("Yay2");


        Point p1 = new Point(1,1);
        Point p2 = new Point(2,0);
        p1 = p2;
        p1.x = -1;

        System.out.println(p2);


        int t =5;
        int z=10;
        t=z;
        t=0;
        System.out.println("t is "+t);
        System.out.println("z is "+z);

    }
}
