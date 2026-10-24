
public class Bus {

    private String busNumber;
    private Seat[][] seats;

    // Default constructor
    public Bus() {
        this("BUS-DEFAULT", 2);
    }

    // Parameterized constructor
    public Bus(String busNumber, int rows) {
        this.busNumber = busNumber;

        seats = new Seat[rows][4];

        int number = 1;

        // Initialize every Seat object
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = new Seat(number);
                number++;
            }
        }
    }

    // Display all seats
    public void displaySeats() {
        for (int i = 0; i < seats.length; i++) {

            System.out.print("Row " + (i + 1) + ": ");

            for (int j = 0; j < seats[i].length; j++) {

                Seat s = seats[i][j];

                String status;

                if (s.isReserved()) {
                    status = "X";
                } else {
                    status = "O";
                }

                System.out.printf("%02d:%s",
                        s.getSeatNumber(), status);

                if (j == 1) {
                    System.out.print(" || ");
                } else if (j < seats[i].length - 1) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    
    public void reserveSeat(int seatNumber) {

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {

                if (seats[i][j].getSeatNumber() == seatNumber) {

                    if (seats[i][j].reserve()) {
                        System.out.println(
                            "Reserving Seat " + seatNumber
                            + ": Successful");
                    } else {
                        System.out.println(
                            "Reserving Seat " + seatNumber
                            + ": Already Reserved");
                    }

                    return;
                }
            }
        }

        System.out.println("Invalid seat number: " + seatNumber);
    }

    // Count available seats
    public int countAvailableSeats() {

        int count = 0;

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {

                if (!seats[i][j].isReserved()) {
                    count++;
                }
            }
        }

        return count;
    }
}
