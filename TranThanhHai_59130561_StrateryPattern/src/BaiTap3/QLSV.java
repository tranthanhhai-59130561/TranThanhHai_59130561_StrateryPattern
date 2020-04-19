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
    
    public void sapXep()
    {
        SinhVien temp ;
        int i, j;
        for(i = 0; i < dsSV.size(); i++){
            for(j = i + 1; j <= dsSV.size()-1; j++)
                if(iSoSanh.soSanh(dsSV.get(i),dsSV.get(j)) == 1){
                    temp = dsSV.get(i);
                    dsSV.set(i,dsSV.get(j));
                    dsSV.set(j,temp);
                }
        }
    }
    
    public void inDS()
    {   
        int i;
        for(i=0; i<dsSV.size(); i++)
        {
            SinhVien sv = dsSV.get(i);
            System.out.println(i+1 + ". Ho ten: " + sv.getHoTen() + ", Ngay sinh: " + sv.getNgaySinh() + 
                                ", Diem TB: " + sv.getDiemTB());
        }
    }
}
