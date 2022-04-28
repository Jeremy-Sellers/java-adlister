public class DAOFactory {
    private static Ads adsDAO;
    private static Products productsDao;

    public static Products getProductsDao(){
        if (productsDao == null){
            productsDao = new ListProductsDAO();
        }
        return productsDao;
    }

    public static Ads getAdsDAO(){
        if (adsDAO == null){
            adsDAO = new ListAdsDao();
        }
        return adsDAO;
    }
}
