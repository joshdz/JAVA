public class Test{

    public static void main(String[] args) {
        Director d = new Director();
        Hamburger h = d.orderHamburger("Double");
        h.hambType();
    }
}