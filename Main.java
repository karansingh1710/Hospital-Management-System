package HospitalManagementSystem;

import java.util.*;
public class Main {
   private   static List<Patient> patientsList = new ArrayList<>();
   private   static List<Doctor> doctorList=new ArrayList<>();
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        boolean run=true;
        while(run){
            System.out.println("\n**************WELCOME************");
            System.out.println("************** Divya Hospital ************\n");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. View All Patients");
            System.out.println("4. View All Doctors");
            System.out.println("5. Search for a Patient");
            System.out.println("6. Search for a Doctor");
            System.out.println("7. Exit");
            int choice=0;
            try {
                choice=scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("You have entered a Wrong Input");
            scan.nextLine();
            }

            switch (choice) {
                case 1:
                    addPatient(scan);
                    break;
                case 2:
                    addDoctor( scan);
                    break;
                case 3:
                    viewAllPatients();
                    break;
                case 4:
                    viewAllDoctors();
                    break;
                case 5:
                    searchPatient(scan);
                    break;
                case 6:
                    searchDoctor(scan);
                    break;
                case 7:
                    run=false;
                    break;
                default:
                    System.out.println("Wrong Choice Selected");
                    break;
            }
        }
    }
    private static void addPatient(Scanner scan){
        String name;
        int  age=-1;
        String phone;
        String address;
        String gender;
        scan.nextLine();
        System.out.println("Enter Patient Name:");
        name=scan.nextLine();
        System.out.println("Enter Age:");
        while (age < 0) {
            try {
                age = scan.nextInt();
                if (age < 0) {
                    System.out.println("Age cannot be negative. Please enter a positive value:");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input for age. Please enter a valid number:");
                scan.next(); // consume the invalid input to avoid infinite loop
            }
        }
        scan.nextLine();
        System.out.println("Enter Phone Number:");
        phone=scan.nextLine();
        System.out.println("Enter Address:");
        address=scan.nextLine();
        System.out.println("Enter Gender:");
        gender=scan.nextLine();

        Patient patient= new Patient(name, age, phone, address, gender);
       patientsList.add(patient);
        System.out.println("Patient Added Successfully");
    }
    private static void addDoctor(Scanner scan){
         String name;
         String department;
         String degree;
         String expert;
         scan.nextLine();
        System.out.println("Enter Doctor Name:");
        name=scan.nextLine();
        System.out.println("Enter The Department of The Doctor:");
        department= scan.nextLine();
        System.out.println("Enter the degrees Of the Doctor:");
        degree= scan.nextLine();
        System.out.println("Enter In which He/She is Expert:");
        expert= scan.nextLine();

        Doctor doctor=new Doctor(name,department,degree,expert);

        doctorList.add(doctor);
        System.out.println("Doctor Added Successfully");
    }
    private static void viewAllPatients(){
        System.out.println(String.format("| %-20s| %-10s| %-15s| %-10s| %-30s", "Name", "Age", "Phone", "Gender", "Address"));
        for (Patient patient : patientsList) {
            System.out.println(String.format("| %-20s| %-10s| %-15s| %-10s| %-30s", patient.name(), patient.age(), patient.phone(), patient.gender(), patient.address()));
        System.out.println("*************************************");
        }
    }
    private static void viewAllDoctors(){
    for (Doctor doctor: doctorList){
        System.out.println("Doctor Name: "+doctor.getName());
        System.out.println("Department: "+doctor.getDepartment());
        System.out.println("Expert in: "+doctor.getExpert());
        System.out.println("Degrees Of The Doctor: "+doctor.getDegree());
    }

    }
    private static void searchPatient(Scanner scan){
        scan.nextLine();
        String name;
        boolean found=false;
        System.out.println("Enter the Patient Name:");
        name=scan.nextLine();
        for (Patient patient: patientsList){
            if (name.equalsIgnoreCase(patient.name())){
                System.out.println("Patient Found:");
                System.out.println(patient);
                found=true;
            }
        }
        if (!found){
            System.out.println("There is no Such Type of Patient Exist in Our Hospital");
        }
    }
    private static void searchDoctor(Scanner scan){
        String name;
        boolean flag=false;
        scan.nextLine();
        System.out.println("Enter the Doctor Name:");
        name=scan.nextLine();
        for (Doctor doctor: doctorList){
            if (name.equalsIgnoreCase(doctor.getName())){
                System.out.println("Doctor Found");
                System.out.println(doctor);
                flag=true;
            }
        }
        if (!flag){
                System.out.println("There is no Such Type of Doctor Exist in Our Hospital");
        }
    }
}
