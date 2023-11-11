import java.util.Scanner;



public class LinkedList {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().trim().toLowerCase();

        placesToVisit.add(name: "Sydney", distance: 1374);
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Alice Springs");
        placesToVisit.add("Perth");
        placesToVisit.add("Darwin");

        System.out.println(placesToVisit);

        int i;

        switch (input) {
            case "F":
                System.out.println("You are going forward to " + placesToVisit[i+1]);
                break;
            case "B":
                System.out.println("You are going backwards to " + placesToVisit[i-1]);
                break;    
            case "L":
                System.out.println("Here are the list of places: " + placesToVisit);
                break;
            case "M":
                System.out.println("Available actions (select word or letter)\n" + "(F)orward\n" + "(B)ackward\n" + "(L)ist Places\n" + "(M)enu\n" + "(Q)uit");
                break;  
            case "Q":
                System.out.println("Quit");
                break;
            default: 
                System.out.println("Invalid input. Please select a word of letter");
                break;
        }

        public static void addPlace(LinkedList<Place> list, Place place) {
            if (list.contains(place)) {
                System.out.println("Duplicate found: " + place);
                return;
            }
            
            list.add(place);
        }

    }

    public static ListIterator( )
    
}
