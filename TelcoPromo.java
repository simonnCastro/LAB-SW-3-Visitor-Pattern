public class TelcoPromo {
  public static void main(String[] args) {
    Telco smart = new Telco(15, 500, "Smart",false);
    Telco globe = new Telco(10, 450, "Globe",true);
    Telco ditto = new Telco(8, 400, "Ditto",true);

    UsagePromo promo = new TelcoAllowance();
    UnliCallsTextOffer unli = new UnliCallTextPackage();    

    System.out.println("Smart Data Usage Offer and price: " + promo.showAllowance(smart.getDataAllowance(), smart.getPromoPrice()));
    System.out.println("Globe Data Usage Offer and price: " + promo.showAllowance(globe.getDataAllowance(), globe.getPromoPrice()));
    System.out.println("Ditto Data Usage Offer and price: " + promo.showAllowance(ditto.getDataAllowance(), ditto.getPromoPrice()));

    System.out.println("\nSmart unlimited calls and text package: " +

                                  unli.showUnliCallsTextOffer(smart.getTelcoName(), smart.getUnliCallText()));
    System.out.println("Globe unlimited calls and text package: " +

                                  unli.showUnliCallsTextOffer(globe.getTelcoName(), globe.getUnliCallText()));
    System.out.println("Ditto unlimited calls and text package: " +

                                   unli.showUnliCallsTextOffer(ditto.getTelcoName(), ditto.getUnliCallText()));
  }
}