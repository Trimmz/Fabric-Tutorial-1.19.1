package net.asriel.tutorialmod.item;
import net.asriel.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import static net.asriel.tutorialmod.TutorialMod.MOD_ID;

public class ModItems {

    public static final Item DARK_INGOT = registerItem("dark_ingot", new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }
    public static void registerModItems()
    {
        TutorialMod.LOGGER.info("Registering Mod Items for" + MOD_ID);
    }

}
