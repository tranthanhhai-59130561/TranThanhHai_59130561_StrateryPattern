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
public class ThanhToanCOD implements IThanhToan{

    @Override
    public double thanhToan(int tienHang) {
        if(tienHang > 2000000)
        {
            System.out.println("Khach hang duoc giam 2%: ");
            return 0.02*tienHang;
        }
        else
        {
            return tienHang;
        }
    }
    
}
