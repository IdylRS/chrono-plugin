package com.chrono;

import lombok.Getter;
import net.runelite.api.Prayer;
import net.runelite.api.Quest;
import net.runelite.api.Skill;
import net.runelite.api.widgets.WidgetInfo;

import java.util.*;

public enum Release {
    JANUARY_2001(
        "January 2001",
        new GregorianCalendar(2001, Calendar.JANUARY, 31).getTime(),
        Arrays.asList(12337,12338,12339,12340,12341,12342,12593,12594,12595,12596,12597,12598,12849,12850,12851,12852,12853,12854,13105,13106,13107,13108,13109,13110),
        Arrays.asList(Skill.HITPOINTS, Skill.ATTACK, Skill.STRENGTH, Skill.DEFENCE, Skill.RANGED, Skill.PRAYER, Skill.MAGIC, Skill.MINING, Skill.SMITHING, Skill.COOKING, Skill.FIREMAKING, Skill.WOODCUTTING, Skill.CRAFTING),
        null,
        Arrays.asList(Quest.COOKS_ASSISTANT, Quest.DEMON_SLAYER, Quest.THE_RESTLESS_GHOST, Quest.ROMEO__JULIET, Quest.SHIELD_OF_ARRAV, Quest.SHEEP_SHEARER,
                Quest.ERNEST_THE_CHICKEN, Quest.VAMPYRE_SLAYER
        ),
        Arrays.asList(ChronoSpell.CONFUSE, ChronoSpell.WIND_STRIKE, ChronoSpell.WATER_STRIKE, ChronoSpell.EARTH_STRIKE, ChronoSpell.FIRE_STRIKE)
    ),
    FEBRUARY_2001(
            "February 2001",
            new GregorianCalendar(2001, Calendar.FEBRUARY, 28).getTime(),
            Arrays.asList(12337,12338,12339,12340,12341,12342,12593,12594,12595,12596,12597,12598,12849,12850,12851,12852,12853,12854,13105,13106,13107,13108,13109,13110),
            null,
            null,
            Arrays.asList(Quest.IMP_CATCHER, Quest.PRINCE_ALI_RESCUE),
            null
    ),
    MARCH_2001(
            "March 2001",
            new GregorianCalendar(2001, Calendar.MARCH, 31).getTime(),
            Arrays.asList(12337,12338,12339,12340,12341,12342,12593,12594,12595,12596,12597,12598,12849,12850,12851,12852,12853,12854,13105,13106,13107,13108,13109,13110),
            null,
            null,
            null,
            null
    ),
    APRIL_2001(
            "April 2001",
            new GregorianCalendar(2001, Calendar.APRIL, 30).getTime(),
            Arrays.asList(11825,11826,11827,11828,11829,11830,12081,12082,12083,12084,12085,12086,12337,12338,12339,12340,12341,12342,12593,12594,12595,12596,12597,12598,12849,12850,12851,12852,12853,12854,13105,13106,13107,13108,13109,13110),
            null,
            null,
            Arrays.asList(Quest.DORICS_QUEST, Quest.BLACK_KNIGHTS_FORTRESS, Quest.WITCHS_POTION, Quest.THE_KNIGHTS_SWORD),
            null
    ),
    MAY_2001(
            "May 2001",
            new GregorianCalendar(2001, Calendar.MAY, 31).getTime(),
            Arrays.asList(11313,11569,11825,11826,11827,11828,11829,11830,12081,12082,12083,12084,12085,12086,12337,12338,12339,12340,12341,12342,12593,12594,12595,12596,12597,12598,12849,12850,12851,12852,12853,12854,13105,13106,13107,13108,13109,13110),
            null,
            Arrays.asList(Prayer.THICK_SKIN, Prayer.BURST_OF_STRENGTH, Prayer.CLARITY_OF_THOUGHT, Prayer.ROCK_SKIN,
                    Prayer.SUPERHUMAN_STRENGTH, Prayer.IMPROVED_REFLEXES, Prayer.RAPID_HEAL, Prayer.RAPID_RESTORE,
                    Prayer.PROTECT_ITEM, Prayer.STEEL_SKIN, Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES,
                    Prayer.PROTECT_FROM_MELEE, Prayer.PROTECT_FROM_MISSILES
            ),
            Arrays.asList(Quest.GOBLIN_DIPLOMACY),
            Arrays.asList(ChronoSpell.WEAKEN,
                    ChronoSpell.LVL_1_ENCHANT, ChronoSpell.LVL_2_ENCHANT, ChronoSpell.LVL_4_ENCHANT, ChronoSpell.LVL_3_ENCHANT,
                    ChronoSpell.WIND_BOLT, ChronoSpell.WIND_BLAST, ChronoSpell.WATER_BLAST, ChronoSpell.WATER_BOLT, ChronoSpell.FIRE_BLAST,
                    ChronoSpell.FIRE_BOLT, ChronoSpell.EARTH_BLAST, ChronoSpell.EARTH_BOLT, ChronoSpell.TELEKINETIC_GRAB, ChronoSpell.FALADOR_TELEPORT,
                    ChronoSpell.VARROCK_TELEPORT, ChronoSpell.LUMBRIDGE_TELEPORT, ChronoSpell.HIGH_LEVEL_ALCHEMY, ChronoSpell.LOW_LEVEL_ALCHEMY,
                    ChronoSpell.CRUMBLE_UNDEAD, ChronoSpell.SUPERHEAT_ITEM, ChronoSpell.BONES_TO_BANANAS
            )
    ),
    JUNE_2001(
            "June 2001",
            new GregorianCalendar(2001, Calendar.JUNE, 30).getTime(),
            Arrays.asList(11313,11569,11825,11826,11827,11828,11829,11830,12081,12082,12083,12084,12085,12086,12337,12338,12339,12340,12341,12342,12593,12594,12595,12596,12597,12598,12849,12850,12851,12852,12853,12854,13105,13106,13107,13108,13109,13110),
            null,
            null,
            Arrays.asList(Quest.PIRATES_TREASURE),
            null
    ),
    JULY_2001(
            "July 2001",
            new GregorianCalendar(2001, Calendar.JULY, 31).getTime(),
            Arrays.asList(11313,11569,11825,11826,11827,11828,11829,11830,12081,12082,12083,12084,12085,12086,12337,12338,12339,12340,12341,12342,12593,12594,12595,12596,12597,12598,12849,12850,12851,12852,12853,12854,13105,13106,13107,13108,13109,13110),
            null,
            null,
            null,
            null
    ),
    AUGUST_2001(
            "August 2001",
            new GregorianCalendar(2001, Calendar.AUGUST, 31).getTime(),
            Arrays.asList(11313,11569,11825,11826,11827,11828,11829,11830,11831,11832,11833,11835,11836,12081,12082,12083,12084,12085,12086,12087,12091,12092,12337,12338,12339,12340,12341,12342,12343,12345,12346,12347,12348,12593,12594,12595,12596,12597,12598,12599,12601,12849,12850,12851,12852,12853,12854,12855,12856,12857,12858,13105,13106,13107,13108,13109,13110,13111,13112,13113,13114,13115,13116),
            null,
            null,
            null,
            null
    ),
    SEPTEMBER_2001(
            "September 2001",
            new GregorianCalendar(2001, Calendar.SEPTEMBER, 30).getTime(),
            Arrays.asList(11313,11314,11315,11569,11570,11825,11826,11827,11828,11829,11830,11831,11832,11833,11835,11836,12081,12082,12083,12084,12085,12086,12087,12091,12092,12337,12338,12339,12340,12341,12342,12343,12345,12346,12347,12348,12593,12594,12595,12596,12597,12598,12599,12601,12849,12850,12851,12852,12853,12854,12855,12856,12857,12858,13105,13106,13107,13108,13109,13110,13111,13112,13113,13114,13115,13116),
            null,
            null,
            Arrays.asList(Quest.DRAGON_SLAYER_I),
            null
    ),
    OCTOBER_2001(
            "October 2001",
            new GregorianCalendar(2001, Calendar.OCTOBER, 31).getTime(),
            Arrays.asList(11313,11314,11315,11569,11570,11825,11826,11827,11828,11829,11830,11831,11832,11833,11835,11836,12081,12082,12083,12084,12085,12086,12087,12091,12092,12337,12338,12339,12340,12341,12342,12343,12345,12346,12347,12348,12593,12594,12595,12596,12597,12598,12599,12601,12849,12850,12851,12852,12853,12854,12855,12856,12857,12858,13105,13106,13107,13108,13109,13110,13111,13112,13113,13114,13115,13116),
            null,
            null,
            null,
            null
    ),
    NOVEMBER_2001(
            "November 2001",
            new GregorianCalendar(2001, Calendar.NOVEMBER, 30).getTime(),
            Arrays.asList(11313,11314,11315,11569,11570,11825,11826,11827,11828,11829,11830,11831,11832,11833,11835,11836,12081,12082,12083,12084,12085,12086,12087,12091,12092,12337,12338,12339,12340,12341,12342,12343,12345,12346,12347,12348,12593,12594,12595,12596,12597,12598,12599,12601,12849,12850,12851,12852,12853,12854,12855,12856,12857,12858,13105,13106,13107,13108,13109,13110,13111,13112,13113,13114,13115,13116),
            null,
            null,
            null,
            null
    ),
    DECEMBER_2001(
            "December 2001",
            new GregorianCalendar(2001, Calendar.DECEMBER, 31).getTime(),
            Arrays.asList(11313,11314,11315,11569,11570,11825,11826,11827,11828,11829,11830,11831,11832,11833,11835,11836,12081,12082,12083,12084,12085,12086,12087,12091,12092,12337,12338,12339,12340,12341,12342,12343,12345,12346,12347,12348,12593,12594,12595,12596,12597,12598,12599,12601,12849,12850,12851,12852,12853,12854,12855,12856,12857,12858,13105,13106,13107,13108,13109,13110,13111,13112,13113,13114,13115,13116),
            null,
            null,
            null,
            null
    ),
    JANUARY_2002(
            "January 2002",
            new GregorianCalendar(2002, Calendar.JANUARY, 31).getTime(),
            Arrays.asList(11313,11314,11315,11569,11570,11825,11826,11827,11828,11829,11830,11831,11832,11833,11835,11836,12081,12082,12083,12084,12085,12086,12087,12091,12092,12337,12338,12339,12340,12341,12342,12343,12345,12346,12347,12348,12593,12594,12595,12596,12597,12598,12599,12601,12849,12850,12851,12852,12853,12854,12855,12856,12857,12858,13105,13106,13107,13108,13109,13110,13111,13112,13113,13114,13115,13116),
            null,
            null,
            null,
            null
    ),
    FEBRUARY_2002(
            "February 2002",
            new GregorianCalendar(2002, Calendar.FEBRUARY, 28).getTime(),
            Arrays.asList(10801,10806,11057,11058,11060,11061,11062,11313,11314,11315,11316,11317,11318,11569,11570,11571,11572,11573,11574,11825,11826,11827,11828,11829,11830,11831,11832,11833,11835,11836,12081,12082,12083,12084,12085,12086,12087,12088,12089,12091,12092,12337,12338,12339,12340,12341,12342,12343,12345,12346,12347,12348,12593,12594,12595,12596,12597,12598,12599,12601,12603,12604,12849,12850,12851,12852,12853,12854,12855,12856,12857,12858,12859,12860,13105,13106,13107,13108,13109,13110,13111,13112,13113,13114,13115,13116),
            null,
            null,
            Arrays.asList(Quest.DRUIDIC_RITUAL, Quest.LOST_CITY, Quest.WITCHS_HOUSE, Quest.HEROES_QUEST, Quest.MERLINS_CRYSTAL),
            Arrays.asList(ChronoSpell.LVL_5_ENCHANT)
    ),
    MARCH_2002(
            "March 2002",
            new GregorianCalendar(2002, Calendar.MARCH, 31).getTime(),
            Arrays.asList(10801,10805,10806,11057,11058,11060,11061,11062,11313,11314,11315,11316,11317,11318,11569,11570,11571,11572,11573,11574,11825,11826,11827,11828,11829,11830,11831,11832,11833,11835,11836,12081,12082,12083,12084,12085,12086,12087,12088,12089,12091,12092,12337,12338,12339,12340,12341,12342,12343,12345,12346,12347,12348,12593,12594,12595,12596,12597,12598,12599,12601,12603,12604,12849,12850,12851,12852,12853,12854,12855,12856,12857,12858,12859,12860,13105,13106,13107,13108,13109,13110,13111,13112,13113,13114,13115,13116),
            null,
            null,
            Arrays.asList(Quest.SCORPION_CATCHER),
            null
    ),
    APRIL_2002(
            "April 2002",
            new GregorianCalendar(2002, Calendar.APRIL, 30).getTime(),
            Arrays.asList(10291,10292,10547,10548,10801,10804,10805,10806,11057,11058,11060,11061,11062,11313,11314,11315,11316,11317,11318,11569,11570,11571,11572,11573,11574,11825,11826,11827,11828,11829,11830,11831,11832,11833,11835,11836,12081,12082,12083,12084,12085,12086,12087,12088,12089,12091,12092,12337,12338,12339,12340,12341,12342,12343,12345,12346,12347,12348,12593,12594,12595,12596,12597,12598,12599,12601,12603,12604,12849,12850,12851,12852,12853,12854,12855,12856,12857,12858,12859,12860,13105,13106,13107,13108,13109,13110,13111,13112,13113,13114,13115,13116),
            null,
            null,
            Arrays.asList(Quest.FAMILY_CREST, Quest.TRIBAL_TOTEM),
            null
    ),
    MAY_2002(
            "May 2002",
            new GregorianCalendar(2002, Calendar.MAY, 31).getTime(),
            Arrays.asList(10290,10291,10292,10546,10547,10548,10549,10550,10801,10804,10805,10806,11057,11058,11060,11061,11062,11313,11314,11315,11316,11317,11318,11569,11570,11571,11572,11573,11574,11825,11826,11827,11828,11829,11830,11831,11832,11833,11835,11836,12081,12082,12083,12084,12085,12086,12087,12088,12089,12091,12092,12093,12337,12338,12339,12340,12341,12342,12343,12345,12346,12347,12348,12349,12593,12594,12595,12596,12597,12598,12599,12601,12603,12604,12605,12849,12850,12851,12852,12853,12854,12855,12856,12857,12858,12859,12860,12861,13105,13106,13107,13108,13109,13110,13111,13112,13113,13114,13115,13116,13117),
            null,
            null,
            Arrays.asList(Quest.FISHING_CONTEST, Quest.MONKS_FRIEND),
            null
    ),
    JUNE_2002(
            "June 2002",
            new GregorianCalendar(2002, Calendar.JUNE, 30).getTime(),
            Arrays.asList(10290,10291,10292,10293,10546,10547,10548,10549,10550,10801,10804,10805,10806,11057,11058,11060,11061,11062,11313,11314,11315,11316,11317,11318,11569,11570,11571,11572,11573,11574,11825,11826,11827,11828,11829,11830,11831,11832,11833,11835,11836,12081,12082,12083,12084,12085,12086,12087,12088,12089,12091,12092,12093,12337,12338,12339,12340,12341,12342,12343,12345,12346,12347,12348,12349,12593,12594,12595,12596,12597,12598,12599,12601,12603,12604,12605,12849,12850,12851,12852,12853,12854,12855,12856,12857,12858,12859,12860,12861,13105,13106,13107,13108,13109,13110,13111,13112,13113,13114,13115,13116,13117),
            null,
            null,
            Arrays.asList(Quest.TEMPLE_OF_IKOV, Quest.CLOCK_TOWER),
            null
    ),
    JULY_2002(
            "July 2002",
            new GregorianCalendar(2002, Calendar.JULY, 31).getTime(),
            Arrays.asList(10033, 10034,10289,10290,10291,10292,10293,10294,10545,10546,10547,10548,10549,10550,10801,10802,10804,10805,10806,11057,11058,11060,11061,11062,11313,11314,11315,11316,11317,11318,11569,11570,11571,11572,11573,11574,11825,11826,11827,11828,11829,11830,11831,11832,11833,11835,11836,12081,12082,12083,12084,12085,12086,12087,12088,12089,12091,12092,12093,12337,12338,12339,12340,12341,12342,12343,12345,12346,12347,12348,12349,12593,12594,12595,12596,12597,12598,12599,12601,12603,12604,12605,12849,12850,12851,12852,12853,12854,12855,12856,12857,12858,12859,12860,12861,13105,13106,13107,13108,13109,13110,13111,13112,13113,13114,13115,13116,13117),
            null,
            null,
            Arrays.asList(Quest.FIGHT_ARENA, Quest.TREE_GNOME_VILLAGE, Quest.HOLY_GRAIL),
            null
    ),
    AUGUST_2002(
            "August 2002",
            new GregorianCalendar(2002, Calendar.AUGUST, 31).getTime(),
            Arrays.asList(10033, 9779,10034,10035,10289,10290,10291,10292,10293,10294,10545,10546,10547,10548,10549,10550,10801,10802,10804,10805,10806,11057,11058,11060,11061,11062,11313,11314,11315,11316,11317,11318,11569,11570,11571,11572,11573,11574,11825,11826,11827,11828,11829,11830,11831,11832,11833,11835,11836,12081,12082,12083,12084,12085,12086,12087,12088,12089,12091,12092,12093,12337,12338,12339,12340,12341,12342,12343,12345,12346,12347,12348,12349,12593,12594,12595,12596,12597,12598,12599,12601,12603,12604,12605,12849,12850,12851,12852,12853,12854,12855,12856,12857,12858,12859,12860,12861,13105,13106,13107,13108,13109,13110,13111,13112,13113,13114,13115,13116,13117),
            null,
            null,
            Arrays.asList(Quest.HAZEEL_CULT, Quest.SHEEP_HERDER, Quest.PLAGUE_CITY),
            Arrays.asList(ChronoSpell.ARDOUGNE_TELEPORT)
    ),
    SEPTEMBER_2002(
            "September 2002",
            new GregorianCalendar(2002, Calendar.SEPTEMBER, 30).getTime(),
            Arrays.asList(10033, 9779,10034,10035,10037,10038,10289,10290,10291,10292,10293,10294,10545,10546,10547,10548,10549,10550,10801,10802,10803,10804,10805,10806,11057,11058,11059,11060,11061,11062,11313,11314,11315,11316,11317,11318,11569,11570,11571,11572,11573,11574,11825,11826,11827,11828,11829,11830,11831,11832,11833,11835,11836,12079,12080,12081,12082,12083,12084,12085,12086,12087,12088,12089,12091,12092,12093,12335,12336,12337,12338,12339,12340,12341,12342,12343,12345,12346,12347,12348,12349,12592,12593,12594,12595,12596,12597,12598,12599,12601,12603,12604,12605,12849,12850,12851,12852,12853,12854,12855,12856,12857,12858,12859,12860,12861,13105,13106,13107,13108,13109,13110,13111,13112,13113,13114,13115,13116,13117),
            null,
            null,
            Arrays.asList(Quest.SEA_SLUG, Quest.WATERFALL_QUEST),
            null
    ),
    OCTOBER_2002(
            "October 2002",
            new GregorianCalendar(2002, Calendar.OCTOBER, 31).getTime(),
            Arrays.asList(10544, 10288, 10032, 10033, 9779,10034,10035,10036,10037,10038,10289,10290,10291,10292,10293,10294,10545,10546,10547,10548,10549,10550,10801,10802,10803,10804,10805,10806,11055,11056,11057,11058,11059,11060,11061,11062,11312,11313,11314,11315,11316,11317,11318,11569,11570,11571,11572,11573,11574,11825,11826,11827,11828,11829,11830,11831,11832,11833,11835,11836,12079,12080,12081,12082,12083,12084,12085,12086,12087,12088,12089,12091,12092,12093,12335,12336,12337,12338,12339,12340,12341,12342,12343,12345,12346,12347,12348,12349,12592,12593,12594,12595,12596,12597,12598,12599,12601,12603,12604,12605,12849,12850,12851,12852,12853,12854,12855,12856,12857,12858,12859,12860,12861,13105,13106,13107,13108,13109,13110,13111,13112,13113,13114,13115,13116,13117),
            null,
            null,
            Arrays.asList(Quest.BIOHAZARD, Quest.JUNGLE_POTION),
            Arrays.asList(
                    ChronoSpell.ENFEEBLE, ChronoSpell.STUN, ChronoSpell.VULNERABILITY
            )
    ),
    NOVEMBER_2002(
            "November 2002",
            new GregorianCalendar(2002, Calendar.NOVEMBER, 30).getTime(),
            Arrays.asList(10544, 10288, 10032, 10033, 9779,10034,10035,10036,10037,10038,10289,10290,10291,10292,10293,10294,10545,10546,10547,10548,10549,10550,10801,10802,10803,10804,10805,10806,11055,11056,11057,11058,11059,11060,11061,11062,11312,11313,11314,11315,11316,11317,11318,11569,11570,11571,11572,11573,11574,11825,11826,11827,11828,11829,11830,11831,11832,11833,11835,11836,12079,12080,12081,12082,12083,12084,12085,12086,12087,12088,12089,12091,12092,12093,12335,12336,12337,12338,12339,12340,12341,12342,12343,12345,12346,12347,12348,12349,12592,12593,12594,12595,12596,12597,12598,12599,12601,12603,12604,12605,12849,12850,12851,12852,12853,12854,12855,12856,12857,12858,12859,12860,12861,13105,13106,13107,13108,13109,13110,13111,13112,13113,13114,13115,13116,13117),
            null,
            null,
            null,
            null
    ),
    DECEMBER_2002(
            "December 2002",
            new GregorianCalendar(2002, Calendar.DECEMBER, 31).getTime(),
            Arrays.asList(10544, 10288, 10032, 9525,9526,9779,9780,9781,9782,10032,10033,10034,10035,10036,10037,10038,10039,10288,10289,10290,10291,10292,10293,10294,10545,10546,10547,10548,10549,10550,10801,10802,10803,10804,10805,10806,11055,11056,11057,11058,11059,11060,11061,11062,11312,11313,11314,11315,11316,11317,11318,11569,11570,11571,11572,11573,11574,11825,11826,11827,11828,11829,11830,11831,11832,11833,11835,11836,12079,12080,12081,12082,12083,12084,12085,12086,12087,12088,12089,12091,12092,12093,12335,12336,12337,12338,12339,12340,12341,12342,12343,12345,12346,12347,12348,12349,12592,12593,12594,12595,12596,12597,12598,12599,12601,12603,12604,12605,12849,12850,12851,12852,12853,12854,12855,12856,12857,12858,12859,12860,12861,13105,13106,13107,13108,13109,13110,13111,13112,13113,13114,13115,13116,13117),
            null,
            null,
            Arrays.asList(Quest.ALFRED_GRIMHANDS_BARCRAWL, Quest.THE_GRAND_TREE),
            null
    ),
    JANUARY_2003(
            "January 2003",
            new GregorianCalendar(2003, Calendar.JANUARY, 31).getTime(),
            Arrays.asList(9525,9526,9779,9780,9781,9782,10032,10033,10034,10035,10036,10037,10038,10039,10288,10289,10290,10291,10292,10293,10294,10544,10545,10546,10547,10548,10549,10550,10801,10802,10803,10804,10805,10806,11054,11055,11056,11057,11058,11059,11060,11061,11062,11310,11311,11312,11313,11314,11315,11316,11317,11318,11566,11567,11568,11569,11570,11571,11572,11573,11574,11825,11826,11827,11828,11829,11830,11831,11832,11833,11835,11836,12079,12080,12081,12082,12083,12084,12085,12086,12087,12088,12089,12091,12092,12093,12335,12336,12337,12338,12339,12340,12341,12342,12343,12345,12346,12347,12348,12349,12592,12593,12594,12595,12596,12597,12598,12599,12601,12603,12604,12605,12849,12850,12851,12852,12853,12854,12855,12856,12857,12858,12859,12860,12861,13105,13106,13107,13108,13109,13110,13111,13112,13113,13114,13115,13116,13117),
            null,
            null,
            Arrays.asList(Quest.SHILO_VILLAGE),
            null
    ),
    FEBRUARY_2003(
            "February 2003",
            new GregorianCalendar(2003, Calendar.FEBRUARY, 28).getTime(),
            Arrays.asList(9525,9526,9779,9780,9781,9782,10032,10033,10034,10035,10036,10037,10038,10039,10288,10289,10290,10291,10292,10293,10294,10544,10545,10546,10547,10548,10549,10550,10801,10802,10803,10804,10805,10806,11054,11055,11056,11057,11058,11059,11060,11061,11062,11310,11311,11312,11313,11314,11315,11316,11317,11318,11566,11567,11568,11569,11570,11571,11572,11573,11574,11825,11826,11827,11828,11829,11830,11831,11832,11833,11835,11836,12079,12080,12081,12082,12083,12084,12085,12086,12087,12088,12089,12091,12092,12093,12335,12336,12337,12338,12339,12340,12341,12342,12343,12345,12346,12347,12348,12349,12592,12593,12594,12595,12596,12597,12598,12599,12601,12603,12604,12605,12849,12850,12851,12852,12853,12854,12855,12856,12857,12858,12859,12860,12861,13105,13106,13107,13108,13109,13110,13111,13112,13113,13114,13115,13116,13117),
            null,
            null,
            null,
            null
    ),
    MARCH_2003(
            "March 2003",
            new GregorianCalendar(2003, Calendar.MARCH, 31).getTime(),
            Arrays.asList(9525,9526,9777,9778,9779,9780,9781,9782,10032,10033,10034,10035,10036,10037,10038,10039,10288,10289,10290,10291,10292,10293,10294,10544,10545,10546,10547,10548,10549,10550,10801,10802,10803,10804,10805,10806,11054,11055,11056,11057,11058,11059,11060,11061,11062,11310,11311,11312,11313,11314,11315,11316,11317,11318,11566,11567,11568,11569,11570,11571,11572,11573,11574,11825,11826,11827,11828,11829,11830,11831,11832,11833,11835,11836,12079,12080,12081,12082,12083,12084,12085,12086,12087,12088,12089,12091,12092,12093,12335,12336,12337,12338,12339,12340,12341,12342,12343,12345,12346,12347,12348,12349,12592,12593,12594,12595,12596,12597,12598,12599,12601,12603,12604,12605,12849,12850,12851,12852,12853,12854,12855,12856,12857,12858,12859,12860,12861,13105,13106,13107,13108,13109,13110,13111,13112,13113,13114,13115,13116,13117),
            null,
            null,
            Arrays.asList(Quest.UNDERGROUND_PASS, Quest.OBSERVATORY_QUEST),
            Arrays.asList(ChronoSpell.IBAN_BLAST)
    ),
    APRIL_2003(
            "April 2003",
            new GregorianCalendar(2003, Calendar.APRIL, 30).getTime(),
            Arrays.asList(9525,9526,9777,9778,9779,9780,9781,9782,10032,10033,10034,10035,10036,10037,10038,10039,10288,10289,10290,10291,10292,10293,10294,10544,10545,10546,10547,10548,10549,10550,10801,10802,10803,10804,10805,10806,11054,11055,11056,11057,11058,11059,11060,11061,11062,11310,11311,11312,11313,11314,11315,11316,11317,11318,11566,11567,11568,11569,11570,11571,11572,11573,11574,11825,11826,11827,11828,11829,11830,11831,11832,11833,11835,11836,12079,12080,12081,12082,12083,12084,12085,12086,12087,12088,12089,12091,12092,12093,12335,12336,12337,12338,12339,12340,12341,12342,12343,12345,12346,12347,12348,12349,12591,12592,12593,12594,12595,12596,12597,12598,12599,12601,12603,12604,12605,12847,12849,12850,12851,12852,12853,12854,12855,12856,12857,12858,12859,12860,12861,13103,13104,13105,13106,13107,13108,13109,13110,13111,13112,13113,13114,13115,13116,13117),
            null,
            null,
            Arrays.asList(Quest.THE_TOURIST_TRAP),
            null
    ),
    MAY_2003(
            "May 2003",
            new GregorianCalendar(2003, Calendar.MAY, 31).getTime(),
            Arrays.asList(9525,9526,9777,9778,9779,9780,9781,9782,10030,10031,10032,10033,10034,10035,10036,10037,10038,10039,10286,10287,10288,10289,10290,10291,10292,10293,10294,10544,10545,10546,10547,10548,10549,10550,10801,10802,10803,10804,10805,10806,11054,11055,11056,11057,11058,11059,11060,11061,11062,11310,11311,11312,11313,11314,11315,11316,11317,11318,11566,11567,11568,11569,11570,11571,11572,11573,11574,11825,11826,11827,11828,11829,11830,11831,11832,11833,11835,11836,12079,12080,12081,12082,12083,12084,12085,12086,12087,12088,12089,12091,12092,12093,12335,12336,12337,12338,12339,12340,12341,12342,12343,12345,12346,12347,12348,12349,12591,12592,12593,12594,12595,12596,12597,12598,12599,12601,12603,12604,12605,12847,12849,12850,12851,12852,12853,12854,12855,12856,12857,12858,12859,12860,12861,13103,13104,13105,13106,13107,13108,13109,13110,13111,13112,13113,13114,13115,13116,13117),
            null,
            null,
            Arrays.asList(Quest.WATCHTOWER, Quest.DWARF_CANNON),
            null
    ),
    JUNE_2003(
            "June 2003",
            new GregorianCalendar(2003, Calendar.JUNE, 30).getTime(),
            Arrays.asList(9525,9526,9777,9778,9779,9780,9781,9782,10030,10031,10032,10033,10034,10035,10036,10037,10038,10039,10286,10287,10288,10289,10290,10291,10292,10293,10294,10544,10545,10546,10547,10548,10549,10550,10801,10802,10803,10804,10805,10806,10807,11054,11055,11056,11057,11058,11059,11060,11061,11062,11063,11310,11311,11312,11313,11314,11315,11316,11317,11318,11566,11567,11568,11569,11570,11571,11572,11573,11574,11825,11826,11827,11828,11829,11830,11831,11832,11833,11835,11836,12079,12080,12081,12082,12083,12084,12085,12086,12087,12088,12089,12091,12092,12093,12335,12336,12337,12338,12339,12340,12341,12342,12343,12345,12346,12347,12348,12349,12591,12592,12593,12594,12595,12596,12597,12598,12599,12601,12603,12604,12605,12847,12849,12850,12851,12852,12853,12854,12855,12856,12857,12858,12859,12860,12861,13103,13104,13105,13106,13107,13108,13109,13110,13111,13112,13113,13114,13115,13116,13117),
            null,
            null,
            Arrays.asList(Quest.MURDER_MYSTERY),
            null
    ),
    JULY_2003(
            "July 2003",
            new GregorianCalendar(2003, Calendar.JULY, 31).getTime(),
            Arrays.asList(9525,9526,9777,9778,9779,9780,9781,9782,10030,10031,10032,10033,10034,10035,10036,10037,10038,10039,10286,10287,10288,10289,10290,10291,10292,10293,10294,10544,10545,10546,10547,10548,10549,10550,10801,10802,10803,10804,10805,10806,10807,11054,11055,11056,11057,11058,11059,11060,11061,11062,11063,11310,11311,11312,11313,11314,11315,11316,11317,11318,11566,11567,11568,11569,11570,11571,11572,11573,11574,11825,11826,11827,11828,11829,11830,11831,11832,11833,11835,11836,12079,12080,12081,12082,12083,12084,12085,12086,12087,12088,12089,12091,12092,12093,12335,12336,12337,12338,12339,12340,12341,12342,12343,12345,12346,12347,12348,12349,12591,12592,12593,12594,12595,12596,12597,12598,12599,12601,12603,12604,12605,12847,12849,12850,12851,12852,12853,12854,12855,12856,12857,12858,12859,12860,12861,13103,13104,13105,13106,13107,13108,13109,13110,13111,13112,13113,13114,13115,13116,13117,13364,13365),
            null,
            null,
            Arrays.asList(Quest.THE_DIG_SITE, Quest.GERTRUDES_CAT),
            null
    ),
    AUGUST_2003(
            "August 2003",
            new GregorianCalendar(2003, Calendar.AUGUST, 31).getTime(),
            Arrays.asList(9525,9526,9777,9778,9779,9780,9781,9782,10030,10031,10032,10033,10034,10035,10036,10037,10038,10039,10286,10287,10288,10289,10290,10291,10292,10293,10294,10544,10545,10546,10547,10548,10549,10550,10801,10802,10803,10804,10805,10806,10807,11053,11054,11055,11056,11057,11058,11059,11060,11061,11062,11063,11309,11310,11311,11312,11313,11314,11315,11316,11317,11318,11565,11566,11567,11568,11569,11570,11571,11572,11573,11574,11821,11825,11826,11827,11828,11829,11830,11831,11832,11833,11835,11836,12079,12080,12081,12082,12083,12084,12085,12086,12087,12088,12089,12091,12092,12093,12335,12336,12337,12338,12339,12340,12341,12342,12343,12345,12346,12347,12348,12349,12591,12592,12593,12594,12595,12596,12597,12598,12599,12601,12603,12604,12605,12847,12849,12850,12851,12852,12853,12854,12855,12856,12857,12858,12859,12860,12861,13103,13104,13105,13106,13107,13108,13109,13110,13111,13112,13113,13114,13115,13116,13117,13364,13365),
            null,
            null,
            Arrays.asList(Quest.LEGENDS_QUEST),
            null
    ),
    SEPTEMBER_2003(
            "September 2003",
            new GregorianCalendar(2003, Calendar.SEPTEMBER, 30).getTime(),
            Arrays.asList(9525,9526,9777,9778,9779,9780,9781,9782,10030,10031,10032,10033,10034,10035,10036,10037,10038,10039,10286,10287,10288,10289,10290,10291,10292,10293,10294,10544,10545,10546,10547,10548,10549,10550,10801,10802,10803,10804,10805,10806,10807,11053,11054,11055,11056,11057,11058,11059,11060,11061,11062,11063,11309,11310,11311,11312,11313,11314,11315,11316,11317,11318,11565,11566,11567,11568,11569,11570,11571,11572,11573,11574,11821,11825,11826,11827,11828,11829,11830,11831,11832,11833,11835,11836,12079,12080,12081,12082,12083,12084,12085,12086,12087,12088,12089,12091,12092,12093,12335,12336,12337,12338,12339,12340,12341,12342,12343,12345,12346,12347,12348,12349,12591,12592,12593,12594,12595,12596,12597,12598,12599,12601,12603,12604,12605,12847,12849,12850,12851,12852,12853,12854,12855,12856,12857,12858,12859,12860,12861,13103,13104,13105,13106,13107,13108,13109,13110,13111,13112,13113,13114,13115,13116,13117,13364,13365),
            null,
            null,
            Arrays.asList(Quest.MAGE_ARENA_I),
            Arrays.asList(ChronoSpell.SARADOMIN_STRIKE, ChronoSpell.FLAMES_OF_ZAMORAK, ChronoSpell.CHARGE, ChronoSpell.CLAWS_OF_GUTHIX)
    ),
    OCTOBER_2003(
            "October 2003",
            new GregorianCalendar(2003, Calendar.OCTOBER, 31).getTime(),
            Arrays.asList(9525,9526,9777,9778,9779,9780,9781,9782,10030,10031,10032,10033,10034,10035,10036,10037,10038,10039,10286,10287,10288,10289,10290,10291,10292,10293,10294,10544,10545,10546,10547,10548,10549,10550,10801,10802,10803,10804,10805,10806,10807,11053,11054,11055,11056,11057,11058,11059,11060,11061,11062,11063,11309,11310,11311,11312,11313,11314,11315,11316,11317,11318,11565,11566,11567,11568,11569,11570,11571,11572,11573,11574,11821,11825,11826,11827,11828,11829,11830,11831,11832,11833,11835,11836,12079,12080,12081,12082,12083,12084,12085,12086,12087,12088,12089,12091,12092,12093,12335,12336,12337,12338,12339,12340,12341,12342,12343,12345,12346,12347,12348,12349,12591,12592,12593,12594,12595,12596,12597,12598,12599,12601,12603,12604,12605,12847,12849,12850,12851,12852,12853,12854,12855,12856,12857,12858,12859,12860,12861,13103,13104,13105,13106,13107,13108,13109,13110,13111,13112,13113,13114,13115,13116,13117,13364,13365),
            null,
            null,
            null,
            null
    ),
    NOVEMBER_2003(
            "November 2003",
            new GregorianCalendar(2003, Calendar.NOVEMBER, 30).getTime(),
            Arrays.asList(9525,9526,9777,9778,9779,9780,9781,9782,10030,10031,10032,10033,10034,10035,10036,10037,10038,10039,10286,10287,10288,10289,10290,10291,10292,10293,10294,10544,10545,10546,10547,10548,10549,10550,10801,10802,10803,10804,10805,10806,10807,11053,11054,11055,11056,11057,11058,11059,11060,11061,11062,11063,11309,11310,11311,11312,11313,11314,11315,11316,11317,11318,11565,11566,11567,11568,11569,11570,11571,11572,11573,11574,11821,11825,11826,11827,11828,11829,11830,11831,11832,11833,11835,11836,12079,12080,12081,12082,12083,12084,12085,12086,12087,12088,12089,12091,12092,12093,12335,12336,12337,12338,12339,12340,12341,12342,12343,12345,12346,12347,12348,12349,12591,12592,12593,12594,12595,12596,12597,12598,12599,12601,12603,12604,12605,12847,12849,12850,12851,12852,12853,12854,12855,12856,12857,12858,12859,12860,12861,13103,13104,13105,13106,13107,13108,13109,13110,13111,13112,13113,13114,13115,13116,13117,13364,13365),
            null,
            null,
            null,
            null
    ),
    DECEMBER_2003(
            "December 2003",
            new GregorianCalendar(2003, Calendar.DECEMBER, 31).getTime(),
            Arrays.asList(9525,9526,9777,9778,9779,9780,9781,9782,10030,10031,10032,10033,10034,10035,10036,10037,10038,10039,10286,10287,10288,10289,10290,10291,10292,10293,10294,10544,10545,10546,10547,10548,10549,10550,10801,10802,10803,10804,10805,10806,10807,11053,11054,11055,11056,11057,11058,11059,11060,11061,11062,11063,11309,11310,11311,11312,11313,11314,11315,11316,11317,11318,11565,11566,11567,11568,11569,11570,11571,11572,11573,11574,11821,11825,11826,11827,11828,11829,11830,11831,11832,11833,11835,11836,12079,12080,12081,12082,12083,12084,12085,12086,12087,12088,12089,12091,12092,12093,12335,12336,12337,12338,12339,12340,12341,12342,12343,12345,12346,12347,12348,12349,12591,12592,12593,12594,12595,12596,12597,12598,12599,12601,12603,12604,12605,12847,12849,12850,12851,12852,12853,12854,12855,12856,12857,12858,12859,12860,12861,13103,13104,13105,13106,13107,13108,13109,13110,13111,13112,13113,13114,13115,13116,13117,13364,13365),
            Arrays.asList(Skill.RUNECRAFT),
            Arrays.asList(Prayer.PROTECT_FROM_MAGIC),
            Arrays.asList(Quest.RUNE_MYSTERIES),
            null
    );

