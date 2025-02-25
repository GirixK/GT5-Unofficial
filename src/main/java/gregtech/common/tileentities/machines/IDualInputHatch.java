package gregtech.common.tileentities.machines;

import java.util.Iterator;
import java.util.Optional;

import net.minecraft.item.ItemStack;

import gregtech.api.logic.ProcessingLogic;

public interface IDualInputHatch {

    boolean justUpdated();

    Iterator<? extends IDualInputInventory> inventories();

    void updateTexture(int id);

    void updateCraftingIcon(ItemStack icon);

    Optional<IDualInputInventory> getFirstNonEmptyInventory();

    boolean supportsFluids();

    ItemStack[] getSharedItems();

    void setProcessingLogic(ProcessingLogic pl);
}
