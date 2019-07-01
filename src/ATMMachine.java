public class ATMMachine {
    
    public static void balanceEnquiry(ATMCard card){
        card.showBalance();
        card.rateInfo();
    }
    
    
    public static void main(String args[]){
        SBICard card=new SBICard();
        //HDFCCard card=new HDFCCard();
        card.setBalance(100000);
        balanceEnquiry(card);
    }
}
