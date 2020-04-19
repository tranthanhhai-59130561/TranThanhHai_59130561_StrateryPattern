/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class QLSV {
    private ArrayList<SinhVien> dsSV;
    private ISoSanh<SinhVien> iSoSanh;
    
    public void setDsSV(ArrayList<SinhVien> dsSV)
    {
        this.dsSV = dsSV;
    }
    
    public void setISoSanh(ISoSanh<SinhVien> iSoSanh)
    {
        this.iSoSanh = iSoSanh;
    }
}
