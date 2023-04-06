package HospitalManagementSystem;
//This will store the patient details
public final class Patient {
    private final String name;
    private final int age;
    private final String phone;
    private final String address;
    private final String gender;
//This Constructor takes the details of the patient and assign them with the new object

    public Patient(String name, int age, String phone, String address, String gender) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
    }

    public String address() {
        return address;
    }

    public String gender() {
        return gender;
    }

    public String phone() {
        return phone;
    }

    public String name() {
        return name;
    }

    public int age() {
        return age;
    }
//This will prints the patient details in the formatted way
    @Override
    public String toString() {
        return "Patient[" +
                "name=" + name + ", " +
                "age=" + age + ", " +
                "phone=" + phone + ", " +
                "address=" + address + ", " +
                "gender=" + gender + ']';
    }

}
