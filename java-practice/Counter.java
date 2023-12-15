public class Counter {
    private static int count = 0;

    public Counter() {
        // Static variable can be updated without assigning a different memory space.
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("Current count: " + Counter.getCount());
    }
}
