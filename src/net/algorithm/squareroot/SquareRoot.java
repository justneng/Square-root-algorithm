package net.algorithm.squareroot;

/**
 * Created by wanchana on 11/10/2558.
 */
public class SquareRoot {

    private Integer n = 0;
    private Double a = 0.0;
    private Double b = 0.0;
    private Double x = 0.0;
    private Double compare = 0.0;

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = Math.round(x*1000000.0)/1000000.0;
    }

    public Double getCompare() {
        return compare;
    }

    public void setCompare(Double compare) {
        this.compare = Math.round(compare*1000000.0)/1000000.0;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public static Double calculateX(Double a, Double b){

        return (a + b)/2;
    }

    public static Double calculateCompare(Double x, Integer n){

        return Math.pow(x, 2) - n;
    }

    public void calculate(){

        setX(Math.round(calculateX(a, b)*1000000.0)/1000000.0);
        setCompare(Math.round(calculateCompare(x, n) * 1000000.0) / 1000000.0);
    }
}
