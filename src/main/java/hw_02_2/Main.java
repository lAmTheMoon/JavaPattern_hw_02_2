package hw_02_2;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        String resultSum = bins.sum("5", "5");
        System.out.println(resultSum);
        String resultMult = bins.mult("5", "5");
        System.out.println(resultMult);
    }
}
