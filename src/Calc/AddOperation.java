
package Calc;

class AddOperation implements Operation {
 
    @Override
    public float apply(float a, float b) {
         return a + b; 
    }
   
}
class SubOperation implements Operation{

    @Override
    public float apply(float a, float b) {
        return a - b;
    }
    
}
class MulOperation implements Operation{
    @Override
    public float apply(float a, float b) {
        return a * b;
    }
    
}
class DivOperation implements Operation{

    @Override
    public float apply(float a, float b) {
        if(b == 0) 
            throw new ArithmeticException("Cannot divide by zero");
        
        return a / b;
    }
    
}