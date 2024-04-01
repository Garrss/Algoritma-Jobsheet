public class patientmain {
    public static void main(String[] args) {
        patient[] patients = new patient[5];
        patients[0] = new patient("Joni", 60, new int[] { 10, 20, 30 }, 50);
        patients[1] = new patient("jane", 45, new int[] { 15, 25, 35 }, 60);
        patients[2] = new patient("Baby", 1, new int[] { 5, 10, 15 }, 70);
        patients[3] = new patient("Grandpa Carl", 75, new int[] { 20, 30, 40 }, 40);
        patients[4] = new patient("Grandma Jennie", 70, new int[] { 25, 35, 45 }, 45);

        double totalFeesAvg = 0;
        int totalFeesCount = 0;
        for (patient patient : patients) {
            if (patient.age > 50) {
                totalFeesAvg += patient.totalFee();
                totalFeesCount++;
            }
        }
        if (totalFeesCount > 0) {
            totalFeesAvg /= totalFeesCount;
            System.out.println("The average total fee of patients whose age is greater than 50 is: " + totalFeesAvg);
        } else {
            System.out.println("No patients found whose age is greater than 50.");
        }

        double smallestMedicationPriceAvg = Integer.MAX_VALUE;
        patient patientWithSmallestMedicationPrice = null;
        for (patient patient : patients) {
            if (patient.age >= 15 && patient.age <= 30) {
                double avg = patient.averageMedicationPrice();
                if (avg < smallestMedicationPriceAvg) {
                    smallestMedicationPriceAvg = avg;
                    patientWithSmallestMedicationPrice = patient;
                }
            }
        }
        if (patientWithSmallestMedicationPrice != null) {
            System.out.println("The smallest average medication price of 15-30 years old patients is: "
                    + smallestMedicationPriceAvg);
            patientWithSmallestMedicationPrice.printData();
        }
    }
}
