public class Operators {
    public static void main(String[] args) {
        // AND - &
        // 5 - 101
        // 6 - 110
        // Output = 100 - 4
        System.out.println(5 & 6);
        
        // OR - |
        // 5 - 101
        // 6 - 110
        // Output = 111 - 7
        System.out.println(5 | 6);

        // XOR - ^
        // 5 - 101
        // 6 - 110
        // Output = 011 - 3
        System.out.println(5 ^ 6);

        // NOT - ~
        // 5 - 101
        // Output = 011 - -6
        System.out.println(~5);

        // Output -1, because MSB is 1 so it is a negative -1, if its 0 then it will be a positive 1 
        System.out.println(~0);

        // Left Shift - <<
        // a << b
        // 5 << 2
        // Output = 10100 - 20 
        System.out.println(5 << 2);

        // Right Shift - >>
        // a >> b
        // 6 >> 1
        // Output = 0011 - 3 
        System.out.println(6 >> 1);
    }
}