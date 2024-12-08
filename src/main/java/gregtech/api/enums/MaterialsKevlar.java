package gregtech.api.enums;

import java.util.Arrays;

import gregtech.api.objects.MaterialStack;

public class MaterialsKevlar {








    public static Materials TerephthaloylChloride = new MaterialBuilder(
        782,
        TextureSet.SET_POWDER,
        "Terephthaloyl Chloride").setName("TerephthaloylChloride")
            .addDustItems()
            .setRGB(0, 255, 12)
            .setColor(Dyes.dyeGreen)
            .setMeltingPoint(355)
            .setMaterialList(
                new MaterialStack(Materials.Carbon, 8),
                new MaterialStack(Materials.Hydrogen, 4),
                new MaterialStack(Materials.Chlorine, 2),
                new MaterialStack(Materials.Oxygen, 2))
            .setAspects(
                Arrays.asList(
                    new TCAspects.TC_AspectStack(TCAspects.TERRA, 1),
                    new TCAspects.TC_AspectStack(TCAspects.VITREUS, 1)))
            .constructMaterial(); // C8H4Cl2O2
    public static Materials IVNitroaniline = new MaterialBuilder(780, TextureSet.SET_FLUID, "Nitroaniline")
        .setName("4Nitroaniline")
        .addCell()
        .addFluid()
        .setRGB(255, 135, 51)
        .setColor(Dyes.dyeOrange)
        .setMeltingPoint(420)
        .setMaterialList(
            new MaterialStack(Materials.Carbon, 6),
            new MaterialStack(Materials.Hydrogen, 6),
            new MaterialStack(Materials.Nitrogen, 2),
            new MaterialStack(Materials.Oxygen, 2))
        .setAspects(
            Arrays.asList(
                new TCAspects.TC_AspectStack(TCAspects.TERRA, 1),
                new TCAspects.TC_AspectStack(TCAspects.VITREUS, 1)))
        .constructMaterial(); // C6H6N2O2
    public static Materials ParaPhenylenediamine = new MaterialBuilder(
        779,
        TextureSet.SET_POWDER,
        "Phenylenediamine").setName("pPhenylenediamine")
            .addDustItems()
            .setRGB(251, 236, 93)
            .setColor(Dyes.dyeYellow)
            .setMeltingPoint(293)
            .setMaterialList(
                new MaterialStack(Materials.Carbon, 6),
                new MaterialStack(Materials.Hydrogen, 8),
                new MaterialStack(Materials.Nitrogen, 2))
            .setAspects(
                Arrays.asList(
                    new TCAspects.TC_AspectStack(TCAspects.TERRA, 1),
                    new TCAspects.TC_AspectStack(TCAspects.VITREUS, 1)))
            .constructMaterial(); // C6H6N2

    public static Materials CalciumCarbide = new MaterialBuilder(775, TextureSet.SET_DULL, "Calcium Carbide")
        .setName("CacliumCarbide")
        .addDustItems()
        .setRGB(235, 235, 235)
        .setColor(Dyes.dyeGray)
        .setMeltingPoint(2430)
        .setMaterialList(new MaterialStack(Materials.Calcium, 1), new MaterialStack(Materials.Carbon, 2))
        .constructMaterial(); // CaC2
    public static Materials LiquidCrystalKevlar = new MaterialBuilder(
        774,
        TextureSet.SET_FLUID,
        "Liquid Crystal Kevlar").setName("LiquidCrystalKevlar")
            .addCell()
            .addFluid()
            .setRGB(240, 240, 120)
            .setColor(Dyes.dyeYellow)
            .constructMaterial(); // [-CO-C6H4-CO-NH-C6H4-NH-]n




