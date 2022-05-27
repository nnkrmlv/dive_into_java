
class Lesson1PrimitiveTypes {
    public static void main(String[] args) {

        // lesson 1. Primitive types:
        // boolean - 8 bit. false or true
        // byte - 8 bit. -127 to 128
        // char - 16 bit. 2 bytes. from 0 to 65535
        // int - 32 bit. 4 bytes. from -2000000000 to +2000000000
        // long - 64 bit. 8 bytes
        // float - 32 bit.
        // double - 64 bit.

        boolean b = true;
        byte by = 100;
        char c = 'A';
        int i = 200;
        long l = 9000000000L;
        float f = 1.5f;
        double d = 1.5;

        int fromByte = by;
        double fromFloar = f;
        long fromInt = i;
        int fromChar = c;


        // array of primitive type
        byte[] byteArray = new byte[100];   // size 100 bytes
        int[] intArray = new int[100]; // size 400 bytes
        boolean[] boolArray = new boolean[100]; // size 100 bytes
        long[] longArray = new long[100]; // size 800 bytes
        float[] floatArray = new float[100]; // size 400 bytes
        double[] doubleArray = new double[100]; // size 800 bytes


    }
}
