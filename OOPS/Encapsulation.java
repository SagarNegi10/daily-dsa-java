class Atm{
    int balance;
    void setbalance(int val){
        this.balance = val;
    }   
    int getBalance(){
        return balance;
    }
}
class Encapsulation{
    public static void main(String[] args) {
        Atm a = new Atm();
        a.setbalance(5000);
        System.out.println("Your Balance is:" + a.getBalance());
    }
}