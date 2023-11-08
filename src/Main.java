public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height_in_meters = 1.87;
        double weight_in_kilograms = 98;
        double index = service.calculate(height_in_meters, weight_in_kilograms);
        System.out.println(index);
    }
}