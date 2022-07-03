package metier;

import java.util.Date;

public class Compte {
    private Long code;
    private Date datecreation;
    private  double sold;

    public Compte(Long code, Date datecreation, double sold) {
        this.code = code;
        this.datecreation = datecreation;
        this.sold = sold;
    }

    public Compte() {
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public Date getDatecreation() {
        return datecreation;
    }

    public void setDatecreation(Date datecreation) {
        this.datecreation = datecreation;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }
}
