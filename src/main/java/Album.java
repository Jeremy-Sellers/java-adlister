import java.io.Serializable;
import java.util.Date;

public class Album implements Serializable {
    private long id;
    private String artist;
    private String songName;
    private Date releaseDate;
    private long sales;
    private String genre;

    public Album(){}

    public Album(long id, String artist, String songName, Date releaseDate, long sales, String genre){
        this.id = id;
        this.artist = artist;
        this.songName = songName;
        this.releaseDate = releaseDate;
        this.sales = sales;
        this.genre = genre;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtist(){
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public long getSales() {
        return sales;
    }

    public void setSales(long sales) {
        this.sales = sales;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
