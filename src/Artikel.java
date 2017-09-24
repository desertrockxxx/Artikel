public class Artikel {

    private String bez;
    private double ntPreis;
    private boolean ermStSa;
    private double brPreis;

    public Artikel(String bez, double ntPreis, boolean ermStSa) {
        this.bez = bez;
        this.ntPreis = ntPreis;
        this.ermStSa = ermStSa;
    }

    public double berechnenBrutto(){
        if(ermStSa == true){
            brPreis = (ntPreis + ( ntPreis / 100 * 7));
        }
        else{
            brPreis = (ntPreis + ( ntPreis / 100 * 19));
        }
        return brPreis;
    }

    public String getBez() {
        return bez;
    }

    public void setBez(String bez) {
        this.bez = bez;
    }

    public double getNtPreis() {
        return ntPreis;
    }

    public void setNtPreis(double ntPreis) {
        this.ntPreis = ntPreis;
    }

    public boolean isErmStSa() {
        return ermStSa;
    }

    public void setErmStSa(boolean ermStSa) {
        this.ermStSa = ermStSa;
    }

    @Override
    public String toString() {
        return  "\nSteuersatz=" + isErmStSa() +
                "\nbez='" + getBez() + '\'' +
                "\nntPreis=" + getNtPreis() +
                "\nbrPreis=" + berechnenBrutto() +
                '\n';
    }
}
