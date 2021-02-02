package P10;

import java.math.BigInteger;

public class Zmogus {

    private String name;
    private String surname;
    private int code;


    public Zmogus(String name, String surname, int code) {
        this.name = name;
        this.surname = surname;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}


