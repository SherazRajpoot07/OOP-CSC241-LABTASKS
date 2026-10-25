
public class HospitalDemo {
    public static void main(String[] args) {

        MedicalService service1 = new MedicalService(
                301, "Doctor Consultation", 1500,
                ServiceCategory.CONSULTATION);

        MedicalService service2 = new MedicalService(
                302, "Blood Test", 800,
                ServiceCategory.LAB_TEST);

        MedicalService service3 = new MedicalService(
                303, "Chest X-Ray", 2000,
                ServiceCategory.XRAY);

        MedicalService service4 = new MedicalService(
                304, "Medicine", 500,
                ServiceCategory.MEDICINE);

        Patient patient = new Patient(20, "Ahmed");

        BillingRecord bill = new BillingRecord(8001, patient);

        bill.addService(service1, 1);
        bill.addService(service2, 2);
        bill.addService(service3, 1);

        bill.displayBill();

        System.out.println("\nSearching for service 302:");
        bill.findService(302);

        System.out.println("\nSearching for service 999:");
        bill.findService(999);
    }
}
