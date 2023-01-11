package creditcard;

public class CreditDemo {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard();
        CreditCard creditCard2 = new CreditCard();
        CreditCard creditCard3 = new CreditCard();

        creditCard1.number = 123456789;
        creditCard1.cash = 10000;
        creditCard1.withdraw = 0;
        creditCard1.replenish = 20;
        creditCard1.noMoneyNoHoney();

        creditCard2.number = 223456789;
        creditCard2.cash = 1000;
        creditCard2.withdraw = 0;
        creditCard2.replenish = 10;
        creditCard2.noMoneyNoHoney();

        creditCard3.number = 323456789;
        creditCard3.cash = 1000;
        creditCard3.withdraw = 20;
        creditCard3.replenish = 0;
        creditCard3.noMoneyNoHoney();}
}