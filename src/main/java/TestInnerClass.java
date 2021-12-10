
// 和 Kotlin 中的嵌套类进行比较

public class TestInnerClass {

    public static void main(String[] args) {
        BigClass bigClass = new BigClass();
        // BigClass.Small small = bigClass.new Small(); // 必须通过外部类来创建内部类
        // or
        BigClass.Small small = new BigClass().new Small(); // 必须通过外部类来创建内部类

        bigClass.showInfo();
        System.out.println("in main() -- big: name = " + bigClass.name + ", size = " + bigClass.size);

        small.showMag();
        System.out.println("in main() -- small: addr = " + small.addr + ", size = " + small.size);
    }
}
