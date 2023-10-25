package org.aleksei.section10.exercise.playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private final String name;
    private final String artist;
    private final ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        return findSong(title) == null && songs.add(new Song(title, duration));
    }

    private Song findSong(String title) {
        for (Song s : songs) {
            if (title.equalsIgnoreCase(s.getTitle())) {
                return s;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        return songs.size() >= trackNumber && trackNumber > 0 && playlist.add(songs.get(trackNumber - 1));
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        return songs.contains(findSong(title)) && playlist.add(findSong(title));
    }
}
