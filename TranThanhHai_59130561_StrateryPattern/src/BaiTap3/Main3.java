/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;
//import java.text.ParseException;
//import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
//import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
/**
 *
 * @author Admin
 */
public class Main3 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        SoSanhTheoDiem soSanhTheoDiem = new SoSanhTheoDiem();
        SoSanhTheoTen soSanhTheoTen = new SoSanhTheoTen();
         
        // tao kieu Date 
        DateFormat dateFmat = new SimpleDateFormat("dd/MM/yyyy");
        
        ArrayList<SinhVien> sv = new ArrayList<>();
        SinhVien sv1 = new SinhVien("Tran Thanh Hai", dateFmat.parse("31/03/1999"), 8.0f);
        SinhVien sv2 = new SinhVien("Nguyen Van Lam", dateFmat.parse("19/03/1998"), 7.1f);
        SinhVien sv3 = new SinhVien("Nguyen Xuan Nhan", dateFmat.parse("19/08/1998"), 9.5f);
        SinhVien sv4 = new SinhVien("Bui Van Hieu", dateFmat.parse("10/01/1996"), 5.5f);
        SinhVien sv5 = new SinhVien("Dinh Hoang Long", dateFmat.parse("08/05/2000"), 9.7f);
               
        sv.add(sv1);
        sv.add(sv2);
        sv.add(sv3);
        sv.add(sv4);
        sv.add(sv5);

        QLSV qlsv = new QLSV();
        
        // Xay dung danh sach theo ten
        qlsv.setDsSV(sv);
        qlsv.setISoSanh(soSanhTheoTen);
        qlsv.sapXep();
        System.out.println("\nDanh sach sap xep theo ho ten: ");
        qlsv.inDS();
        
        // Xay dung danh sach theo diem
        qlsv.setISoSanh(soSanhTheoDiem);
        qlsv.sapXep();
        System.out.println("\nDanh sach sap xep theo diem: ");
        qlsv.inDS();
    
    }
}
