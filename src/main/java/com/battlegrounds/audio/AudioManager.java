package com.battlegrounds.audio;

import javax.sound.sampled.*;
import java.io.File;

public class AudioManager {
    private Clip backgroundMusicClip;
    private Clip soundEffectClip;

    public AudioManager() {
        // Initialize audio system components
    }

    public void playBackgroundMusic(String filePath) throws Exception {
        if (backgroundMusicClip != null && backgroundMusicClip.isRunning()) {
            backgroundMusicClip.stop();
        }
        backgroundMusicClip = AudioSystem.getClip();
        backgroundMusicClip.open(AudioSystem.getAudioInputStream(new File(filePath)));
        backgroundMusicClip.loop(Clip.LOOP_CONTINUOUSLY);
        backgroundMusicClip.start();
    }

    public void stopBackgroundMusic() {
        if (backgroundMusicClip != null && backgroundMusicClip.isRunning()) {
            backgroundMusicClip.stop();
        }
    }

    public void playSoundEffect(String filePath) throws Exception {
        soundEffectClip = AudioSystem.getClip();
        soundEffectClip.open(AudioSystem.getAudioInputStream(new File(filePath)));
        soundEffectClip.start();
    }

    // Method for voice chat integration would go here.
    // Implementing voice chat would depend heavily on the specific requirements and libraries you want to use.
}