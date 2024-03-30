/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasNo1;

/**
 *
 * @author Acer
 */
public class tugasNo1 {
    public static void main(String[] args) {
        // atribut dari jafar
        Manusia jafar = new Manusia();
        jafar.nama="Muhammad Jafar Shidiq";
        jafar.umur=19;
        jafar.alamat="Probolinggo";
        //menampilkan atibut jafar
        System.out.println("Nama    : "+jafar.nama);
        System.out.println("Umur    : "+jafar.umur);
        System.out.println("Alamat  : "+jafar.alamat);
        //method dari jafar
        jafar.makan();
        jafar.tidur();
    }   
}
