public class Main {
    public static void main(String[] args) {

        // This is a comment
        /*
        This is a multiline
        comment
         */

        // variables -> container for values
        // data types - Numeric, Character, String, boolean

        // numeric -> byte, short, int, long, float ,double

        /*
        bit
        0 -> 0 or 1
        00 -> 00, 01, 10, 11
        000 -> 000, 001, 010, 011, 100, 101, 110, 111
         */

        // region number data types
        // byte (1 byte(8 bit)) range -> -128 to 127
        byte b, c, d, r;
        b = 2;

        // short (2 byte(16bit)) range -> 32768 to 32767
        short myFirstShortDataType = 56;

        // int (4 byte(32bit)) range -> -2147483648 to 2147483647
        int a, v;

        // long (8 byte) range -> -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long myLong = 43355445454565L;

        // float (4 byte) -> 6 to 7 decimal digit
        float myFloat = 45.6F;

        // Double (8 byte) -> 15 decimal digit
        double myDouble = 5.6;
        // endregion

        // character (2 byte)
        char myChar = 'a';

        // boolean (1 bit)
        boolean myBoolean = true; // false

        // String
        String myString = "ali ahmadi";
        System.out.println(b);
    }
}