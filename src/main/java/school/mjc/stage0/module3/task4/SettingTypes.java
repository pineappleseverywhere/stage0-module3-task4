package school.mjc.stage0.module3.task4;

public class SettingTypes {
    public static void main(String[] args) {
        long first = 10_000_000_000L;  // Needs to be long for large value
        char second = 'a';             // char is suitable for single character
        boolean third = 5 > 9;          // boolean for true/false
        double forth = 12.90434323324342; // double for high precision decimal
        float fifth = 12.3F;            // float for single-precision decimal
        byte sixth = 1;                 // byte can hold values from -128 to 127 (inclusive)
        short seventh = 129;            // short can hold values from -32768 to 32767 (inclusive)
    }
}

