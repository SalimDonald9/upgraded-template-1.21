package com.dadon.upgraded.item;

import com.dadon.upgraded.Upgraded;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RAW_SILVER = registerItem("raw_silver", new Item(new Item.Settings()));
    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new Item.Settings()));
    public static final Item ROSE_GOLD_INGOT = registerItem("rose_gold_ingot", new Item(new Item.Settings()));
    public static final Item ROSE_GOLD_NUGGET = registerItem("rose_gold_nugget", new Item(new Item.Settings()));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Upgraded.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Upgraded.LOGGER.info("Registering Mod Items for " + Upgraded.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(RAW_SILVER);
            fabricItemGroupEntries.add(SILVER_INGOT);
            fabricItemGroupEntries.add(ROSE_GOLD_INGOT);
            fabricItemGroupEntries.add(ROSE_GOLD_NUGGET);
        });
    }
}
