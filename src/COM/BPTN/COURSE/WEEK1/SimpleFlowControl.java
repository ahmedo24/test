

public class SimpleFlowControl {

    public static void main(String[] args) {
        int number = 3;

        switch (number) {
            case 1:
                System.out.println("Option 1");
                break;
            case 2:
                System.out.println("Option 2");
                break;
            default:
                System.out.println("Default option");
        }

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("Iteration " + i);
        }

        int value = 7;
        switch (value) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            default:
                System.out.println("Value is not 1 or 2");
        }
    }
}