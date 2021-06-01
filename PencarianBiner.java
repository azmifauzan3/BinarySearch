/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MUHAMMAD AZMI FAUZAN
 */
public class PencarianBiner {

    public static void main(String[] args){
        int data[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        
        BinarySearch daftar = new BinarySearch(data,10);
        
        int dicari = 100;
        
        System.out.println(daftar.find(dicari));
    }
}
