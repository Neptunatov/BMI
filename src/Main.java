public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int weight = 73;
        double lenght = 1.86;

        double myBmi = service.humanBmi(weight, lenght);

        System.out.println(myBmi);

    }
}