import java.util.List;

/**
 * Created by Do Thanh on 9/26/2016.
 */
public class Controller {
    public Model objModel;

    public Controller() {
        objModel = new Model();
    }

    public void timkiem(List<Emtity> list, int opt) {
        objModel.timkiem(list, opt);
    }

    public void themsuaxoa(List<Emtity> list, int opt) {
        objModel.themsuaxoa(list, opt);
    }

    public List<Emtity> sapxep(List<Emtity> list, int opt) {
        return objModel.sapxep(list, opt);
    }

    public List<Emtity> Kiemtra(List<Emtity> list) {
        return objModel.Kiemtra(list);
    }

    public void Thongke(List<Emtity> list) {
        objModel.Thongke(list);
    }

    public List<Emtity> ReadFile(String filenane) {
        return objModel.ReadFile(filenane);
    }

    public void Nhapnpt(List<Emtity> list) {
        objModel.Nhapnpt(list);
    }

    public void Innpt(List<Emtity> list) {
        objModel.Innpt(list);
    }

    public void WriteFile(List<Emtity> list, String filenane) {
        objModel.WriteFile(list, filenane);
    }
}
