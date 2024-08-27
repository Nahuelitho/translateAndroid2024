package com.softnahu.translate2024;

import java.io.Serializable;

public class Palabras {
    private String palabraEspañol;
    private String palabraIngles;
    private int imgId;

    public Palabras(String palabraEspañol, String palabraIngles, int imgId) {
        this.palabraEspañol = palabraEspañol;
        this.palabraIngles = palabraIngles;
        this.imgId = imgId;
    }

    public String getPalabraEspañol() {
        return palabraEspañol;
    }

    public void setPalabraEspañol(String palabraEspañol) {
        this.palabraEspañol = palabraEspañol;
    }

    public String getPalabraIngles() {
        return palabraIngles;
    }

    public void setPalabraIngles(String palabraIngles) {
        this.palabraIngles = palabraIngles;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
