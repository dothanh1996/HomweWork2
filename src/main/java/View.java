import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Do Thanh on 9/26/2016.
 */
public class View {
    public static void main(String[] args) {
        Controller objCon = new Controller();
        Menu objMenu = new Menu();
        int opt, n, chon;
        List<Emtity> listSV = new ArrayList<Emtity>();
        Scanner nhap = new Scanner(System.in);
        do {
            do {
                objMenu.Menu0();
                opt = Integer.parseInt(nhap.nextLine());
                if (opt < 1 || opt > 6)
                    System.out.println("Chọn sai!!!");
            } while (opt < 1 || opt > 6);
            switch (opt) {
                case 1: {
                    do {
                        do {
                            objMenu.Menu1();
                            chon = Integer.parseInt(nhap.nextLine());
                            if (chon > 3 || chon < 1)
                                System.out.println("Chọn sai!!!");
                        } while (chon > 3 || chon < 1);
                        switch (chon) {
                            case 1:
                                objCon.Nhapnpt(listSV);
                                objCon.Innpt(listSV);
                                break;
                            case 2:
                                listSV = objCon.ReadFile("Sinhvien.dat");
                                objCon.Innpt(listSV);
                                break;
                            case 3:
                                break;
                        }
                    } while (chon != 3);
                }
                break;
                case 2: {
                    do {
                        do {
                            objMenu.Menu2();
                            chon = Integer.parseInt(nhap.nextLine());
                            if (chon < 1 || chon > 7)
                                System.out.println("Chọn sai!!!");
                        } while (chon < 1 || chon > 7);
                        switch (chon) {
                            case 1:
                                objCon.timkiem(listSV, 1);
                                break;
                            case 2:
                                objCon.timkiem(listSV, 2);
                                break;
                            case 3:
                                objCon.timkiem(listSV, 3);
                                break;
                            case 4:
                                objCon.timkiem(listSV, 4);
                                break;
                            case 5:
                                objCon.timkiem(listSV, 5);
                                break;
                            case 6:
                                objCon.timkiem(listSV, 6);
                                break;
                            case 7:
                                break;

                        }
                    } while (chon != 7);
                }
                break;
                case 3: {
                    do {
                        do {
                            objMenu.Menu3();
                            chon = Integer.parseInt(nhap.nextLine());
                            if (chon < 1 || chon > 4)
                                System.out.println("Chọn sai!!!");
                        } while (chon < 1 || chon > 4);
                        switch (chon) {
                            case 1:
                                objCon.sapxep(listSV, 1);
                                break;
                            case 2:
                                objCon.sapxep(listSV, 2);
                                break;
                            case 3:
                                objCon.sapxep(listSV, 3);
                                break;
                            case 4:
                                break;
                        }
                    } while (chon != 4);
                }
                break;
                case 4: {
                    do {
                        do {
                            objMenu.Menu4();
                            chon = Integer.parseInt(nhap.nextLine());
                            if (chon < 1 || chon > 4)
                                System.out.println("Chọn sai!!!");
                        } while (chon < 1 || chon > 4);
                        switch (chon) {
                            case 1:
                                objCon.themsuaxoa(listSV, 1);
                                break;
                            case 2:
                                objCon.themsuaxoa(listSV, 2);
                                break;
                            case 3:
                                objCon.themsuaxoa(listSV, 3);
                                break;
                            case 4:
                                break;
                        }
                    } while (chon != 4);
                }
                break;
                case 5:
                    listSV = objCon.Kiemtra(listSV);
                    objCon.Thongke(listSV);
                    break;
                case 6:
                    break;
            }
        } while (opt != 6);
    }
}
