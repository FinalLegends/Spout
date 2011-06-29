package org.bukkitcontrib.sound;

import org.bukkit.Location;
import org.bukkitcontrib.ClientOnly;
import org.bukkitcontrib.player.ContribPlayer;

public interface SoundManager {
    
    /**
     * Plays a sound effect for all players
     * @param effect to play
     */
    @ClientOnly
    public void playGlobalSoundEffect(SoundEffect effect);
    
    /**
     * Plays a sound effect for all players, at the given location
     * @param effect to play
     * @param location to play at
     */
    @ClientOnly
    public void playGlobalSoundEffect(SoundEffect effect, Location location);
    
    /**
     * Plays a sound effect for all players, at the given location
     * @param effect to play
     * @param location to play at
     * @param distance away it can be heard from (in full blocks) or -1 for any distance
     */
    @ClientOnly
    public void playGlobalSoundEffect(SoundEffect effect, Location location, int distance);

    /**
     * Plays a sound effect for all players, at the given location, with the given intensity and given volume
     * The intensity is how far away (in full blocks) players can be and hear the sound effect at full volume.
     * @param effect to play
     * @param location to play at
     * @param volumePercent to play at (100 = normal, 200 = double volume, 50 = half volume)
     * @param distance away it can be heard from (in full blocks) or -1 for any distance
     */
    @ClientOnly
    public void playGlobalSoundEffect(SoundEffect effect, Location location, int distance, int volumePercent);
    
    /**
     * Plays a sound effect for the target player
     * @param target to play the sound effect for
     * @param effect to play
     */
    @ClientOnly
    public void playSoundEffect(ContribPlayer target, SoundEffect effect);
    
    /**
     * Plays a sound effect for the target player, at the given location
     * @param target to play the sound effect for
     * @param effect to play
     * @param location to play at
     */
    @ClientOnly
    public void playSoundEffect(ContribPlayer target, SoundEffect effect, Location location);
    
    /**
     * Plays a sound effect for the target player, at the given location
     * @param target to play the sound effect for
     * @param effect to play
     * @param location to play at
     * @param distance away it can be heard from (in full blocks) or -1 for any distance
     */
    @ClientOnly
    public void playSoundEffect(ContribPlayer target, SoundEffect effect, Location location, int distance);
    
    /**
     * Plays a sound effect for the target player, at the given location, with the given intensity and given volume
     * The intensity is how far away (in full blocks) players can be and hear the sound effect at full volume.
     * @param target to play the sound effect for
     * @param effect to play
     * @param location to play at
     * @param intensity to play at
     * @param distance away it can be heard from (in full blocks) or -1 for any distance
     * @param volumePercent to play at (100 = normal, 200 = double volume, 50 = half volume)
     */
    @ClientOnly
    public void playSoundEffect(ContribPlayer target, SoundEffect effect, Location location, int distance, int volumePercent);
    
    /**
     * Plays the music for all players
     * @param music to play
     */
    @ClientOnly
    public void playGlobalMusic(Music music);
    
    /**
     * Plays the music at the given volume percent for all players
     * @param music to play
     * @param volumePercent to play at (100 = normal, 200 = double volume, 50 = half volume)
     */
    @ClientOnly
    public void playGlobalMusic(Music music, int volumePercent);
    
    /**
     * Plays the music for the target player
     * @param target to play for
     * @param music to play
     */
    @ClientOnly
    public void playMusic(ContribPlayer target, Music music);
    
    /**
     * Plays the music for the target player at the given volume
     * @param target to play for
     * @param music to play
     * @param volumePercent to play at (100 = normal, 200 = double volume, 50 = half volume)
     */
    @ClientOnly
    public void playMusic(ContribPlayer target, Music music, int volumePercent);
    
    /**
     * Plays a custom music file from the internet. The music must be in ogg, wav, or midi format.
     * After the file has been downloaded once, it will be cached for future use.
     * @param Url of the file to download
     * @param notify whether the player should be notified of the download
     */
    @ClientOnly
    public void playGlobalCustomMusic(String Url, boolean notify);
    
    /**
     * Plays a custom music file from the internet. The music must be in ogg, wav, or midi format.
     * After the file has been downloaded once, it will be cached for future use.
     * @param Url of the file to download
     * @param notify whether the player should be notified of the download
     * @param location to play at
     */
    @ClientOnly
    public void playGlobalCustomMusic(String Url, boolean notify, Location location);
    
    
    /**
     * Plays a custom music file from the internet. The music must be in ogg, wav, or midi format.
     * After the file has been downloaded once, it will be cached for future use.
     * @param Url of the file to download
     * @param notify whether the player should be notified of the download
     * @param location to play at
     * @param distance away it can be heard from (in full blocks) or -1 for any distance
     */
    @ClientOnly
    public void playGlobalCustomMusic(String Url, boolean notify, Location location, int distance);
    
    /**
     * Plays a custom music file from the internet. The music must be in ogg, wav, or midi format.
     * After the file has been downloaded once, it will be cached for future use.
     * @param Url of the file to download
     * @param notify whether the player should be notified of the download
     * @param the location to play at
     * @param distance away it can be heard from (in full blocks) or -1 for any distance
     * @param volumePercent to play at
     */
    @ClientOnly
    public void playGlobalCustomMusic(String Url, boolean notify, Location location, int distance, int volumePercent);
    
