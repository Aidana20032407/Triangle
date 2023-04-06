public class Main {
    public static void main(String[] args) {
        Triangle trian = new Triangle();
        trian.a = 1.0;
        trian.b = 1.5;
        trian.c = 2.0;

        System.out.println(trian.a + "\n" + trian.b + "\n" + trian.c + "\n");

        trian.area();
    }
}