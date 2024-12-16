public class MyClass {
    public static void main(String[] args) {
        int i = 10;
        boolean loopFinishedNormally = true;
        while (i > 0) {
            System.out.println(i);
            if (i == 5) {
                loopFinishedNormally = false;
                break; // Exit the loop when i is 5
            }
            i--;
        }
        if (loopFinishedNormally) {
            System.out.println("Loop finished normally");
        } else {
            System.out.println("Loop finished prematurely at i=5");
        }
        System.out.println("Post-loop execution");
    }
}