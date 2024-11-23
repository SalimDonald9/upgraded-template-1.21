package com.dadon.upgraded.item;

import com.dadon.upgraded.Upgraded;
import com.dadon.upgraded.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup METALS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Upgraded.MOD_ID, "metals"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SILVER_INGOT))
                    .displayName(Text.translatable("itemgroup.upgraded.metals"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SILVER_INGOT);
                        entries.add(ModItems.RAW_SILVER);
                        entries.add(ModBlocks.BLOCK_OF_SILVER);
                        entries.add(ModBlocks.BLOCK_OF_RAW_SILVER);
                        entries.add(ModBlocks.SILVER_ORE);
                        entries.add(ModBlocks.DEEPSLATE_SILVER_ORE);
                    }).build());

    public static void registerItemGroups(){
        Upgraded.LOGGER.info("Registering Item Groups for " + Upgraded.MOD_ID);
    }
}
