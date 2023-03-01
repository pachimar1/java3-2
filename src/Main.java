public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double w = 98;
        double h = 1.87;
        double index = service.calculate(w, h);
        System.out.println("Ваш индекс тела равен: " +index);
    }
}