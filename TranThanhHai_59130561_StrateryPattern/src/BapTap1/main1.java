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
public class main1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        context ct = new context();
        
        ct.setTinhToan(new Cong());
        System.out.println("75 + 2 =" + ct.tinh(75, 2));
        ct.setTinhToan(new Tru());
        System.out.println("54 - 78 =" + ct.tinh(54, 78));
        //ct.setTinhToan(new Nhan());
        //ct.setTinhToan(new Chia());
    }
}
