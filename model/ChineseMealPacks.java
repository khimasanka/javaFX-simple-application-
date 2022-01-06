package model;

public class ChineseMealPacks {
    private String cMealNo;
    private String cMealName;
    private String cMealPrice;
    private String cMealOrders;
    private String cMealTime;

    public ChineseMealPacks(String cMealNo, String cMealName, String cMealPrice, String cMealOrders, String cMealTime) {
        this.cMealNo = cMealNo;
        this.cMealName = cMealName;
        this.cMealPrice = cMealPrice;
        this.cMealOrders = cMealOrders;
        this.cMealTime = cMealTime;
    }

    public String getcMealNo() {
        return cMealNo;
    }

    public String getcMealName() {
        return cMealName;
    }

    public String getcMealPrice() {
        return cMealPrice;
    }

    public String getcMealOrders() {
        return cMealOrders;
    }

    public String getcMealTime() {
        return cMealTime;
    }
}