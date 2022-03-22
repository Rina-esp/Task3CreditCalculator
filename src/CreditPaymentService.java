public class CreditPaymentService {
    public double calculate(int creditAmount, int creditMonth, double rateYear) {
        //логика
        double monthRate = rateYear / creditMonth / 100;
        System.out.println("Процент по кредиту: " + monthRate + " % в месяц.");
        System.out.println("Кредит оформлен на: " + creditMonth + " месяцев.");
        double pow = Math.pow(1 + monthRate, creditMonth);
        double total = (creditMonth * creditAmount * monthRate * pow) / (pow - 1);
        double totalMonth = total / creditMonth;
        return totalMonth;
    }
}