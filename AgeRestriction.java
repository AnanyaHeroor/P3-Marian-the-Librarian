/**
* This class figures out which books a given person is allowed to borrow
* @author Ananya Heroor
*/
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
/**
* This function checks if someone is under the age of 13
* kids under the age of 13 should not be allowed to borrow books
* @param int age: the borrower's age
* @return boolean: true if age is 13 or above, false otherwise
*/
    public static boolean isOver13(int age){
        if (age >= 13){
            return true;
        } else{
            return false;
        }
    }
/**
* This function checks if ages fall in the range of 13 to under 18
* If the borrower is 13 or older, but still under 18, they will not be allowed to borrow any books
    containing sensitive materials, but will still be allowed to borrow anything else
* @param int age: the borrower's age
* @return nothing
*/
    public static boolean whatCanIBorrow(int age){
        if (age >=18 && age < 100){
            System.out.println ("You can borrow any book!!!");
        } else if (age < 18 && age > 13){
            System.out.println("You cannot borrow sensitive material.");
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
