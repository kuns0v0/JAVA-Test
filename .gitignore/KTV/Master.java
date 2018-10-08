package com.zww.KTV;
import java.util.List;
import java.util.ArrayList;
public class Master{
	static List<Song> listSong;
	
	public Master() {
		listSong = new ArrayList<Song>();
	}
	
	public boolean play() {
		//已选歌单
		if(listSong.size()==0)
			System.out.println("没有歌曲！");
		else{
				System.out.println("已选歌单：");
				for(int i=0;i<listSong.size();i++) {
				if(i==0)
					System.out.println("*正在播放*"+(i+1)+". "+ listSong.get(i).songName+"\t\t"+listSong.get(i).singer+"\t\t"+listSong.get(i).time);
				else
					System.out.println((i+1)+". "+listSong.get(i).songName+"\t\t"+listSong.get(i).singer+"\t\t"+listSong.get(i).time);	
				}
			}
		System.out.println();
		return true;
	}
	
	public void nextSong() {
		if(listSong.size()==0)
			System.out.println("歌单中没有歌曲！");
		else {
			listSong.remove(0);
			System.out.println("切歌成功！");
			}
		System.out.println();
	}
	
}