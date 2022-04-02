package assignment7;

import javafx.scene.control.*;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class DanhSach {
    public TextField tensp,gia,dvi,slg;
    public Text tieude,tbao;
    public ArrayList<SanPham> danhsachsp = new ArrayList<SanPham>();
    public Button qlai,xemds;
    public TextArea name,price,unit,num;

    public void nhapsp(){
        try {
            danhsachsp.add(new SanPham(tensp.getText(),dvi.getText(),Double.parseDouble(gia.getText()),Integer.parseInt(slg.getText())));
            tbao.setFill(Paint.valueOf("BLUE"));
            tbao.setText("Thêm thành công");
            tbao.setVisible(true);
            tensp.setText("");
            gia.setText("");
            dvi.setText("");
            slg.setText("");
        }catch (Exception e){
            tbao.setVisible(true);
            tbao.setFill(Paint.valueOf("RED"));
            tbao.setText(e.getMessage());
        }

    }

    public void quaylai(){
        qlai.setVisible(false);
        name.setVisible(false);
        price.setVisible(false);
        unit.setVisible(false);
        num.setVisible(false);
        xemds.setDisable(false);
        name.setText("       Tên sản phẩm");
        price.setText("          Giá");
        unit.setText("    Đơn vị");
        num.setText(" Số lượng");
    }

    public String cotTen(){
        String s=name.getText();
        for (SanPham sp:danhsachsp){
            s += "\n_______________________\n" + sp.getTensp();
        }
        return s;
    }

    public String cotGia(){
        String s=price.getText();
        for (SanPham sp:danhsachsp){
            s += "\n________________\n" + sp.getGia();
        }
        return s;
    }

    public String cotDvi(){
        String s=unit.getText();
        for (SanPham sp:danhsachsp){
            s += "\n____________\n" + sp.getDvi();
        }
        return s;
    }

    public String cotSlg(){
        String s=num.getText();
        for (SanPham sp:danhsachsp){
            s += "\n__________\n" + sp.getSlg();
        }
        return s;
    }

    public void xemds(){
        name.setText(cotTen());
        price.setText(cotGia());
        unit.setText(cotDvi());
        num.setText(cotSlg());
        tbao.setVisible(false);
        name.setVisible(true);
        price.setVisible(true);
        unit.setVisible(true);
        num.setVisible(true);
        qlai.setVisible(true);
        xemds.setDisable(true);
    }
}
