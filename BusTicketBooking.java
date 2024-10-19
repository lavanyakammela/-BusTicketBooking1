import java.util.Random;

public class BusTicketBooking {
    private static final int ROWS = 5; // Number of rows in the bus
    private static final int COLUMNS = 4; // Number of columns in the bus
    private static boolean[][] seats = new boolean[ROWS][COLUMNS]; // false = available, true = booked

    public static void main(String[] args) {
        initializeSeats(); // Initialize seats with random availability
        displaySeatLayout(); // Display the seat layout
    }

    // Randomly assign seat availability
    private static void initializeSeats() {
        Random random = new Random();
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                // Randomly assign booked (true) or available (false) status
                seats[i][j] = random.nextBoolean(); // true = booked, false = available
            }
        }
    }

    // Display the seat layout
    private static void displaySeatLayout() {
        System.out.println("\nSeat Layout:");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (!seats[i][j]) {
                    System.out.print("[ ] "); // Available seat
                } else {
                    System.out.print("[X] "); // Booked seat
                }
            }
            System.out.println();
        }
    }
}