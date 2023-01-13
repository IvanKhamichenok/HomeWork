package oop_homework;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone firstPhone = new Phone();
        firstPhone.getNumber();
        firstPhone.receiveCall("Леонид","+3752911111");
        Phone secondPhone = new Phone("+375332222222","Iphone");
        String numberOfSecondPhone = secondPhone.getNumber();
        secondPhone.receiveCall("Начальник");
        Phone thirdPhone = new Phone(numberOfSecondPhone,"Samsung",123);
        String[] numbers = {"+375293515151","+375333515174","+375443515353"};
        thirdPhone.sendMessage(numbers);
    }
}