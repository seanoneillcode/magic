package com.sean.game.magic;

import com.sean.game.MagicGame;
import com.sean.game.entity.Entity;

public class HurtPersonAction implements Action {

	int damage;
	
	public HurtPersonAction(int damage) {
		this.damage = damage;
	}
	
	@Override
	public void perform(Event e, Spell s, MagicGame m) {
		Entity entity = e.getSource();
		if (entity != null) {
			entity.getHurt(damage);			
		}
	}
}