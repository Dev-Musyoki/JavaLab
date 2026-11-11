// Java programs are organized around classes => Every single line of code has to live inside a class.

public class Hello{
    public static void main(String[] args){
        System.out.println("Hello Java");
    }
}

// public class Hello, everything lives inside this class. The file must be named Hello.java. Java requires the filename to match the public class name exactly.
// public static void main(String[] args) is the entry point of the program. When you run the program, Java looks for this method and starts execution there. Nothing runs unless it's reachable from here.

// Running the program: It involves two steps;
   // 1. javac Hello.java => Translates the Java code into bytecode, which is stored in a file named Hello.class.
   // 2. java Hello => Runs the bytecode on the Java Virtual Machine (JVM). JVM is a program that interprets the bytecode and executes it.

// Comments: In Java, there are three types of comments
    //i. Single line comments: // This is a single line comment
    //ii. Multi-line comments: /* This is a multi-line comment */
    //iii. Javadoc comments: (Usually start with 2 asterisks) Used for classes and methods. /** This is a javadoc comment */


// Decoding public static void main: Each word answers one question about the method:
// public: who can call it? Anyone. The Java runtime lives outside your class, so main has to be visible to it.
// static: does it need an object first? No. static means the method belongs to the class itself.
// void: what does it give back? Nothing.
