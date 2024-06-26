package UAS;

public class TaxTransaction {
    private static int codeCounter = 1;
    private int code;
    private long nominal;
    private long penalty;
    private int monthToPay;
    private Vehicle vehicle;

    public TaxTransaction(long nominal, long penalty, int monthToPay, Vehicle vehicle) {
        this.code = codeCounter++;
        this.nominal = nominal;
        this.penalty = penalty;
        this.monthToPay = monthToPay;
        this.vehicle = vehicle;
    }

    public int getCode() {
        return code;
    }

    public long getNominal() {
        return nominal;
    }

    public long getPenalty() {
        return penalty;
    }

    public int getMonthToPay() {
        return monthToPay;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}