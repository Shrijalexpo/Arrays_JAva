import java.util.Scanner;

/**
 * A metropolitan hotel has 10 floors (from 0 to 9) and each floor has 20 rooms. [0 se 19]       20 x 10
 * The receptionist enters the name of the visitors and allots the room                 input shit
 * in a particular floor as 3 x 3 double dimensional array per the choice
 * of the visitor (if available). Write a program in Java, which displays the
 * availability of room in a particular floor as per the choice of the visitor.
 * If it is already allotted then display "not available" otherwise allot
 * the room, as per the availability.
 */
class LocateGuest {
    static int floor, room;
    static int FLOOR = 10, ROOM = 20;
    static Scanner sc = new Scanner(System.in);
    static String rooms[][] = new String[FLOOR][ROOM];

    public static void main(String args[]) {
        LocateGuest guest = new LocateGuest();
        guest.inputGuest();
        guest.isAvailable();
    }

    static void inputGuest() {
        for (floor = 0; floor < FLOOR; floor++) {
            System.out.println("Enter floor " + (floor + 1) + " Guest details: ");
            for (room = 0; room < ROOM; room++) {
                System.out.println("Guest in room" + (room + 1) + ": ");
                if (sc.nextLine() != " ") {
                    rooms[floor][room] = sc.nextLine();
                }
            }
        }
    }

    void isAvailable() {
        int counter;
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Enter floor to check availability: ");
        int available = sc.nextInt();
        if (available >= FLOOR) {
            counter = ROOM;
        }
        for (counter = 0; counter < ROOM; counter++) {
            if (rooms[available][counter] == null || rooms[available][counter].isEmpty()) {
                rooms[available][counter] = name;
                break;
            }
        }
        if (counter != ROOM) {
            System.out.print("Room Available & Booked\nHave a nice day");
        } else {
            System.out.print("No Rooms Available for Given Floor\nSorry for the inconvenience");
        }
    }
}
