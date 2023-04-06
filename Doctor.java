package HospitalManagementSystem;
public class Doctor {
  final   private String name;
  final   private String department;
  final   private String degree;
   final private String expert;

//   This Constructor takes the details of the Doctor and creates a new Object
    public Doctor(String name, String department, String degree, String expert) {
        this.name = name;
        this.department = department;
        this.degree = degree;
        this.expert = expert;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getDegree() {
        return degree;
    }

    public String getExpert() {
        return expert;
    }
//This will also prints the Doctor details
    @Override
    public String toString() {
        return "Doctor Name: "+name+" Department: "+department+" Degree: "+degree+" Expert: "+expert+"\n";
    }
}
