package EthanClass;

import java.util.LinkedList;
import java.lang.Math;

public class Album {
    static void addSong(LinkedList<String>titles, String songTitle) {
        titles.add(songTitle);
    }

    static void removeSong(LinkedList<String>titles, String songTitle) {
        titles.remove(songTitle);
    }

    static int searchSong(LinkedList<String>titles, String songTitle) {
        return titles.indexOf(songTitle);
    }

    static String searchSong(LinkedList<String>titles, int index) {
        return titles.get(index);
    }

    static void shufflePlaylist(LinkedList<String> titles) {
        for (String song : titles) {
            int index = (int) (Math.random() * titles.size() + 1) -1;
            int songIndex = titles.indexOf(song);
            String song2 = titles.get(index);
            titles.set(index, song);
            titles.set(songIndex, song2);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> Album = new LinkedList<>();
        Album.add("Song1");
        Album.add("Song2");
        Album.add("Song3");
        System.out.println(Album);

        addSong(Album, "Song4");
        System.out.println(Album);

        removeSong(Album, "Song2");
        System.out.println(Album);

        System.out.println(searchSong(Album, "Song3"));

        System.out.println(searchSong(Album, 2));

        shufflePlaylist(Album);
        System.out.println(Album);
    }
}
