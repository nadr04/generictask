public class Main {

    public static void main(String[] args) {

        Integer[] skaiciuArray = {1, 2, 3};
        String[] zodziuArray = {"Hello", "World"};

        printArray(skaiciuArray);
        printArray(zodziuArray);

    }


    public static <T> void printArray(T[] allTypesArray) {
        for (T arrayElements : allTypesArray) {
            System.out.println(arrayElements);
        }

    }
}
