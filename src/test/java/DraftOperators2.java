public class DraftOperators2 {
    public static boolean getTrue() {
        System.out.println("Returning true");
        return true;
    }
    public static boolean getFalse() {
        System.out.println("Returning false");
        return false;
    }

    public static void main(String[] args) {
        System.out.println(getTrue() && getFalse());
        System.out.println(getTrue() || getFalse());

        System.out.println(!true && false ^ false || true);

//        System.out.println(Integer.toBinaryString(3));
//        System.out.println(Integer.toBinaryString(4));
//        00000000 00000000 00000000 00000001

        System.out.println();
    }

}
