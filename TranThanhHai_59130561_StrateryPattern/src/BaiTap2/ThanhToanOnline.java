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
public class ThanhToanOnline implements IThanhToan {

    @Override
    public double thanhToan(int tienHang) {
        if(tienHang < 1000000)
        {
            System.out.println("Khach hang duoc giam 5%: )");
            return 0.05*tienHang;
        }
        else
        {
            System.out.println("Khach hang duoc giam 7%: ");
            return 0.07*tienHang;
        }
    }       
}
