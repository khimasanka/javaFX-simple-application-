package model;

public class RoomDiscounts {
    private String rmType;
    private String dRate;
    private String uWhen;

    public RoomDiscounts() {
    }

    public RoomDiscounts(String rmType, String dRate, String uWhen) {
        this.setRmType(rmType);
        this.setdRate(dRate);
        this.setuWhen(uWhen);
    }

    public String getRmType() {
        return rmType;
    }

    public void setRmType(String rmType) {
        this.rmType = rmType;
    }

    public String getdRate() {
        return dRate;
    }

    public void setdRate(String dRate) {
        this.dRate = dRate;
    }

    public String getuWhen() {
        return uWhen;
    }

    public void setuWhen(String uWhen) {
        this.uWhen = uWhen;
    }

    @Override
    public String toString() {
        return "RoomDiscounts{" +
                "rmType='" + rmType + '\'' +
                ", dRate='" + dRate + '\'' +
                ", uWhen='" + uWhen + '\'' +
                '}';
    }
}
