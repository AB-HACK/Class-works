import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class State{
    String name;
    List<Integer> stations;
    int sum = 0;
    double MOR;


    State(String name){
        this.name = name;
        this.stations = new ArrayList<>();
    }

  
    void addStation(int station) {
        stations.add(station);
        sum += station;
    }

    void calculateMOR() {
        if (!stations.isEmpty()) {
            MOR = (double) sum / stations.size();
        }
    }

    void displayStateInfo(){
        System.out.printf("State: %s", name);
        System.out.printf("MOR: %.2f", MOR);
        System.out.println("");
    }


}

public class weather  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num_of_states;
        List<State> states = new ArrayList<>();
        double totalSum = 0;
        int totalStations = 0;

        System.out.print("Enter Number of states: ");
        num_of_states = scan.nextInt();

        for(int i = 0; i < num_of_states; i++){
            System.out.print("Name of state: ");
            String name_of_state = scan.next();
            State state = new State(name_of_state); 

            System.out.printf("Enter number of stations in %s: ", name_of_state );
            int number_of_stations = scan.nextInt();

            for( int j = 0; j < number_of_stations; j++){
                System.out.printf("Enter Weather condition in station(%d): ", j + 1 );
                int weatherCondition = scan.nextInt();
                state.addStation(weatherCondition);

            }
            scan.nextLine();


            state.calculateMOR();
            states.add(state);

            totalSum += state.sum;
            totalStations += number_of_stations;
             
        }


        double overallMOR = totalSum / totalStations;
        System.out.println("\n--- State Reports ---");
        for (State state : states) {
            state.displayStateInfo();
            if (state.MOR > 10) {
                System.out.println("This state qualifies for WPF.");
            }
            System.out.println();
        }

        System.out.printf("Overall MOR for the entire country[Nigeria] per day: %.2f%n", overallMOR);

    }
    
}
