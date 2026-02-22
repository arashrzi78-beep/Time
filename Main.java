//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Time t1 = new Time("14:50");
        System.out.println(t1.convert());

        Time t2 = new Time("01:40");
        System.out.println(t2.convert());
    }
}