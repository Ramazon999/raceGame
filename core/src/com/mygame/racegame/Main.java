package com.mygame.racegame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygame.racegame.view.GameScreen;

public class Main extends Game {
    private Screen gameScreen;
	@Override
	public void create() {
    gameScreen=new GameScreen();
    setScreen(gameScreen);
	}
}
