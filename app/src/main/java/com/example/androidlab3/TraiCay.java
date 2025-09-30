package com.example.androidlab3;

public class TraiCay {
    private String ten;
    private String mota;
    private int hinh; // resource id (R.drawable.*)

    public TraiCay(String ten, String mota, int hinh) {
        this.ten = ten;
        this.mota = mota;
        this.hinh = hinh;
    }

    public String getTen() { return ten; }
    public void setTen(String ten) { this.ten = ten; }

    public String getMota() { return mota; }
    public void setMota(String mota) { this.mota = mota; }

    public int getHinh() { return hinh; }
    public void setHinh(int hinh) { this.hinh = hinh; }
}
