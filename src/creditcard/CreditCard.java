package creditcard;

public class CreditCard {
    double number;// номер карты
    double cash;// сколько кэша на карте ?
    double withdraw;// снятие
    double replenish;// пополнение

    void noMoneyNoHoney() {
        System.out.println(cash + replenish - withdraw);
    }
}

