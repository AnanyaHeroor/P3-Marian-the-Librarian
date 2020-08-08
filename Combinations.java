//Ananya Heroor, 9074986762, heroor
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
    public static char findCombination (int x, int y, int z){
       if ((x * y == z) || (x * z ==  y)  ||  (y *  z ==  x)){
           return '*';
       } else if ((x +  y == z) ||  (x +  z ==  y) || (y +  z ==  x)){
           return '+';
       } else{
           return 'N';
       }
    }
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