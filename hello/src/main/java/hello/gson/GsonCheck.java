package hello.gson;

import com.google.gson.Gson;

import java.math.BigDecimal;

public class GsonCheck {

    private String name;

    private BigDecimal lastPaymentDate;

    public GsonCheck(String name, BigDecimal amount) {
        this.name = name;
        this.lastPaymentDate = amount;
    }

    public static void main(String[] args) {
        GsonCheck gsonCheck = new GsonCheck("Aadavan", new BigDecimal(1000.00));
        Gson gson = new Gson();
        String gsonCheckJson = gson.toJson(gsonCheck, GsonCheck.class);
        System.out.println("gsonCheckJson = " + gsonCheckJson);
    }
}
