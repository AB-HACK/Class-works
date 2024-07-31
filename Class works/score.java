import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

// Write a program to read the Name, Matric Number and scores in five courses data from a file and compute the mean of the scores. The outputs must be written into another file.

public class score {
    public static void main(String[] args) {
        String inputFilename = "input.txt";
        String outputFilename = "output.txt";



 try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFilename));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilename))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into parts
                String[] parts = line.split(" ");
                String name = parts[0];
                String matricNumber = parts[1];
                int score1 = Integer.parseInt(parts[2]);
                int score2 = Integer.parseInt(parts[3]);
                int score3 = Integer.parseInt(parts[4]);
                int score4 = Integer.parseInt(parts[5]);
                int score5 = Integer.parseInt(parts[6]);

                // Compute the mean of the scores
                double mean = (score1 + score2 + score3 + score4 + score5) / 5.0;

                // Write the output to the file
                writer.write(name + " " + matricNumber + " " + mean);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
