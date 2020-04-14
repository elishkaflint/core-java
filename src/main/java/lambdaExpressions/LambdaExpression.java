package lambdaExpressions;

public class LambdaExpression {

    public static void main(String[] args) {

        MyInterface imperativeImplementation = new MyInterface() {
            public void doAThing() {
                System.out.println("Hello from my imperative interface implementation");
            }
        };
        imperativeImplementation.doAThing();


        MyInterface functionalImplementation = () -> System.out.println("Hello from my functional interface implementation");
        functionalImplementation.doAThing();

    }

}
