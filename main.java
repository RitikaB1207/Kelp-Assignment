package classes;

import org.w3c.dom.ls.LSOutput;

public class main {
    public static void main(String[]args) {


        NewBank Axis = new NewBank();
        NewBank BOI = new NewBank();

        Axis.setCustName("Ritika");
        BOI.setCustName("Sangeeta");

        System.out.println("The customer name is: " +Axis.getCustName());

        Axis.setCusAccountbal(2000);
        Axis.rechargeAcc(200);
        System.out.println("New balance of " +Axis.getCustName() + " is: " +Axis.getCusAccountbal());

       



    }
}
