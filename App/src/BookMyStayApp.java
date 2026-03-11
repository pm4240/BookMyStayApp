public class BookMyStayApp {
        public static void main(String[] args) {

            // Create room objects
            Room singleRoom = new SingleRoom();
            Room doubleRoom = new DoubleRoom();
            Room suiteRoom = new SuiteRoom();

            // Availability stored as simple variables
            int singleRoomAvailable = 5;
            int doubleRoomAvailable = 3;
            int suiteRoomAvailable = 2;

            // Display room information
            System.out.println("Hotel Room Availability\n");

            singleRoom.displayRoomDetails();
            System.out.println("Available: " + singleRoomAvailable);
            System.out.println("---------------------");

            doubleRoom.displayRoomDetails();
            System.out.println("Available: " + doubleRoomAvailable);
            System.out.println("---------------------");

            suiteRoom.displayRoomDetails();
            System.out.println("Available: " + suiteRoomAvailable);
        }


}
