public class Mahasiswa {
    String nim;
    String nama;
    String kelas;

    public Mahasiswa(String nim, String nama, String kelas) {
        nim = nimb;
        this.nama = nama;
        this.kelas = kelas;
    }
    public Mahasiswa() {
        nim = "18090030";
        nama = "wiwin nur kholifah";
        kelas = "4B";
    }
    public String info() {
        return nim + ":" + nama + ":" +kelas;
    }
}