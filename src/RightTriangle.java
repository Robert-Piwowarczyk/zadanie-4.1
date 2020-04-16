class RightTriangle {

    boolean isRightTriangle(double a, double b, double c) {
       if  ((a * a + b * b == c * c) ||
                (a * a + c * c == b * b) ||
                (b * b + c * c == a * a)) {
            return true;
        } else {
            return  false;
        }
    }
}
