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
        for(int i = 0; i < dsSV.size(); i++){
            for(int j = i + 1; j <= dsSV.size()-1; j++)
                if(iSoSanh.soSanh(dsSV.get(i),dsSV.get(j)) == 1){
                    temp = dsSV.get(i);
                    dsSV.set(i,dsSV.get(j));
                    dsSV.set(j,temp);
                }
        }
    }
}
