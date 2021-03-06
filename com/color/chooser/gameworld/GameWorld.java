package com.color.chooser.gameworld;

import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Rectangle;
<<<<<<< HEAD
<<<<<<< HEAD
import com.color.chooser.includes.GameState;
=======
import com.color.chooser.gameobjects.Button;
>>>>>>> origin/master
=======
>>>>>>> parent of 1db16fc... Added sgtuffs

public class GameWorld {
	private Rectangle ground;
	private int score = 0;
	private float runTime = 0;
	private int midPointY;
	private GameRenderer renderer;
<<<<<<< HEAD
<<<<<<< HEAD
=======
	private Button button;
=======
>>>>>>> parent of 1db16fc... Added sgtuffs
	
	private GameState currentState;
>>>>>>> origin/master

	private GameState currentState;

	public GameWorld(int midPointY) {
		currentState = GameState.MENU;
		this.midPointY = midPointY;
		ground = new Rectangle(0, midPointY + 66, 137, 11);
	}

	public void update(float delta) {
		runTime += delta;

		switch (currentState) {
		case READY:
		case MENU:
			updateReady(delta);
			break;
		case RUNNING:
			updateRunning(delta);
			break;
		default:
			break;
		}

	}

	private void updateReady(float delta) {

	}

	public void updateRunning(float delta) {
		if (delta > .15f) {
			delta = .15f;
		}
	}

	public int getMidPointY() {
		return midPointY;
	}

	public int getScore() {
		return score;
	}

	public void addScore(int increment) {
		score += increment;
	}

	public void start() {
		currentState = GameState.RUNNING;
	}

	public void ready() {
		currentState = GameState.READY;
		renderer.prepareTransition(0, 0, 0, 1f);
	}

	public void restart() {
		score = 0;
		ready();
	}

	public boolean isReady() {
		return currentState == GameState.READY;
	}

	public boolean isGameOver() {
		return currentState == GameState.GAMEOVER;
	}

	public boolean isHighScore() {
		return currentState == GameState.HIGHSCORE;
	}

	public boolean isMenu() {
		return currentState == GameState.MENU;
	}

	public boolean isRunning() {
		return currentState == GameState.RUNNING;
	}

	public void setRenderer(GameRenderer renderer) {
		this.renderer = renderer;
	}

}
