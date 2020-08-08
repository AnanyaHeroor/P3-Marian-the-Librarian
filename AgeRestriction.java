//Ananya Heroor, 9074986762, heroor
public class AgeRestriction{
    public static void main (String[] args){
        System.out.println(isOver13(5));
        System.out.println(isOver13(20));
        whatCanIBorrow(20);
        whatCanIBorrow(15);
        whatCanIBorrow(5);
        whatCanIBorrow(-15);
        whatCanIBorrow(150);
    }
    public static boolean isOver13(int age){
        if (age >= 13){
            return true;
        } else{
            return false;
        }
    }
    public static boolean whatCanIBorrow(int age){
        if (age >=18 && age < 100){
            System.out.println ("You can borrow any book!!!");
        } else if (age < 18 && age > 13){
            System.out.println("You cannot borrow any sensitive material.");
        } else if (age < 13 && age > 0){
            System.out.println("You cannot borrow any books.");
        } else if (age < 0){
            System.out.println("INVALID AGE");
        } else if (age > 100){
            System.out.println("INVALID AGE");
        }
        return true;
    }
}