public interface ATMCard {
    public void setBalance(int balance);
    public void showBalance();
    public default void rateInfo(){
        System.out.println("Interest Rate : 8%");
    }
}
/*
    to give the specification of a class.
    this interface will define that
    exactly one ATMCard should have.
*/
