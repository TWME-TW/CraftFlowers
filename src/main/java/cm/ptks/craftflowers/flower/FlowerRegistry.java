package cm.ptks.craftflowers.flower;

import org.bukkit.Material;

import java.util.*;

public class FlowerRegistry {

    private static final List<Flower> flowers = new ArrayList<>();

    static {
        registerFlower(new Flower(Material.SUNFLOWER, "§2向日葵"));
        registerFlower(new Flower(Material.SUGAR_CANE, "§2甘蔗"));
        registerFlower(new Flower(Material.LILAC, "§2紫丁香"));
        registerFlower(new Flower(Material.ROSE_BUSH, "§2玫瑰叢"));
        registerFlower(new Flower(Material.PEONY, "§2牡丹花"));
        registerFlower(new Flower(Material.TALL_GRASS, "§2芒草"));
        registerFlower(new Flower(Material.LARGE_FERN, "§2大型蕨類"));
        registerFlower(new Flower(Material.OAK_SAPLING, "§2Oak Sapling"));
        registerFlower(new Flower(Material.SPRUCE_SAPLING, "§2Spruce Sapling"));
        registerFlower(new Flower(Material.BIRCH_SAPLING, "§2Birch Sapling"));
        registerFlower(new Flower(Material.JUNGLE_SAPLING, "§2Jungle Sapling"));
        registerFlower(new Flower(Material.ACACIA_SAPLING, "§2Acacia Sapling"));
        registerFlower(new Flower(Material.DARK_OAK_SAPLING, "§2Dark Oak Sapling"));
        registerFlower(new Flower(Material.DEAD_BUSH, "§2Dead Bush"));
        registerFlower(new Flower(Material.GRASS, "§2Grass"));
        registerFlower(new Flower(Material.FERN, "§2Fern"));
        registerFlower(new Flower(Material.DANDELION, "§2蒲公英"));
        registerFlower(new Flower(Material.POPPY, "§2罌粟"));
        registerFlower(new Flower(Material.BLUE_ORCHID, "§2藍色蝴蝶蘭"));
        registerFlower(new Flower(Material.ALLIUM, "§2紫紅球花"));
        registerFlower(new Flower(Material.AZURE_BLUET, "§2雛草"));
        registerFlower(new Flower(Material.RED_TULIP, "§2紅色鬱金香"));
        registerFlower(new Flower(Material.ORANGE_TULIP, "§2橙色鬱金香"));
        registerFlower(new Flower(Material.WHITE_TULIP, "§2白色鬱金香"));
        registerFlower(new Flower(Material.PINK_TULIP, "§2粉紅色鬱金香"));
        registerFlower(new Flower(Material.OXEYE_DAISY, "§2雛菊"));
        registerFlower(new Flower(Material.CORNFLOWER,"§2矢車菊"));
        registerFlower(new Flower(Material.LILY_OF_THE_VALLEY, "§2鈴蘭"));
        registerFlower(new Flower(Material.WITHER_ROSE, "§2凋零玫瑰"));
        registerFlower(new Flower(Material.BROWN_MUSHROOM, "§2Mushroom"));
        registerFlower(new Flower(Material.RED_MUSHROOM, "§2Mushroom"));
        registerFlower(new Flower(Material.CRIMSON_FUNGUS, "§2Crimson Fungus"));
        registerFlower(new Flower(Material.WARPED_FUNGUS, "§2Warped Fungus"));
        registerFlower(new Flower(Material.FLOWER_POT, "§2Flower Pot"));

        if (isValidMaterial("AZALEA") /* 1.17 or newer*/) {
            registerFlower(new Flower(Material.AZALEA, "§2Azalea"));
            registerFlower(new Flower(Material.FLOWERING_AZALEA, "§2Flowering Azalea"));
            registerFlower(new Flower(Material.AZALEA_LEAVES, "§2Azalea Leaves"));
            registerFlower(new Flower(Material.FLOWERING_AZALEA_LEAVES, "§2Flowering Azalea Leaves"));
            registerFlower(new Flower(Material.GLOW_BERRIES, "§2Glow Berries", Material.CAVE_VINES));
            registerFlower(new Flower(Material.BIG_DRIPLEAF, "§2Big Dripleaf"));
            registerFlower(new Flower(Material.BIG_DRIPLEAF, "§2Big Dripleaf Stem", Material.BIG_DRIPLEAF_STEM));
            registerFlower(new Flower(Material.SMALL_DRIPLEAF, "§2Small Dripleaf"));
        }
        
        if (isValidMaterial("MANGROVE_LEAVES")) {
            registerFlower(new Flower(Material.MANGROVE_ROOTS, "§2Mangrove Roots"));
            registerFlower(new Flower(Material.MANGROVE_LEAVES, "§2Mangrove Leaves"));
        }

        registerFlower(new Flower(Material.OAK_LEAVES, "§2Oak Leaves"));
        registerFlower(new Flower(Material.SPRUCE_LEAVES, "§2Spruce Leaves"));
        registerFlower(new Flower(Material.BIRCH_LEAVES, "§2Birch Leaves"));
        registerFlower(new Flower(Material.JUNGLE_LEAVES, "§2Jungle Leaves"));
        registerFlower(new Flower(Material.ACACIA_LEAVES, "§2Acacia Leaves"));
        registerFlower(new Flower(Material.DARK_OAK_LEAVES, "§2Dark Oak Leaves"));
        registerFlower(new Flower(Material.LILY_PAD, "§2Lily Pad"));
        registerFlower(new Flower(Material.VINE, "§2Vines"));
        registerFlower(new Flower(Material.CACTUS, "§2Cactus"));
        registerFlower(new Flower(Material.MELON, "§2Melon"));
        registerFlower(new Flower(Material.PUMPKIN, "§2Pumpkin"));
        registerFlower(new Flower(Material.SEAGRASS, "§2Seagrass"));
        registerFlower(new Flower(Material.SEA_PICKLE, "§2Sea Pickle"));
        registerFlower(new Flower(Material.KELP, "§2Kelp"));
        registerFlower(new Flower(Material.BAMBOO, "§2Bamboo"));
        registerFlower(new Flower(Material.END_ROD, "§2End Rod"));
        registerFlower(new Flower(Material.SOUL_LANTERN, "§2Soul Lantern"));
        registerFlower(new Flower(Material.LANTERN, "§2Lantern"));
        registerFlower(new Flower(Material.COCOA_BEANS, "§2Cocoa", Material.COCOA));
        registerFlower(new Flower(Material.CRIMSON_ROOTS, "§2Crimson Roots"));
        registerFlower(new Flower(Material.WEEPING_VINES, "§2Weeping Vines"));
        registerFlower(new Flower(Material.WARPED_ROOTS, "§2Warped Roots"));
        registerFlower(new Flower(Material.NETHER_SPROUTS, "§2Nether Sprouts"));
        registerFlower(new Flower(Material.TWISTING_VINES, "§2Twisting Vines"));
        registerFlower(new Flower(Material.BRAIN_CORAL, "§2Brain Coral"));
        registerFlower(new Flower(Material.BUBBLE_CORAL, "§2Bubble Coral"));
        registerFlower(new Flower(Material.FIRE_CORAL, "§2Fire Coral"));
        registerFlower(new Flower(Material.HORN_CORAL, "§2Horn Coral"));
        registerFlower(new Flower(Material.TUBE_CORAL, "§2Tube Coral"));
        registerFlower(new Flower(Material.BRAIN_CORAL_FAN, "§2Brain Coral fan"));
        registerFlower(new Flower(Material.BUBBLE_CORAL_FAN, "§2Bubble Coral fan"));
        registerFlower(new Flower(Material.FIRE_CORAL_FAN, "§2Fire Coral fan"));
        registerFlower(new Flower(Material.HORN_CORAL_FAN, "§2Horn Coral fan"));
        registerFlower(new Flower(Material.TUBE_CORAL_FAN, "§2Tube Coral fan"));

        registerFlower(new FlowerGroup(Material.WHEAT, "§2Wheat Seeds", Arrays.asList(
                new AgingFlower(Material.WHEAT, "§2Wheat Seeds", 0),
                new AgingFlower(Material.WHEAT, "§2Wheat Seeds", 1),
                new AgingFlower(Material.WHEAT, "§2Wheat Seeds", 2),
                new AgingFlower(Material.WHEAT, "§2Wheat Seeds", 3),
                new AgingFlower(Material.WHEAT, "§2Wheat Seeds", 4),
                new AgingFlower(Material.WHEAT, "§2Wheat Seeds", 5),
                new AgingFlower(Material.WHEAT, "§2Wheat Seeds", 6),
                new AgingFlower(Material.WHEAT, "§2Wheat Seeds", 7)
        )));

        registerFlower(new FlowerGroup(Material.POTATO, "§2Potato", Arrays.asList(
                new AgingFlower(Material.POTATO, "§2Potato", Material.POTATOES, 0),
                new AgingFlower(Material.POTATO, "§2Potato", Material.POTATOES, 1),
                new AgingFlower(Material.POTATO, "§2Potato", Material.POTATOES, 2),
                new AgingFlower(Material.POTATO, "§2Potato", Material.POTATOES, 3),
                new AgingFlower(Material.POTATO, "§2Potato", Material.POTATOES, 4),
                new AgingFlower(Material.POTATO, "§2Potato", Material.POTATOES, 5),
                new AgingFlower(Material.POTATO, "§2Potato", Material.POTATOES, 6),
                new AgingFlower(Material.POTATO, "§2Potato", Material.POTATOES, 7)
        )));

        registerFlower(new FlowerGroup(Material.CARROT, "§2Carrot", Arrays.asList(
                new AgingFlower(Material.CARROT, "§2Carrot", Material.CARROTS, 0),
                new AgingFlower(Material.CARROT, "§2Carrot", Material.CARROTS, 1),
                new AgingFlower(Material.CARROT, "§2Carrot", Material.CARROTS, 2),
                new AgingFlower(Material.CARROT, "§2Carrot", Material.CARROTS, 3),
                new AgingFlower(Material.CARROT, "§2Carrot", Material.CARROTS, 4),
                new AgingFlower(Material.CARROT, "§2Carrot", Material.CARROTS, 5),
                new AgingFlower(Material.CARROT, "§2Carrot", Material.CARROTS, 6),
                new AgingFlower(Material.CARROT, "§2Carrot", Material.CARROTS, 7)
        )));
        
        registerFlower(new FlowerGroup(Material.MANGROVE_PROPAGULE, "§2Mangrove Propagule", Arrays.asList(
                new AgingFlower(Material.MANGROVE_PROPAGULE, "§2Mangrove Propagule", Material.MANGROVE_PROPAGULE, 0),
                new AgingFlower(Material.MANGROVE_PROPAGULE, "§2Mangrove Propagule", Material.MANGROVE_PROPAGULE, 1),
                new AgingFlower(Material.MANGROVE_PROPAGULE, "§2Mangrove Propagule", Material.MANGROVE_PROPAGULE, 2),
                new AgingFlower(Material.MANGROVE_PROPAGULE, "§2Mangrove Propagule", Material.MANGROVE_PROPAGULE, 3)
        )));
    }

    private static <E extends Enum<E>> boolean isValidMaterial(String enumName) {
        if (enumName == null) {
            return false;
        } else {
            try {
                Material.valueOf(enumName);
                return true;
            } catch (IllegalArgumentException var3) {
                return false;
            }
        }
    }

    private static void registerFlower(Flower flower) {
        flowers.add(flower);
    }

    public static List<Flower> getFlowers() {
        return flowers;
    }
}
