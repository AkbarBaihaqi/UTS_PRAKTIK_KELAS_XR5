package tugaspraktikum;

import java.util.Scanner;

public class TugasPraktikum {
    public static void main(String[] args) {
        System.out.println("Identitas: Akbar Baihaqi Putra Aji Pratama/X RPL 5/04");
        
        int a, b, c, e, f, g, h;//Harga, uang yang diberikan, kembalian, jumlah, harga total, harga sudah diskon, harga diskon
        String d;
        
        Scanner kasir = new Scanner(System.in);
        
        System.out.print("Nama barang: ");
        d = kasir.next();
        
        System.out.print("Harga satuan: ");
        a = kasir.nextInt();
        
        System.out.print("Jumlah pembelian: ");
        e = kasir.nextInt();
        
        f = a * e;
        
        System.out.println("=============================");
        System.out.println("\nNama barang: "+d);
        System.out.println("Harga satuan: Rp."+a);
        System.out.println("Jumlah pembelian: "+e);
        System.out.println("Harga keseluruhan: Rp."+f);
        
         if (f > 500000){
            h = f/100*50; 
            g = f-h;  
            System.out.println("Kode barang: 10024315");
            System.out.println("Diskon: 50%");
            System.out.println("Harga Diskon: "+h);
            System.out.println("Harga total: Rp."+g);
           
        }
        else if (f > 200000){
            h = f/100*20; 
            g = f-h; 
            System.out.println("Kode barang: 20024315");
             System.out.println("Diskon: 20%");
             System.out.println("Harga Diskon: "+h);
            System.out.println("Harga total: Rp."+g);
        }
        else if (f > 100000){
            System.out.println("Kode barang: 50024315");
            h = f/100*10; 
            g = f-h;
            System.out.println("Diskon: 10%");
            System.out.println("Harga Diskon: "+h);
            System.out.println("Harga total: Rp."+g);
        }
        else {
            System.out.println("Kode barang: 10024315");
            System.out.println("Diskon: 0%");
            g = f;
            System.out.println("Harga Total: Rp."+g);
        }
         
         System.out.print("\nUang yang diberikan: ");
         b = kasir.nextInt();
         
         c =(b-g);
         System.out.println("Kembalian: Rp."+c);
         
         System.out.println("\nNama kasir: Akbar Baihaqi Putra Aji Pratama");
         
         System.out.println("\n=============================");
              
    }
    
}
