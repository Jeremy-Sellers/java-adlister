import java.util.List;

public interface Products {
    //Matches SELECT * FROM products;
    List<Product> all();
    //matches INSERT INTO prodcuts (name, price)...
    void insert(Product product);
}
