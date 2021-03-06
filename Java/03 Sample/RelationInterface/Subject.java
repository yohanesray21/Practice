
public class Subject implements Relation {

    private String code;
    private String name;
    private int credit;
    private float pricePerCredit;

    public Subject() {
        code = "";
        name = "";
        credit = 0;
        pricePerCredit = 0;
    }

    public Subject(String code, String name, int credit, float pricePerCredit) {
        this.code = code;
        this.name = name;
        this.credit = credit;
        this.pricePerCredit = pricePerCredit;
    }

    public Subject(Subject subject) {
        code = subject.getCode();
        name = subject.getName();
        credit = subject.getCredit();
        pricePerCredit = subject.getPricePerCredit();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public float getPricePerCredit() {
        return pricePerCredit;
    }

    public void setPricePerCredit(float pricePerCredit) {
        this.pricePerCredit = pricePerCredit;
    }

    public float calculateSubjectPrice() {
        return credit * pricePerCredit;
    }

    @Override
    public String toString() {
        return "code: " + code + "\nname: " + name + "\ncredit: " + credit + 
                "\npricePerCredit: " + pricePerCredit + 
                "\nSubject Price: " + calculateSubjectPrice() +"\n";
    }
    
    @Override
    public boolean isEquals(Object o) {
        if (o == null) {
            return false;
        } else if (o instanceof Subject) {
            return (code.equals(((Subject) o).getCode()) && name.equals(((Subject) o).getName())
                    && credit == ((Subject) o).getCredit() && pricePerCredit == ((Subject) o).getPricePerCredit());
        } else {
            return false;
        }

    }

    //tidak bisa dibandingkan
    @Override
    public boolean isGreaterThan(Object o) {
        return false;
    }

    @Override
    public boolean isLessThan(Object o) {
        return false;
    }

}
