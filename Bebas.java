public class Bebas {
    private String menuutama;
    private String perhitungan_nilai;
    private String daftar_nilai;
    private String ranking;

public void menuUtama(){
    System.out.println("Ini method untuk menu utama");
}

public String getMenuutama(){

    return this.menuutama;
}

public void setMenuutama(String menuutama){

    this.menuutama =menuutama;
}


public void daftarNilai(){
    System.out.println("Ini method Daftar Nilai");
}

public String getDaftarNilai(){
    return this.daftar_nilai;
}

public void setDaftarNilai(String daftar_nilai){

    this.daftar_nilai = daftar_nilai;
}


public void perhitunganNilai(){

    System.out.println("Ini method Perhitungan Nilai");
}

public String getPerhitunganNilai(){

    return this.perhitungan_nilai;
}

public void setPerhitunganNilai(String perhitungan_nilai){

    this.perhitungan_nilai = perhitungan_nilai;
}


public void ranking(){

    System.out.println("Ini method Ranking");
}

public String getRanking(){
    return this.ranking;
}

public void setRanking(String ranking){
    this.ranking = ranking;
}

}
