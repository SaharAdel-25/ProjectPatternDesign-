package Calc;

public class OperationFactory {

    private final ComplexMath complex = new ComplexMath();

    public Operation getOperation(String operation) {
        switch (operation) {
            case "+" ->  { return new AddOperation(); }
            case "-" ->  { return new SubOperation(); }
            case "*" ->  { return new MulOperation(); }
            case "/" ->  { return new DivOperation(); }
            case "^" ->       { return new ComplexMathAdapter(complex, ComplexMathAdapter.OpType.POW); }
            case "√" ->       { return new ComplexMathAdapter(complex, ComplexMathAdapter.OpType.SQRT); }
            case "exp" ->     { return new ComplexMathAdapter(complex, ComplexMathAdapter.OpType.EXP); }
            case "log" ->    { return new ComplexMathAdapter(complex, ComplexMathAdapter.OpType.LOG_BASE); }
            case "π" ->       { return new ComplexMathAdapter(complex, ComplexMathAdapter.OpType.PI); }
            case "%" ->       { return new ComplexMathAdapter(complex, ComplexMathAdapter.OpType.PERCENT); }
            case "sin" ->     { return new ComplexMathAdapter(complex, ComplexMathAdapter.OpType.SIN); }
            case "cos" ->     { return new ComplexMathAdapter(complex, ComplexMathAdapter.OpType.COS); }
            case "tan" ->     { return new ComplexMathAdapter(complex, ComplexMathAdapter.OpType.TAN); }
            default -> throw new IllegalArgumentException("Unknown operation: " + operation);
        }
    }
}
