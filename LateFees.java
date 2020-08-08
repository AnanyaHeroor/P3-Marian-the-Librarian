//Ananya Heroor, 9074986762, heroor
public class LateFees{
    public static void main (String [] args){
       System.out.println(isAccountBad(true,true));
       System.out.println(isAccountBad(false,true));
       System.out.println(isAccountGood(true, true));
       System.out.println(isAccountGood(false, true));

    }
    public static boolean isAccountBad (boolean paidLateFee, boolean hasOverdueBook){
        if (paidLateFee && hasOverdueBook){
            return false;
        } else{
            return true;
        }
    }
    public static boolean isAccountGood (boolean paidLateFee, boolean hasOverdueBook){
        if ((paidLateFee && hasOverdueBook) || (!paidLateFee && !hasOverdueBook)){
            return true;
        } else{
            return false;
        }
    }
}