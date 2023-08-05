package app.service;

import app.entity.Client;
import app.utils.Rounder;

import java.util.Scanner;

public class InfoService02 extends InfoService<String, Double> {

    Scanner scanner;
    String name;
    double amount;

    @Override
    protected Client<String, Double> getInputs() {
        scanner = new Scanner(System.in);
        System.out.print("Enter client's phone: ");
        name = scanner.nextLine();
        System.out.print("Enter client's purchase amount: ");
        amount = scanner.nextDouble();
        return new Client<>(name, amount);
    }

    @Override
    protected String formData(Client<String, Double> client) {
        String amountRounded = Rounder.roundValue(client.value());
        return "Client's phone is " + client.key() +
                ", purchase amount is USD " + amountRounded;
    }
}
