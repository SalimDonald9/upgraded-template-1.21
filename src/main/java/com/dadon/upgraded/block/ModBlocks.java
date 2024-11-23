package com.dadon.upgraded.block;

import com.dadon.upgraded.Upgraded;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block BLOCK_OF_RAW_SILVER = registerBlock("block_of_raw_silver",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block BLOCK_OF_SILVER = registerBlock("block_of_silver",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block SILVER_ORE = registerBlock("silver_ore",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().instrument(NoteBlockInstrument.BASEDRUM)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Upgraded.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(Upgraded.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        Upgraded.LOGGER.info("Registering Mod Blocks for "+ Upgraded.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.BLOCK_OF_RAW_SILVER);
            fabricItemGroupEntries.add(ModBlocks.SILVER_ORE);
            fabricItemGroupEntries.add(ModBlocks.DEEPSLATE_SILVER_ORE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.BLOCK_OF_SILVER);
        });
    }
}
