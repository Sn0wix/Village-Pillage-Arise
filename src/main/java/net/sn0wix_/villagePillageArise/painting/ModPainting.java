package net.sn0wix_.villagePillageArise.painting;

import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.sn0wix_.villagePillageArise.VillagePillageAriseMain;

public class ModPainting {
    public static final PaintingVariant EARTH = registerPainting("earth", new PaintingVariant(32,32));
    public static final PaintingVariant FIRE = registerPainting("fire", new PaintingVariant(32,32));
    public static final PaintingVariant WATER = registerPainting("water", new PaintingVariant(32,32));
    public static final PaintingVariant WIND = registerPainting("wind", new PaintingVariant(32,32));
    public static final PaintingVariant CAMP_FIRE = registerPainting("camp_fire", new PaintingVariant(16,32));

    private static PaintingVariant registerPainting(String name, PaintingVariant paintingMotive){
        return Registry.register(Registry.PAINTING_VARIANT, new Identifier(VillagePillageAriseMain.MOD_ID, name), paintingMotive);
    }

    public static void registerPaintings(){
        VillagePillageAriseMain.LOGGER.info("Registering Paintings for " + VillagePillageAriseMain.MOD_ID);
    }
}
