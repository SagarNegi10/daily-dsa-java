public class Pattern {
    // * 
    // * * 
    // * * * 
    // * * * * 
    // * * * * * 
    public static void pattern1(int n){
        for(int i = 1; i < n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // * * * * * 
    // * * * *
    // * * *
    // * *
    // *
    public static void pattern2(int n){
        for(int i = 1; i < n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for(int i = 1; i < n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // pattern1(6);
        // pattern2(6);
    }
}