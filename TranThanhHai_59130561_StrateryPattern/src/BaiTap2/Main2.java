/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Main2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HangHoa hH1 = new HangHoa("Ram 8GB", 900000, "Gia TB, Dung luong TB");
        HangHoa hH2 = new HangHoa("Ram 4GB", 500000, "Gia thap, dung luong thap");
        HangHoa hH3 = new HangHoa("ram 16GB", 1900000, "Gia cao, dung luong cao");
        HangHoa hH4 = new HangHoa("Ram 32GB", 3900000, "Gia rat cao, dung luong rat cao");
        
        GioHang gH1 = new GioHang();
        gH1.setHinhThucTT(new ThanhToanCOD());
        
        ArrayList <HangHoa> dS1 = new ArrayList<>();
        dS1.add(hH4);
        dS1.add(hH1);
        
        GioHang gH2 = new GioHang();
        gH2.setHinhThucTT(new ThanhToanOnline());
        
        ArrayList <HangHoa> dS2 = new ArrayList<>();
        dS2.add(hH3);
        dS2.add(hH2);
        
        
    }
}
