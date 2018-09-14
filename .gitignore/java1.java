public class java1 {
    public static void main(String []args) {
		int num1=99;
		int num2=0;
		for(int i=num1;i>num2;i--){
		if(i!=1&&i!=2) System.out.println(i+" bottles,take one away,"+(i-1)+"bottles left.");
		else if(i==2) System.out.println(i+" bottles,take one away,"+(i-1)+"bottle left.");
		else if(i==1) System.out.println(i+" bottle,take one away,no more bottle!");
		}
    }
}