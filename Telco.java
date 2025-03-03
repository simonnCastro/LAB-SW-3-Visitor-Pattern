public class Telco implements TelcoSubscription{
    private String telcoName;
    private double promoPrice;
    private int dataAllowance;
    private boolean unliCallText;

    public Telco(int dateAllowance, double promoPrice, String telcoName, boolean unliCallText){
        this.dataAllowance = dateAllowance;
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.unliCallText = unliCallText;

    }

    @Override
    public String accept(UsagePromo promo, double price){
        this.promoPrice = price;
        return promo.showAllowance(dataAllowance, price);

    }
    public String accept(UnliCallsTextOffer unliPackage, boolean unliCallText){
        this.unliCallText = unliCallText;
        return unliPackage.showUnliCallsTextOffer(telcoName, unliCallText);
    }

    
    public String getTelcoName() {
        return telcoName;
    }

    public void setTelcoName(String telcoName) {
        this.telcoName = telcoName;
    }

    public double getPromoPrice() {
        return promoPrice;
    }

    public void setPromoPrice(double promoPrice) {
        this.promoPrice = promoPrice;
    }

    public int getDataAllowance() {
        return dataAllowance;
    }

    public void setDataAllowance(int dateAllowance) {
        this.dataAllowance = dateAllowance;
    }

    public boolean getUnliCallText() {
        return unliCallText;
    }

    public void setUnliCallText(boolean unliCallText) {
        this.unliCallText = unliCallText;
    }
}