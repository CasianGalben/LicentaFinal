package com.casian.aplicatiefinala;

public class Intrebare {
    private int intrebareText;
    private Boolean raspunsIntrebare;
    public Intrebare(int intrebareText, Boolean raspunsIntrebare) {
        this.intrebareText = intrebareText;
        this.raspunsIntrebare = raspunsIntrebare;
    }
    public int getIntrebareText() {
        return intrebareText;
    }
    public Boolean getRaspunsIntrebare() {
        return raspunsIntrebare;
    }
    public void setIntrebareText(int intrebareText) {
        this.intrebareText = intrebareText;
    }
    public void setRaspunsIntrebare(Boolean raspunsIntrebare) {
        this.raspunsIntrebare = raspunsIntrebare;
    }
}
