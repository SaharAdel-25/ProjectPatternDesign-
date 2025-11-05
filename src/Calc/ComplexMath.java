/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calc;


public class ComplexMath {

    public float calculate(float a, float b, ComplexMathAdapter.OpType type) {
        return switch (type) {
            case POW -> (float) Math.pow(a, b); // الأس
            case SQRT -> (float) Math.sqrt(a); // الجذر التربيعي
            case LOG_BASE -> (float) Math.log10(a); // اللوغاريتم العشري
            case EXP -> (float) Math.exp(a); // الدالة الأسية
            case PERCENT -> a / 100.0f; // التصحيح: قسمة المعامل a على 100
            case SIN -> (float) Math.sin(Math.toRadians(a)); // الجيب
            case COS -> (float) Math.cos(Math.toRadians(a)); // جيب التمام
            case TAN -> (float) Math.tan(Math.toRadians(a)); // الظل
            case PI -> (float) Math.PI; // الثابت باي
            default -> throw new IllegalArgumentException("Unsupported complex operation");
        };
    }
}
