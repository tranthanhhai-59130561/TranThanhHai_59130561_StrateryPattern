/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BapTap1;

/**
 *
 * @author Admin
 */
public class context {
    ITinh tinhToan;
    public context()
    {}
    
    public void setTinhToan(ITinh tinhToan)
    {
        this.tinhToan = tinhToan;
    }
    
    public float ferformTinh(float a, float b)
    {
        return tinhToan.tinh(a, b);
    }
}
