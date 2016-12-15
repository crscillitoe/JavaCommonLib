package crscillitoeCommonLib;

import java.io.*;
import sun.audio.*;

public class crscillitoeAudioPlayer {
	String SOUND_FILENAME;
	
	public crscillitoeAudioPlayer(String filePath) {
		this.SOUND_FILENAME = filePath;
	}
	
	public void setFilePath(String s) {
		this.SOUND_FILENAME = s;
	}
	
 
  public void playSound() {
    try
    {
      InputStream inputStream = getClass().getResourceAsStream(SOUND_FILENAME);
      AudioStream audioStream = new AudioStream(inputStream);
      AudioPlayer.player.start(audioStream);
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
}
