import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        ArrayList<Quotes> quotes = new ArrayList<>();

        Authors neilGaiman = new Authors(1L,"Neil Gaiman");
        Authors marcelProust = new Authors(2L, "Marcel Proust");

        Quotes newQuote = new Quotes(1L,"qoute content",neilGaiman);
        Quotes secondQuote = new Quotes(2L,"Second quote content",marcelProust);

        quotes.add(newQuote);
        quotes.add(secondQuote);


        for (Quotes quote: quotes){
            System.out.println(quote.getAuthor().getName() + " said " + quote.getContent());
        }
    }
}
