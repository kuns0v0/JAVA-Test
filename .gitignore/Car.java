import java.util.Scanner;
public class Car{
	String name;
	double tank;                //油箱容量
	double oilconsumption;		//油耗
	public void Gas(){
		//比较油箱容量和油耗确定是否还有汽油
		System.out.print("油箱状态：");
		if(this.oilconsumption==this.tank)
			System.out.println("没有汽油");
		else if(this.oilconsumption<this.tank&&this.oilconsumption>0)
			System.out.println("汽油未满");
		else if(this.oilconsumption==0) 
			System.out.println("汽油满");
		else
			System.out.println("ERROR!");
	}
	
	public void Run(){
		//有油汽车能开，无油不能开
		System.out.print("汽车能否行驶：");
		if(this.oilconsumption == this.tank) 
			System.out.println("没有汽油，不能开");
		else if(this.oilconsumption<this.tank&&this.oilconsumption>=0) 
			System.out.println("有汽油，能开");
		else 
			System.out.println("ERROR!");
	}
	
	public void setCar(){
		//设置汽车属性
		Scanner scan=new Scanner(System.in);
		System.out.println("set name:");
		if(scan.hasNext()){
			this.name=scan.next();
		}
		System.out.println("set tank:");
		if(scan.hasNextDouble()){
			this.tank=scan.nextDouble();
		}
		System.out.println("set oilconsumption:");
		if(scan.hasNextDouble()){
			this.oilconsumption=scan.nextDouble();
		}
	}
	
	//带默认参数的构造函数
	public Car(){
		this.name="宝马";
		this.tank=50;
		this.oilconsumption=0;
	}
	
	public static void main(String[] args){
		Car[] car=new Car[3];
		for(int i=0;i<3;i++){
			car[i]=new Car();
			car[i].setCar();
			System.out.println("\n第"+(i+1)+"辆汽车信息：\n"+"name:\t\t"+car[i].name
				+"\ntank:\t\t"+car[i].tank+"\noilconsumption:\t"+car[i].oilconsumption);
			car[i].Gas();
			car[i].Run();
			System.out.println("\n");
		}
	}
}