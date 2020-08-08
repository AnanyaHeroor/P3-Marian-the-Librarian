/**
* This class determines which accounts need to pay fines
* @author Ananya Heroor
*/
public class LateFees{
    public static void main (String [] args){
       System.out.println(isAccountBad(true,true));
       System.out.println(isAccountBad(false,true));
       System.out.println(isAccountGood(true, true));
       System.out.println(isAccountGood(false, true));

    }
/**
* This function determines which accounts are bad and need to pay fines
* An account is considered bad if either (a) the account paid money, but has no overdue books, or
    (b) the account has not paid, but does have an overdue book.
* @param boolean paidLateFee: has this account paid a late fee?
* @param boolean hasOverdueBook: does this account have an overdue
    book?
* @return boolean that is true if the account is (a) paid and not overdue, or
    (b) overdue and not paid.
*/
    public static boolean isAccountBad (boolean paidLateFee, boolean hasOverdueBook){
        if (paidLateFee && hasOverdueBook){
            return false;
        } else{
            return true;
        }
    }
/**
* This function determines which accounts are good and don't need to pay fines
* @param boolean paidLateFee: has this account paid a late fee?
* @param boolean hasOverdueBook: does this account have an overdue
    book?
* @return boolean that is true if the account is (a) paid and overdue, or
    (b) overdue and not paid.
*/
    public static boolean isAccountGood (boolean paidLateFee, boolean hasOverdueBook){
        if ((paidLateFee && hasOverdueBook) || (!paidLateFee && !hasOverdueBook)){
            return true;
        } else{
            return false;
        }
    }
}
