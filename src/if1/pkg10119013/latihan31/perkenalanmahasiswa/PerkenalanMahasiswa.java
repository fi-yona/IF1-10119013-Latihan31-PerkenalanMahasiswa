/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan31.perkenalanmahasiswa;

/**
 *
 * @author Fiona Avila
 */

public class PerkenalanMahasiswa {
    
    String nim;
    String nama;
    
    public void perkenalanDiri(){
      System.out.println("Hello Everyone");
      System.out.println("My NIM is " + nim);
      System.out.println("My name is " + nama);
    }
    
    public static void main(String[] args) {
        //Data Mahasiswa 1
        PerkenalanMahasiswa diri1 = new PerkenalanMahasiswa();
        diri1.nim = "10119013";
        diri1.nama = "Fiona Avila Putri";
        
        //Data mahasiswa 2
        PerkenalanMahasiswa diri2 = new PerkenalanMahasiswa();
        diri2.nim = "10119000";
        diri2.nama = "Saya";
        
        //Data mahasiswa 3
        PerkenalanMahasiswa diri3 = new PerkenalanMahasiswa();
        diri3.nim = "10119001";
        diri3.nama = "Manusia";
        
        //Data mahasiswa 4
        PerkenalanMahasiswa diri4 = new PerkenalanMahasiswa();
        diri4.nim = "10119002";
        diri4.nama = "Langka";
        
        diri1.perkenalanDiri();
        System.out.println();
        diri2.perkenalanDiri();
        System.out.println();
        diri3.perkenalanDiri();
        System.out.println();
        diri4.perkenalanDiri();
    }
    
}
