
package Calc;


import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.CombinatoricsUtils;
import org.apache.commons.math3.special.Gamma;
import org.apache.commons.math3.special.Beta;
import org.apache.commons.math3.special.Erf;


public class ComplexMath {
    public double pow(double a, double b) { return FastMath.pow(a, b); }
    public double root(double a, double b) { return FastMath.pow(a, 1.0 / b); }
    public double ln(double a) { return FastMath.log(a); }
    public double log10(double a) { return FastMath.log10(a); }
    public double logBase(double a, double base) { return FastMath.log(a) / FastMath.log(base); }
    public double exp(double a) { return FastMath.exp(a); }
    public double hypot(double a, double b) { return FastMath.hypot(a, b); }
    public double atan2(double y, double x) { return FastMath.atan2(y, x); }
    public double max(double a, double b) { return FastMath.max(a, b); }
    public double min(double a, double b) { return FastMath.min(a, b); }
    public double gamma(double a) { return Gamma.gamma(a); }
    public double beta(double a, double b) { return Beta.logBeta(a, b); }
    public double binomial(long n, long k) { return CombinatoricsUtils.binomialCoefficientDouble((int)n, (int)k); }
    public double erf(double a) { return Erf.erf(a); }
    public double erfc(double a) { return Erf.erfc(a); }
}
