import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Wire wire = new Wire("Cagor", "Russia", LocalDate.of(2018, 5, 2));
        Wire wire1 = new Wire("PLP", "France", LocalDate.of(2014, 1, 4));
        Wire wire2 = new Wire("EX", "China", LocalDate.of(2010, 5, 7));
        Wire[] wires = {wire1, wire2};
        for (Wire b : wires) {
            System.out.println(b);
            System.out.println(b.toString());
        }
    }
}