package id.ac.umn.edwardlouisrago_00000022464_uts;

import java.io.Serializable;

public class SumberLagu implements Serializable {
    private String judul;

    public SumberLagu(String judul, int testing1){
        this.judul = judul;
    }

    public String getJudul() { return this.judul; }

    public void setJudul(String judul) { this.judul = judul; }

    public String toString() { return this.getJudul(); }
}
