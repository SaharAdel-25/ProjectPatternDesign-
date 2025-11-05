/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
        return complex.calculate(a, b, type);
    }
    
}