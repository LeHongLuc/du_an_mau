package com.example.luclhph12819.model;

public class TheLoai {
    private String MaTheLoai;
    private String TenTheLoai;
    private String MoTa;
    private int ViTri;

    public TheLoai() {
    }

    public TheLoai(String maTheLoai, String tenTheLoai, String moTa, int viTri) {
        MaTheLoai = maTheLoai;
        TenTheLoai = tenTheLoai;
        MoTa = moTa;
        ViTri = viTri;
    }

    public String getMaTheLoai() {
        return MaTheLoai;
    }

    public void setMaTheLoai(String maTheLoai) {
        MaTheLoai = maTheLoai;
    }

    public String getTenTheLoai() {
        return TenTheLoai;
    }

    public void setTenTheLoai(String tenTheLoai) {
        TenTheLoai = tenTheLoai;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public int getViTri() {
        return ViTri;
    }

    public void setViTri(int viTri) {
        ViTri = viTri;
    }

    @Override
    public String toString() {
        return "TheLoai{" +
                "MaTheLoai='" + MaTheLoai + '\'' +
                ", TenTheLoai='" + TenTheLoai + '\'' +
                ", MoTa='" + MoTa + '\'' +
                ", ViTri=" + ViTri +
                '}';
    }
}
