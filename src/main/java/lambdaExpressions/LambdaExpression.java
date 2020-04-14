package lambdaExpressions;

public class LambdaExpression {

    public static void main(String[] args) {

        // ------------------------------------------
        // Using a class instance (normal way)
        // ------------------------------------------

        MyInterface withClassInstance = new InterfaceImplementation();
        withClassInstance.doAThing();

        // ------------------------------------------
        // Using an anonymous function
        // Quicker than creating a whole new class
        // ------------------------------------------

        MyInterface withAnonymousFunction = new MyInterface() {
            public void doAThing() {
                System.out.println("Doing a thing");
            }
        };
        withAnonymousFunction.doAThing();

        // ------------------------------------------
        // Using a lambda
        // Quicker than creating a whole new class, also more readable
        // ------------------------------------------

        MyInterface withLambda = () -> System.out.println("Doing a thing");
        withLambda.doAThing();

    }

}
