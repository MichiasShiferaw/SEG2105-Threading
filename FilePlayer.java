import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 * Classs that will play music files at given paths
 * Student Name: Michias Shiferaw
 * Student Number: 300188168
 * 
 * @author Jesus Molina & Michias Shiferaw
 * @version 2.3
 * @since 11/16/21
 */
public class FilePlayer {
	List<String> allchords = Arrays.asList("re", "fa", "la","do", "mi", "sol", "si", "do-octave");
	static Queue<String> queue1 = new LinkedList<String>();// All performance with a LinkedQueue is O(1)
	static FilePlayer fp = new FilePlayer();
	/**
	 * Plays an audio clip located at the given path
	 * 
	 * @param filePath
	 *            the path to the audio clip that should be played
	 */
	public void play(String filePath) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception e) {
			System.out.println("Error with playing sound.");
			e.printStackTrace();
		}
	}
	
    	public void tune(){
		Scanner sc= new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		String request;
		while (true){
			System.out.println("Type in [A] for the first multi thread\nType in [B] for the Bonus {Twinkle Twinkle Litter Star}\nType in [C] for the beginning of 'Someone like you' by Adele\nType in [D] to input your own music");
			String input = sc.next();
			request=input.toUpperCase();
			if (((request.equals("A"))|| (request.equals("B"))|| (request.equals("C")) || (request.equals("D")))){break;}
		}
