
package Calc;


import org.apache.commons.math3.util.FastMath;

public class ComplexMath {

    public double pow(double a, double b) { 
        return FastMath.pow(a, b); 
    }

    public double logBase(double a, double base) { 
        return FastMath.log(a) / FastMath.log(base); 
    }

    public double exp(double a) { 
        return FastMath.exp(a); 
    }

    public double Pi() { 
        return FastMath.PI; 
    }

    public double percent(double a) { 
        return a / 100.0; 
    }

    public double sin(double a) { 
        return FastMath.sin(a); 
    }

    public double cos(double a) { 
        return FastMath.cos(a); 
    }

    public double tan(double a) { 
        return FastMath.tan(a); 
    }

    public double sqrt(double a) { 
        return FastMath.sqrt(a); 
    }
}

