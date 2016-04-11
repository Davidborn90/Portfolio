/*
 * Decompiled with CFR 0_114.
 */
package portfolio;

import java.util.ArrayList;
import portfolio.Auto;

public class AutoLijst {
	private ArrayList<Auto> autolijst = new ArrayList<Auto>();

    public AutoLijst() {
        Auto aw1 = new Auto("Alien Workshop", "OGIII", 49, "images/decks/OG3.jpg");
        this.autolijst.add(aw1);
        Auto aw2 = new Auto("Alien Workshop", "Gull Cult MD", 60, "images/decks/gullcult.jpg");
        this.autolijst.add(aw2);
        Auto Element1 = new Auto("Element", "Evan NameBrand", 29, "images/decks/evanname.jpg");
        this.autolijst.add(Element1);
        Auto Element2 = new Auto("Element", "Maders Cosmonaut", 54, "images/decks/cosmonaut.jpg");
        this.autolijst.add(Element2);
        Auto Santa1 = new Auto("Santa Cruz", "Star Wars ep.7 FINN", 60, "images/decks/santafinn.jpg");
        this.autolijst.add(Santa1);
        Auto Santa2 = new Auto("Santa Cruz", "R2D2 Inlay deck", 299, "images/decks/starwarsinlay.jpg");
        this.autolijst.add(Santa2);
        Auto zero1 = new Auto("ZERO", "Disorder Green", 52, "images/decks/disordergreen.jpg");
        this.autolijst.add(zero1);
        Auto zero2 = new Auto("ZERO", "Thomas Apocalypse", 39, "images/decks/thomasapocalypse.jpg");
        this.autolijst.add(zero2);
        Auto Toy1 = new Auto("Toy Machine", "Carpenter Raygun", 45, "images/decks/carpenterray.jpg");
        this.autolijst.add(Toy1);
        Auto Toy2 = new Auto("Toy Machine", "Vice Dead", 46, "images/decks/vicedead.jpg");
        this.autolijst.add(Toy2);
        Auto planb1 = new Auto("PlanB", "Joslin Guardian P2", 65, "images/decks/joslinguardian.jpg");
        this.autolijst.add(planb1);
        Auto planb2 = new Auto("PlanB", "Way No Prisoners", 65, "images/decks/WNP.jpg");
        this.autolijst.add(planb2);
        Auto Enjoi1 = new Auto("Enjoi", "Chronic Logo Rasta", 53, "images/decks/Rasta.jpg");
        this.autolijst.add(Enjoi1);
        Auto Enjoi2 = new Auto("Enjoi", "Wieger Alley Cats", 53, "images/decks/Cats.jpg");
        this.autolijst.add(Enjoi2);
    }

    public ArrayList<Auto> getLijst() {
        return this.autolijst;
    }

    public ArrayList<String> getMerken() {
        ArrayList<String> merken = new ArrayList<String>();
        for (Auto auto : this.autolijst) {
            String merk = auto.getMerk();
            if (merken.contains(merk)) continue;
            merken.add(merk);
        }
        return merken;
    }
}