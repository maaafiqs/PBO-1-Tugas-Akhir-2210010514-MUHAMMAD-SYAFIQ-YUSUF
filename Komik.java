public class Komik extends Buku {
    private String ilustrator;
    private String chapter;
    private String volume;


    public String getChapter(){
        return this.chapter;
    }
    
    public void setChapter(String chapter){
        this.chapter = chapter;
    }
    
   

    public String getIlustrator() {
        return this.ilustrator;
    }

    public void setIlustrator(String ilustrator) {
        this.ilustrator = ilustrator;
    }

    public String getIVolume() {
        return this.volume;
    }

    public void setVolume(String volume){
        this.volume = volume;
    }

    public void naikkanHarga(){
        System.out.println("Komik ini mengalami kenaikan harga");
    }
}
