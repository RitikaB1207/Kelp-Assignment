package classes;

public class NewBank {


        private String custName;
        private String custId;
        private String custPhone;
        private double cusAccountbal;
        private String custAddress;

        public String getCustName() {
            return custName;
        }

        public void setCustName(String custName) {
            this.custName = custName;
        }

        public String getCustId() {
            return custId;
        }

        public void setCustId(String custId) {
            this.custId = custId;
        }

        public String getCustPhone() {
            return custPhone;
        }

        public void setCustPhone(String custPhone) {
            this.custPhone = custPhone;
        }

        public double getCusAccountbal() {
            return cusAccountbal;
        }

        public void setCusAccountbal(double cusAccountbal) {
            this.cusAccountbal = cusAccountbal;
        }

        public String getCustAddress() {
            return custAddress;
        }

        public void setCustAddress(String custAddress) {
            this.custAddress = custAddress;
        }

        public void accBalance(double amount) {

            double rembal = cusAccountbal - amount;
            System.out.println("your remaining balance is:" + rembal);
            cusAccountbal = rembal;

        }

        public void rechargeAcc(double recharge){
            double newbalance = cusAccountbal + recharge;
            System.out.println("your balance is: " +newbalance);
            cusAccountbal = newbalance;
        }
    }

