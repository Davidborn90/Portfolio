/*
 * Decompiled with CFR 0_114.
 */
package portfolio;

import java.text.DecimalFormat;

public class Auto {
    private final String merk;
    private final String type;
    private final int prijs;
    private final String fotourl;

    public Auto(String merk, String type, int prijs, String fotourl) {
        this.merk = merk;
        this.type = type;
        this.prijs = prijs;
        this.fotourl = fotourl;
    }

    public String getMerk() {
        return this.merk;
    }

    public String getType() {
        return this.type;
    }

    public int getPrijs() {
        return this.prijs;
    }

    public String getFoto() {
        return this.fotourl;
    }

    public String getPrijsFormat() {
        DecimalFormat df = new DecimalFormat("#,##0.--");
        double prijs = this.getPrijs();
        String sPrijs = df.format(prijs);
        return sPrijs;
    }
}