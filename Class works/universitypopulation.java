public class universitypopulation {
    public static void main (String[] args){

        int initialPopulation = 9000;
        int capacity = 15000;
        double growthRate = 0.05;

        int year = 0;
        int population = initialPopulation;

        while (population <= capacity);

        population += (int)(population * growthRate);

        year ++ ;
    }
    system.out.print("poplation exceed the capacity in", year + "years");
    system.out.print("final population:" + population);
}
