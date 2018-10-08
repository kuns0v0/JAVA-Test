package com.zww.KTV;
import java.util.List;
import java.util.ArrayList;
public class Song{
	String songName;
	String singer;
	double time;
	static List<Song> allSong = new ArrayList<Song>();
	//¸è¿â
	public static void setSong() {
		
		Song song1=new Song("PPAP","PIKO",2.26);
		allSong.add(song1);
		
		Song song2=new Song("That Girl","Olly Murs",2.56);
		allSong.add(song2);
	}
	
	
	public Song(String songName,String singer,double time){
		this.songName=songName;
		this.singer=singer;
		this.time=time;
	}
	
	public Song() {}
}