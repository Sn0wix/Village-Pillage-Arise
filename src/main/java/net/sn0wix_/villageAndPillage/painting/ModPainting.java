package net.sn0wix_.villageAndPillage.painting;

import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.sn0wix_.villageAndPillage.VillageAndPillageMain;

public class ModPainting {
    public static final PaintingMotive EARTH = registerPainting("earth", new PaintingMotive(32,32));
    public static final PaintingMotive FIRE = registerPainting("fire", new PaintingMotive(32,32));
    public static final PaintingMotive WATER = registerPainting("water", new PaintingMotive(32,32));
    public static final PaintingMotive WIND = registerPainting("wind", new PaintingMotive(32,32));
    public static final PaintingMotive CAMP_FIRE = registerPainting("camp_fire", new PaintingMotive(16,32));

    private static PaintingMotive registerPainting(String name, PaintingMotive paintingMotive){
        return Registry.register(Registry.PAINTING_MOTIVE, new Identifier(VillageAndPillageMain.MOD_ID, name), paintingMotive);
    }

    public static void registerPaintings(){
        VillageAndPillageMain.LOGGER.info("Registering Paintings for " + VillageAndPillageMain.MOD_ID);
    }
}
