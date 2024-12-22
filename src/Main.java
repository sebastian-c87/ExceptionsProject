public class Main {
    public static void main(String[] args) {
        try {
            NullPointerExceptionGenerator.generateNullPointer();
        } catch (NullPointerException e) {
            System.out.println("A NullPointerException was caught");
            e.printStackTrace();
            System.out.println(e.toString());
        }

        System.out.println("End of program");
    }
}
