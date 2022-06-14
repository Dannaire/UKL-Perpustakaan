/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UKLPerpustakaan;

/**
 *
 * @author mimbu
 */
public class ListBuku {
  //pemeberian nilai pada array "listBuku" dengan tipe class Buku
    Buku[] listBuku = {
        new Buku(1, "Fisika", 30),
        new Buku(2, "Pemrograman", 25),
        new Buku(3, "Seni Budaya", 25),
        new Buku(4, "Matematika", 15),
    };
    
    //method untuk menampilkan data list buku
    public void viewBuku(){
        System.out.println("-------- List Buku --------");
        System.out.println("ID \t Judul \t\t Stok");
        for (int i = 0; i < listBuku.length; i++) {
            System.out.println(listBuku[i].getIdBuku() + " \t " +
                    listBuku[i].getJudulBuku() + " \t " +
                    listBuku[i].getStok());
        }
    }
    
    public int cariBuku(int id){
        int found = 0;
        //pencarian data berdasarkan id
        for (int i = 1; i < listBuku.length; i++) {
            if (listBuku[i].getIdBuku()== id) {
                found = i; 
                //menyimpan nilai index dari data yg ditemukan
            }
        }
        return found;        
    }
    
}
