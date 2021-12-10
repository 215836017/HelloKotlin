
// 和 Kotlin 中的嵌套类进行比较

public class BigClass {

    public String name = "big-name";
    public int size = 50;

    void showInfo() {
        System.out.println("Big() -- name = " + name + ", size = " + size);
    }

    class Small {
        public String addr = "small-addr";
        public int size = 30;

        void showMag() {
            System.out.println("Big() -- name = " + name + ", size = " + size);
            System.out.println("Small() -- addr = " + addr + ", size = " + size);
        }
    }
}
