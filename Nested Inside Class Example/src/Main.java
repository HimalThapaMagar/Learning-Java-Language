public class Main {
    public static void main(String[] args) {
        Outside out = new Outside();
        System.out.println(out);

        Outside.Inside ins = out.new Inside();
        ins.SayHello();


    }
}