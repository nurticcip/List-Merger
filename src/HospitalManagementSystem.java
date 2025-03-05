import java.util.Date;

abstract class Patient{
    String name;
    int age;
    String illness;

    public Patient(String name, int age, String illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
    }

    public void updateIllness(String illness){
        this.illness = illness;
    }

    abstract void getDetails();
}

class Inpatient extends Patient{
    int roomNumber;
    int stayingDays;

    public Inpatient(String name, int age, String illness, int roomNumber, int stayingDays) {
        super(name, age, illness);
        this.roomNumber = roomNumber;
        this.stayingDays = stayingDays;
    }

    public void extendStay(int day){
        stayingDays +=day;
    }
    @Override
    void getDetails() {
        System.out.println("Inpatient: "+name+", Age: "+age + ", Illness: "+
                illness+", roomNumber: "+roomNumber+", Stay Duration: "+
                stayingDays+"days.");
    }
}

class Outpatient extends Patient{
    Date appointmentDate;

    public Outpatient(String name, int age, String illness, Date appointmentDate) {
        super(name, age, illness);
        this.appointmentDate = appointmentDate;
    }

    public void rescheduleAppointment(Date newDate){
        appointmentDate = newDate;
    }

    public void getDetails(){
        System.out.println("Outpatient: "+name+", Age: "+age + ", Illness: "+
                illness+", Appointment Date "+appointmentDate);
    }
}

class Hospital{
    Patient[] patients;

    public Hospital() {
        this.patients = new Patient[5];
    }

    public void add(Patient newp){
        for (int i=0; i< patients.length;i++){
            if(patients[i] == null){
                patients[i] = newp;
                String pt = patients[i] instanceof Inpatient ? "Inpatient" : "Outpatient";
                System.out.println(patients[i].name +
                        " has been registered as an " + pt);
            }
        }
    }
}

class BankAccount{
    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double sum) throws InsufficientFundsException, IllegalArgumentException{
        if (sum > balance) {
            throw new InsufficientFundsException("Insufficient funds exception");
        } else if (sum <= 0) {
            throw new IllegalArgumentException("Illegal argument exception");
        }
        balance -= sum;
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException (String message) {
        super(message);
    }
}

class IllegalArgumentException extends Exception {
    public IllegalArgumentException (String message) {
        super(message);
    }
}

public class HospitalManagementSystem {
    public static void findMiddleChar(String s){
        if(s.length()%2 == 0){
            System.out.println(s.charAt(s.length()/2-1)+""+s.charAt(s.length()/2));
        }else{
            int m = (int) s.length()/2;
            System.out.println(s.charAt(m));
        }
    }

    public static void removeVowelsReverse(String s){
        String reversed = "";
        String vowels = "aeio";
        for(int i =s.length()-1;i>-1;i--){
            if (!vowels.contains(s.charAt(i)+"")){
                reversed +=s.charAt(i);
            }
        }
        System.out.println(reversed);
    }


    public static void main(String[] args) {
    Hospital h = new Hospital();
    Patient p = new Inpatient("Bob", 24, "Pneumonia", 102, 4);
    h.add(p);
    removeVowelsReverse("efe");
    findMiddleChar("AITT");
    BankAccount b = new BankAccount(1000);

    try {
        b.withdraw(-52);
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    }
}
