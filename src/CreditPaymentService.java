public class CreditPaymentService {
    public int calculate(int summCredit,double percent,int month){
        double percentPerMonth = percent /100 / 12;
        double payment = summCredit * ((percentPerMonth * Math.pow(1 + percentPerMonth,month)) / (Math.pow(1 + percentPerMonth,month) - 1));
        return (int) payment;
    }
}
