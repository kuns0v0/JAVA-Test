package com.zww.KTV;
import java.util.List;
import java.util.ArrayList;
public class Master{
	static List<Song> listSong;
	
	public Master() {
		listSong = new ArrayList<Song>();
	}
	
	public boolean play() {
		//��ѡ�赥
		if(listSong.size()==0)
			System.out.println("û�и�����");
		else{
				System.out.println("��ѡ�赥��");
				for(int i=0;i<listSong.size();i++) {
				if(i==0)
					System.out.println("*���ڲ���*"+(i+1)+". "+ listSong.get(i).songName+"\t\t"+listSong.get(i).singer+"\t\t"+listSong.get(i).time);
				else
					System.out.println((i+1)+". "+listSong.get(i).songName+"\t\t"+listSong.get(i).singer+"\t\t"+listSong.get(i).time);	
				}
			}
		System.out.println();
		return true;
	}
	
	public void nextSong() {
		if(listSong.size()==0)
			System.out.println("�赥��û�и�����");
		else {
			listSong.remove(0);
			System.out.println("�и�ɹ���");
			}
		System.out.println();
	}
	
}