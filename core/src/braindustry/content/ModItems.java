package braindustry.content;

import arc.graphics.Color;
import mindustry.content.Items;
import mindustry.ctype.ContentList;
import mindustry.type.Item;

public class ModItems implements ContentList {
    static {
        Items.class.isArray();
    }

    public static Item chromium, exoticAlloy, graphenite, odinum, phaseAlloy, plastic, chloroAlloy, astroBar;

    public void load() {
        chromium = new Item("chromium") {
            {
                this.localizedName = "Chromium";
                this.description = "A very infusible resource.";
                this.hardness = 4;
                this.cost = 1;
                this.color = Color.valueOf("dededf");
            }
        };
//for next update
        astroBar = new Item("astronomical-alloy") {
            {
                this.localizedName="Astro Bar";
                this.description="This little piece of material contains power of 1 star...";
                this.cost = 1.2f;
                this.alwaysUnlocked = false;
                this.explosiveness = 0.1f;
              //  this.color = Color.valueOf("e2f723");
                this.radioactivity = 0;
                this.flammability = 0.00f;
            }
        };

        exoticAlloy = new Item("exotic-alloy") {
            {
                this.localizedName="Exo Metal";
                this.description="Heavy organic metal with high durability and low weight.";
                this.cost = 1;
                this.alwaysUnlocked = false;
                this.explosiveness = 0.02f;
                this.color = Color.valueOf("e2f723");
                this.radioactivity = 0;
                this.flammability = 0.06f;
            }
        };

        graphenite = new Item("graphenite") {
            {
                this.localizedName = "Graphenite";
                this.description = "Progressed synthetic metal with low weight.";
                this.cost = 1;
                this.alwaysUnlocked = false;
                this.color = Color.valueOf("9868AB");
                this.explosiveness = 0;
                this.radioactivity = 0;
                this.flammability = 0;
            }
        };

        odinum = new Item("odinum") {
            {
                this.localizedName="Odinum";
                this.description="A radioactive resource.";
                this.radioactivity=2;
                this.hardness=5;
                this.cost=1;
                this.color=Color.valueOf("bddedd");
            }
        };

        phaseAlloy = new Item("dense-composite") {
            {
                this.localizedName = "Dense Composite";
                this.description = "This composite material combines features of Platanium, Surge Alloy and Phase fabric.";
                this.flammability = 0;
                this.explosiveness = 0;
                this.radioactivity = 0;
                this.cost = 1.5f;
                this.color = Color.valueOf("DEC74D");
            }
        };

        plastic = new Item("plastic") {
            {
                this.localizedName="Plastic";
                this.description="A lightweight and durable material.";
                this.flammability=0;
                this.explosiveness=0;
                this.radioactivity=0.01f;
                this.cost=1.5f;
                this.color = Color.valueOf("f6bfff");
            }
        };
        chloroAlloy  = new Item("chloro-alloy") {
            {
                this.localizedName="Chlorophilum Bar";
                this.description="[green]Super light, strong and organical material.";
                this.cost = 1.5f;
                this.alwaysUnlocked = false;
                this.explosiveness = 0.7f;
                this.color = Color.valueOf("4adb9e");
                this.radioactivity = 0.94f;
                this.flammability = 0.7f;
                this.hardness= 8;
            }
        };
    }
}
