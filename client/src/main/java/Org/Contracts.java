package Org;

import java.io.Serializable;

public class Contracts implements Serializable {
    private int id;
    private String contract;
    private String category;
    private int payment;
    private int date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", contract='" + contract + '\'' +
                ", category='" + category + '\'' +
                ", payment=" + payment +
                '}';
    }
}

