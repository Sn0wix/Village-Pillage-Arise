package net.sn0wix_.villageAndPillage.sounds;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.sn0wix_.villageAndPillage.VillageAndPillageMain;

public class ModSounds {
    public static SoundEvent REVENGE = registerSoundEvent("revenge");
    public static SoundEvent GILDED = registerSoundEvent("gilded");
    public static SoundEvent GUARDIAN = registerSoundEvent("guardian");
    public static SoundEvent HUSK = registerSoundEvent("husk");
    public static SoundEvent RAIDERS = registerSoundEvent("raiders");
    public static SoundEvent SHULKER = registerSoundEvent("shulker");
    public static SoundEvent THE_ENDER_DRAGON = registerSoundEvent("the_ender_dragon");
    public static SoundEvent THE_WITHER = registerSoundEvent("the_wither");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(VillageAndPillageMain.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
