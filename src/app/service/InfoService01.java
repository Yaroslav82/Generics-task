package app.service;

import app.entity.Client;

import java.util.Scanner;

public class InfoService01 extends InfoService<String, String> {

    Scanner scanner;
    String name;
    String email;

    public String getData() {
        return formData(getInputs());
    }

    @Override
    protected Client<String, String> getInputs() {
        scanner = new Scanner(System.in);
        System.out.print("Enter client's name: ");
        name = scanner.nextLine();
        System.out.print("Enter client's email: ");
        email = scanner.nextLine();
        return new Client<>(name, email);
    }

    @Override
    protected String formData(Client<String, String> client) {
        return "Client's name is " + client.key() +
                ", email is " + client.value();
    }
}
