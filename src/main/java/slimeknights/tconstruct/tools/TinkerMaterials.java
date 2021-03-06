package slimeknights.tconstruct.tools;

import net.minecraft.item.Item;
import slimeknights.tconstruct.common.TinkerModule;
import slimeknights.tconstruct.library.registration.object.BlockItemObject;
import slimeknights.tconstruct.library.registration.object.ItemObject;
import slimeknights.tconstruct.shared.block.BeaconBaseBlock;

/**
 * Contains blocks and items used in crafting materials, and the materials themselves
 */
public final class TinkerMaterials extends TinkerModule {
  /*
   * Blocks
   */

  // metal
  // TODO: which tinker materials do we want?
  public static final BlockItemObject<BeaconBaseBlock> cobaltBlock = BLOCKS.register("cobalt_block", () -> new BeaconBaseBlock(GENERIC_METAL_BLOCK), GENERAL_TOOLTIP_BLOCK_ITEM);
  public static final BlockItemObject<BeaconBaseBlock> arditeBlock = BLOCKS.register("ardite_block", () -> new BeaconBaseBlock(GENERIC_METAL_BLOCK), GENERAL_TOOLTIP_BLOCK_ITEM);
  public static final BlockItemObject<BeaconBaseBlock> manyullynBlock = BLOCKS.register("manyullyn_block", () -> new BeaconBaseBlock(GENERIC_METAL_BLOCK), GENERAL_TOOLTIP_BLOCK_ITEM);
  public static final BlockItemObject<BeaconBaseBlock> knightSlimeBlock = BLOCKS.register("knightslime_block", () -> new BeaconBaseBlock(GENERIC_METAL_BLOCK), GENERAL_TOOLTIP_BLOCK_ITEM);
  public static final BlockItemObject<BeaconBaseBlock> pigironBlock = BLOCKS.register("pigiron_block", () -> new BeaconBaseBlock(GENERIC_METAL_BLOCK), GENERAL_TOOLTIP_BLOCK_ITEM);
  public static final BlockItemObject<BeaconBaseBlock> copperBlock = BLOCKS.register("copper_block", () -> new BeaconBaseBlock(GENERIC_METAL_BLOCK), GENERAL_TOOLTIP_BLOCK_ITEM);
  public static final BlockItemObject<BeaconBaseBlock> roseGoldBlock = BLOCKS.register("rose_gold_block", () -> new BeaconBaseBlock(GENERIC_METAL_BLOCK), GENERAL_TOOLTIP_BLOCK_ITEM);

  /*
   * Items
   */
  // metals
  public static final ItemObject<Item> cobaltNugget = ITEMS.register("cobalt_nugget", GENERAL_PROPS);
  public static final ItemObject<Item> cobaltIngot = ITEMS.register("cobalt_ingot", GENERAL_PROPS);
  public static final ItemObject<Item> arditeNugget = ITEMS.register("ardite_nugget", GENERAL_PROPS);
  public static final ItemObject<Item> arditeIngot = ITEMS.register("ardite_ingot", GENERAL_PROPS);
  public static final ItemObject<Item> manyullynNugget = ITEMS.register("manyullyn_nugget", GENERAL_PROPS);
  public static final ItemObject<Item> manyullynIngot = ITEMS.register("manyullyn_ingot", GENERAL_PROPS);
  public static final ItemObject<Item> pigironNugget = ITEMS.register("pigiron_nugget", GENERAL_PROPS);
  public static final ItemObject<Item> pigironIngot = ITEMS.register("pigiron_ingot", GENERAL_PROPS);
  public static final ItemObject<Item> knightslimeNugget = ITEMS.register("knightslime_nugget", GENERAL_PROPS);
  public static final ItemObject<Item> knightslimeIngot = ITEMS.register("knightslime_ingot", GENERAL_PROPS);
  public static final ItemObject<Item> copperNugget = ITEMS.register("copper_nugget", GENERAL_PROPS);
  public static final ItemObject<Item> copperIngot = ITEMS.register("copper_ingot", GENERAL_PROPS);
  public static final ItemObject<Item> roseGoldNugget = ITEMS.register("rose_gold_nugget", GENERAL_PROPS);
  public static final ItemObject<Item> roseGoldIngot = ITEMS.register("rose_gold_ingot", GENERAL_PROPS);
}
