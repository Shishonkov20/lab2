package example;
public class Alice {
    public Integer g;
    public Integer p;
    private Integer a; //просто число
    private Integer _a_;
    public Integer _b_;
    public Integer secretKey;

    public Alice(Integer g, Integer p) {
        this.g = g;
        this.p = p;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer sendToBob() {
        return _a_;
    }

    public Integer calculateRemainderOfTheDivision() {
        _a_ = (int) (Math.pow(g, a) % p);
        return a;
    }

    public Integer calculateSecretKey() {
        secretKey = (int)(Math.pow(_b_, a) % p);
        return secretKey;
    }
}
