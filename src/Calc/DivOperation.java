
package Calc;


public class DivOperation implements Operation{

    @Override
    public float apply(float a, float b) {
        if(b == 0) 
            throw new ArithmeticException("Cannot divide by zero");
        
        return a / b;
    }
    
}
