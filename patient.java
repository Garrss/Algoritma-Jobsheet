public class patient {
    String name;
    int age;
    int doctorFee;
    int[] medicationPrice = new int[3];

    public patient(String name, int age, int[] medicationPrice, int doctorFee) {
        this.name = name;
        this.age = age;
        this.medicationPrice = medicationPrice;
        this.doctorFee = doctorFee;

    }

    public double averageMedicationPrice() {
        int sum = 0;
        for (int price : medicationPrice) {
            sum += price;
        }
        return (double) sum / medicationPrice.length;
    }

    public int totalFee() {
        int sum = 0;
        for (int price : medicationPrice) {
            sum += price;
        }
        return sum + doctorFee;
    }

    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Medication price : ");
        for (int i = 0; i < medicationPrice.length; i++) {
            System.out.print(medicationPrice[i]);
            if (i < medicationPrice.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.println("Doctor fee: " + doctorFee);
        System.out.println("Total fee: " + totalFee());
    }
}