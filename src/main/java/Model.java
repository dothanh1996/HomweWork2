import java.io.*;
import java.util.*;

/**
 * Created by Do Thanh on 9/26/2016.
 */
public class Model {
    Scanner nhap = new Scanner(System.in);
    Emtity objEmtity = new Emtity();

    public void timkiem(List<Emtity> list, int opt) {
        switch (opt) {
            case 1: {
                List<Emtity> listtemp = new ArrayList<Emtity>();
                double tong, temp;
                System.out.println("Tổng điểm cần tìm kiếm:");
                temp = nhap.nextDouble();
                for (int i = 0; i < list.size(); i++) {
                    tong = list.get(i).getDiemtoan() + list.get(i).getDiemly() + list.get(i).getDiemhoa();
                    if (tong == temp) {
                        list.get(i).in();
                        listtemp.add(list.get(i));
                    }
                    WriteFile(listtemp, "Timkiemtongdiem.dat");
                }
            }
            break;
            case 2: {
                List<Emtity> listtemp = new ArrayList<Emtity>();
                String temp;
                System.out.println("Nhập số báo danh cần tìm:");
                temp = nhap.nextLine();
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getSBD().equals(temp)) {
                        list.get(i).in();
                        listtemp.add(list.get(i));
                    }
                    WriteFile(list, "TimkiemSBD.dat");
                }
            }
            break;
            case 3: {
                List<Emtity> listtemp = new ArrayList<Emtity>();
                String temp;
                System.out.println("Nhập vào họ tên cần tìm:");
                temp = nhap.nextLine();
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getHoten().equals(temp)) {
                        list.get(i).in();
                        listtemp.add(list.get(i));
                    }
                    WriteFile(list, "Timkiemhoten.dat");
                }
            }
            break;
            case 4: {
                List<Emtity> listtemp = new ArrayList<Emtity>();
                double temp;
                System.out.println("Nhập vào điểm toán cần tìm:");
                temp = Double.parseDouble(nhap.nextLine());
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getDiemtoan() == temp) {
                        list.get(i).in();
                        listtemp.add(list.get(i));
                    }
                    WriteFile(list, "Timkiemdiemtoan.dat");
                }
            }
            break;
            case 5: {
                List<Emtity> listtemp = new ArrayList<Emtity>();
                double temp;
                System.out.println("Nhập vào điểm hóa cần tìm:");
                temp = Double.parseDouble(nhap.nextLine());
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getDiemhoa() == temp) {
                        list.get(i).in();
                        listtemp.add(list.get(i));
                    }
                    WriteFile(list, "Timkiemdiemhoa.dat");
                }
            }
            break;
            case 6: {
                List<Emtity> listtemp = new ArrayList<Emtity>();
                double temp;
                System.out.println("Nhập vào điểm lý cần tìm:");
                temp = Double.parseDouble(nhap.nextLine());
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getDiemly() == temp) {
                        list.get(i).in();
                        listtemp.add(list.get(i));
                    }
                    WriteFile(list, "Timkiemdiemly.dat");
                }
            }
            break;
        }
    }

    public void themsuaxoa(List<Emtity> list, int opt) {
        switch (opt) {
            case 1: {
                Emtity hom = new Emtity();
                hom.Nhap();
                list.add(hom);
            }
            break;
            case 3: {
                String temp;
                System.out.println("Nhập số báo danh học sinh cần xóa: ");
                temp = nhap.nextLine();
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getSBD().equals(temp)) {
                        list.remove(i);
                    }
                }
                for (int i = 0; i < list.size(); i++) {
                    WriteFile(list, "Sinhvien.dat");
                }
            }
            break;

            case 2: {
                String temp;
                Emtity hom = new Emtity();
                System.out.println("Nhập số báo danh học sinh cần sửa: ");
                temp = nhap.nextLine();
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getSBD().equals(temp)) {
                        list.remove(i);
                        System.out.println("Nhập thông tin học sinh cần sửa:");
                        hom.Nhap();
                        list.add(hom);
                        File file = new File("Sinhvien.dat");
                        WriteFile(list, "Sinhvien.dat");
                    }
                }
            }
            break;
        }
    }

    public List<Emtity> sapxep(List<Emtity> list, int opt) {
        switch (opt) {
            case 1: {
                Collections.sort(list, new Comparator<Emtity>() {
                    public int compare(Emtity o1, Emtity o2) {
                        return (o1.getSBD().compareTo(o2.getSBD()));
                    }
                });
            }
            break;
            case 2: {
                Collections.sort(list, new Comparator<Emtity>() {
                    public int compare(Emtity o1, Emtity o2) {
                        if ((o1.getDiemtoan() + o1.getDiemly() + o1.getDiemhoa()) < (o2.getDiemtoan() + o2.getDiemly() + o2.getDiemhoa())) {
                            return -1;
                        } else {
                            if ((o1.getDiemtoan() + o1.getDiemly() + o1.getDiemhoa()) == (o2.getDiemtoan() + o2.getDiemly() + o2.getDiemhoa())) {
                                return 0;
                            } else {
                                return 1;
                            }
                        }
                    }
                });
            }
            break;
            case 3: {
                Collections.sort(list, new Comparator<Emtity>() {
                    public int compare(Emtity o1, Emtity o2) {
                        return (o1.getHoten().compareTo(o2.getHoten()));
                    }
                });
            }
            break;

        }
        return list;
    }

    public List<Emtity> Kiemtra(List<Emtity> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSBD() == null)
                list.remove(i);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).getSBD() == list.get(j).getSBD())
                    list.remove(j);
            }
        }
        return list;
    }

    public void Thongke(List<Emtity> list) {
        System.out.println("Tổng số học sinh la :" + list.size());
        double tong;
        System.out.println("Danh sach hoc sinh duoi 15 diem:");
        for (int i = 0; i < list.size(); i++) {
            tong = list.get(i).getDiemtoan() + list.get(i).getDiemly() + list.get(i).getDiemhoa();
            if (tong < 15)
                list.get(i).in();
        }

        System.out.println("Danh sach hoc sinh tu 15 đến 25 điểm:");
        for (int i = 0; i < list.size(); i++) {
            tong = list.get(i).getDiemtoan() + list.get(i).getDiemly() + list.get(i).getDiemhoa();
            if ((tong >= 15) && (tong <= 25))
                list.get(i).in();
        }

        System.out.println("Danh sach hoc sinh tren 25 diem:");
        for (int i = 0; i < list.size(); i++) {
            tong = list.get(i).getDiemtoan() + list.get(i).getDiemly() + list.get(i).getDiemhoa();
            if (tong > 25)
                list.get(i).in();
        }

    }

    public void WriteFile(List<Emtity> list, String filename) {
        File file = new File(filename);
        try {
            FileOutputStream f = new FileOutputStream(file);
            ObjectOutputStream oOT = new ObjectOutputStream(f);
            oOT.writeObject(list);
            oOT.close();
            f.close();
        } catch (IOException e) {
            System.out.println("Có lỗi xảy ra!");
        }
    }

    public List<Emtity> ReadFile(String filename) {
        List<Emtity> list = new ArrayList<Emtity>();
        try {
            FileInputStream f = new FileInputStream(new File(filename));
            ObjectInputStream oIT = new ObjectInputStream(f);
            list = (List<Emtity>) oIT.readObject();
            oIT.close();
            f.close();
        } catch (IOException io) {
            System.out.println("Có lỗi xảy ra!");
        } catch (ClassNotFoundException ex) {
            System.out.println("Không tìm thấy class");
        }
        return list;
    }

    public void Nhapnpt(List<Emtity> list) {
        int n;
        System.out.println("Số học sinh cần nhập: ");
        n = Integer.parseInt(nhap.nextLine());
        for (int i = 0; i < n; i++) {
            objEmtity = new Emtity();
            System.out.println("Nhập vào thông tin sinh viên thứ " + (i + 1) + ": ");
            objEmtity.Nhap();
            list.add(objEmtity);
            WriteFile(list, "Sinhvien.dat");
        }
    }

    public void Innpt(List<Emtity> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).in();
        }
    }
}
