package gregtech.loaders.postload.chains;

import static gregtech.api.recipe.RecipeMaps.fluidSolidifierRecipes;
import static gregtech.api.recipe.RecipeMaps.multiblockChemicalReactorRecipes;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;
import static gregtech.api.util.GTRecipeConstants.CHEMPLANT_CASING_TIER;
import static gtPlusPlus.api.recipe.GTPPRecipeMaps.chemicalPlantRecipes;

import bartworks.system.material.WerkstoffLoader;
import gregtech.api.enums.GTValues;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.MaterialsKevlar;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.enums.TierEU;
import gregtech.api.util.GTOreDictUnificator;
import gregtech.api.util.GTUtility;
import gtPlusPlus.core.util.minecraft.ItemUtils;
import gtPlusPlus.xmod.gregtech.api.enums.GregtechItemList;

public class KevlarChain {

    public static void run() {

        // LCKevlar
        GTValues.RA.stdBuilder()
            .itemInputs(GTUtility.getIntegratedCircuit(1))
            .fluidInputs(
                MaterialsKevlar.ParaPhenylenediamine.getFluid(1000),
                MaterialsKevlar.TerephthaloylChloride.getFluid(1000))
            .fluidOutputs(MaterialsKevlar.LiquidCrystalKevlar.getFluid(1296), Materials.HydrochloricAcid.getFluid(2000))
            .duration(10 * SECONDS)
            .eut(TierEU.RECIPE_UV)
            .addTo(multiblockChemicalReactorRecipes);

        // Phenylenediamine
        GTValues.RA.stdBuilder()
            .itemInputs(
                GregtechItemList.PinkMetalCatalyst.get(0),
                GTOreDictUnificator.get(OrePrefixes.dust, Materials.Iron, 1))
            .fluidInputs(Materials.Hydrogen.getGas(6000), MaterialsKevlar.IVNitroaniline.getFluid(1000))
            .fluidOutputs(MaterialsKevlar.ParaPhenylenediamine.getFluid(1000), Materials.Water.getFluid(2000))
            .duration(5 * SECONDS)
            .eut(TierEU.RECIPE_LuV)
            .metadata(CHEMPLANT_CASING_TIER, 1)
            .addTo(chemicalPlantRecipes);

        // Nitroaniline
        GTValues.RA.stdBuilder()
            .itemInputs(GTUtility.getIntegratedCircuit(1))
            .fluidInputs(Materials.Nitrochlorobenzene.getFluid(1000), Materials.Ammonia.getGas(2000))
            .fluidOutputs(
                MaterialsKevlar.IVNitroaniline.getFluid(1000),
                WerkstoffLoader.AmmoniumChloride.getFluidOrGas(1000))
            .duration(15 * SECONDS)
            .eut(TierEU.RECIPE_EV)
            .addTo(multiblockChemicalReactorRecipes);

        // Terephthaloyl Chloride
        GTValues.RA.stdBuilder()
            .itemInputs(GregtechItemList.RedMetalCatalyst.get(0))
            .fluidInputs(
                MaterialsKevlar.Hexachloroxylene.getFluid(1000),
                MaterialsKevlar.TerephthalicAcid.getFluid(1000))
            .fluidOutputs(
                MaterialsKevlar.TerephthaloylChloride.getFluid(2000),
                Materials.HydrochloricAcid.getFluid(2000))
            .duration(5 * SECONDS)
            .eut(TierEU.RECIPE_LuV)
            .metadata(CHEMPLANT_CASING_TIER, 1)
            .addTo(chemicalPlantRecipes);

        // Hexachloroxylene
        GTValues.RA.stdBuilder()
            .itemInputs(GTUtility.getIntegratedCircuit(1))
            .fluidInputs(Materials.Chlorine.getGas(12000), Materials.Dimethylbenzene.getFluid(1000))
            .fluidOutputs(MaterialsKevlar.Hexachloroxylene.getFluid(1000), Materials.HydrochloricAcid.getFluid(6000))
            .duration(5 * SECONDS)
            .eut(TierEU.RECIPE_LV)
            .addTo(multiblockChemicalReactorRecipes);

        // Terephthalic Acid
        GTValues.RA.stdBuilder()
            .itemInputs(GregtechItemList.BlueMetalCatalyst.get(0))
            .fluidInputs(Materials.Dimethylbenzene.getFluid(1000), Materials.Oxygen.getGas(6000))
            .fluidOutputs(MaterialsKevlar.TerephthalicAcid.getFluid(1000), Materials.Water.getFluid(2000))
            .duration(5 * SECONDS)
            .eut(TierEU.RECIPE_LV)
            .metadata(CHEMPLANT_CASING_TIER, 1)
            .addTo(chemicalPlantRecipes);

        // Drawn Kevlar Fiber
        GTValues.RA.stdBuilder()
            .itemInputs(ItemList.Spinneret.get(0))
            .itemOutputs(ItemList.KevlarFiber.get(8))
            .fluidInputs(MaterialsKevlar.LiquidCrystalKevlar.getFluid(144))
            .duration(40 * SECONDS)
            .eut(TierEU.RECIPE_EV)
            .addTo(fluidSolidifierRecipes);
    }
}
