package template;

/**
 * Created by mzcsh on 2019/3/19.
 */
public class BubusTest {
    public static void main(String[] args) {
        System.out.println("坐大巴");
        Bubus bubus = new Bus(false);
        bubus.createFare();

        System.out.println("坐高铁");
        Bubus bubus1 = new HSR();
        bubus1.createFare();
    }
}
