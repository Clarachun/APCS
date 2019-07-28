
/**
 * Write a description of class x here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList; 
public class x
{
    public static void main(String[] args)
    {
        ArrayList<String> aList = new ArrayList<String>(8);
        aList.set(1, "purple");
        aList.set(1, "red");
        aList.set(2, "blue");
        aList.set(3, "yellow");
        aList.set(4, "green");
        aList.set(5, "pink");
        aList.set(6, "black");
        aList.set(7, "gold");
        aList.remove(3);
        System.out.println(aList);
    }
    
    
    
  public static String arrayToString( String[] sArr ) 
  { 
    String s = "[ "; 
    for ( int i = 0 ; i < sArr.length ; i++ ) 
    { 
      s += sArr[ i ]; 
      if ( i + 1 < sArr.length ) 
        s += ", "; 
    } 
    s += " ]"; 
    return s;
  }
}
