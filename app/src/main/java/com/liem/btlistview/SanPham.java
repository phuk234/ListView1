package com.liem.btlistview;

public class SanPham {
    private String tenSP;
    private double giaSP;
    private int hinh;

    public SanPham(String tenSP, double giaSP, int hinh) {
        this.tenSP = tenSP;
        this.giaSP = giaSP;
        this.hinh = hinh;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "tenSP='" + tenSP + '\'' +
                ", giaSP=" + giaSP +
                ", hinh=" + hinh +
                '}';
    }
}
