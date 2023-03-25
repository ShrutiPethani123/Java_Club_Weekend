public class WrapperClass2 {
    public static void main(String[] args) {
        
        byte b = 10;
        short s = 30;
        int i=40;
        long l=50;
        float f = 34.56f;
        double d = 67.5;
        char ch = 't';
        boolean bool = true;

        //autoboxing

        Byte b1 = Byte.valueOf(b);
        Short s1 = Short.valueOf(s);
        Integer i1 = Integer.valueOf(i);
        Long l1 = Long.valueOf(l);
        Float f1 = Float.valueOf(f);
        Double d1 = Double.valueOf(d);
        Character ch1 = Character.valueOf(ch);
        Boolean bool1 = Boolean.valueOf(bool);

        System.out.println(b1);
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l1);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(ch1);
        System.out.println(bool1);

        //unboxing

        byte b2 = b1.byteValue();
        short s2 = s1.shortValue();
        int i2 = i1.intValue();
        long l2 = l1.longValue();
        float f2 = f1.floatValue();
        double d2 = d1.doubleValue();
        char ch2 = ch1.charValue();
        boolean bool2 = bool1.booleanValue();

        System.out.println("-------------Unboxing ----------------");
        System.out.println(b2);
        System.out.println(s2);
        System.out.println(i2);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d2);
        System.out.println(ch2);
        System.out.println(bool2);

    }
}
