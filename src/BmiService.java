public class BmiService {

    public double calculate(double height_in_meters, double weight_in_kilograms) {
        double index;
        index = weight_in_kilograms / (height_in_meters * height_in_meters);

        return (int) index;
    }
}
