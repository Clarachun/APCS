/**
 * The purpose of this program is to calculate the weight of a person on different planets
 * based on their weight on Earth.
 *
 * @author Clara Chun
 * @version 22 November, 2018
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class PlanetWeight
{
    public static void main( String[] args ) throws IOException
    {
        File planetGravity = new File("planets.txt");
        Scanner inFile = new Scanner(planetGravity);
        Scanner in = new Scanner(System.in);
        
        String[] planet = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        
        double[] gravity = cycle(planetGravity, inFile, planet.length, 2);
        
        System.out.println("\nHow much do you weigh in pounds? (eg. 145)");
        double weight = in.nextDouble();
        
        double[] newWeight = weightPlanets(gravity, weight);
        
        //print weight
        System.out.printf("\n\n%55s\n", "Planetary Data");
        System.out.printf("%25s %29s %25s\n", "Planet", "Gravity(m/s^2)", "Weight(lbs)");
        System.out.println("_______________________________________________________________________________________________");
        for (int i = 0; i < planet.length; i++){
                System.out.printf("%19s %-7s %23.2f %26.2f\n", "", planet[i], gravity[i], newWeight[i]);
        }
    }
    public static double[] cycle(File a, Scanner inFile, int c, int d) throws IOException{
        
        double[] variable = new double[c];
        String name = "";
        double invaluableVariable = 0.0;
        
        for (int i = 0; i < c; i ++){
            name = inFile.next();
            for (int z = 0; z < d; z++) {
                invaluableVariable = inFile.nextDouble();
            }
            variable[i] = inFile.nextDouble();
            inFile.nextLine();
        }
        return variable;
    }
    public static double[] weightPlanets(double[] gravity, double weight){
        double[] newWeight = new double[gravity.length];
        double mass = (weight * 453.59237);
        for (int i = 0; i < gravity.length; i++) {
            newWeight[i] = ( ((mass)*( (gravity[i]/9.8) )) / (453.59237) );
        }
        return newWeight;
    }
}
