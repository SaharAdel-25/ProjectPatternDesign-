
package Calc;


public class OperationFactory {
   
    private final ComplexMath cm = new ComplexMath(); // shared adaptee

    public Operation getOperation(String op) {
       
        if ("+".equals(op)) return new AddOperation();
        if ("-".equals(op)) return new SubOperation();
        if ("*".equals(op)) return new MulOperation();
        if ("/".equals(op)) return new DivOperation();

        
        switch (op) {
            case "^" -> {
                return new ComplexMathAdapter(cm, ComplexMathAdapter.OpType.POW);
            }
            case "√" -> {
                return new ComplexMathAdapter(cm, ComplexMathAdapter.OpType.ROOT);     // a^(1/b)
            }
            case "ln" -> {
                return new ComplexMathAdapter(cm, ComplexMathAdapter.OpType.LOGN);
            }
            case "log10" -> {
                return new ComplexMathAdapter(cm, ComplexMathAdapter.OpType.LOG10);
            }
            case "logb" -> {
                return new ComplexMathAdapter(cm, ComplexMathAdapter.OpType.LOG_BASE);
            }
            case "exp" -> {
                return new ComplexMathAdapter(cm, ComplexMathAdapter.OpType.EXP);
            }
            case "hypot" -> {
                return new ComplexMathAdapter(cm, ComplexMathAdapter.OpType.HYPOT);
            }
            case "atan2" -> {
                return new ComplexMathAdapter(cm, ComplexMathAdapter.OpType.ATAN2);
            }
            case "max" -> {
                return new ComplexMathAdapter(cm, ComplexMathAdapter.OpType.MAX);
            }
            case "min" -> {
                return new ComplexMathAdapter(cm, ComplexMathAdapter.OpType.MIN);
            }
            case "Γ" -> {
                return new ComplexMathAdapter(cm, ComplexMathAdapter.OpType.GAMMA);
            }
            case "β" -> {
                return new ComplexMathAdapter(cm, ComplexMathAdapter.OpType.BETA);
            }
            case "C" -> {
                return new ComplexMathAdapter(cm, ComplexMathAdapter.OpType.BINOMIAL);
            }
            case "erf" -> {
                return new ComplexMathAdapter(cm, ComplexMathAdapter.OpType.ERF);
            }
            case "erfc" -> {
                return new ComplexMathAdapter(cm, ComplexMathAdapter.OpType.ERFC);
            }
            default -> throw new IllegalArgumentException("Unknown operation: " + op);
        }
    }
}
