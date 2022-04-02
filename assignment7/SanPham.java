package assignment7;

public class SanPham {
    public String tensp,dvi;
    public Double gia;
    public Integer slg;

    public SanPham(String tensp, String dvi, Double gia, Integer slg) {
        this.tensp = tensp;
        this.dvi = dvi;
        this.gia = gia;
        this.slg = slg;
    }

    public SanPham() {
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getDvi() {
        return dvi;
    }

    public void setDvi(String dvi) {
        this.dvi = dvi;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public Integer getSlg() {
        return slg;
    }

    public void setSlg(Integer slg) {
        this.slg = slg;
    }
}
