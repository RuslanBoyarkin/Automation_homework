public class DraftOperators {
        public static void Draft (String[] args) {
            int i = 10;
            int i2 = i + 5;
            int i3 = i2 - 4;
            float f = 10 / 3;
            int i4 = 10 / 3;
            int i5 = 20 / 3;

            float f2 = 10f / 3;
            float f3 = 100f / 3;
            double d = 10d / 3;

            System.out.printf("%s \n", f2);
            System.out.printf("%s \n", f3);
            System.out.printf("%s \n", d);

            int i6 = 10;
            float f4 = 0f;
            System.out.println(f4/i6);

            System.out.println(9.5 % 3.5);

            int i7 = 5;
            i7 = i7 + 2;
            i7 += 2;
            i7 -= 3;
            i7 /= 4;
            i7 %= 4;
            System.out.println(i7);

            int i8 = 10;
            i8 = 10 + 1;
            i8 += 1;
            i8 ++;
            i8 --;


            int i9 = 10;
            int i10 = i9++;
            System.out.printf("%s %s \n", i9++, ++i9);

            String s1 = "Hello";
            String s2 = "My name is John";
            String s3 = s1 + "" + s2;
            System.out.println(s3);

            int i11 = 55;
            String s4 = i11 + "";
            System.out.println(s1 += " I am good");
            System.out.println(s1);

            System.out.println(10 > 5);

            boolean b = 10 > 5;
            System.out.println(b);

            boolean b2 = 10 >= 10;
            System.out.println(b2);
            boolean b3 = 10 != 10;
            System.out.println(b3);

            boolean bb1 = true;
            boolean bb2 = false;
            System.out.println(bb1 && bb2);
            System.out.println(true || false);

            System.out.println(!bb2);
            System.out.println(false ^ false);


        }
}
