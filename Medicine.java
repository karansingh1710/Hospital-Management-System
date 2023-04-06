package HospitalManagementSystem;

public class Medicine {
    private String name;
    private int id;
    private double price;

   public Medicine(String name, int id, double price){
        this.name=name;
        this.id=id;
        this.price=price;
    }

    public double generateBill(){
       return 3;
    };
}
