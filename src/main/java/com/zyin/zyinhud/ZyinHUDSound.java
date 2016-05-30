package com.zyin.zyinhud;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;

public class ZyinHUDSound
{
	private static final Minecraft mc = Minecraft.getMinecraft();
	
	/**
	 * Plays a zyinhud sound with the given resource name.
	 * @param name
	 */
	public static void PlaySound(String name)
	{
		mc.getSoundHandler().playSound(PositionedSoundRecord.getMasterRecord(new SoundEvent(new ResourceLocation("zyinhud:" + name)), 1.0F));
	}
	
	/**
	 * Plays a zyinhud sound with the given resource name the specified volume 
	 * @param name
	 * @param volume 0-100% (0.0F to 1.0F) cannot go above 100%
	 */
	public static void PlaySound(String name, float volume)
	{
		BlockPos playerPosition = mc.thePlayer.getPosition();
		SoundEvent soundEvent = new SoundEvent(new ResourceLocation("zyinhud:" + name));
		mc.getSoundHandler().playSound(new PositionedSoundRecord(soundEvent, SoundCategory.MASTER, volume, 1.0F, playerPosition));
	}
	
	/**
	 * Plays the sound that a GuiButton makes.
	 */
	public static void PlayButtonPress()
	{
		mc.getSoundHandler().playSound(PositionedSoundRecord.getMasterRecord(new SoundEvent(new ResourceLocation("gui.button.press")), 1.0F));
	}
	
	/**
	 * Plays the "plop" sound that a chicken makes when laying an egg.
	 */
	public static void PlayPlopSound()
	{
		mc.getSoundHandler().playSound(PositionedSoundRecord.getMasterRecord(new SoundEvent(new ResourceLocation("mob.chicken.plop")), 1.0F));
	}
}