    public static Materials Kevlar = new MaterialBuilder(765, TextureSet.SET_DULL, "Kevlar").setName("Kevlar")
        .addDustItems()
        .addMetalItems()
        .addGearItems()
        .setRGB(240, 240, 120)
        .setColor(Dyes.dyeYellow)
        .constructMaterial();
    public static Materials TerephthalicAcid = new MaterialBuilder(764, TextureSet.SET_FLUID, "Terephthalic Acid")
        .setName("TerephthalicAcid")
        .addCell()
        .addFluid()
        .setRGB(255, 255, 255)
        .setColor(Dyes.dyeWhite)
        .setMeltingPoint(480)
        .setMaterialList(
            new MaterialStack(Materials.Carbon, 8L),
            new MaterialStack(Materials.Hydrogen, 6),
            new MaterialStack(Materials.Oxygen, 4))
        .constructMaterial(); // C9H6O6
    public static Materials NaphthenicAcid = new MaterialBuilder(760, TextureSet.SET_FLUID, "Naphthenic Acid")
        .setName("NaphthenicAcid")
        .addCell()
        .addFluid()
        .setRGB(255, 255, 255)
        .setColor(Dyes.dyeWhite)
        .setFuelType(MaterialBuilder.SEMIFLUID)
        .setFuelPower(80)
        .constructMaterial();
    public static Materials RhodiumChloride = new MaterialBuilder(754, TextureSet.SET_POWDER, "Rhodium Chloride")
        .setName("RhodiumChloride")
        .addDustItems()
        .setRGB(128, 0, 0)
        .setColor(Dyes.dyeRed)
        .setMeltingPoint(723)
        .constructMaterial(); // RHCL3
    public static Materials Triphenylphosphene = new MaterialBuilder(753, TextureSet.SET_POWDER, "Triphenylphosphine")
        .setName("Triphenylphosphene")
        .addDustItems()
        .setRGB(255, 255, 255)
        .setColor(Dyes.dyeWhite)
        .setMeltingPoint(353)
        .setMaterialList(
            new MaterialStack(Materials.Carbon, 18L),
            new MaterialStack(Materials.Hydrogen, 15L),
            new MaterialStack(Materials.Phosphorus, 1L))
        .constructMaterial(); // C18H15P
    public static Materials PhosphorusTrichloride = new MaterialBuilder(
        752,
        TextureSet.SET_FLUID,
        "Phosphorus Trichloride").setName("PhosphorusTrichloride")
            .addCell()
            .addFluid()
            .setRGB(255, 255, 255)
            .setColor(Dyes.dyeWhite)
            .setMeltingPoint(179)
            .setMaterialList(new MaterialStack(Materials.Phosphorus, 1L), new MaterialStack(Materials.Chlorine, 3L))
            .constructMaterial(); // PCL3
    public static Materials SodiumHydride = new MaterialBuilder(751, TextureSet.SET_POWDER, "Sodium Hydride")
        .setName("SodiumHydride")
        .addDustItems()
        .setRGB(192, 192, 192)
        .setColor(Dyes.dyeLightGray)
        .setMeltingPoint(911)
        .setMaterialList(new MaterialStack(Materials.Sodium, 1L), new MaterialStack(Materials.Hydrogen, 1L))
        .constructMaterial(); // NaH
    public static Materials TrimethylBorate = new MaterialBuilder(750, TextureSet.SET_FLUID, "Trimethyl Borate")
        .setName("TrimethylBorate")
        .addCell()
        .addFluid()
        .setRGB(255, 255, 255)
        .setColor(Dyes.dyeWhite)
        .setMeltingPoint(239)
        .setMaterialList(
            new MaterialStack(Materials.Carbon, 3L),
            new MaterialStack(Materials.Hydrogen, 9L),
            new MaterialStack(Materials.Boron, 1L),
            new MaterialStack(Materials.Oxygen, 3L))
        .constructMaterial(); // C3H9BO3
    public static Materials SodiumMethoxide = new MaterialBuilder(749, TextureSet.SET_POWDER, "Sodium Methoxide")
        .setName("SodiumMethoxide")
        .addDustItems()
        .setRGB(255, 255, 255)
        .setColor(Dyes.dyeWhite)
        .setMeltingPoint(400)
        .setMaterialList(
            new MaterialStack(Materials.Carbon, 1L),
            new MaterialStack(Materials.Hydrogen, 3L),
            new MaterialStack(Materials.Oxygen, 1L),
            new MaterialStack(Materials.Sodium, 1L))
        .constructMaterial(); // CH3NaO

    // H3RhCl6

    /**
     * This method is called by Materials. It can be safely called multiple times.
     * It exists to allow Materials ensure this class is initialized.
     */
    public static void init() {
        // no-op. all work is done by <clinit>
    }
}
