package com.color.chooser.helpers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class AssetLoader {
	public static Texture texture, logoTexture;
	
	public static TextureRegion logo, zbLogo, bg, grass, bird, birdDown,
	birdUp, skullUp, skullDown, bar, playButtonUp, playButtonDown,
	ready, gameOver, highScore, scoreboard, star, noStar, retry;
	
	public static void load() {
		System.out.println("LOAD START");
		
		logoTexture = new Texture(Gdx.files.internal("data/logo.png"));
		logoTexture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		
		logo = new TextureRegion(logoTexture, 0, 0, 512, 114);

		texture = new Texture(Gdx.files.internal("data/texture.png"));
		texture.setFilter(TextureFilter.Nearest, TextureFilter.Nearest);

		playButtonUp = new TextureRegion(texture, 0, 83, 29, 16);
		playButtonDown = new TextureRegion(texture, 29, 83, 29, 16);
		playButtonUp.flip(false, true);
		playButtonDown.flip(false, true);
		
		System.out.println("LOAD END");
	}

	public static void setHighScore(int val) {
	}

	public static int getHighScore() {
		return 0;
	}

	public static void dispose() {
		texture.dispose();
	}

}
