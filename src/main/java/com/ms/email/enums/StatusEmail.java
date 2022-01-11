package com.ms.email.enums;

public enum StatusEmail {

    send(1, "Enviado"), error(2, "Error");

    private int cod;
    private String description;

    private StatusEmail(int cod, String description) {
        this.cod = cod;
        this.description = description;
    }

    public int getCod() {
        return cod;
    }

    public String getDescription() {
        return description;
    }

    public static StatusEmail toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }
        for (StatusEmail x : StatusEmail.values()) {
            if (cod.equals(x.getCod())) {
                return x;
            }
        }
        throw new IllegalArgumentException("ID invalido: " + cod);
    }
}
