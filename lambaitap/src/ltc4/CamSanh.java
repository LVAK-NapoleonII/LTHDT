package ltc4;

public class CamSanh extends QuaCam{
    private String tinhTrang;

    public CamSanh() {
        super();
    }

    public CamSanh(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
}
