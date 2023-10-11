public class Main {
    static Animal sobaka = new Animal("Жора", "собака", "м", "8");
    static House dom = new House("Северо-западная 105", "+79831778095", "2");
    static Owner timofey = new Owner("Тимофей", "19.12.2004", "2");
    static Residence domTimofeya = new Residence(dom, timofey);
    static Pet sobakaTimofeya = new Pet(timofey, sobaka, dom);
    public static void main(String[] args) {
        System.out.printf(sobaka.toString());
        System.out.printf("\n");
        System.out.printf(dom.toString());
        System.out.printf("\n");
        System.out.printf(timofey.toString());
        System.out.printf("\n");
        System.out.printf(sobakaTimofeya.toString());
    }
}