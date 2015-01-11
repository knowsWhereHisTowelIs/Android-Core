package com.color.chooser.gameobjects;

import com.badlogic.gdx.math.Rectangle;

public class Button {
	
	private float x, y, width, height;
	private Rectangle bounds;
	
	public Button(float x, float y, float width, float height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		bounds = new Rectangle(x, y, width, height);
	}
	
	
	public void setX(float x) {
		this.x = x;
		bounds.setX(x);
	}
	
	public void setY(float y) {
		this.y = y;
		bounds.setY(y);
	}
	
	
	public boolean isClicked(int screenX, int screenY) {
		return bounds.contains(screenX, screenY);
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	public float getWidth() {
		return width;
	}
	
	public float getHeight() {
		return height;
	}

}