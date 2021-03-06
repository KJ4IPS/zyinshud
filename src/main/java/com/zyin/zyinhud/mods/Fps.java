package com.zyin.zyinhud.mods;

import net.minecraft.util.text.TextFormatting;

import com.zyin.zyinhud.util.Localization;

public class Fps extends ZyinHUDModBase
{
	
	/** Enables/Disables this Mod */
	public static boolean Enabled;

    /**
     * Toggles this Mod on or off
     * @return The state the Mod was changed to
     */
    public static boolean ToggleEnabled()
    {
    	return Enabled = !Enabled;
    }
	
    public static String currentFps = "0";

    public static String CalculateMessageForInfoLine()
    {
        if (Fps.Enabled)
        {
            currentFps = mc.debug.substring(0, mc.debug.indexOf(' '));
        	return TextFormatting.WHITE + currentFps + " " + Localization.get("fps.infoline");
        }
        else
        {
            return "";
        }
    }
}
