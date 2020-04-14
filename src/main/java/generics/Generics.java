package generics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Generics {

    public static void main(String[] args) {

    // ------------------------------------------
    // Basic example
    // ------------------------------------------

        String[] stringArray = new String[] {"hello", "world"};
        List<String> stringList = convertBasic(stringArray);
        stringList.forEach(System.out::println);

        Integer[] intArray = new Integer[] {1,2,3,4,5};
        List<Integer> integerList = convertBasic(intArray);
        integerList.forEach(System.out::println);

    // ------------------------------------------
    // Example using inheritance (upper bounding)
    // ------------------------------------------

        GenericSubclass[] genericSubclassArray = new GenericSubclass[] { new GenericSubclass(), new GenericSubclass() };
        List<GenericSubclass> genericSubclassList = convertSubclass(genericSubclassArray);
        genericSubclassList.forEach(System.out::println);

        // String[] stringArray2 = new String[] {"hello", "world"};
        // List<String> stringList2 = convertSubclass(stringArray2);
        // ---> would cause compiler error because String is not a subclass of GenericSuperclass

    // ------------------------------------------
    // Wildcard example
    // ------------------------------------------

        // useWildcardIncorrect(genericSubclassList);
        // ---> would cause compiler error because List<GenericSubclass> is not a subclass of List<GenericSuperclass>

        useWildcardCorrect(genericSubclassList);

    }

    private static <T> List<T> convertBasic(T[] array) {
        return Arrays.stream(array).collect(Collectors.toList());
    }

    private static <T extends GenericSuperclass> List<T> convertSubclass(T[] array) {
        return Arrays.stream(array).collect(Collectors.toList());
    }

    private static void useWildcardIncorrect(List<GenericSuperclass> list) {
        list.forEach(GenericSuperclass::doSomething);
    }

    private static void useWildcardCorrect(List<? extends GenericSuperclass> list) {
        list.forEach(GenericSuperclass::doSomething);
    }

}
