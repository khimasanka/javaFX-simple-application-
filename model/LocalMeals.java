package model;

public class LocalMeals {
    private String lMealNo;
    private String lMealName;
    private String lMealTime;
    private String lMealPrice;

    public LocalMeals() {
    }

    public LocalMeals(String lMealNo, String lMealName, String lMealTime, String lMealPrice) {
        this.lMealNo = lMealNo;
        this.lMealName = lMealName;
        this.lMealTime = lMealTime;
        this.lMealPrice = lMealPrice;
    }

    public String getlMealNo() {
        return lMealNo;
    }

    public void setlMealNo(String lMealNo) {
        this.lMealNo = lMealNo;
    }

    public String getlMealName() {
        return lMealName;
    }

    public void setlMealName(String lMealName) {
        this.lMealName = lMealName;
    }

    public String getlMealTime() {
        return lMealTime;
    }

    public void setlMealTime(String lMealTime) {
        this.lMealTime = lMealTime;
    }

    public String getlMealPrice() {
        return lMealPrice;
    }

    public void setlMealPrice(String lMealPrice) {
        this.lMealPrice = lMealPrice;
    }

    @Override
    public String toString() {
        return "LocalMeals{" +
                "lMealNo='" + lMealNo + '\'' +
                ", lMealName='" + lMealName + '\'' +
                ", lMealTime='" + lMealTime + '\'' +
                ", lMealPrice='" + lMealPrice + '\'' +
                '}';
    }
}
