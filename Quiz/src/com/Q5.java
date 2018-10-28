package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * 
 * @author nag-training
 * 
 *  Strategy pattern
 *
 */

class Song {
	private String title;
	private int duration;

	public Song(String title, int duration) {
		super();
		this.title = title;
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", duration=" + duration + "]";
	}

}

interface SchedulingStrategy {
	Song next(List<Song> songs);
}

class PlayList {
	private List<Song> songs;
	private SchedulingStrategy strategy;

	public PlayList() {
		songs = new ArrayList<>();
	}

	public List<Song> getSongs() {
		return songs;
	}

	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}

	public void setStrategy(SchedulingStrategy strategy) {
		this.strategy = strategy;
	}

	public Song getNextSong() {
		return strategy.next(songs);
	}

}

class FCFSStrategy implements SchedulingStrategy {
	@Override
	public Song next(List<Song> songs) {
		return songs.get(0);
	}
}

public class Q5 {

	public static void main(String[] args) {

		PlayList playList = new PlayList();
		List<Song> allSongs = Arrays.asList(new Song("la la", 4), new Song("oo oo", 3), new Song("ha ha", 2));
		playList.setSongs(allSongs);
		// playList.setStrategy(new FCFSStrategy()); // OO style
		playList.setStrategy(songs -> songs.get(0)); // FP style

		Song nextSong = playList.getNextSong();
		System.out.println(nextSong);

	}

}
