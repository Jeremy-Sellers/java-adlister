import java.util.List;

public interface Ads {
    //get list of all Ad objects
    List<Ad> all();
    //insert a new ad
    Long insert(Ad ad);
}
