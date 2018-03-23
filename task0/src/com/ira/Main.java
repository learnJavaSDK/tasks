package com.ira;

public class Main {

    public static void main(String[] args)
    {
        boolean someBoolean = true;
        boolean otherBoolean = false;

        System.out.println("bool value example: " + someBoolean);
        System.out.println("bool value example: " + otherBoolean);

        int someInt = 27;
        int otherInt = 2;
        System.out.println("Sum int: " + sum(someInt, otherInt));
        System.out.println("Diff int: " + diff(someInt, otherInt));
        System.out.println("Multiply int: " + multiply(someInt, otherInt));
        System.out.println("Divide int: " + divide(someInt, otherInt));
        System.out.println("Power int: " + power(someInt, otherInt));

        byte someByte = 3;
        byte otherByte = 2;
        System.out.println("Sum byte: " + sum(someByte, otherByte));
        System.out.println("Diff byte: " + diff(someByte, otherByte));
        System.out.println("Multiply byte: " + multiply(someByte, otherByte));
        System.out.println("Divide byte: " + divide(someByte, otherByte));
        System.out.println("Power byte: " + power(someByte, otherByte));

        short someShort = -9;
        short otherShort = 2;
        System.out.println("Sum short: " + sum(someShort,otherShort));
        System.out.println("Diff short: " + diff(someShort,otherShort));
        System.out.println("Multiply short: " + multiply(someShort,otherShort));
        System.out.println("Divide short: " + divide(someShort,otherShort));
        System.out.println("Power short: " + power(someShort,otherShort));

        long someLong = 52;
        long otherLong = 2;
        System.out.println("Sum long: " + sum(someLong, otherLong));
        System.out.println("Diff long: " + diff(someLong, otherLong));
        System.out.println("Multiply long: " + multiply(someLong, otherLong));
        System.out.println("Divide long: " + divide(someLong, otherLong));
        System.out.println("Power long: " + power(someLong, otherLong));

        double someDouble = 1.6;
        double otherDouble = 2.0;
        System.out.println("Sum double: " + sum(someDouble, otherDouble));
        System.out.println("Diff double: " + diff(someDouble, otherDouble));
        System.out.println("Multiply double: " + multiply(someDouble, otherDouble));
        System.out.println("Divide double: " + divide(someDouble, otherDouble));
        System.out.println("Power double: " + power(someDouble, otherDouble));

        float someFloat = 4.6f;
        float otherFloat = 2.0f;
        System.out.println("Sum float: " + sum(someFloat, otherFloat));
        System.out.println("Diff float: " + diff(someFloat, otherFloat));
        System.out.println("Multiply float: " + multiply(someFloat, otherFloat));
        System.out.println("Multiply float: " + multiply(someFloat, otherFloat));
        System.out.println("Divide float: " + divide(someFloat, otherFloat));
        System.out.println("Power float: " + power(someFloat, otherFloat));

        char someChar = 'a';
        char otherChar = 2;
        System.out.println("Sum char: " + sum(someChar, otherChar));
        System.out.println("Diff char: " + diff(someChar, otherChar));
        System.out.println("Multiply char: " + multiply(someChar, otherChar));
        System.out.println("Divide char: " + divide(someChar, otherChar));
        System.out.println("Power char: " + power(someChar, otherChar));
    }

    private static long sum(int someInt, int otherInt)
    {
        return someInt + otherInt;
    }

    private static short sum(byte someByte,  byte otherByte)
    {
       return (short)(someByte + otherByte);
    }

    private static int sum(short someShort, short otherShort)
    {
        return someShort + otherShort;
    }

    private static long sum(long someLong, long otherLong)
    {
        return someLong + otherLong;
    }

    private static double sum(double someDouble, double otherDouble)
    {
        return someDouble + otherDouble;
    }

    private static float sum(float someFloat, float otherFloat)
    {
        return someFloat + otherFloat;
    }

    private static int sum(char someChar, char otherChar)
    {
        return someChar + otherChar;
    }

    private static int diff(int someInt, int otherInt)
    {
        return someInt - otherInt;
    }

    private static short diff(byte someByte,  byte otherByte)
    {
        return (short)(someByte - otherByte);
    }

    private static int diff(short someShort, short otherShort)
    {
        return someShort - otherShort;
    }

    private static long diff(long someLong, long otherLong)
    {
        return someLong - otherLong;
    }

    private static double diff(double someDouble, double otherDouble)
    {
        return someDouble - otherDouble;
    }

    private static float diff(float someFloat, float otherFloat)
    {
        return someFloat - otherFloat;
    }

    private static int diff(char someChar, char otherChar)
    {
        return someChar - otherChar;
    }
    private static long multiply(int someInt, int otherInt)
    {
        return someInt * otherInt;
    }

    private static int multiply(byte someByte,  byte otherByte)
    {
        return someByte * otherByte;
    }

    private static int multiply(short someShort, short otherShort)
    {
        return someShort * otherShort;
    }

    private static long multiply(long someLong, long otherLong)
    {
        return someLong * otherLong;
    }

    private static double multiply(double someDouble, double otherDouble)
    {
        return someDouble * otherDouble;
    }

    private static float multiply(float someFloat, float otherFloat)
    {
        return someFloat * otherFloat;
    }

    private static int multiply(char someChar, char otherChar)
    {
        return someChar * otherChar;
    }

    private static double divide(int someInt, int otherInt)
    {
        if (otherInt == 0) {
            throw new RuntimeException("divider cannot be 0");
        }
        return someInt / otherInt;
    }

    private static double divide(byte someByte,  byte otherByte)
    {
        if (otherByte == 0) {
            throw new RuntimeException("divider cannot be 0");
        }
        return someByte / otherByte;
    }

    private static double divide(short someShort, short otherShort)
    {
        if (otherShort == 0) {
            throw new RuntimeException("divider cannot be 0");
        }
        return someShort / otherShort;
    }

    private static double divide(long someLong, long otherLong)
    {
        if (otherLong == 0) {
            throw new RuntimeException("divider cannot be 0");
        }
        return someLong / otherLong;
    }

    private static double divide(double someDouble, double otherDouble)
    {
        if (otherDouble == 0) {
            throw new RuntimeException("divider cannot be 0");
        }
        return  someDouble / otherDouble;
    }

    private static float divide(float someFloat, float otherFloat)
    {
        if (otherFloat == 0) {
            throw new RuntimeException("divider cannot be 0");
        }
        return  someFloat / otherFloat;
    }

    private static double divide(char someChar, char otherChar)
    {
        if (otherChar == 0) {
            throw new RuntimeException("divider cannot be 0");
        }
        return  someChar / otherChar;
    }

    private static double power(int someInt, int otherInt)
    {
        return Math.pow(someInt, otherInt);
    }

    private static double power(byte someByte,  byte otherByte)
    {
        return Math.pow(someByte, otherByte);
    }

    private static double power(short someShort, short otherShort)
    {
        return Math.pow(someShort, otherShort);
    }

    private static double power(long someLong, long otherLong)
    {
        return Math.pow(someLong, otherLong);
    }

    private static double power(double someDouble, double otherDouble)
    {
        return Math.pow(someDouble, otherDouble);
    }

    private static double power(float someFloat, float otherFloat)
    {
        return Math.pow(someFloat, otherFloat);
    }

    private static double power(char someChar, char otherChar)
    {
        return Math.pow(someChar, otherChar);
    }
}
