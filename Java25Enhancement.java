public class PrimitivePatternMatching {

    static void inspect(Object objInspect) {
        if (objInspect instanceof int i) {
            System.out.println("Its Primitive int: " + i);
        }
        else if (objInspect instanceof Integer integerObj) {
            System.out.println("Its Boxed Integer: " + integerObj);
        }
        else {
            System.out.println("Other type: " + objInspect);
        }
    }

    static String classifyNum(Object objClassify) {
        return switch (objClassify) {
            case int i when i < 0 -> "Negative int: " + i;
            case int i -> "Non-negative int: " + i;
            case Integer _ -> "Boxed integer";
            default -> "Unknown";
        };
    }



    public static void main(String[] args) {
        inspect(5);            // Its Primitive int: 5
        inspect(Integer.valueOf(10));  // Its Boxed Integer: 10
        inspect("Hello");      // prints: Other type: Hello

        System.out.println(classifyNum(-3)); // Negative int: -3
        System.out.println(classifyNum(42));
        System.out.println(classifyNum(Integer.valueOf(7)));
    }

}
