package app.service;

import app.entity.Client;

public abstract class InfoService<K, V> {

    public String getData() {
        return formData(getInputs());
    }

    protected abstract Client<K, V> getInputs();

    protected abstract String formData(Client<K, V> client);
}
