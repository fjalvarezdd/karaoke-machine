import com.teamtreehouse.model.Song;
import com.teamtreehouse.model.SongBook;
import com.teamtreehouse.KaraokeMachine;

public class Karaoke {
    public static void main(String[] args) {
        SongBook songBook = new SongBook();
        songBook.importFrom("song.txt");
        KaraokeMachine karaokeMachine = new KaraokeMachine(songBook);
        karaokeMachine.run();
        System.out.println("Saving book...");
        songBook.exportTo("song.txt");
    }
}