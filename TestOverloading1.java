class TestOverloading1 {
    void multiply(int a, int b) {
        System.out.println("Result is:- " + a * b);
    }

    void multiply(int a, int b, int c) {
        System.out.println("Result is:- " + a * b * c);
    }

    public static void main(String[] args) {
        TestOverloading1 obj = new TestOverloading1();
        obj.multiply(2, 4);
        obj.multiply(4, 7, 8);
    }
}