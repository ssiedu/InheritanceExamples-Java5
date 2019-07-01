public class HDFCCard implements ATMCard {
    private int balance;
    
    public void setBalance(int balance){
        this.balance=balance;
    }
    
    public void showBalance(){
        System.out.println("Balance Available In HDFC Ac : "+balance);
    }
    
}
