
package Calc;

public class ComplexMathAdapter implements Operation {
    public enum OpType {
        POW, ROOT, LOGN, LOG10, LOG_BASE, EXP, HYPOT, ATAN2, MAX, MIN, GAMMA, BETA, BINOMIAL, ERF, ERFC
    }

    private final ComplexMath complex; 
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
            case ROOT -> {
                return (b == 0f) ? Float.NaN : (float) complex.root(a, b);
            }
            case LOGN -> {
                return (a <= 0f) ? Float.NaN : (float) complex.ln(a);
            }
            case LOG10 -> {
                return (a <= 0f) ? Float.NaN : (float) complex.log10(a);
            }
            case LOG_BASE -> {
                return (a <= 0f || b <= 0f || b == 1f) ? Float.NaN : (float) complex.logBase(a, b);
            }
            case EXP -> {
                return (float) complex.exp(a);
            }
            case HYPOT -> {
                return (float) complex.hypot(a, b);
            }
            case ATAN2 -> {
                return (float) complex.atan2(a, b);
            }
            case MAX -> {
                return (float) complex.max(a, b);
            }
            case MIN -> {
                return (float) complex.min(a, b);
            }
            case GAMMA -> {
                return (float) complex.gamma(a);
            }
            case BETA -> {
                return (float) complex.beta(a, b);
            }
            case BINOMIAL -> {
                long n = Math.round(a);
                long k = Math.round(b);
                if (n < 0 || k < 0 || k > n) return Float.NaN;
                return (float) complex.binomial(n, k);
            }
            case ERF -> {
                return (float) complex.erf(a);
            }
            case ERFC -> {
                return (float) complex.erfc(a);
            }
            default -> {
                return Float.NaN;
            }
        }
    }
}