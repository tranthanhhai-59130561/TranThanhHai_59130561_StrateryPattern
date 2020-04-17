/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author Admin
 */
public class HangHoa {
    String tenHH;
    int gia;
    String moTa;
    
    public HangHoa(String tenHH, int gia, String moTa)
    {
        this.gia = gia;
        this.moTa = moTa;
        this.tenHH = tenHH;
    }
    
    public String getTenHH()
    {
        return tenHH;
    }
    
    public int getGia()
    {
        return gia;
    }
    
    public String getMoTa()
    {
        return moTa;
    }
    
}
