import java.io.Serializable;

public class Quotes implements Serializable {
    private long id;
    private String content;
    private  Authors author;

    public Quotes(){}

    public Quotes(long id, String content, Authors author){
        this.id = id;
        this.content = content;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Authors getAuthor() {
        return author;
    }

    public void setAuthor(Authors author) {
        this.author = author;
    }
}
