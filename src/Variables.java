// Variables and Types: Java is a statically typed language, every variable must be declared with a type.

// int: whole numbers (capacity, hour of the day, student count)
// double: decimals (area, utilisation like 0.85)
// boolean: true or false (is the room booked? has a projector?)
// String: text. Capital S, because it's a class, not a primitive. Text goes in double quotes only; single quotes are for a different type (char).

public class Variables {
    public static void main(String[] args) {
        courseDetails();
        roomDetails();
        courseInfo();
    }

    static void courseDetails() {
        String code = "CS201";
        int enrolled = 45;
        System.out.println(code + " has " + enrolled + " students");
    }

    static void roomDetails() {
        String roomName = "Lecture Hall A"; // Variable names follow camelCase
        int capacity = 120;
        System.out.println(roomName + " seats " + capacity); // + joins strings and values
    }

    static void courseInfo() {
        String unitCode = "CS201";
        String unitName = "Data Structures";
        int enrolledStudents = 45;
        boolean isLabOriented = true;

        System.out.println(unitCode + ": " +  unitName + " (" + enrolledStudents + " students)"); 
        System.out.println("Lab oriented: " + isLabOriented);
    }
}
