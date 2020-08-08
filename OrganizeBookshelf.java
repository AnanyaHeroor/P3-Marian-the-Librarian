//Ananya Heroor, 9074986762, heroor
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
    public static boolean getRightmostBookID (int id_1, int id_2){
        if (id_1 > id_2){
            System.out.println(id_1);  
        } else{
            System.out.println(id_2);
        }
        return true;
        
    }
    public static boolean spaceToLeave (int id_1, int id_2){
        if (id_1 > id_2){
            System.out.println(id_1-(id_2+1));
        } else if (id_2>id_1){
            System.out.println(id_2-(id_1+1));
        }
        return true;
    }
}