    @Getter
    private String name;
    @Getter
    private Date date;
    @Getter
    private List<Integer> regions;
    @Getter
    private List<Skill> skills;
    @Getter
    private List<Prayer> prayers;
    @Getter
    private List<Quest> quests;
    @Getter
    private List<ChronoSpell> spells;

    Release(String name, Date date, List<Integer> regions, List<Skill> skills, List<Prayer> prayers, List<Quest> quests, List<ChronoSpell> spells) {
        this.name = name;
        this.date = date;
        this.skills = skills;
        this.regions = regions;
        this.prayers = prayers;
        this.quests = quests;
        this.spells = spells;
    }

    public static List<Skill> getSkills(Release release) {
        Release[] releases = Release.values();
        List<Skill> skills = new ArrayList<>();

        for(Release r : releases) {
            if(r.skills != null) skills.addAll(r.getSkills());
            if(r.equals(release)) break;
        }

        return skills;
    }

    public static List<Prayer> getPrayers(Release release) {
        Release[] releases = Release.values();
        List<Prayer> prayers = new ArrayList<>();

        for(Release r : releases) {
            if(r.prayers != null) prayers.addAll(r.getPrayers());
            if(r.equals(release)) break;
        }

        return prayers;
    }

    public static List<Quest> getQuests(Release release) {
        Release[] releases = Release.values();
        List<Quest> quests = new ArrayList<>();

        for(Release r : releases) {
            if(r.quests != null) quests.addAll(r.getQuests());
            if(r.equals(release)) break;
        }

        return quests;
    }

    public static List<ChronoSpell> getSpells(Release release) {
        Release[] releases = Release.values();
        List<ChronoSpell> spells = new ArrayList<>();

        for(Release r : releases) {
            if(r.spells != null) spells.addAll(r.getSpells());
            if(r.equals(release)) break;
        }

        return spells;
    }
}
