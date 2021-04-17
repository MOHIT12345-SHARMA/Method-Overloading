class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }
}

class TestOverloading2 {
    public static void main(String[] args) {
        System.out.println(Adder.add(3, 9));
        System.out.println(Adder.add(4.89, 8.84, 2.90));
    }
}
