import java.io.Serializable;
import java.util.Scanner;

/**
 * Created by Do Thanh on 9/26/2016.
 */
public class Emtity implements Serializable {
    private String hoten;
    private String SBD;
    private String diachi;
    private int test;
    private String gioitinh;
    private double diemtoan;
    private double diemhoa;
    private double diemly;

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getSBD() {
        return SBD;
    }

    public void setSBD(String SBD) {
        this.SBD = SBD;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public double getDiemtoan() {
        return diemtoan;
    }

    public void setDiemtoan(double diemtoan) {
        this.diemtoan = diemtoan;
    }

    public double getDiemhoa() {
        return diemhoa;
    }

    public void setDiemhoa(double diemhoa) {
        this.diemhoa = diemhoa;
    }

    public double getDiemly() {
        return diemly;
    }

    public void setDiemly(double diemly) {
        this.diemly = diemly;
    }

    public void Nhap() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập vào tên sinh viên: ");
        setHoten(nhap.nextLine());
        System.out.println("Nhập vào số báo danh của sinh viên: ");
        setSBD(nhap.nextLine());
        System.out.println("Nhập vào địa chỉ của sinh viên: ");
        setDiachi(nhap.nextLine());
        do {
            System.out.println("Chọn giới tính học sinh: ");
            System.out.println("1.Nam");
            System.out.println("2.Nữ");
            System.out.print("Ban chọn:");
            test = Integer.parseInt(nhap.nextLine());
            if (test > 2 || test < 1)
                System.out.println("Chọn sai");
        } while (test > 2 || test < 1);
        if (test == 1)
            gioitinh = "Nam";
        else
            gioitinh = "Nữ";
        System.out.println("Nhập điểm thi môn toán: ");
        diemtoan = nhap.nextDouble();
        System.out.println("Nhập điểm thi môn lý: ");
        diemly = nhap.nextDouble();
        System.out.println("Nhập điểm thi môn hóa: ");
        diemhoa = nhap.nextDouble();
    }

    public void in() {
        System.out.println("Thông tin sinh viên: ");
        Emtity objEm = new Emtity();
        System.out.println("Họ và tên: " + hoten);
        System.out.println("SBD: " + SBD);
        System.out.println("Địa chỉ: " + diachi);
        System.out.println("Giới tính: " + gioitinh);
        System.out.println("Điểm toán: " + diemtoan);
        System.out.println("Điểm lý: " + diemly);
        System.out.println("Điểm hóa: " + diemhoa);

    }

}
