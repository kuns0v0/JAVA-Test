package com.zww.KTV;
import java.util.Scanner; 
public class Player{
	
	public Player() {}
	public boolean addSong() {
		//���
		
		System.out.println("\n������£�");		//������
		for(int i=0;i<Song.allSong.size();i++) {
			System.out.println((i+1)+". "+ Song.allSong.get(i).songName+"\t\t"+Song.allSong.get(i).singer+"\t\t"+Song.allSong.get(i).time);
		}
		System.out.println("�����������ţ�");	
		Scanner s = new Scanner(System.in);
		if(s.hasNextInt()) {
			int  no=s.nextInt();
			if(no>0 && no<=Song.allSong.size()) {
				Master.listSong.add(Song.allSong.get(no-1));
				System.out.println("���ɹ���");
			}
			else
				System.out.println("���ʧ�ܣ�");
		}
		System.out.println();
		return true;
	}
	
	
}