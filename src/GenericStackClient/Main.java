package GenericStackClient;

import static GenericStackClient.MyGenericStack.stackOfIStrings;
import static GenericStackClient.MyGenericStack.stackOfIntegers;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }
}