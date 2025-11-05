package Inheritance;

public class BankInform {
    public static void main(String[] args) {
        Bank b1 = new SBI();   // SBI is a Bank
        Bank b2 = new HDFC();  // HDFC is a Bank
        Bank b3 = new ICICI(); // ICICI is a Bank

        b1.bankName();
        System.out.println("SBI Rate of Interest: " + b1.getRateOfInterest() + "%");
        System.out.println("HDFC Rate of Interest: " + b2.getRateOfInterest() + "%");
        System.out.println("ICICI Rate of Interest: " + b3.getRateOfInterest() + "%");
    }
}

