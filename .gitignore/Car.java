import java.util.Scanner;
public class Car{
	String name;
	double tank;                //��������
	double oilconsumption;		//�ͺ�
	public void Gas(){
		//�Ƚ������������ͺ�ȷ���Ƿ�������
		System.out.print("����״̬��");
		if(this.oilconsumption==this.tank)
			System.out.println("û������");
		else if(this.oilconsumption<this.tank&&this.oilconsumption>0)
			System.out.println("����δ��");
		else if(this.oilconsumption==0) 
			System.out.println("������");
		else
			System.out.println("ERROR!");
	}
	
	public void Run(){
		//���������ܿ������Ͳ��ܿ�
		System.out.print("�����ܷ���ʻ��");
		if(this.oilconsumption == this.tank) 
			System.out.println("û�����ͣ����ܿ�");
		else if(this.oilconsumption<this.tank&&this.oilconsumption>=0) 
			System.out.println("�����ͣ��ܿ�");
		else 
			System.out.println("ERROR!");
	}
	
	public void setCar(){
		//������������
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
	
	//��Ĭ�ϲ����Ĺ��캯��
	public Car(){
		this.name="����";
		this.tank=50;
		this.oilconsumption=0;
	}
	
	public static void main(String[] args){
		Car[] car=new Car[3];
		for(int i=0;i<3;i++){
			car[i]=new Car();
			car[i].setCar();
			System.out.println("\n��"+(i+1)+"��������Ϣ��\n"+"name:\t\t"+car[i].name
				+"\ntank:\t\t"+car[i].tank+"\noilconsumption:\t"+car[i].oilconsumption);
			car[i].Gas();
			car[i].Run();
			System.out.println("\n");
		}
	}
}