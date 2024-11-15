public class JavaBasics {

    public static void main(String[] args) {
        AdvancedCalculator calc1 = new AdvancedCalculator();
        
        // Calling the overridden add method (from AdvancedCalculator)
        System.out.println("Sum using AdvancedCalculator add: " + calc1.add(10, 20)); // Output: 31
        
        // Calling the Calculator add method (using super)
        System.out.println("Sum using Calculator add: " + calc1.addUsingSuper(10, 20)); // Output: 30
    }
}

class Calculator {
    int add(int num1, int num2) {
        return num1 + num2;
    }
    int sub(int num1, int num2) {
        return num2 - num1;
    }
}

class AdvancedCalculator extends Calculator {
    @Override
    int add(int num1, int num2) {
        return num1 + num2 + 1;
    }

    // Method to call the Calculator's add method using super
    int addUsingSuper(int num1, int num2) {
        return super.add(num1, num2);
    }

    int multiply(int num1, int num2) {
        return num1 * num2;
    }

    int divide(int num1, int num2) {
        return num1 / num2;
    }
}
