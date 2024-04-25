class Alamat{
    String jalan;
    String kota;
}

class Mahasiswa{
    String nama;
    String nim;
    Alamat alamat;
    
    String getNama(){
        return nama;
    }
    
    String getNim(){
        return nim;
    }
    
    String getAlamat(){
        return alamat.jalan + ", " + alamat.kota;
    }
}

public class TP2_4_H071231090 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalanrea Indah";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Farhan";
        mahasiswa.nim = "H0871231023";

        System.out.println("Nama "+ mahasiswa.getNama());
        System.out.println("NIM "+ mahasiswa.getNim());
        System.out.println("Alamat: "+ mahasiswa.getAlamat());
    }
}