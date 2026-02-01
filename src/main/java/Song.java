import java.util.HashSet;

public class Song {
    private String name;
    private Song nextSong;

    public Song(String name) {
        this.name = name;
    }

    public void setNextSong(Song nextSong) {
        this.nextSong = nextSong;
    }

    public boolean isInRepeatingPlaylist() {
        HashSet<Song> visited = new HashSet<>();
        Song current = this;

        while (current != null) {
            if (visited.contains(current)) {
                return true;
            }
            visited.add(current);
            current = current.nextSong;
        }

        return false;
    }
}
