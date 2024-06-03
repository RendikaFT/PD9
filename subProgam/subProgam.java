package subProgam;
import java.io.*;

public class subProgam {
    public static int totalSPP; //variabel global (bisa dibaca disemua blok progam)
    
    public static void main(String[] args){
        BufferedReader key = new BufferedReader (new InputStreamReader (System.in));
        try {
            do {
                String nim, nama;
                int jml_semester;
            
                //Menu dengan switch case
                System.out.println("========================");
                System.out.println("       -Input Data-     ");
                System.out.println("      -Output Data-     ");
                System.out.println("         -Logout-       ");
                System.out.println("========================");
                System.out.print("Pilih Menu: ");
                int menu = Integer.parseInt(key.readLine());
                switch(menu){
                case 1: //menu1
                    System.out.print("NIM: ");
                    nim = key.readLine();
                    System.out.print("Nama: ");
                    nama = key.readLine();
                    System.out.print("Semester Yang Sudah Ditempuh: ");
                    jml_semester = Integer.parseInt(key.readLine());
                    // cara call fungtion
                    totalSPP(jml_semester);
                    System.out.println("Total SPP: " + totalSPP(jml_semester));
                    break;
                case 2: //menu2
                    break;
                default: //else
                    System.exit(0); //perintah keluar progam
                }
            } while(true);
            
            
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }   
    }
     //membuat fungsi 
    static public int totalSPP(int smt){//int smt --> parameter
        //nilai yang dikembalikan = variabel total SPP
        totalSPP = smt * 15000000;
        return totalSPP;
    }
    static public void cetakData(){
    }
}
