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



//
//package Calc;
//
//public class ComplexMath {
//
//    public double pow(double a, double b) { 
//        return Math.pow(a, b); 
//    }
//
//    public double logBase(double a, double base) { 
//        return Math.log(a) / Math.log(base); 
//    }
//
//    public double exp(double a) { 
//        return Math.exp(a); 
//    }
//
//    public double Pi() { 
//        return Math.PI; 
//    }
//
//    public double percent(double a) { 
//        return a / 100.0; 
//    }
//
//    public double sin(double a) { 
//        return Math.sin(a); 
//    }
//
//    public double cos(double a) { 
//        return Math.cos(a); 
//    }
//
//    public double tan(double a) { 
//        return Math.tan(a); 
//    }
//
//    public double sqrt(double a) { 
//        return Math.sqrt(a); 
//    }
//}
//
