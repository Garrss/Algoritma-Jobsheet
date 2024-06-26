package UAS;

public class Vehicle {
    private String regNumber;
    private String name;
    private String type;
    private int cc;
    private int year;
    private int monthToPay;

    public Vehicle(String regNumber, String name, String type, int cc, int year, int monthToPay) {
        this.regNumber = regNumber;
        this.name = name;
        this.type = type;
        this.cc = cc;
        this.year = year;
        this.monthToPay = monthToPay;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getCc() {
        return cc;
    }

    public int getYear() {
        return year;
    }

    public int getMonthToPay() {
        return monthToPay;
    }
}