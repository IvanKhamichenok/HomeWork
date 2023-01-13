package oop_homework;

import java.util.Arrays;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public void receiveCall(String name) {
        System.out.println(name + " Звонит");
    }

    public void receiveCall(String name, String number) {
        System.out.println(name + " Звонит " + number);
    }

    public void sendMessage(String... phoneNumbers) {
        System.out.println("Сообщение отпавлено на номер : " + Arrays.toString(phoneNumbers));
    }

    public String getNumber() {
        if (this.number == null) {
            System.out.println("Номер неопределен. ");

        }
        return number;
    }
}


