public class java2 {
    public static void main(String []args) {
	String c="abcd";
	String a=c;
	System.out.println("c="+c);
	System.out.println("a="+a);
	System.out.println("c:"+System.identityHashCode(c));
	System.out.println("a:"+System.identityHashCode(a));
    }
}