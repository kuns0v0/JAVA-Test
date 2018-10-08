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
		//选单
		
		System.out.println("1. 选歌\n"+"2. 已选歌单\n"+"3. 下一首\n"+"0. 退出");	
		two:{
			System.out.println("请选择：");	
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
					{System.out.println("请重新选择！\n");break two;	}
			
			}
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {

		Song.setSong();
		SongDrive songDrive=new SongDrive();
		System.out.println("****欢迎来到zww的KTV****");
		songDrive.menu1(songDrive);
		
	}
}