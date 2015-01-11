package com.color.chooser.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.color.chooser.game.ColorChooserGame;
import com.color.chooser.gameworld.GameRenderer;
import com.color.chooser.gameworld.GameWorld;
import com.color.chooser.helpers.InputHandler;
import com.color.chooser.gameobjects.*;

public class MenuScreen implements Screen {
	private ColorChooserGame game;
	private SpriteBatch batcher;
	private Sprite sprite;
	private Texture splashTexture;
	
	private GameWorld world;
	private GameRenderer renderer;
	
	private float runtime;
	
	public MenuScreen(ColorChooserGame colorChooserGame) {
		this.game = colorChooserGame;
		runtime = 0;
		
		float screenWidth = Gdx.graphics.getWidth();
		float screenHeight = Gdx.graphics.getHeight();
		float gameWidth = 136;
		float gameHeight = screenHeight / (screenWidth / gameWidth);
		int midPointY = (int) (gameHeight / 2);

		world = new GameWorld(midPointY);
		Gdx.input.setInputProcessor(new InputHandler(world, screenWidth / gameWidth, screenHeight / gameHeight));
		renderer = new GameRenderer(world, (int) gameHeight, midPointY);
		world.setRenderer(renderer);
	}

	public void show() {
		batcher = new SpriteBatch();
        splashTexture = new Texture(Gdx.files.internal("data/texture.png"));
	}

	public void render(float delta) {
		runtime += delta;
		
		Gdx.gl.glClearColor(.0f, 1f, .0f, 1);
	    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batcher.begin();
        batcher.draw(splashTexture, 0, 0);
        batcher.end();
        
        if(Gdx.input.justTouched()) {
        	System.out.println("Clicked menu page");
            //game.setScreen( new GameScreen(game) );
        }
        
        world.update(delta);
	}

	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	public void pause() {
		// TODO Auto-generated method stub
		
	}

	public void resume() {
		// TODO Auto-generated method stub
		
	}

	public void hide() {
		// TODO Auto-generated method stub
		
	}

	public void dispose() {
		// TODO Auto-generated method stub
		
	}
}
