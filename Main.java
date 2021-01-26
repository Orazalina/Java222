public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = service.calculate(50, 160);
        System.out.println(bmi);

        int bmi1 = service.calculate(60, 160);
        System.out.println(bmi1);

        int bmi2 = service.calculate(50, 180);
        System.out.println(bmi2);
    }

}
