/*
 * Copyright (c) 2019, Slay to Stay <https://github.com/slaytostay>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.chrono.regionlocker;

import java.awt.Color;
import java.util.*;

import com.chrono.ChronoConfig;
import com.chrono.ChronoPlugin;
import lombok.Getter;
import net.runelite.api.Client;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.util.Text;

public class RegionLocker
{
	private final Client client;
	private final ChronoConfig config;
	private final ConfigManager configManager;

	@Getter
	private static Map<String, RegionTypes> regions = new HashMap<>();

	private ChronoPlugin chronoPlugin;

	public static boolean renderLockedRegions;
	public static Color grayColor;
	public static int grayAmount;
	public static boolean hardBorder;
	public static boolean invertShader;

	public RegionLocker(Client client, ChronoConfig config, ConfigManager configManager, ChronoPlugin plugin)
	{
		this.client = client;
		this.config = config;
		this.configManager = configManager;
		this.chronoPlugin = plugin;
		readConfig();
	}

	private List<String> StringToList(String s)
	{
		List<String> regs;
		if (s.isEmpty())
			regs = new ArrayList<>();
		else
			regs = new ArrayList<>(Text.fromCSV(s));
		return regs;
	}

	public void readConfig()
	{
		regions.clear();
	}

	private void setConfig()
	{
		List<String> unlockedRegions = new ArrayList<>();
		List<String> unlockableRegions = new ArrayList<>();
		List<String> blacklistedRegions = new ArrayList<>();

		chronoPlugin.getCurrentRelease().getRegions().forEach(e -> unlockedRegions.add(e+""));

		String csv = Text.toCSV(unlockedRegions);
		configManager.setConfiguration(ChronoPlugin.CONFIG_GROUP_KEY, "unlockedRegions", csv);
	}

	public void setRegions(List<Integer> regs, RegionTypes type)
	{
		for (int id : regs)
		{
			regions.put(id+"", type);
		}
	}

	public void addRegion(int regionId)
	{
		String id = Integer.toString(regionId);
		RegionTypes type = regions.get(id);
		if (type == null)
			regions.put(id, RegionTypes.UNLOCKABLE);
		else if (type == RegionTypes.UNLOCKABLE)
			regions.put(id, RegionTypes.UNLOCKED);
		else
			regions.remove(id);
		setConfig();
	}

	public static RegionTypes getType(int regionId)
	{
		String id = Integer.toString(regionId);
//		if (!id.equals("") && trailblazerRegions != null && trailblazerRegions.size() > 0) {
//			for(int i = 0;i < trailblazerRegions.size();i++) {
//				if (Arrays.asList(trailblazerRegions.get(i).regions).contains(id))
//					return RegionTypes.UNLOCKED;
//			}
//		}
		int y = getY(regionId);
		if (y >= 4160 && y < 5952) return RegionTypes.UNLOCKED;
		if (y >= 8960) return RegionTypes.UNLOCKED;
		if (regions == null) return null;
		return regions.get(id);
	}

	public static boolean hasRegion(int regionId)
	{
		RegionTypes type = getType(regionId);
		if (type == null) return false;
		return type == RegionTypes.UNLOCKED;
	}

	public static boolean isUnlockable(int regionId)
	{
		RegionTypes type = getType(regionId);
		if (type == null) return false;
		return type == RegionTypes.UNLOCKABLE;
	}

	public static boolean isBlacklisted(int regionId)
	{
		RegionTypes type = getType(regionId);
		if (type == null) return false;
		return type == RegionTypes.BLACKLISTED;
	}


	public static int getX(int id)
	{
		return ((id >> 8) << 6);
	}

	public static int getY(int id)
	{
		return ((id & 255) << 6);
	}
}