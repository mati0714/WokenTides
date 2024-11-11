package com.wokentides.init;

import com.wokentides.WokenTides;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ItemInit {

    public static final Item STEELIUM_INGOT = register("steelium_ingot", new Item(new Item.Settings()));
    //public static  final Item STEELIUM_NUGGET = register("steelium_nugget", new Item(new Item.Settings()))


    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, WokenTides.id(name), item);
    }

    public static void load() {

    }
}

