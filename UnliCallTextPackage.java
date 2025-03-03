public class UnliCallTextPackage implements UnliCallsTextOffer{
    
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText){
        return telcoName + " and " + unliCallText;
    }
}