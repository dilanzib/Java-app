package app;

public class Payment {

    double m;

    public static double power(double base, int exponent) {
        double ans = 1;
        if (exponent != 0) {
            int absExponent = exponent > 0 ? exponent : (-1) * exponent;
            for (int i = 1; i <= absExponent; i++) {
                ans *= base;
            }
            if (exponent < 0) {
                // if the exponent is negative, must invert
                ans = 1.0 / ans;
            }
        } else {
            // if the exponent is 0
            ans = 1;
        }
        return ans;
    }

    public Payment(double loan, double i, int y) {    //Calculating monthly payment
        m = (loan * i) / (1 - power(1 + i, -y));
        m = (m* 100) / 100;
    }

}
