package crscillitoeCommonLib;

import java.io.*;
import sun.audio.*;

public class crscillitoeAudioPlayer {
	String SOUND_FILENAME;
	InputStream inputStream;
	@SuppressWarnings("restriction")
	AudioStream audioStream;
	
	
	/**
	 * Constructor for crscillitoeAudioPlayer, you must pass it the filePath of the audio
	 * file you wish to play.
	 * @param filePath
	 */
	public crscillitoeAudioPlayer(String filePath) {
		this.SOUND_FILENAME = filePath;
	}
	
	/**
	 * Changes the file path to the given path.
	 * @param s
	 */
	public void setFilePath(String s) {
		this.SOUND_FILENAME = s;
	}
	
	/**
	 * Returns the file path.
	 * @return
	 */
	public String getFilePath() {
		return SOUND_FILENAME;
	}
	
	/**
	 * Plays the audio.
	 */
	@SuppressWarnings("restriction")
	public void play() {
	    try {
	      inputStream = getClass().getResourceAsStream(SOUND_FILENAME);
	      audioStream = new AudioStream(inputStream);
	      AudioPlayer.player.start(audioStream);
	    }
	    catch (Exception e) {
	      e.printStackTrace();
	    }
	}
	
	/**
	 * Stops the audio.
	 */
	@SuppressWarnings("restriction")
	public void stop() {
		try {
			AudioPlayer.player.stop(audioStream);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
