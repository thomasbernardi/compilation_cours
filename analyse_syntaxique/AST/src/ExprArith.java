//public abstract class ExprArith {
//
//    abstract int print();
//
//}
//
//class Cte extends ExprArith {
//
//    int val;
//
//    Cte (int val) {
//        this.val = val;
//    }
//
//    int print() {
//        return val;
//    }
//
//}
//
//class Inv extends ExprArith {
//
//    ExprArith e;
//
//    Inv (ExprArith e) {
//        this.e = e;
//    }
//
//    int print() {
//        return -e.print();
//    }
//
//}
//
//abstract class BinOp extends ExprArith {
//
//    ExprArith e1, e2;
//
//}
//
//class Add extends BinOp {
//
//    Add (ExprArith e1, ExprArith e2) {
//        this.e1 = e1;
//        this.e2 = e2;
//    }
//
//    int print() {
//        return e1.print() + e2.print();
//    }
//}
//
//class Sub extends BinOp {
//
//    Sub(ExprArith e1, ExprArith e2) {
//        this.e1 = e1;
//        this.e2 = e2;
//    }
//
//    int print() {
//        return e1.print() - e2.print();
//    }
//}
//class Mul extends BinOp {
//
//    Mul(ExprArith e1, ExprArith e2) {
//        this.e1 = e1;
//        this.e2 = e2;
//    }
//
//    int print() { return e1.print() * e2.print(); }
//}
//
//class Div extends BinOp {
//
//    Div(ExprArith e1, ExprArith e2) {
//        this.e1 = e1;
//        this.e2 = e2;
//    }
//
//    int print() { return e1.print() / e2.print(); }
//}