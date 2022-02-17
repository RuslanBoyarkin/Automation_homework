import java.util.Arrays;

 class DraftClass{
    public static String returnString(int x) {
        return "Hello";
    }

    public static String returnString(String s) {
        return "World";
    }

    public static String returnStringFromTwoInputs(String s, int i) {
        return "String from Int";
    }

    public static String returnStringFromTwoInputs(int i, String s) {
        return "Int from String";
    }

    public static void main(String[] args) {
        String result = returnString("Hi");
        System.out.println(result);

        String result2 = returnStringFromTwoInputs(7,"Boom");


        byte b = 127;
        short s = 32767;
        int i = 456654;
        long l = 12389484392474299L;
        float f = 8.8F;
        double d = 666.6;
        boolean boo = false;
        boolean bo = true;

        char c = "A".charAt(0);

        System.out.println(c);

        String s2 = null;
        String s3 = new String ("World");
        String s4 = "World";

        System.out.println("Hello".equals(s2));
    }
}


