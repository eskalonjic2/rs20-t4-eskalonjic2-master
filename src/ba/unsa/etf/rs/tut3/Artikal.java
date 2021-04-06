package ba.unsa.etf.rs.tut3;

public class Artikal {
    public String sifra;

    public String getSifra() {
        return sifra;
    }

    public Artikal(String sifra, String naziv, double cijena) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.cijena = cijena;
        return new Artikal(sifra,naziv,cijena);
    }


    public void setSifra(String sifra) {
        this.sifra = sifra;
        throw new IllegalArgumentException("Šifra je prazna");
    }

    public String getNaziv() {
        return naziv;

    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
        throw new IllegalArgumentException("Naziv je prazan");
    }

    public double getCijena() {
        return cijena;


    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
        throw new IllegalArgumentException("Cijena je negativna");
    }

    public String naziv;
    public double cijena;
}
