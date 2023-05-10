package ltc4;

public class CamCaoPhong extends QuaCam{
    private String tinhTrang;

    public CamCaoPhong() {
        super();
    }

    public CamCaoPhong(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
}
