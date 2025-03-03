public class TelcoAllowance implements UsagePromo{
    @Override
    public String showAllowance(int dataAllowance , double money) {
        return dataAllowance + " and " + money;
    }
    
}