package com.zww.KTV;

import java.util.Scanner;

public class SongDrive{
	

	public Player player;
	public Master master;
	
	public SongDrive() {
		player=new Player();
		master=new Master();
		}
	
	public void menu1(SongDrive songDrive) {
		//ѡ��
		
		System.out.println("1. ѡ��\n"+"2. ��ѡ�赥\n"+"3. ��һ��\n"+"0. �˳�");	
		two:{
			System.out.println("��ѡ��");	
			Scanner s = new Scanner(System.in);
			if(s.hasNextInt()) {
				int  no=s.nextInt();
				if(no==1) 
					{songDrive.player.addSong();menu1(songDrive);}
				else if(no==2)
					{songDrive.master.play();menu1(songDrive);}
				else if(no==3)
					{songDrive.master.nextSong();menu1(songDrive);}
				else if(no==0)
					System.exit(0);
				else 
					{System.out.println("������ѡ��\n");break two;	}
			
			}
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {

		Song.setSong();
		SongDrive songDrive=new SongDrive();
		System.out.println("****��ӭ����zww��KTV****");
		songDrive.menu1(songDrive);
		
	}
}