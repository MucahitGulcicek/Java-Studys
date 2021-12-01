public class Insan {

    int yas;
    String isim;
    String soyisim;

    public Insan()
    {
        yas = 20;
        isim = "İsimsiz";
    }
    public Insan(int alinanYas, String alinanIsim,String alinanSoyisim)
    {
        yas = alinanYas;
        isim = alinanIsim;
        soyisim = alinanSoyisim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    @Override
    public String toString() {
        return "Insan{" +
                "yas=" + yas +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                '}';
    }
}
