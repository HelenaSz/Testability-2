public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightInMeters = 1.87;
        double weightInKilograms = 98;
        double index = service.calculate(heightInMeters, weightInKilograms);
        System.out.println(index);
    }
}