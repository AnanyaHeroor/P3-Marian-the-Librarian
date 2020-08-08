/**
* This class combines numbers to create a game at the library
* @author Ananya Heroor
*/
public class Combinations{
    public static void main (String [] args){
        System.out.println(findCombination(10,10,100));
        System.out.println(findCombination(-5,0,5));
        System.out.println(findCombination(67,1,66));
        System.out.println(findCombination(100,1,55));
        System.out.println(findOppositeCombination(10,10,100));
        System.out.println(findOppositeCombination(-5,0,5));
        System.out.println(findOppositeCombination(67,1,66));
        System.out.println(findOppositeCombination(100,1,55));
        System.out.println(findColorCombination(5, 5, 10, false, false));
        System.out.println(findColorCombination(5, 2, 10, true, false));
        System.out.println(findColorCombination(5, 2, 10, true, true));
        System.out.println(findColorCombination(5, 2, 9, false, true));
    }
 /**
 * This function determines whether any two numbers can be added or multiplied to produce the third (order doesn't matter
 * @param int x
 * @param int y
 * @param int z
 * @return A char: + if two of the inputs can be added to make a third, * if
    multiplied, and N if there is no combination
 */
    public static char findCombination (int x, int y, int z){
       if ((x * y == z) || (x * z ==  y)  ||  (y *  z ==  x)){
           return '*';
       } else if ((x +  y == z) ||  (x +  z ==  y) || (y +  z ==  x)){
           return '+';
       } else{
           return 'N';
       }
    }
/**
 * This function determines whether any two numbers can be subtracted or divided to one another (order doesn't matter
 * @param int x
 * @param int y
 * @param int z
 * @return a char: - if two of the inputs can be subtracted to make the third,
    / if two of the inputs can be divided to make the thirds, and N if
    there is no combination
 */
    public static char findOppositeCombination (int x, int y, int z){
        char ret = findCombination(x,y,z);
        if (ret == '*'){
            return '/';
        } else if (ret == '+'){
            return '-';
        } else{
            return 'N';
        }
    }
/**
* This functon determines whether three integers add or multiply to one another AND there will be a ball
    which will either be red, blue or both.  If the ball is red, the first and
    third integers are multiplied by 3. If the ball is blue, then the second integer is multiplied by 2. If
    the ball is both red and blue, then both happen.
* @param int x
* @param int y
* @param int z
* @param boolean isRed
* @param boolean isBlue
* @return A char that is either +, *, or N, according to the rules in the
    paragraph above...
*/
    public static char findColorCombination (int x, int y, int z, boolean isRed, boolean isBlue){
        if (isRed){
            x = x* 3;
            z = z*3;
        }
        if (isBlue){
            y = y*2;
        }
        if (isBlue && isRed){
            x = x*3;
            y = y*2; 
            z = z*3;
        }
        return findCombination(x,y,z);
    }
}
