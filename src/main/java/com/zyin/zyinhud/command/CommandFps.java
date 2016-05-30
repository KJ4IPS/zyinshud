package com.zyin.zyinhud.command;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

import com.zyin.zyinhud.mods.Fps;
import net.minecraft.server.MinecraftServer;

public class CommandFps extends CommandBase
{
	@Override
	public String getCommandName()
	{
		return "fps";
	}
	
	@Override
    public List getCommandAliases()
    {
		List list = new ArrayList();
		list.add("f");
        return list;
    }

	@Override
	public String getCommandUsage(ICommandSender iCommandSender)
	{
		return "commands.zyinhudfps.usage";
	}

	//@Override
	public void processCommand(ICommandSender iCommandSender, String[] parameters)
	{
		Fps.ToggleEnabled();
	}

	@Override // ICommand
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException
	{
		//TODO Method stub to silence error; needs implementation
	}
}