    /**
     * Plays a custom music file from the internet. The music must be in ogg, wav, or midi format.
     * After the file has been downloaded once, it will be cached for future use.
     * @param target to play for
     * @param Url of the file to download
     * @param notify whether the player should be notified of the download
     */
    @ClientOnly
    public void playCustomMusic(ContribPlayer target, String Url, boolean notify);
    
    /**
     * Plays a custom music file from the internet. The music must be in ogg, wav, or midi format.
     * After the file has been downloaded once, it will be cached for future use.
     * @param target to play for
     * @param Url of the file to download
     * @param notify whether the player should be notified of the download
     * @param location to play at
     */
    @ClientOnly
    public void playCustomMusic(ContribPlayer target, String Url, boolean notify, Location location);
    
    /**
     * Plays a custom music file from the internet. The music must be in ogg, wav, or midi format.
     * After the file has been downloaded once, it will be cached for future use.
     * @param target to play for
     * @param Url of the file to download
     * @param location to play at
     * @param distance away it can be heard from (in full blocks) or -1 for any distance
     */
    @ClientOnly
    public void playCustomMusic(ContribPlayer target, String Url, boolean notify, Location location, int distance);
    
    /**
     * Plays a custom music file from the internet. The music must be in ogg, wav, or midi format.
     * After the file has been downloaded once, it will be cached for future use.
     * @param target to play for
     * @param Url of the file to download
     * @param notify whether the player should be notified of the download
     * @param location to play at
     * @param distance away it can be heard from (in full blocks) or -1 for any distance
     * @param volumePercent to play at
     */
    @ClientOnly
    public void playCustomMusic(ContribPlayer target, String Url, boolean notify, Location location, int distance, int volumePercent);
    
    /**
     * Plays a custom sound effect from the internet. The music must be in ogg, wav, or midi format.
     * After the file has been downloaded once, it will be cached for future use.
     * Sound effects do not interrupt any ongoing music or other sound effects
     * @param Url of the file to download
     */
    @ClientOnly
    public void playGlobalCustomSoundEffect(String Url, boolean notify);
    
    /**
     * Plays a custom sound effect from the internet. The music must be in ogg, wav, or midi format.
     * After the file has been downloaded once, it will be cached for future use.
     * Sound effects do not interrupt any ongoing music or other sound effects
     * @param Url of the file to download
     * @param notify whether the player should be notified of the download
     * @param location to play at
     */
    @ClientOnly
    public void playGlobalCustomSoundEffect(String Url, boolean notify, Location location);
    
    
    /**
     * Plays a custom sound effect from the internet. The music must be in ogg, wav, or midi format.
     * After the file has been downloaded once, it will be cached for future use.
     * Sound effects do not interrupt any ongoing music or other sound effects
     * @param Url of the file to download
     * @param notify whether the player should be notified of the download
     * @param location to play at
     * @param distance away it can be heard from (in full blocks) or -1 for any distance
     */
    @ClientOnly
    public void playGlobalCustomSoundEffect(String Url, boolean notify, Location location, int distance);
    
    /**
     * Plays a custom sound effect from the internet. The music must be in ogg, wav, or midi format.
     * After the file has been downloaded once, it will be cached for future use.
     * Sound effects do not interrupt any ongoing music or other sound effects
     * @param Url of the file to download
     * @param notify whether the player should be notified of the download
     * @param location to play at
     * @param distance away it can be heard from (in full blocks) or -1 for any distance
     * @param volumePercent to play at
     */
    @ClientOnly
    public void playGlobalCustomSoundEffect(String Url, boolean notify, Location location, int distance, int volumePercent);
    
    /**
     * Plays a custom sound effect from the internet. The music must be in ogg, wav, or midi format.
     * After the file has been downloaded once, it will be cached for future use.
     * Sound effects do not interrupt any ongoing music or other sound effects
     * @param target to play for
     * @param Url of the file to download
     * @param notify whether the player should be notified of the download
     */
    @ClientOnly
    public void playCustomSoundEffect(ContribPlayer target, String Url, boolean notify);
    
    /**
     * Plays a custom sound effect from the internet. The music must be in ogg, wav, or midi format.
     * After the file has been downloaded once, it will be cached for future use.
     * Sound effects do not interrupt any ongoing music or other sound effects
     * @param target to play for
     * @param Url of the file to download
     * @param location to play at
     */
    @ClientOnly
    public void playCustomSoundEffect(ContribPlayer target, String Url, boolean notify, Location location);
    
    /**
     * Plays a custom sound effect from the internet. The music must be in ogg, wav, or midi format.
     * After the file has been downloaded once, it will be cached for future use.
     * Sound effects do not interrupt any ongoing music or other sound effects
     * @param target to play for
     * @param Url of the file to download
     * @param notify whether the player should be notified of the download
     * @param location to play at
     * @param distance away it can be heard from (in full blocks) or -1 for any distance
     */
    @ClientOnly
    public void playCustomSoundEffect(ContribPlayer target, String Url, boolean notify, Location location, int distance);
    
    /**
     * Plays a custom sound effect from the internet. The music must be in ogg, wav, or midi format.
     * After the file has been downloaded once, it will be cached for future use.
     * Sound effects do not interrupt any ongoing music or other sound effects
     * @param target to play for
     * @param Url of the file to download
     * @param notify whether the player should be notified of the download
     * @param location to play at
     * @param distance away it can be heard from (in full blocks) or -1 for any distance
     * @param volumePercent to play at
     */
    @ClientOnly
    public void playCustomSoundEffect(ContribPlayer target, String Url, boolean notify, Location location, int distance, int volumePercent);

}