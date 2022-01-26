package example;
public class Bob {
    public Integer g;
    public Integer p;
    private Integer b; //простое число
    private Integer _b_;
    public Integer _a_;
    public Integer secretKey;

    public Bob(Integer g, Integer p) {
        this.g = g;
        this.p = p;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Integer sendToAlice() {
        return _b_;
    }

    public Integer calculateRemainderOfTheDivision() {
        _b_ = (int) (Math.pow(g, b) % p);
        return b;
    }
    public Integer calculateSecretKey() {
        secretKey = (int) (Math.pow(_a_, b) % p);
        return secretKey;
    }
}
