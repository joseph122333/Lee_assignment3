package Lee_problem2;

public class SavingsAccountTest {

    public SavingsAccountTest() {
    }
    public static void main(String[] args)
    {
       SavingsAccount saver1,saver2;
        saver1 = new SavingsAccount (2000.0);
        saver2 = new SavingsAccount (3000.0);
        SavingsAccount.modifyInterestRate (0.04);
        int total_month=12;                                                   // Show Complete Balance Till 12 Month
        double[] balance_month=saver1.getMonthsSavingBalance(total_month);             // I have added This Function that will calculate till which month you want
         System.out.println("\n\nTest     Saver 1 with 4% Intrest tax \n");
         for(int i=0;i<total_month;i++)
         {
             System.out.println("\n Month "+(i+1)+" :\n Saver 1 balance= "+balance_month[i]+" with rate of 0.04" );
        }
          System.out.println("\n\nTest     Saver 2 with 4% Intrest tax \n");
         balance_month=saver2.getMonthsSavingBalance(12);             // I have added This Function that will calculate till which month you want
         for(int i=0;i<total_month;i++)
         {
             System.out.println("\n Month "+(i+1)+" :\n Saver 2 balance= "+balance_month[i]+" with rate of 0.04" );
        }  
          System.out.println("\n\nTest     Saver 1 with 5% Intrest tax \n");
         SavingsAccount.modifyInterestRate(0.05);
       balance_month=saver1.getMonthsSavingBalance(12);             // I have added This Function that will calculate till which month you want
         for(int i=0;i<total_month;i++)
         {
             System.out.println("\n Month "+(i+1)+" :\n Saver 1 balance= "+balance_month[i]+" with rate of 0.05" );
        }
        System.out.println("\n\nTest     Saver 2 with 5% Intrest tax \n");
         balance_month=saver2.getMonthsSavingBalance(12);             // I have added This Function that will calculate till which month you want
         for(int i=0;i<total_month;i++)
         {
             System.out.println("\n Month "+(i+1)+" :\n Saver 2 balance= "+balance_month[i]+" with rate of 0.05" );
        }  
    }
}