/**
 * The purpose of this program is to calculate the gravity of a planet based on it's diameter,
 * mass, and the gravitational constant.
 *
 * @author Clara Chun
 * @version 22 November, 2018
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
public class PlanetGravity
{
    public static void main( String[] args ) throws IOException
    {
        PrintWriter outFile = new PrintWriter(new File("planets.txt"));
        double[] diameterOfPlanet = {4880, 12103.6, 12756.3, 6794, 142984, 120536, 51118, 49532};
        double[] massOfPlanet = {(3.30 * Math.pow(10, 23)), (4.869*Math.pow(10, 24)), (5.972*Math.pow(10, 24)), (6.421*Math.pow(10, 23)), (1.900 * Math.pow(10, 27)), (5.68*Math.pow(10, 26)), (8.683*Math.pow(10, 25)), (1.0247*Math.pow(10, 26))};
        String[] planet = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        double[] gravity = surfaceGravity(diameterOfPlanet, massOfPlanet);
        System.out.printf("\n\n%55s\n", "Planetary Data");
        System.out.printf("%12s %25s %22s %22s\n", "Planet", "Diameter (km)", "Mass (kg)", "g (m/s^2)");
        System.out.println("_______________________________________________________________________________________________");
        for (int i = 0; i < planet.length; i++){
                System.out.printf("%6s %-7s %20.1f %26.2e %20.2f\n", "", planet[i], diameterOfPlanet[i], massOfPlanet[i], gravity[i]);
                outFile.println(planet[i] + " " + diameterOfPlanet[i] + " " + massOfPlanet[i] + " " + gravity[i]);
        }
        outFile.close();
    }
    public static double[] surfaceGravity(double[] diameter, double[] mass){
        double[] gravity = new double[8];
        double g = 6.67 * Math.pow(10, -11);
        for (int i = 0; i < diameter.length; i++){
            double r = ( (diameter[i]*1000)/2.0);
            double m = mass[i];
            
            gravity[i] = ( (g * m)/(Math.pow(r, 2)));
        }
        return gravity;
    }
}
