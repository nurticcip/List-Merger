public class StringClass {
    public static void main(String[] args) {
        //String immutable
        String a = "hello";
        a = "world";
        System.out.println(a.toUpperCase());
        System.out.println(a);
        //StringBuilder mutable
        StringBuilder sb = new StringBuilder("hello");
        sb.append(" world");
        System.out.println(sb);
        //StringBuffer
    }
}
