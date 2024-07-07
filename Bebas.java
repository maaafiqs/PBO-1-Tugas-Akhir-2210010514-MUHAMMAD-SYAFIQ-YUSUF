public class Bebas {
    private String menuutama;
    private String perhitungan_nilai;
    private String daftar_nilai;

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



public String perhitunganNilai(){

    return this.perhitungan_nilai;
}

}
