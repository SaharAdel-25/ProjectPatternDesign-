
package Calc;

public class ComplexMathAdapter implements Operation {

    private final ComplexMath complex;
    public enum OpType {
        POW,LOG_BASE,EXP,
        PI,PERCENT,SIN,
        COS,TAN,SQRT
    }
    private final OpType type;

    public ComplexMathAdapter(ComplexMath complex, OpType type) {
        this.complex = complex;
        this.type = type;
    }

    @Override
    public float apply(float a, float b) {

        switch (type) {

            case POW -> {
                return (float) complex.pow(a, b);
            }

            case LOG_BASE -> {
                if (a <= 0f || b <= 0f || b == 1f) return Float.NaN;
                return (float) complex.logBase(a, b);
            }

            case EXP -> {
                return (float) complex.exp(a);
            }

            case PI -> {
                return (float) complex.Pi();  
            }

            case PERCENT -> {
                return (float) complex.percent(a);
            }

            case SIN -> {
                return (float) complex.sin(Math.toRadians(a));
            }

            case COS -> {
                return (float) complex.cos(Math.toRadians(a));
            }

            case TAN -> {
                return (float) complex.tan(Math.toRadians(a));
            }

            case SQRT -> {
                if (a < 0f) return Float.NaN;
                return (float) complex.sqrt(a);
            }

            default -> {
                return Float.NaN;
            }
        }
    }
}
