public class BmiService {
    public double humanBmi(int weight, double lenght) {
        double result;
        result = weight / (lenght * lenght);
        return result;
    }
}
