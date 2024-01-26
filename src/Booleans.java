public class Booleans {
    public static void main(String[] args) {
        boolean isJavaFun = true;
        boolean isProgrammingEasy = false;
        boolean resultAnd = isJavaFun && isProgrammingEasy;
        System.out.println("Logical AND: " + resultAnd);
        boolean resultOr = isJavaFun || isProgrammingEasy;
        System.out.println("Logical OR: " + resultOr);
        boolean resultNot = !isJavaFun;
        System.out.println("Logical NOT: " + resultNot);
    }
}

