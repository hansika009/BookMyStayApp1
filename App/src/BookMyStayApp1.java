/**
 * Hotel Booking Management System
 * Use Case 1: Application Entry & Welcome Message
 *
 * This class serves as the entry point for the application.
 * It demonstrates how a Java program starts execution and
 * prints output to the console.
 *
 * @author Hansika
 * @version 1.0
 */



        abstract class Room {
            String type;
            int beds;
            double price;

            Room(String type, int beds, double price) {
                this.type = type;
                this.beds = beds;
                this.price = price;
            }

            abstract void display();
        }

        class SingleRoom extends Room {
            SingleRoom() {
                super("Single Room", 1, 2000);
            }

            void display() {
                System.out.println(type + " | Beds: " + beds + " | Price: ₹" + price);
            }
        }

        class DoubleRoom extends Room {
            DoubleRoom() {
                super("Double Room", 2, 3500);
            }

            void display() {
                System.out.println(type + " | Beds: " + beds + " | Price: ₹" + price);
            }
        }

        class SuiteRoom extends Room {
            SuiteRoom() {
                super("Suite Room", 3, 6000);
            }

            void display() {
                System.out.println(type + " | Beds: " + beds + " | Price: ₹" + price);
            }
        }

        class BookMyStayApp1 {
            public static void main(String[] args) {

                Room r1 = new SingleRoom();
                Room r2 = new DoubleRoom();
                Room r3 = new SuiteRoom();

                int single = 5, doubleR = 3, suite = 2;

                r1.display();
                System.out.println("Available: " + single);

                r2.display();
                System.out.println("Available: " + doubleR);

                r3.display();
                System.out.println("Available: " + suite);
            }
        }

