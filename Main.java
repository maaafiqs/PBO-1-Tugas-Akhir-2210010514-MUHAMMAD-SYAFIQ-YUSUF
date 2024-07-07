public class Main {
    public static void main(String[] args) {
        String variabelString;
        Pengguna pengguna = new Pengguna();
        Tamu tamu = new Tamu();
        
        // Example usages
        pengguna.login();
        pengguna.hapus(1);
        
        tamu.menambahMasaAktif(5);
        tamu.login();
    }
}

class Pengguna {
    public void hapus() {
        System.out.println("DELETE FROM pengguna");
    }

    public void hapus(int id) {
        System.out.println("DELETE FROM pengguna WHERE id=" + id);
    }

    public void hapus(String username) {
        System.out.println("DELETE FROM pengguna WHERE username=" + username);
    }

    public void login() {
        System.out.println("Ini method untuk login");
    }

    public void login(String tokenGoogle) {
        System.out.println("Ini Login menggunakan Google");
    }
}

class Tamu extends Pengguna {
    private int sisaMasaAktif;

    public void menambahMasaAktif(int tambahan) {
        this.sisaMasaAktif = this.sisaMasaAktif + tambahan;
    }

    public void hapus() {
        System.out.println("DELETE FROM pengguna WHERE status='Tamu'");
    }

    public void login() {
        System.out.println("Login Sebagai tamu");
    }
}
