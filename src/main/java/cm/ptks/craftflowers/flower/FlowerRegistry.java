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
        registerFlower(new Flower(Material.OAK_SAPLING, "§2橡木樹苗"));
        registerFlower(new Flower(Material.SPRUCE_SAPLING, "§2杉木樹苗"));
        registerFlower(new Flower(Material.BIRCH_SAPLING, "§2樺木樹苗"));
        registerFlower(new Flower(Material.JUNGLE_SAPLING, "§2叢林木樹苗"));
        registerFlower(new Flower(Material.ACACIA_SAPLING, "§2相思木樹苗"));
        registerFlower(new Flower(Material.DARK_OAK_SAPLING, "§2黑橡木樹苗"));
        registerFlower(new Flower(Material.DEAD_BUSH, "§2枯灌木"));
        registerFlower(new Flower(Material.GRASS, "§2草"));
        registerFlower(new Flower(Material.FERN, "§2蕨"));
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
        registerFlower(new Flower(Material.BROWN_MUSHROOM, "§2棕色蘑菇"));
        registerFlower(new Flower(Material.RED_MUSHROOM, "§2紅色蘑菇"));
        registerFlower(new Flower(Material.CRIMSON_FUNGUS, "§2緋紅蕈菇"));
        registerFlower(new Flower(Material.WARPED_FUNGUS, "§2扭曲蕈菇"));
        registerFlower(new Flower(Material.FLOWER_POT, "§2花盆"));

        if (isValidMaterial("AZALEA") /* 1.17 or newer*/) {
            registerFlower(new Flower(Material.AZALEA, "§2杜鵑叢"));
            registerFlower(new Flower(Material.FLOWERING_AZALEA, "§2開花的杜鵑叢"));
            registerFlower(new Flower(Material.AZALEA_LEAVES, "§2杜鵑葉"));
            registerFlower(new Flower(Material.FLOWERING_AZALEA_LEAVES, "§2開花的杜鵑葉"));
            registerFlower(new Flower(Material.GLOW_BERRIES, "§2洞穴藤蔓", Material.CAVE_VINES));
            registerFlower(new Flower(Material.BIG_DRIPLEAF, "§2大懸葉草"));
            registerFlower(new Flower(Material.BIG_DRIPLEAF, "§2大懸葉草椗", Material.BIG_DRIPLEAF_STEM));
            registerFlower(new Flower(Material.SMALL_DRIPLEAF, "§2小懸葉草"));
        }
        
        if (isValidMaterial("MANGROVE_LEAVES" /* 1.19*/)) {
            registerFlower(new Flower(Material.MANGROVE_ROOTS, "§2紅樹林木根"));
            registerFlower(new Flower(Material.MANGROVE_LEAVES, "§2紅樹林木樹葉"));
            registerFlower(new Flower(Material.MANGROVE_PROPAGULE, "§2紅樹林木胎生苗"));
        }

        registerFlower(new Flower(Material.OAK_LEAVES, "§2橡木樹葉"));
        registerFlower(new Flower(Material.SPRUCE_LEAVES, "§2杉木樹葉"));
        registerFlower(new Flower(Material.BIRCH_LEAVES, "§2樺木樹葉"));
        registerFlower(new Flower(Material.JUNGLE_LEAVES, "§2叢林木樹葉"));
        registerFlower(new Flower(Material.ACACIA_LEAVES, "§2相思木樹葉"));
        registerFlower(new Flower(Material.DARK_OAK_LEAVES, "§2黑橡木樹葉"));
        registerFlower(new Flower(Material.LILY_PAD, "§2荷葉"));
        registerFlower(new Flower(Material.VINE, "§2藤蔓"));
        registerFlower(new Flower(Material.CACTUS, "§2仙人掌"));
        registerFlower(new Flower(Material.MELON, "§2西瓜"));
        registerFlower(new Flower(Material.PUMPKIN, "§2南瓜"));
        registerFlower(new Flower(Material.SEAGRASS, "§2海草"));
        registerFlower(new Flower(Material.SEA_PICKLE, "§2海泡菜"));
        registerFlower(new Flower(Material.KELP, "§2海带"));
        registerFlower(new Flower(Material.BAMBOO, "§2竹子"));
        registerFlower(new Flower(Material.END_ROD, "§2終界燭"));
        registerFlower(new Flower(Material.SOUL_LANTERN, "§2靈魂燈籠"));
        registerFlower(new Flower(Material.LANTERN, "§2燈籠"));
        registerFlower(new Flower(Material.COCOA_BEANS, "§2可可豆", Material.COCOA));
        registerFlower(new Flower(Material.CRIMSON_ROOTS, "§2緋紅蕈根"));
        registerFlower(new Flower(Material.WEEPING_VINES, "§2垂泣藤"));
        registerFlower(new Flower(Material.WARPED_ROOTS, "§2扭曲蕈根"));
        registerFlower(new Flower(Material.NETHER_SPROUTS, "§2地獄芽"));
        registerFlower(new Flower(Material.TWISTING_VINES, "§2扭曲藤"));
        registerFlower(new Flower(Material.BRAIN_CORAL, "§2腦珊瑚"));
        registerFlower(new Flower(Material.BUBBLE_CORAL, "§2氣泡珊瑚"));
        registerFlower(new Flower(Material.FIRE_CORAL, "§2火珊瑚"));
        registerFlower(new Flower(Material.HORN_CORAL, "§2角珊瑚"));
        registerFlower(new Flower(Material.TUBE_CORAL, "§2管珊瑚"));
        registerFlower(new Flower(Material.BRAIN_CORAL_FAN, "§2扇狀腦珊瑚"));
        registerFlower(new Flower(Material.BUBBLE_CORAL_FAN, "§2扇狀氣泡珊瑚"));
        registerFlower(new Flower(Material.FIRE_CORAL_FAN, "§2扇狀火珊瑚"));
        registerFlower(new Flower(Material.HORN_CORAL_FAN, "§2扇狀角珊瑚"));
        registerFlower(new Flower(Material.TUBE_CORAL_FAN, "§2扇狀管珊瑚"));

        registerFlower(new FlowerGroup(Material.WHEAT, "§2小麥種子", Arrays.asList(
                new AgingFlower(Material.WHEAT, "§2小麥種子", 0),
                new AgingFlower(Material.WHEAT, "§2小麥種子", 1),
                new AgingFlower(Material.WHEAT, "§2小麥種子", 2),
                new AgingFlower(Material.WHEAT, "§2小麥種子", 3),
                new AgingFlower(Material.WHEAT, "§2小麥種子", 4),
                new AgingFlower(Material.WHEAT, "§2小麥種子", 5),
                new AgingFlower(Material.WHEAT, "§2小麥種子", 6),
                new AgingFlower(Material.WHEAT, "§2小麥種子s", 7)
        )));

        registerFlower(new FlowerGroup(Material.POTATO, "§2馬鈴薯", Arrays.asList(
                new AgingFlower(Material.POTATO, "§2馬鈴薯", Material.POTATOES, 0),
                new AgingFlower(Material.POTATO, "§2馬鈴薯", Material.POTATOES, 1),
                new AgingFlower(Material.POTATO, "§2馬鈴薯", Material.POTATOES, 2),
                new AgingFlower(Material.POTATO, "§2馬鈴薯", Material.POTATOES, 3),
                new AgingFlower(Material.POTATO, "§2馬鈴薯", Material.POTATOES, 4),
                new AgingFlower(Material.POTATO, "§2馬鈴薯", Material.POTATOES, 5),
                new AgingFlower(Material.POTATO, "§2馬鈴薯", Material.POTATOES, 6),
                new AgingFlower(Material.POTATO, "§2馬鈴薯", Material.POTATOES, 7)
        )));

        registerFlower(new FlowerGroup(Material.CARROT, "§2胡蘿蔔", Arrays.asList(
                new AgingFlower(Material.CARROT, "§2胡蘿蔔", Material.CARROTS, 0),
                new AgingFlower(Material.CARROT, "§2胡蘿蔔", Material.CARROTS, 1),
                new AgingFlower(Material.CARROT, "§2胡蘿蔔", Material.CARROTS, 2),
                new AgingFlower(Material.CARROT, "§2胡蘿蔔", Material.CARROTS, 3),
                new AgingFlower(Material.CARROT, "§2胡蘿蔔", Material.CARROTS, 4),
                new AgingFlower(Material.CARROT, "§2胡蘿蔔", Material.CARROTS, 5),
                new AgingFlower(Material.CARROT, "§2胡蘿蔔", Material.CARROTS, 6),
                new AgingFlower(Material.CARROT, "§2胡蘿蔔", Material.CARROTS, 7)
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
