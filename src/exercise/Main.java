package exercise;

public class Main {
    public static void main(String[] args) {
        int[] testArray = { 7, 5, 9, 3, 6 };

        Ciclabile test = new Ciclabile(testArray);

        // testing hasAncoraElementi & getElementoSuccessivo
        while (test.hasAncoraElementi()) {
            int testValue = test.getElementoSuccessivo();
            System.out.println("Next element: " + testValue);
        }

        System.out.println("There are no values left in the specified array.");

        // testing bonus
        test.addElemento(1);
        test.addElemento(8);

        System.out.println("The specificed array now contains the following values: ");
        test.setIndex(0);
        while (test.hasAncoraElementi()) {
            int testElement = test.getElementoSuccessivo();
            System.out.println(testElement);
        }
    }
}
