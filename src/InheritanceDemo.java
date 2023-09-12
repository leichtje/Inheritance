import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {

        ArrayList<Worker> workers = new ArrayList<>();

        workers.add(new Worker("000001", "Jonathon", "Leicht", "Mr.", 1999, 22.25));
        workers.add(new Worker("000002", "Bobby", "Wagner", "Mr.", 1975, 23.50));
        workers.add(new Worker("000003", "Ricky", "Bobby", "Mr.", 1990, 20.50));
        workers.add(new SalaryWorker("200004", "Martin", "King", "Dr.", 1950, 21.63, 45000));
        workers.add(new SalaryWorker("200005", "Geno", "Smith", "Mr.", 2000, 24.04, 50000));
        workers.add(new SalaryWorker("200006", "Helen", "Keller", "Mrs.", 1973, 28.85, 60000));


        String headerOne = "Name";
        String headerTwo = "Week 1";
        String headerThree = "Week 2";
        String headerFour = "Week 3";

        System.out.println();
        System.out.println("Weekly Pay Per Worker");
        System.out.println("---------------------------------------------------------");
        System.out.printf("%-20s%-15s%-15s%-15s", headerOne, headerTwo, headerThree, headerFour);
        System.out.println();
        System.out.println("---------------------------------------------------------");

        for (Worker f :workers){
            System.out.printf("\n%-20s%-15.2f%-15.2f%-15.2f",f.getFullName(),f.calculateWeeklyPay(40),f.calculateWeeklyPay(50),f.calculateWeeklyPay(40));
        }

    }
}
