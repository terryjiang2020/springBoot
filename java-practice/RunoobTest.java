public class RunoobTest {
    // This is an instance variable.
    private int instanceVar;
    // This is a static variable / class variable.
    // 静态变量的值可以改变，只是不能换内存空间，也就是不能重新赋值。
    // 静态变量更接近const在JavaScript里的概念，可以通过某些手法在不改变内存空间的情况下改变值。
    // 相对的，final的值不可变。
    private static int staticVar;

    public void method(int paramVar) {
        // This is a local variable.
        int localVar = 0;

        // Use the variable here.
        instanceVar = localVar;
        staticVar = paramVar;

        // In Java world, comma won't work for console logs.
        // We have to use the plus operator here.
        System.out.println("instanceVar: " + instanceVar);
        System.out.println("staticVar: " + staticVar);
        System.out.println("paramVar: " + paramVar);
        System.out.println("localVar: " + localVar);
    }

    public static void main(String[] args) {
        RunoobTest test = new RunoobTest();
        test.method(20);
    }
}
