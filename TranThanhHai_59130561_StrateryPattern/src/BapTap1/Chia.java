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
public class Chia implements ITinh{

    @Override
    public float tinh(float a, float b) {
        if  (b == 0)
            {
                System.out.println("Khong chia duoc");
            }
        else            
            {
                System.out.println("Ket qua la: ");
            }
        return a/b;
    }
}       

