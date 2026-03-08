
package Calc;


public class ComplexMath {

    public float calculate(float a, float b, OpType type) {
        return switch (type) {
            case POW -> (float) Math.pow(a, b); 
            case SQRT -> (float) Math.sqrt(a); 
            case LOG_BASE -> (float) Math.log10(a); 
            case EXP -> (float) Math.exp(a); 
            case PERCENT -> a / 100.0f; 
            case SIN -> (float) Math.sin(Math.toRadians(a)); 
            case COS -> (float) Math.cos(Math.toRadians(a)); 
            case TAN -> (float) Math.tan(Math.toRadians(a)); 
            case PI -> (float) Math.PI; 
            default -> throw new IllegalArgumentException("Unsupported complex operation");
        };
    }
}
