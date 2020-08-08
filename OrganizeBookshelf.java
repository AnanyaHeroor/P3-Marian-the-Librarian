/**
* This class puts books back in the correct order
* @author Ananya Heroor
*/
public class OrganizeBookshelf{
    public static void main (String [] args){
        getRightmostBookID(5, 10);
        getRightmostBookID(111, 10);
        getRightmostBookID(-100, -5);
        getRightmostBookID(-100, 5);
        spaceToLeave(5,15);
        spaceToLeave (10,0);
        spaceToLeave(-5,10);
        spaceToLeave(5,-10);
    }
/**
* This function sorts shelves so that the IDs increase from left the right
* @param int id_1: book 1’s ID number
* @param int id_2: book 2’s ID number
* @return int: ID of the book that should be placed on the right
*/
    public static boolean getRightmostBookID (int id_1, int id_2){
        if (id_1 > id_2){
            System.out.println(id_1);  
        } else{
            System.out.println(id_2);
        }
        return true;
        
    }
/**
* This function that takes two integers, and returns how much space Marian
    needs to leave between them on the shelves
* @param int id_1: book 1’s ID number
* @param int id_2 book 2’s ID number
* @return int that represents the number of integers/spaces between id_1
    and id_2
*/
    public static boolean spaceToLeave (int id_1, int id_2){
        if (id_1 > id_2){
            System.out.println(id_1-(id_2+1));
        } else if (id_2>id_1){
            System.out.println(id_2-(id_1+1));
        }
        return true;
    }
}
