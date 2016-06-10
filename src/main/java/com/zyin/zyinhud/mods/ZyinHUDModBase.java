package com.zyin.zyinhud.mods;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;

public abstract class ZyinHUDModBase
{
	protected static final Minecraft mc = Minecraft.getMinecraft();
	protected static final RenderItem itemRenderer = mc.getRenderItem();
	
	//We can't move the static variable Enabled to this base mod because then if one mod sets it to false
	//then ALL mods will be set to false
}
