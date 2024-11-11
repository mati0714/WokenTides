package com.wokentides.init;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;


public class GuiditeArmorMaterial implements ArmorMaterial {


        @Override
        public int getDurability(ArmorItem.Type type)
        // Replace this multiplier by a constant value for the durability of the armor.
        // For reference, diamond uses 33 for all armor pieces, whilst leather uses 5.
        int DURABILITY_MULTIPLIER = 12;
        return switch (type) {
                case BOOTS -> 13 * DURABILITY_MULTIPLIER;
                case LEGGINGS -> 15 * DURABILITY_MULTIPLIER;
                case CHESTPLATE -> 16 * DURABILITY_MULTIPLIER;
                case HELMET -> 11 * DURABILITY_MULTIPLIER;
                default -> 0;
        };
}
