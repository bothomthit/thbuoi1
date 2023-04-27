
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Menu {
  public Scanner scanner;
   private  Vehicle vehicle;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    public Menu(Scanner scanner) {
        this.scanner = scanner;
         vehicle = new Vehicle();
    }

   

    public Menu(Vehicle Vehicle) {
        this.vehicle = Vehicle;
         this.scanner = new Scanner(System.in);
    }

    public Menu() {
    
    }
     private void nhapThongTin() {

        System.out.print("NHẬP TEN CHU XE: ");
        String tenChuXe = scanner.nextLine();
        System.out.print("NHẬP LOAI XE: ");
        String loaiXe = scanner.nextLine();
        System.out.print("NHẬP DUNG TICHS XE: ");
        int dungTich = scanner.nextInt();
        scanner.nextLine();
        System.out.print("NHẬP GIÁ XE: ");
        double triGia = scanner.nextDouble();
        System.out.print("THUE XE LA: ");
        double thuePhaiNop = scanner.nextDouble();
        scanner.nextLine();
        
     Vehicle vehicle = new Vehicle(tenChuXe,loaiXe,dungTich,triGia,thuePhaiNop);
Vehicle.nhapThongTin(vehicle);
     }
   public void showThue(){
        System.out.print("THUE XE LA: ");
        double thuePhaiNop = scanner.nextDouble();
        scanner.nextLine();
   }  
      public void displayMenu() {
        int choice = 0;
        do {
            System.out.println("=== ===");
            System.out.println("1. THÊM SẢN PHẨM VÀO KHO");
            System.out.println("2. XÓA SẢN PHẨM");
            System.out.println("3. THOAT");
            switch (choice) {
                case 1 ->
                    nhapThongTin();
                case 2 ->
                    showThue();
                case 3 ->
                    System.out.println("get out");   }
    }
    

