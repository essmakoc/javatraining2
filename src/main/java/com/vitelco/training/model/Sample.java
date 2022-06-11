package com.vitelco.training.model;

public class Sample {

    private String x;
    private String tel;

    public Sample(String x, String tel) {
        this.setX(x);
        this.setTel(tel);
    }


    public String getX() {
        return "" + x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        if (tel.startsWith("+90")){
            this.tel = tel.replace("+90", "");
        } else if (tel.startsWith("90")) {
            this.tel = tel.replace("90", "");
        } else {
            this.tel = tel;
        }
    }

    @Override
    public String toString() {
        return "Sample{" +
                "x='" + x + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
