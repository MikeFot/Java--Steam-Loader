package com.michaelfotiadis.steam.data.dota2.model.live;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.michaelfotiadis.steam.data.ResultContainer;
import com.michaelfotiadis.steam.net.gson.SteamGson;

import org.junit.Test;

import java.lang.reflect.Type;

import static org.junit.Assert.assertNotNull;


public class LiveGamesTest {

    @Test
    public void testDeserialization() throws Exception {

        final Gson gson = SteamGson.buildGson();

        final Type type = new TypeToken<ResultContainer<LiveGames>>() {
        }.getType();


        final ResultContainer<LiveGames> resultContainer = gson.fromJson(JSON, type);

        assertNotNull(resultContainer);
        assertNotNull(resultContainer.getResult());
        assertNotNull(resultContainer.getResult().getGames());
        assertNotNull(resultContainer.getResult().getGames().get(0));


    }


    private static final String JSON = "{\n" +
            "  \"result\": {\n" +
            "    \"games\": [\n" +
            "      {\n" +
            "        \"players\": [\n" +
            "          {\n" +
            "            \"account_id\": 292962457,\n" +
            "            \"name\": \"FACEIT.com | Reaperbronze Bot\",\n" +
            "            \"hero_id\": 0,\n" +
            "            \"team\": 4\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 176559866,\n" +
            "            \"name\": \"Diana Prince\",\n" +
            "            \"hero_id\": 50,\n" +
            "            \"team\": 1\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 126410529,\n" +
            "            \"name\": \"Avatar\",\n" +
            "            \"hero_id\": 109,\n" +
            "            \"team\": 1\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 205361556,\n" +
            "            \"name\": \"RIP attitude\",\n" +
            "            \"hero_id\": 47,\n" +
            "            \"team\": 1\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 329878054,\n" +
            "            \"name\": \"Nirqua[PMA]\",\n" +
            "            \"hero_id\": 86,\n" +
            "            \"team\": 1\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 196522530,\n" +
            "            \"name\": \"Red-Sabre'sFangs\",\n" +
            "            \"hero_id\": 7,\n" +
            "            \"team\": 0\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 161215690,\n" +
            "            \"name\": \"mwp\",\n" +
            "            \"hero_id\": 65,\n" +
            "            \"team\": 1\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 103548667,\n" +
            "            \"name\": \"The Flash\",\n" +
            "            \"hero_id\": 37,\n" +
            "            \"team\": 0\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 239311714,\n" +
            "            \"name\": \"♥Thoma§♥\",\n" +
            "            \"hero_id\": 10,\n" +
            "            \"team\": 0\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 117102726,\n" +
            "            \"name\": \"Tela\",\n" +
            "            \"hero_id\": 41,\n" +
            "            \"team\": 0\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 249933077,\n" +
            "            \"name\": \"EZ\",\n" +
            "            \"hero_id\": 39,\n" +
            "            \"team\": 0\n" +
            "          }\n" +
            "        ],\n" +
            "        \"lobby_id\": 25126350610277476,\n" +
            "        \"match_id\": 3262216700,\n" +
            "        \"spectators\": 3,\n" +
            "        \"series_id\": 0,\n" +
            "        \"game_number\": 0,\n" +
            "        \"league_id\": 4122,\n" +
            "        \"stream_delay_s\": 120,\n" +
            "        \"radiant_series_wins\": 0,\n" +
            "        \"dire_series_wins\": 0,\n" +
            "        \"series_type\": 0,\n" +
            "        \"league_series_id\": 0,\n" +
            "        \"league_game_id\": 0,\n" +
            "        \"stage_name\": \"\",\n" +
            "        \"league_tier\": 1,\n" +
            "        \"scoreboard\": {\n" +
            "          \"duration\": 3282.41455078125,\n" +
            "          \"roshan_respawn_timer\": 0,\n" +
            "          \"radiant\": {\n" +
            "            \"score\": 21,\n" +
            "            \"tower_state\": 1828,\n" +
            "            \"barracks_state\": 63,\n" +
            "            \"picks\": [\n" +
            "              {\n" +
            "                \"hero_id\": 37\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 7\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 41\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 39\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 10\n" +
            "              }\n" +
            "            ],\n" +
            "            \"bans\": [\n" +
            "              {\n" +
            "                \"hero_id\": 99\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 88\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 34\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 59\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 75\n" +
            "              }\n" +
            "            ],\n" +
            "            \"players\": [\n" +
            "              {\n" +
            "                \"player_slot\": 1,\n" +
            "                \"account_id\": 196522530,\n" +
            "                \"hero_id\": 7,\n" +
            "                \"kills\": 0,\n" +
            "                \"death\": 8,\n" +
            "                \"assists\": 10,\n" +
            "                \"last_hits\": 59,\n" +
            "                \"denies\": 0,\n" +
            "                \"gold\": 1164,\n" +
            "                \"level\": 17,\n" +
            "                \"gold_per_min\": 199,\n" +
            "                \"xp_per_min\": 238,\n" +
            "                \"ultimate_state\": 3,\n" +
            "                \"ultimate_cooldown\": 0,\n" +
            "                \"item0\": 100,\n" +
            "                \"item1\": 36,\n" +
            "                \"item2\": 102,\n" +
            "                \"item3\": 46,\n" +
            "                \"item4\": 0,\n" +
            "                \"item5\": 180,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": 575.5035400390625,\n" +
            "                \"position_y\": -4639.91455078125,\n" +
            "                \"net_worth\": 8079\n" +
            "              },\n" +
            "              {\n" +
            "                \"player_slot\": 2,\n" +
            "                \"account_id\": 249933077,\n" +
            "                \"hero_id\": 39,\n" +
            "                \"kills\": 6,\n" +
            "                \"death\": 3,\n" +
            "                \"assists\": 8,\n" +
            "                \"last_hits\": 553,\n" +
            "                \"denies\": 21,\n" +
            "                \"gold\": 3606,\n" +
            "                \"level\": 25,\n" +
            "                \"gold_per_min\": 613,\n" +
            "                \"xp_per_min\": 492,\n" +
            "                \"ultimate_state\": 3,\n" +
            "                \"ultimate_cooldown\": 0,\n" +
            "                \"item0\": 250,\n" +
            "                \"item1\": 158,\n" +
            "                \"item2\": 190,\n" +
            "                \"item3\": 48,\n" +
            "                \"item4\": 123,\n" +
            "                \"item5\": 119,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": 3805.408935546875,\n" +
            "                \"position_y\": -1068.4473876953125,\n" +
            "                \"net_worth\": 30741\n" +
            "              },\n" +
            "              {\n" +
            "                \"player_slot\": 3,\n" +
            "                \"account_id\": 239311714,\n" +
            "                \"hero_id\": 10,\n" +
            "                \"kills\": 12,\n" +
            "                \"death\": 8,\n" +
            "                \"assists\": 4,\n" +
            "                \"last_hits\": 448,\n" +
            "                \"denies\": 16,\n" +
            "                \"gold\": 1659,\n" +
            "                \"level\": 25,\n" +
            "                \"gold_per_min\": 619,\n" +
            "                \"xp_per_min\": 492,\n" +
            "                \"ultimate_state\": 3,\n" +
            "                \"ultimate_cooldown\": 0,\n" +
            "                \"item0\": 48,\n" +
            "                \"item1\": 147,\n" +
            "                \"item2\": 123,\n" +
            "                \"item3\": 139,\n" +
            "                \"item4\": 160,\n" +
            "                \"item5\": 112,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": -1780.3126220703125,\n" +
            "                \"position_y\": 2060.931884765625,\n" +
            "                \"net_worth\": 30459\n" +
            "              },\n" +
            "              {\n" +
            "                \"player_slot\": 4,\n" +
            "                \"account_id\": 103548667,\n" +
            "                \"hero_id\": 37,\n" +
            "                \"kills\": 0,\n" +
            "                \"death\": 6,\n" +
            "                \"assists\": 10,\n" +
            "                \"last_hits\": 30,\n" +
            "                \"denies\": 0,\n" +
            "                \"gold\": 899,\n" +
            "                \"level\": 16,\n" +
            "                \"gold_per_min\": 186,\n" +
            "                \"xp_per_min\": 214,\n" +
            "                \"ultimate_state\": 1,\n" +
            "                \"ultimate_cooldown\": 63,\n" +
            "                \"item0\": 180,\n" +
            "                \"item1\": 11,\n" +
            "                \"item2\": 43,\n" +
            "                \"item3\": 88,\n" +
            "                \"item4\": 40,\n" +
            "                \"item5\": 60,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": -3224.636962890625,\n" +
            "                \"position_y\": -1316.054931640625,\n" +
            "                \"net_worth\": 4379\n" +
            "              },\n" +
            "              {\n" +
            "                \"player_slot\": 5,\n" +
            "                \"account_id\": 117102726,\n" +
            "                \"hero_id\": 41,\n" +
            "                \"kills\": 3,\n" +
            "                \"death\": 4,\n" +
            "                \"assists\": 7,\n" +
            "                \"last_hits\": 376,\n" +
            "                \"denies\": 8,\n" +
            "                \"gold\": 3286,\n" +
            "                \"level\": 25,\n" +
            "                \"gold_per_min\": 542,\n" +
            "                \"xp_per_min\": 492,\n" +
            "                \"ultimate_state\": 3,\n" +
            "                \"ultimate_cooldown\": 0,\n" +
            "                \"item0\": 65,\n" +
            "                \"item1\": 174,\n" +
            "                \"item2\": 147,\n" +
            "                \"item3\": 139,\n" +
            "                \"item4\": 158,\n" +
            "                \"item5\": 48,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": 189.6371612548828,\n" +
            "                \"position_y\": -2015.46923828125,\n" +
            "                \"net_worth\": 27211\n" +
            "              }\n" +
            "            ],\n" +
            "            \"abilities\": [\n" +
            "              {\n" +
            "                \"ability_id\": 5182,\n" +
            "                \"ability_level\": 4\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5691,\n" +
            "                \"ability_level\": 4\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5184,\n" +
            "                \"ability_level\": 4\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5185,\n" +
            "                \"ability_level\": 3\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 6119,\n" +
            "                \"ability_level\": 1\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 6009,\n" +
            "                \"ability_level\": 1\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 6008,\n" +
            "                \"ability_level\": 1\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 6128,\n" +
            "                \"ability_level\": 1\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          \"dire\": {\n" +
            "            \"score\": 29,\n" +
            "            \"tower_state\": 1568,\n" +
            "            \"barracks_state\": 60,\n" +
            "            \"picks\": [\n" +
            "              {\n" +
            "                \"hero_id\": 65\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 50\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 47\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 86\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 109\n" +
            "              }\n" +
            "            ],\n" +
            "            \"bans\": [\n" +
            "              {\n" +
            "                \"hero_id\": 98\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 40\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 97\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 2\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 6\n" +
            "              }\n" +
            "            ],\n" +
            "            \"players\": [\n" +
            "              {\n" +
            "                \"player_slot\": 1,\n" +
            "                \"account_id\": 205361556,\n" +
            "                \"hero_id\": 47,\n" +
            "                \"kills\": 9,\n" +
            "                \"death\": 5,\n" +
            "                \"assists\": 10,\n" +
            "                \"last_hits\": 353,\n" +
            "                \"denies\": 32,\n" +
            "                \"gold\": 1270,\n" +
            "                \"level\": 25,\n" +
            "                \"gold_per_min\": 460,\n" +
            "                \"xp_per_min\": 492,\n" +
            "                \"ultimate_state\": 3,\n" +
            "                \"ultimate_cooldown\": 0,\n" +
            "                \"item0\": 48,\n" +
            "                \"item1\": 263,\n" +
            "                \"item2\": 36,\n" +
            "                \"item3\": 127,\n" +
            "                \"item4\": 112,\n" +
            "                \"item5\": 114,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": 3283.616455078125,\n" +
            "                \"position_y\": 2285.8681640625,\n" +
            "                \"net_worth\": 21435\n" +
            "              },\n" +
            "              {\n" +
            "                \"player_slot\": 2,\n" +
            "                \"account_id\": 329878054,\n" +
            "                \"hero_id\": 86,\n" +
            "                \"kills\": 3,\n" +
            "                \"death\": 5,\n" +
            "                \"assists\": 13,\n" +
            "                \"last_hits\": 160,\n" +
            "                \"denies\": 4,\n" +
            "                \"gold\": 3383,\n" +
            "                \"level\": 22,\n" +
            "                \"gold_per_min\": 323,\n" +
            "                \"xp_per_min\": 404,\n" +
            "                \"ultimate_state\": 3,\n" +
            "                \"ultimate_cooldown\": 0,\n" +
            "                \"item0\": 180,\n" +
            "                \"item1\": 1,\n" +
            "                \"item2\": 108,\n" +
            "                \"item3\": 254,\n" +
            "                \"item4\": 36,\n" +
            "                \"item5\": 46,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": 3565.936767578125,\n" +
            "                \"position_y\": 2630.1162109375,\n" +
            "                \"net_worth\": 13498\n" +
            "              },\n" +
            "              {\n" +
            "                \"player_slot\": 3,\n" +
            "                \"account_id\": 176559866,\n" +
            "                \"hero_id\": 50,\n" +
            "                \"kills\": 0,\n" +
            "                \"death\": 6,\n" +
            "                \"assists\": 10,\n" +
            "                \"last_hits\": 40,\n" +
            "                \"denies\": 5,\n" +
            "                \"gold\": 601,\n" +
            "                \"level\": 19,\n" +
            "                \"gold_per_min\": 168,\n" +
            "                \"xp_per_min\": 303,\n" +
            "                \"ultimate_state\": 3,\n" +
            "                \"ultimate_cooldown\": 0,\n" +
            "                \"item0\": 244,\n" +
            "                \"item1\": 218,\n" +
            "                \"item2\": 0,\n" +
            "                \"item3\": 180,\n" +
            "                \"item4\": 229,\n" +
            "                \"item5\": 59,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": 2819.838134765625,\n" +
            "                \"position_y\": 5825.37890625,\n" +
            "                \"net_worth\": 5836\n" +
            "              },\n" +
            "              {\n" +
            "                \"player_slot\": 4,\n" +
            "                \"account_id\": 161215690,\n" +
            "                \"hero_id\": 65,\n" +
            "                \"kills\": 11,\n" +
            "                \"death\": 3,\n" +
            "                \"assists\": 11,\n" +
            "                \"last_hits\": 268,\n" +
            "                \"denies\": 7,\n" +
            "                \"gold\": 4881,\n" +
            "                \"level\": 25,\n" +
            "                \"gold_per_min\": 411,\n" +
            "                \"xp_per_min\": 493,\n" +
            "                \"ultimate_state\": 3,\n" +
            "                \"ultimate_cooldown\": 0,\n" +
            "                \"item0\": 1,\n" +
            "                \"item1\": 102,\n" +
            "                \"item2\": 100,\n" +
            "                \"item3\": 185,\n" +
            "                \"item4\": 116,\n" +
            "                \"item5\": 48,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": 6900,\n" +
            "                \"position_y\": 6650,\n" +
            "                \"net_worth\": 21121\n" +
            "              },\n" +
            "              {\n" +
            "                \"player_slot\": 5,\n" +
            "                \"account_id\": 126410529,\n" +
            "                \"hero_id\": 109,\n" +
            "                \"kills\": 6,\n" +
            "                \"death\": 2,\n" +
            "                \"assists\": 6,\n" +
            "                \"last_hits\": 460,\n" +
            "                \"denies\": 34,\n" +
            "                \"gold\": 4691,\n" +
            "                \"level\": 25,\n" +
            "                \"gold_per_min\": 581,\n" +
            "                \"xp_per_min\": 501,\n" +
            "                \"ultimate_state\": 3,\n" +
            "                \"ultimate_cooldown\": 0,\n" +
            "                \"item0\": 263,\n" +
            "                \"item1\": 160,\n" +
            "                \"item2\": 48,\n" +
            "                \"item3\": 174,\n" +
            "                \"item4\": 147,\n" +
            "                \"item5\": 116,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": 6157.3271484375,\n" +
            "                \"position_y\": 2559.920166015625,\n" +
            "                \"net_worth\": 29641\n" +
            "              }\n" +
            "            ],\n" +
            "            \"abilities\": [\n" +
            "              {\n" +
            "                \"ability_id\": 5619,\n" +
            "                \"ability_level\": 4\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5620,\n" +
            "                \"ability_level\": 4\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5621,\n" +
            "                \"ability_level\": 4\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5622,\n" +
            "                \"ability_level\": 3\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 6119,\n" +
            "                \"ability_level\": 1\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5959,\n" +
            "                \"ability_level\": 1\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5929,\n" +
            "                \"ability_level\": 1\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 6135,\n" +
            "                \"ability_level\": 1\n" +
            "              }\n" +
            "            ]\n" +
            "          }\n" +
            "        }\n" +
            "      },\n" +
            "      {\n" +
            "        \"players\": [\n" +
            "          {\n" +
            "            \"account_id\": 292920318,\n" +
            "            \"name\": \"FACEIT.com | Pegasustulip Bot\",\n" +
            "            \"hero_id\": 0,\n" +
            "            \"team\": 4\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 363801337,\n" +
            "            \"name\": \"Jerukk\",\n" +
            "            \"hero_id\": 57,\n" +
            "            \"team\": 0\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 153306675,\n" +
            "            \"name\": \"super men\",\n" +
            "            \"hero_id\": 36,\n" +
            "            \"team\": 1\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 117652939,\n" +
            "            \"name\": \"nestii\",\n" +
            "            \"hero_id\": 60,\n" +
            "            \"team\": 0\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 152172198,\n" +
            "            \"name\": \"BEGAZOULE\",\n" +
            "            \"hero_id\": 75,\n" +
            "            \"team\": 1\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 163816454,\n" +
            "            \"name\": \"©Mg3\",\n" +
            "            \"hero_id\": 73,\n" +
            "            \"team\": 1\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 164249437,\n" +
            "            \"name\": \"AR.RAMBUT KLIMIS\",\n" +
            "            \"hero_id\": 5,\n" +
            "            \"team\": 0\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 301863742,\n" +
            "            \"name\": \"MindGames\",\n" +
            "            \"hero_id\": 18,\n" +
            "            \"team\": 0\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 291958380,\n" +
            "            \"name\": \"Philanthopist\",\n" +
            "            \"hero_id\": 84,\n" +
            "            \"team\": 1\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 358007315,\n" +
            "            \"name\": \"SRM\",\n" +
            "            \"hero_id\": 39,\n" +
            "            \"team\": 1\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 156755896,\n" +
            "            \"name\": \"CaSPeR.Dotax2.com\",\n" +
            "            \"hero_id\": 25,\n" +
            "            \"team\": 0\n" +
            "          }\n" +
            "        ],\n" +
            "        \"lobby_id\": 25126350635571550,\n" +
            "        \"match_id\": 3262309044,\n" +
            "        \"spectators\": 2,\n" +
            "        \"series_id\": 0,\n" +
            "        \"game_number\": 0,\n" +
            "        \"league_id\": 4122,\n" +
            "        \"stream_delay_s\": 120,\n" +
            "        \"radiant_series_wins\": 0,\n" +
            "        \"dire_series_wins\": 0,\n" +
            "        \"series_type\": 0,\n" +
            "        \"league_series_id\": 0,\n" +
            "        \"league_game_id\": 0,\n" +
            "        \"stage_name\": \"\",\n" +
            "        \"league_tier\": 1,\n" +
            "        \"scoreboard\": {\n" +
            "          \"duration\": 1200.9400634765625,\n" +
            "          \"roshan_respawn_timer\": 0,\n" +
            "          \"radiant\": {\n" +
            "            \"score\": 24,\n" +
            "            \"tower_state\": 2047,\n" +
            "            \"barracks_state\": 63,\n" +
            "            \"picks\": [\n" +
            "              {\n" +
            "                \"hero_id\": 60\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 57\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 5\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 25\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 18\n" +
            "              }\n" +
            "            ],\n" +
            "            \"bans\": [\n" +
            "              {\n" +
            "                \"hero_id\": 83\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 97\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 65\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 104\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 109\n" +
            "              }\n" +
            "            ],\n" +
            "            \"players\": [\n" +
            "              {\n" +
            "                \"player_slot\": 1,\n" +
            "                \"account_id\": 117652939,\n" +
            "                \"hero_id\": 60,\n" +
            "                \"kills\": 7,\n" +
            "                \"death\": 2,\n" +
            "                \"assists\": 7,\n" +
            "                \"last_hits\": 88,\n" +
            "                \"denies\": 15,\n" +
            "                \"gold\": 732,\n" +
            "                \"level\": 14,\n" +
            "                \"gold_per_min\": 436,\n" +
            "                \"xp_per_min\": 452,\n" +
            "                \"ultimate_state\": 1,\n" +
            "                \"ultimate_cooldown\": 28,\n" +
            "                \"item0\": 229,\n" +
            "                \"item1\": 50,\n" +
            "                \"item2\": 181,\n" +
            "                \"item3\": 60,\n" +
            "                \"item4\": 65,\n" +
            "                \"item5\": 11,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": -2989.890869140625,\n" +
            "                \"position_y\": 3459.90234375,\n" +
            "                \"net_worth\": 8522\n" +
            "              },\n" +
            "              {\n" +
            "                \"player_slot\": 2,\n" +
            "                \"account_id\": 363801337,\n" +
            "                \"hero_id\": 57,\n" +
            "                \"kills\": 1,\n" +
            "                \"death\": 4,\n" +
            "                \"assists\": 11,\n" +
            "                \"last_hits\": 14,\n" +
            "                \"denies\": 2,\n" +
            "                \"gold\": 298,\n" +
            "                \"level\": 10,\n" +
            "                \"gold_per_min\": 207,\n" +
            "                \"xp_per_min\": 278,\n" +
            "                \"ultimate_state\": 1,\n" +
            "                \"ultimate_cooldown\": 88,\n" +
            "                \"item0\": 178,\n" +
            "                \"item1\": 0,\n" +
            "                \"item2\": 180,\n" +
            "                \"item3\": 188,\n" +
            "                \"item4\": 25,\n" +
            "                \"item5\": 218,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": -2073.342041015625,\n" +
            "                \"position_y\": 6019.9267578125,\n" +
            "                \"net_worth\": 3058\n" +
            "              },\n" +
            "              {\n" +
            "                \"player_slot\": 3,\n" +
            "                \"account_id\": 301863742,\n" +
            "                \"hero_id\": 18,\n" +
            "                \"kills\": 2,\n" +
            "                \"death\": 3,\n" +
            "                \"assists\": 6,\n" +
            "                \"last_hits\": 67,\n" +
            "                \"denies\": 1,\n" +
            "                \"gold\": 734,\n" +
            "                \"level\": 11,\n" +
            "                \"gold_per_min\": 247,\n" +
            "                \"xp_per_min\": 310,\n" +
            "                \"ultimate_state\": 1,\n" +
            "                \"ultimate_cooldown\": 15,\n" +
            "                \"item0\": 34,\n" +
            "                \"item1\": 46,\n" +
            "                \"item2\": 182,\n" +
            "                \"item3\": 63,\n" +
            "                \"item4\": 0,\n" +
            "                \"item5\": 1,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": -2303.333251953125,\n" +
            "                \"position_y\": 6013.25244140625,\n" +
            "                \"net_worth\": 4784\n" +
            "              },\n" +
            "              {\n" +
            "                \"player_slot\": 4,\n" +
            "                \"account_id\": 164249437,\n" +
            "                \"hero_id\": 5,\n" +
            "                \"kills\": 1,\n" +
            "                \"death\": 4,\n" +
            "                \"assists\": 9,\n" +
            "                \"last_hits\": 11,\n" +
            "                \"denies\": 0,\n" +
            "                \"gold\": 2018,\n" +
            "                \"level\": 10,\n" +
            "                \"gold_per_min\": 202,\n" +
            "                \"xp_per_min\": 256,\n" +
            "                \"ultimate_state\": 1,\n" +
            "                \"ultimate_cooldown\": 40,\n" +
            "                \"item0\": 36,\n" +
            "                \"item1\": 214,\n" +
            "                \"item2\": 0,\n" +
            "                \"item3\": 188,\n" +
            "                \"item4\": 0,\n" +
            "                \"item5\": 0,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": 922.9190673828125,\n" +
            "                \"position_y\": -3098.725830078125,\n" +
            "                \"net_worth\": 3508\n" +
            "              },\n" +
            "              {\n" +
            "                \"player_slot\": 5,\n" +
            "                \"account_id\": 156755896,\n" +
            "                \"hero_id\": 25,\n" +
            "                \"kills\": 13,\n" +
            "                \"death\": 5,\n" +
            "                \"assists\": 3,\n" +
            "                \"last_hits\": 83,\n" +
            "                \"denies\": 3,\n" +
            "                \"gold\": 1038,\n" +
            "                \"level\": 15,\n" +
            "                \"gold_per_min\": 431,\n" +
            "                \"xp_per_min\": 514,\n" +
            "                \"ultimate_state\": 1,\n" +
            "                \"ultimate_cooldown\": 59,\n" +
            "                \"item0\": 41,\n" +
            "                \"item1\": 50,\n" +
            "                \"item2\": 121,\n" +
            "                \"item3\": 244,\n" +
            "                \"item4\": 0,\n" +
            "                \"item5\": 0,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": -2575.109619140625,\n" +
            "                \"position_y\": 5394.78076171875,\n" +
            "                \"net_worth\": 8028\n" +
            "              }\n" +
            "            ],\n" +
            "            \"abilities\": [\n" +
            "              {\n" +
            "                \"ability_id\": 5040,\n" +
            "                \"ability_level\": 4\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5041,\n" +
            "                \"ability_level\": 3\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5042,\n" +
            "                \"ability_level\": 4\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5043,\n" +
            "                \"ability_level\": 2\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 6388,\n" +
            "                \"ability_level\": 1\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          \"dire\": {\n" +
            "            \"score\": 18,\n" +
            "            \"tower_state\": 1974,\n" +
            "            \"barracks_state\": 63,\n" +
            "            \"picks\": [\n" +
            "              {\n" +
            "                \"hero_id\": 36\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 84\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 75\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 39\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 73\n" +
            "              }\n" +
            "            ],\n" +
            "            \"bans\": [\n" +
            "              {\n" +
            "                \"hero_id\": 74\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 99\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 1\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 93\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 44\n" +
            "              }\n" +
            "            ],\n" +
            "            \"players\": [\n" +
            "              {\n" +
            "                \"player_slot\": 1,\n" +
            "                \"account_id\": 153306675,\n" +
            "                \"hero_id\": 36,\n" +
            "                \"kills\": 0,\n" +
            "                \"death\": 4,\n" +
            "                \"assists\": 10,\n" +
            "                \"last_hits\": 19,\n" +
            "                \"denies\": 0,\n" +
            "                \"gold\": 84,\n" +
            "                \"level\": 8,\n" +
            "                \"gold_per_min\": 155,\n" +
            "                \"xp_per_min\": 205,\n" +
            "                \"ultimate_state\": 1,\n" +
            "                \"ultimate_cooldown\": 8,\n" +
            "                \"item0\": 94,\n" +
            "                \"item1\": 86,\n" +
            "                \"item2\": 34,\n" +
            "                \"item3\": 29,\n" +
            "                \"item4\": 42,\n" +
            "                \"item5\": 0,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": -708.6932373046875,\n" +
            "                \"position_y\": 5854.99853515625,\n" +
            "                \"net_worth\": 2219\n" +
            "              },\n" +
            "              {\n" +
            "                \"player_slot\": 2,\n" +
            "                \"account_id\": 291958380,\n" +
            "                \"hero_id\": 84,\n" +
            "                \"kills\": 2,\n" +
            "                \"death\": 5,\n" +
            "                \"assists\": 5,\n" +
            "                \"last_hits\": 3,\n" +
            "                \"denies\": 0,\n" +
            "                \"gold\": 480,\n" +
            "                \"level\": 6,\n" +
            "                \"gold_per_min\": 144,\n" +
            "                \"xp_per_min\": 116,\n" +
            "                \"ultimate_state\": 3,\n" +
            "                \"ultimate_cooldown\": 0,\n" +
            "                \"item0\": 29,\n" +
            "                \"item1\": 0,\n" +
            "                \"item2\": 181,\n" +
            "                \"item3\": 34,\n" +
            "                \"item4\": 178,\n" +
            "                \"item5\": 0,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": 3258.4287109375,\n" +
            "                \"position_y\": 5614.0751953125,\n" +
            "                \"net_worth\": 2105\n" +
            "              },\n" +
            "              {\n" +
            "                \"player_slot\": 3,\n" +
            "                \"account_id\": 163816454,\n" +
            "                \"hero_id\": 73,\n" +
            "                \"kills\": 1,\n" +
            "                \"death\": 7,\n" +
            "                \"assists\": 5,\n" +
            "                \"last_hits\": 52,\n" +
            "                \"denies\": 3,\n" +
            "                \"gold\": 3027,\n" +
            "                \"level\": 11,\n" +
            "                \"gold_per_min\": 269,\n" +
            "                \"xp_per_min\": 330,\n" +
            "                \"ultimate_state\": 1,\n" +
            "                \"ultimate_cooldown\": 41,\n" +
            "                \"item0\": 29,\n" +
            "                \"item1\": 46,\n" +
            "                \"item2\": 41,\n" +
            "                \"item3\": 16,\n" +
            "                \"item4\": 16,\n" +
            "                \"item5\": 182,\n" +
            "                \"respawn_timer\": 34,\n" +
            "                \"position_x\": -2088.06982421875,\n" +
            "                \"position_y\": 6080.5888671875,\n" +
            "                \"net_worth\": 4427\n" +
            "              },\n" +
            "              {\n" +
            "                \"player_slot\": 4,\n" +
            "                \"account_id\": 358007315,\n" +
            "                \"hero_id\": 39,\n" +
            "                \"kills\": 9,\n" +
            "                \"death\": 7,\n" +
            "                \"assists\": 4,\n" +
            "                \"last_hits\": 53,\n" +
            "                \"denies\": 7,\n" +
            "                \"gold\": 264,\n" +
            "                \"level\": 13,\n" +
            "                \"gold_per_min\": 386,\n" +
            "                \"xp_per_min\": 422,\n" +
            "                \"ultimate_state\": 3,\n" +
            "                \"ultimate_cooldown\": 0,\n" +
            "                \"item0\": 41,\n" +
            "                \"item1\": 190,\n" +
            "                \"item2\": 100,\n" +
            "                \"item3\": 29,\n" +
            "                \"item4\": 0,\n" +
            "                \"item5\": 36,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": -2054.8193359375,\n" +
            "                \"position_y\": 5115.70654296875,\n" +
            "                \"net_worth\": 6769\n" +
            "              },\n" +
            "              {\n" +
            "                \"player_slot\": 5,\n" +
            "                \"account_id\": 152172198,\n" +
            "                \"hero_id\": 75,\n" +
            "                \"kills\": 6,\n" +
            "                \"death\": 1,\n" +
            "                \"assists\": 5,\n" +
            "                \"last_hits\": 60,\n" +
            "                \"denies\": 12,\n" +
            "                \"gold\": 352,\n" +
            "                \"level\": 14,\n" +
            "                \"gold_per_min\": 337,\n" +
            "                \"xp_per_min\": 452,\n" +
            "                \"ultimate_state\": 1,\n" +
            "                \"ultimate_cooldown\": 53,\n" +
            "                \"item0\": 63,\n" +
            "                \"item1\": 46,\n" +
            "                \"item2\": 21,\n" +
            "                \"item3\": 206,\n" +
            "                \"item4\": 18,\n" +
            "                \"item5\": 77,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": -563.2664794921875,\n" +
            "                \"position_y\": 5900.43212890625,\n" +
            "                \"net_worth\": 6752\n" +
            "              }\n" +
            "            ],\n" +
            "            \"abilities\": [\n" +
            "              {\n" +
            "                \"ability_id\": 5377,\n" +
            "                \"ability_level\": 3\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5378,\n" +
            "                \"ability_level\": 4\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5379,\n" +
            "                \"ability_level\": 4\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5380,\n" +
            "                \"ability_level\": 2\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 6117,\n" +
            "                \"ability_level\": 1\n" +
            "              }\n" +
            "            ]\n" +
            "          }\n" +
            "        }\n" +
            "      },\n" +
            "      {\n" +
            "        \"players\": [\n" +
            "          {\n" +
            "            \"account_id\": 292933099,\n" +
            "            \"name\": \"FACEIT.com | Chestgravel Bot\",\n" +
            "            \"hero_id\": 0,\n" +
            "            \"team\": 4\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 302068323,\n" +
            "            \"name\": \"Guyver!\",\n" +
            "            \"hero_id\": 59,\n" +
            "            \"team\": 0\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 164308812,\n" +
            "            \"name\": \"stormy weather time!\",\n" +
            "            \"hero_id\": 85,\n" +
            "            \"team\": 1\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 122138421,\n" +
            "            \"name\": \"Stewie Griffin\",\n" +
            "            \"hero_id\": 50,\n" +
            "            \"team\": 1\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 383276135,\n" +
            "            \"name\": \"Это был кувалда\",\n" +
            "            \"hero_id\": 30,\n" +
            "            \"team\": 1\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 223825442,\n" +
            "            \"name\": \"Fuck Pussy For Ever\",\n" +
            "            \"hero_id\": 63,\n" +
            "            \"team\": 1\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 119474976,\n" +
            "            \"name\": \"porno.dealer\",\n" +
            "            \"hero_id\": 74,\n" +
            "            \"team\": 1\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 150797825,\n" +
            "            \"name\": \"Q\",\n" +
            "            \"hero_id\": 0,\n" +
            "            \"team\": 0\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 344809816,\n" +
            "            \"name\": \"Floki ??!!\",\n" +
            "            \"hero_id\": 93,\n" +
            "            \"team\": 0\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 124380676,\n" +
            "            \"name\": \"Power Dans\",\n" +
            "            \"hero_id\": 57,\n" +
            "            \"team\": 0\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 78803693,\n" +
            "            \"name\": \"Shpion\",\n" +
            "            \"hero_id\": 65,\n" +
            "            \"team\": 0\n" +
            "          }\n" +
            "        ],\n" +
            "        \"lobby_id\": 25126350635526892,\n" +
            "        \"match_id\": 3262310046,\n" +
            "        \"spectators\": 2,\n" +
            "        \"series_id\": 0,\n" +
            "        \"game_number\": 0,\n" +
            "        \"league_id\": 4122,\n" +
            "        \"stream_delay_s\": 300,\n" +
            "        \"radiant_series_wins\": 0,\n" +
            "        \"dire_series_wins\": 0,\n" +
            "        \"series_type\": 0,\n" +
            "        \"league_series_id\": 0,\n" +
            "        \"league_game_id\": 0,\n" +
            "        \"stage_name\": \"\",\n" +
            "        \"league_tier\": 1,\n" +
            "        \"scoreboard\": {\n" +
            "          \"duration\": 870.6873779296875,\n" +
            "          \"roshan_respawn_timer\": 0,\n" +
            "          \"radiant\": {\n" +
            "            \"score\": 7,\n" +
            "            \"tower_state\": 1846,\n" +
            "            \"barracks_state\": 63,\n" +
            "            \"picks\": [\n" +
            "              {\n" +
            "                \"hero_id\": 93\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 57\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 59\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 95\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 65\n" +
            "              }\n" +
            "            ],\n" +
            "            \"bans\": [\n" +
            "              {\n" +
            "                \"hero_id\": 36\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 35\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 44\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 98\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 46\n" +
            "              }\n" +
            "            ],\n" +
            "            \"players\": [\n" +
            "              {\n" +
            "                \"player_slot\": 1,\n" +
            "                \"account_id\": 302068323,\n" +
            "                \"hero_id\": 59,\n" +
            "                \"kills\": 2,\n" +
            "                \"death\": 4,\n" +
            "                \"assists\": 0,\n" +
            "                \"last_hits\": 64,\n" +
            "                \"denies\": 1,\n" +
            "                \"gold\": 261,\n" +
            "                \"level\": 10,\n" +
            "                \"gold_per_min\": 429,\n" +
            "                \"xp_per_min\": 368,\n" +
            "                \"ultimate_state\": 3,\n" +
            "                \"ultimate_cooldown\": 0,\n" +
            "                \"item0\": 63,\n" +
            "                \"item1\": 73,\n" +
            "                \"item2\": 73,\n" +
            "                \"item3\": 164,\n" +
            "                \"item4\": 21,\n" +
            "                \"item5\": 0,\n" +
            "                \"respawn_timer\": 13,\n" +
            "                \"position_x\": -6760.29541015625,\n" +
            "                \"position_y\": -1503.9730224609375,\n" +
            "                \"net_worth\": 5616\n" +
            "              },\n" +
            "              {\n" +
            "                \"player_slot\": 2,\n" +
            "                \"account_id\": 344809816,\n" +
            "                \"hero_id\": 93,\n" +
            "                \"kills\": 0,\n" +
            "                \"death\": 1,\n" +
            "                \"assists\": 0,\n" +
            "                \"last_hits\": 1,\n" +
            "                \"denies\": 0,\n" +
            "                \"gold\": 1,\n" +
            "                \"level\": 1,\n" +
            "                \"gold_per_min\": 121,\n" +
            "                \"xp_per_min\": 4,\n" +
            "                \"ultimate_state\": 0,\n" +
            "                \"ultimate_cooldown\": 0,\n" +
            "                \"item0\": 0,\n" +
            "                \"item1\": 0,\n" +
            "                \"item2\": 0,\n" +
            "                \"item3\": 0,\n" +
            "                \"item4\": 0,\n" +
            "                \"item5\": 0,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": -5781.78125,\n" +
            "                \"position_y\": -6869.7099609375,\n" +
            "                \"net_worth\": 1\n" +
            "              },\n" +
            "              {\n" +
            "                \"player_slot\": 3,\n" +
            "                \"account_id\": 78803693,\n" +
            "                \"hero_id\": 65,\n" +
            "                \"kills\": 4,\n" +
            "                \"death\": 5,\n" +
            "                \"assists\": 2,\n" +
            "                \"last_hits\": 25,\n" +
            "                \"denies\": 3,\n" +
            "                \"gold\": 1926,\n" +
            "                \"level\": 10,\n" +
            "                \"gold_per_min\": 399,\n" +
            "                \"xp_per_min\": 361,\n" +
            "                \"ultimate_state\": 3,\n" +
            "                \"ultimate_cooldown\": 0,\n" +
            "                \"item0\": 214,\n" +
            "                \"item1\": 44,\n" +
            "                \"item2\": 46,\n" +
            "                \"item3\": 0,\n" +
            "                \"item4\": 0,\n" +
            "                \"item5\": 102,\n" +
            "                \"respawn_timer\": 12,\n" +
            "                \"position_x\": -6365.42919921875,\n" +
            "                \"position_y\": -1183.001708984375,\n" +
            "                \"net_worth\": 5326\n" +
            "              },\n" +
            "              {\n" +
            "                \"player_slot\": 4,\n" +
            "                \"account_id\": 124380676,\n" +
            "                \"hero_id\": 57,\n" +
            "                \"kills\": 1,\n" +
            "                \"death\": 2,\n" +
            "                \"assists\": 0,\n" +
            "                \"last_hits\": 36,\n" +
            "                \"denies\": 3,\n" +
            "                \"gold\": 2,\n" +
            "                \"level\": 8,\n" +
            "                \"gold_per_min\": 289,\n" +
            "                \"xp_per_min\": 280,\n" +
            "                \"ultimate_state\": 3,\n" +
            "                \"ultimate_cooldown\": 0,\n" +
            "                \"item0\": 92,\n" +
            "                \"item1\": 40,\n" +
            "                \"item2\": 180,\n" +
            "                \"item3\": 94,\n" +
            "                \"item4\": 0,\n" +
            "                \"item5\": 0,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": -7298.8408203125,\n" +
            "                \"position_y\": -6766.21142578125,\n" +
            "                \"net_worth\": 3232\n" +
            "              },\n" +
            "              {\n" +
            "                \"player_slot\": 5,\n" +
            "                \"account_id\": 150797825,\n" +
            "                \"hero_id\": 95,\n" +
            "                \"kills\": 0,\n" +
            "                \"death\": 0,\n" +
            "                \"assists\": 0,\n" +
            "                \"last_hits\": 0,\n" +
            "                \"denies\": 0,\n" +
            "                \"gold\": 2,\n" +
            "                \"level\": 1,\n" +
            "                \"gold_per_min\": 99,\n" +
            "                \"xp_per_min\": 0,\n" +
            "                \"ultimate_state\": 0,\n" +
            "                \"ultimate_cooldown\": 0,\n" +
            "                \"item0\": 0,\n" +
            "                \"item1\": 0,\n" +
            "                \"item2\": 0,\n" +
            "                \"item3\": 0,\n" +
            "                \"item4\": 0,\n" +
            "                \"item5\": 0,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": -7007.279296875,\n" +
            "                \"position_y\": -6718.0869140625,\n" +
            "                \"net_worth\": 2\n" +
            "              }\n" +
            "            ],\n" +
            "            \"abilities\": [\n" +
            "              {\n" +
            "                \"ability_id\": 5508,\n" +
            "                \"ability_level\": 1\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          \"dire\": {\n" +
            "            \"score\": 12,\n" +
            "            \"tower_state\": 2039,\n" +
            "            \"barracks_state\": 63,\n" +
            "            \"picks\": [\n" +
            "              {\n" +
            "                \"hero_id\": 30\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 85\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 50\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 74\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 63\n" +
            "              }\n" +
            "            ],\n" +
            "            \"bans\": [\n" +
            "              {\n" +
            "                \"hero_id\": 70\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 48\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 75\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 6\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 20\n" +
            "              }\n" +
            "            ],\n" +
            "            \"players\": [\n" +
            "              {\n" +
            "                \"player_slot\": 1,\n" +
            "                \"account_id\": 223825442,\n" +
            "                \"hero_id\": 63,\n" +
            "                \"kills\": 2,\n" +
            "                \"death\": 0,\n" +
            "                \"assists\": 1,\n" +
            "                \"last_hits\": 67,\n" +
            "                \"denies\": 7,\n" +
            "                \"gold\": 53,\n" +
            "                \"level\": 11,\n" +
            "                \"gold_per_min\": 389,\n" +
            "                \"xp_per_min\": 428,\n" +
            "                \"ultimate_state\": 3,\n" +
            "                \"ultimate_cooldown\": 0,\n" +
            "                \"item0\": 0,\n" +
            "                \"item1\": 212,\n" +
            "                \"item2\": 29,\n" +
            "                \"item3\": 168,\n" +
            "                \"item4\": 57,\n" +
            "                \"item5\": 0,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": 2631.0751953125,\n" +
            "                \"position_y\": -5947.53857421875,\n" +
            "                \"net_worth\": 5788\n" +
            "              },\n" +
            "              {\n" +
            "                \"player_slot\": 2,\n" +
            "                \"account_id\": 122138421,\n" +
            "                \"hero_id\": 50,\n" +
            "                \"kills\": 0,\n" +
            "                \"death\": 0,\n" +
            "                \"assists\": 6,\n" +
            "                \"last_hits\": 2,\n" +
            "                \"denies\": 0,\n" +
            "                \"gold\": 470,\n" +
            "                \"level\": 7,\n" +
            "                \"gold_per_min\": 234,\n" +
            "                \"xp_per_min\": 238,\n" +
            "                \"ultimate_state\": 1,\n" +
            "                \"ultimate_cooldown\": 0,\n" +
            "                \"item0\": 180,\n" +
            "                \"item1\": 92,\n" +
            "                \"item2\": 36,\n" +
            "                \"item3\": 46,\n" +
            "                \"item4\": 237,\n" +
            "                \"item5\": 0,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": -6430.32568359375,\n" +
            "                \"position_y\": -765.1581420898438,\n" +
            "                \"net_worth\": 3230\n" +
            "              },\n" +
            "              {\n" +
            "                \"player_slot\": 3,\n" +
            "                \"account_id\": 383276135,\n" +
            "                \"hero_id\": 30,\n" +
            "                \"kills\": 4,\n" +
            "                \"death\": 2,\n" +
            "                \"assists\": 4,\n" +
            "                \"last_hits\": 7,\n" +
            "                \"denies\": 4,\n" +
            "                \"gold\": 1163,\n" +
            "                \"level\": 7,\n" +
            "                \"gold_per_min\": 238,\n" +
            "                \"xp_per_min\": 219,\n" +
            "                \"ultimate_state\": 1,\n" +
            "                \"ultimate_cooldown\": 56,\n" +
            "                \"item0\": 180,\n" +
            "                \"item1\": 36,\n" +
            "                \"item2\": 188,\n" +
            "                \"item3\": 0,\n" +
            "                \"item4\": 0,\n" +
            "                \"item5\": 0,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": -6017.74755859375,\n" +
            "                \"position_y\": -494.621826171875,\n" +
            "                \"net_worth\": 2978\n" +
            "              },\n" +
            "              {\n" +
            "                \"player_slot\": 4,\n" +
            "                \"account_id\": 164308812,\n" +
            "                \"hero_id\": 85,\n" +
            "                \"kills\": 4,\n" +
            "                \"death\": 4,\n" +
            "                \"assists\": 3,\n" +
            "                \"last_hits\": 49,\n" +
            "                \"denies\": 5,\n" +
            "                \"gold\": 328,\n" +
            "                \"level\": 9,\n" +
            "                \"gold_per_min\": 333,\n" +
            "                \"xp_per_min\": 340,\n" +
            "                \"ultimate_state\": 1,\n" +
            "                \"ultimate_cooldown\": 38,\n" +
            "                \"item0\": 36,\n" +
            "                \"item1\": 187,\n" +
            "                \"item2\": 182,\n" +
            "                \"item3\": 25,\n" +
            "                \"item4\": 0,\n" +
            "                \"item5\": 0,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": -6323.90380859375,\n" +
            "                \"position_y\": -821.4974975585938,\n" +
            "                \"net_worth\": 4318\n" +
            "              },\n" +
            "              {\n" +
            "                \"player_slot\": 5,\n" +
            "                \"account_id\": 119474976,\n" +
            "                \"hero_id\": 74,\n" +
            "                \"kills\": 1,\n" +
            "                \"death\": 1,\n" +
            "                \"assists\": 3,\n" +
            "                \"last_hits\": 82,\n" +
            "                \"denies\": 2,\n" +
            "                \"gold\": 380,\n" +
            "                \"level\": 12,\n" +
            "                \"gold_per_min\": 437,\n" +
            "                \"xp_per_min\": 469,\n" +
            "                \"ultimate_state\": 3,\n" +
            "                \"ultimate_cooldown\": 0,\n" +
            "                \"item0\": 77,\n" +
            "                \"item1\": 23,\n" +
            "                \"item2\": 60,\n" +
            "                \"item3\": 65,\n" +
            "                \"item4\": 29,\n" +
            "                \"item5\": 21,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": -6590.55908203125,\n" +
            "                \"position_y\": -449.01702880859375,\n" +
            "                \"net_worth\": 6600\n" +
            "              }\n" +
            "            ],\n" +
            "            \"abilities\": [\n" +
            "              {\n" +
            "                \"ability_id\": 5370,\n" +
            "                \"ability_level\": 3\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5371,\n" +
            "                \"ability_level\": 2\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5372,\n" +
            "                \"ability_level\": 6\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5384,\n" +
            "                \"ability_level\": 1\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5387,\n" +
            "                \"ability_level\": 1\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5375,\n" +
            "                \"ability_level\": 1\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5385,\n" +
            "                \"ability_level\": 1\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5376,\n" +
            "                \"ability_level\": 1\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5383,\n" +
            "                \"ability_level\": 1\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5381,\n" +
            "                \"ability_level\": 1\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5390,\n" +
            "                \"ability_level\": 1\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5386,\n" +
            "                \"ability_level\": 1\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5389,\n" +
            "                \"ability_level\": 1\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5382,\n" +
            "                \"ability_level\": 1\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5938,\n" +
            "                \"ability_level\": 1\n" +
            "              }\n" +
            "            ]\n" +
            "          }\n" +
            "        }\n" +
            "      },\n" +
            "      {\n" +
            "        \"players\": [\n" +
            "          {\n" +
            "            \"account_id\": 292951515,\n" +
            "            \"name\": \"FACEIT.com | Swordzinc Bot\",\n" +
            "            \"hero_id\": 0,\n" +
            "            \"team\": 4\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 73887511,\n" +
            "            \"name\": \"Senas|TopSena bets.gg\",\n" +
            "            \"hero_id\": 50,\n" +
            "            \"team\": 1\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 254940892,\n" +
            "            \"name\": \"ГоловаЧ лена\",\n" +
            "            \"hero_id\": 27,\n" +
            "            \"team\": 0\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 73127318,\n" +
            "            \"name\": \"Sweaty Hands\",\n" +
            "            \"hero_id\": 11,\n" +
            "            \"team\": 0\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 155351934,\n" +
            "            \"name\": \"Maionezzz\",\n" +
            "            \"hero_id\": 6,\n" +
            "            \"team\": 0\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 394732680,\n" +
            "            \"name\": \"кроооошик\",\n" +
            "            \"hero_id\": 16,\n" +
            "            \"team\": 1\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 97297051,\n" +
            "            \"name\": \"=P1GE0N=\",\n" +
            "            \"hero_id\": 20,\n" +
            "            \"team\": 0\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 159118526,\n" +
            "            \"name\": \"Gandalf the White\",\n" +
            "            \"hero_id\": 84,\n" +
            "            \"team\": 1\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 192190634,\n" +
            "            \"name\": \"Gekyba\",\n" +
            "            \"hero_id\": 63,\n" +
            "            \"team\": 1\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 135417226,\n" +
            "            \"name\": \"Exort\",\n" +
            "            \"hero_id\": 43,\n" +
            "            \"team\": 1\n" +
            "          },\n" +
            "          {\n" +
            "            \"account_id\": 194039559,\n" +
            "            \"name\": \"-EterN1TY_\",\n" +
            "            \"hero_id\": 2,\n" +
            "            \"team\": 0\n" +
            "          }\n" +
            "        ],\n" +
            "        \"radiant_team\": {\n" +
            "          \"team_name\": \"SUKAVNEZAKONA!\",\n" +
            "          \"team_id\": 3321686,\n" +
            "          \"team_logo\": 266098287266215330,\n" +
            "          \"complete\": false\n" +
            "        },\n" +
            "        \"lobby_id\": 25126350625136964,\n" +
            "        \"match_id\": 3262274685,\n" +
            "        \"spectators\": 1,\n" +
            "        \"series_id\": 0,\n" +
            "        \"game_number\": 0,\n" +
            "        \"league_id\": 4122,\n" +
            "        \"stream_delay_s\": 300,\n" +
            "        \"radiant_series_wins\": 0,\n" +
            "        \"dire_series_wins\": 0,\n" +
            "        \"series_type\": 0,\n" +
            "        \"league_series_id\": 0,\n" +
            "        \"league_game_id\": 0,\n" +
            "        \"stage_name\": \"\",\n" +
            "        \"league_tier\": 1,\n" +
            "        \"scoreboard\": {\n" +
            "          \"duration\": 1496.0458984375,\n" +
            "          \"roshan_respawn_timer\": 0,\n" +
            "          \"radiant\": {\n" +
            "            \"score\": 13,\n" +
            "            \"tower_state\": 1846,\n" +
            "            \"barracks_state\": 63,\n" +
            "            \"picks\": [\n" +
            "              {\n" +
            "                \"hero_id\": 6\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 11\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 20\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 27\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 2\n" +
            "              }\n" +
            "            ],\n" +
            "            \"bans\": [\n" +
            "              {\n" +
            "                \"hero_id\": 99\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 37\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 28\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 67\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 34\n" +
            "              }\n" +
            "            ],\n" +
            "            \"players\": [\n" +
            "              {\n" +
            "                \"player_slot\": 1,\n" +
            "                \"account_id\": 254940892,\n" +
            "                \"hero_id\": 27,\n" +
            "                \"kills\": 2,\n" +
            "                \"death\": 7,\n" +
            "                \"assists\": 5,\n" +
            "                \"last_hits\": 13,\n" +
            "                \"denies\": 8,\n" +
            "                \"gold\": 507,\n" +
            "                \"level\": 9,\n" +
            "                \"gold_per_min\": 156,\n" +
            "                \"xp_per_min\": 181,\n" +
            "                \"ultimate_state\": 3,\n" +
            "                \"ultimate_cooldown\": 0,\n" +
            "                \"item0\": 42,\n" +
            "                \"item1\": 40,\n" +
            "                \"item2\": 180,\n" +
            "                \"item3\": 237,\n" +
            "                \"item4\": 94,\n" +
            "                \"item5\": 46,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": -2425.4443359375,\n" +
            "                \"position_y\": 191.87088012695312,\n" +
            "                \"net_worth\": 2842\n" +
            "              },\n" +
            "              {\n" +
            "                \"player_slot\": 2,\n" +
            "                \"account_id\": 73127318,\n" +
            "                \"hero_id\": 11,\n" +
            "                \"kills\": 5,\n" +
            "                \"death\": 2,\n" +
            "                \"assists\": 3,\n" +
            "                \"last_hits\": 176,\n" +
            "                \"denies\": 17,\n" +
            "                \"gold\": 1960,\n" +
            "                \"level\": 17,\n" +
            "                \"gold_per_min\": 459,\n" +
            "                \"xp_per_min\": 516,\n" +
            "                \"ultimate_state\": 1,\n" +
            "                \"ultimate_cooldown\": 34,\n" +
            "                \"item0\": 236,\n" +
            "                \"item1\": 63,\n" +
            "                \"item2\": 41,\n" +
            "                \"item3\": 8,\n" +
            "                \"item4\": 152,\n" +
            "                \"item5\": 212,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": -2629.970703125,\n" +
            "                \"position_y\": -3659.90576171875,\n" +
            "                \"net_worth\": 11195\n" +
            "              },\n" +
            "              {\n" +
            "                \"player_slot\": 3,\n" +
            "                \"account_id\": 155351934,\n" +
            "                \"hero_id\": 6,\n" +
            "                \"kills\": 3,\n" +
            "                \"death\": 0,\n" +
            "                \"assists\": 5,\n" +
            "                \"last_hits\": 159,\n" +
            "                \"denies\": 22,\n" +
            "                \"gold\": 1333,\n" +
            "                \"level\": 14,\n" +
            "                \"gold_per_min\": 427,\n" +
            "                \"xp_per_min\": 392,\n" +
            "                \"ultimate_state\": 3,\n" +
            "                \"ultimate_cooldown\": 0,\n" +
            "                \"item0\": 152,\n" +
            "                \"item1\": 263,\n" +
            "                \"item2\": 63,\n" +
            "                \"item3\": 212,\n" +
            "                \"item4\": 46,\n" +
            "                \"item5\": 0,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": -5221.724609375,\n" +
            "                \"position_y\": 217.418701171875,\n" +
            "                \"net_worth\": 11068\n" +
            "              },\n" +
            "              {\n" +
            "                \"player_slot\": 4,\n" +
            "                \"account_id\": 194039559,\n" +
            "                \"hero_id\": 2,\n" +
            "                \"kills\": 2,\n" +
            "                \"death\": 5,\n" +
            "                \"assists\": 4,\n" +
            "                \"last_hits\": 92,\n" +
            "                \"denies\": 2,\n" +
            "                \"gold\": 379,\n" +
            "                \"level\": 13,\n" +
            "                \"gold_per_min\": 297,\n" +
            "                \"xp_per_min\": 350,\n" +
            "                \"ultimate_state\": 3,\n" +
            "                \"ultimate_cooldown\": 0,\n" +
            "                \"item0\": 214,\n" +
            "                \"item1\": 125,\n" +
            "                \"item2\": 1,\n" +
            "                \"item3\": 4,\n" +
            "                \"item4\": 19,\n" +
            "                \"item5\": 46,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": -7100,\n" +
            "                \"position_y\": -6150.00390625,\n" +
            "                \"net_worth\": 6804\n" +
            "              },\n" +
            "              {\n" +
            "                \"player_slot\": 5,\n" +
            "                \"account_id\": 97297051,\n" +
            "                \"hero_id\": 20,\n" +
            "                \"kills\": 0,\n" +
            "                \"death\": 6,\n" +
            "                \"assists\": 9,\n" +
            "                \"last_hits\": 5,\n" +
            "                \"denies\": 3,\n" +
            "                \"gold\": 104,\n" +
            "                \"level\": 10,\n" +
            "                \"gold_per_min\": 158,\n" +
            "                \"xp_per_min\": 214,\n" +
            "                \"ultimate_state\": 3,\n" +
            "                \"ultimate_cooldown\": 0,\n" +
            "                \"item0\": 43,\n" +
            "                \"item1\": 0,\n" +
            "                \"item2\": 46,\n" +
            "                \"item3\": 29,\n" +
            "                \"item4\": 0,\n" +
            "                \"item5\": 240,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": -3260.62451171875,\n" +
            "                \"position_y\": -923,\n" +
            "                \"net_worth\": 1054\n" +
            "              }\n" +
            "            ],\n" +
            "            \"abilities\": [\n" +
            "              {\n" +
            "                \"ability_id\": 5122,\n" +
            "                \"ability_level\": 1\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5124,\n" +
            "                \"ability_level\": 4\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5123,\n" +
            "                \"ability_level\": 3\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5125,\n" +
            "                \"ability_level\": 1\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5936,\n" +
            "                \"ability_level\": 1\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          \"dire\": {\n" +
            "            \"score\": 20,\n" +
            "            \"tower_state\": 2022,\n" +
            "            \"barracks_state\": 63,\n" +
            "            \"picks\": [\n" +
            "              {\n" +
            "                \"hero_id\": 84\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 63\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 50\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 16\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 43\n" +
            "              }\n" +
            "            ],\n" +
            "            \"bans\": [\n" +
            "              {\n" +
            "                \"hero_id\": 75\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 74\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 79\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 40\n" +
            "              },\n" +
            "              {\n" +
            "                \"hero_id\": 29\n" +
            "              }\n" +
            "            ],\n" +
            "            \"players\": [\n" +
            "              {\n" +
            "                \"player_slot\": 1,\n" +
            "                \"account_id\": 394732680,\n" +
            "                \"hero_id\": 16,\n" +
            "                \"kills\": 3,\n" +
            "                \"death\": 3,\n" +
            "                \"assists\": 10,\n" +
            "                \"last_hits\": 66,\n" +
            "                \"denies\": 1,\n" +
            "                \"gold\": 360,\n" +
            "                \"level\": 13,\n" +
            "                \"gold_per_min\": 271,\n" +
            "                \"xp_per_min\": 318,\n" +
            "                \"ultimate_state\": 1,\n" +
            "                \"ultimate_cooldown\": 30,\n" +
            "                \"item0\": 102,\n" +
            "                \"item1\": 1,\n" +
            "                \"item2\": 180,\n" +
            "                \"item3\": 239,\n" +
            "                \"item4\": 46,\n" +
            "                \"item5\": 0,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": 274.1334533691406,\n" +
            "                \"position_y\": 2460.47607421875,\n" +
            "                \"net_worth\": 6710\n" +
            "              },\n" +
            "              {\n" +
            "                \"player_slot\": 2,\n" +
            "                \"account_id\": 135417226,\n" +
            "                \"hero_id\": 43,\n" +
            "                \"kills\": 9,\n" +
            "                \"death\": 1,\n" +
            "                \"assists\": 7,\n" +
            "                \"last_hits\": 118,\n" +
            "                \"denies\": 10,\n" +
            "                \"gold\": 1965,\n" +
            "                \"level\": 14,\n" +
            "                \"gold_per_min\": 406,\n" +
            "                \"xp_per_min\": 403,\n" +
            "                \"ultimate_state\": 3,\n" +
            "                \"ultimate_cooldown\": 0,\n" +
            "                \"item0\": 100,\n" +
            "                \"item1\": 9,\n" +
            "                \"item2\": 37,\n" +
            "                \"item3\": 41,\n" +
            "                \"item4\": 77,\n" +
            "                \"item5\": 50,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": 5810.19091796875,\n" +
            "                \"position_y\": -2816.78125,\n" +
            "                \"net_worth\": 10025\n" +
            "              },\n" +
            "              {\n" +
            "                \"player_slot\": 3,\n" +
            "                \"account_id\": 192190634,\n" +
            "                \"hero_id\": 63,\n" +
            "                \"kills\": 7,\n" +
            "                \"death\": 2,\n" +
            "                \"assists\": 7,\n" +
            "                \"last_hits\": 131,\n" +
            "                \"denies\": 5,\n" +
            "                \"gold\": 1261,\n" +
            "                \"level\": 16,\n" +
            "                \"gold_per_min\": 426,\n" +
            "                \"xp_per_min\": 466,\n" +
            "                \"ultimate_state\": 3,\n" +
            "                \"ultimate_cooldown\": 0,\n" +
            "                \"item0\": 8,\n" +
            "                \"item1\": 123,\n" +
            "                \"item2\": 212,\n" +
            "                \"item3\": 63,\n" +
            "                \"item4\": 240,\n" +
            "                \"item5\": 0,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": 4004.521240234375,\n" +
            "                \"position_y\": 721.9775390625,\n" +
            "                \"net_worth\": 10346\n" +
            "              },\n" +
            "              {\n" +
            "                \"player_slot\": 4,\n" +
            "                \"account_id\": 159118526,\n" +
            "                \"hero_id\": 84,\n" +
            "                \"kills\": 1,\n" +
            "                \"death\": 5,\n" +
            "                \"assists\": 10,\n" +
            "                \"last_hits\": 9,\n" +
            "                \"denies\": 2,\n" +
            "                \"gold\": 151,\n" +
            "                \"level\": 10,\n" +
            "                \"gold_per_min\": 162,\n" +
            "                \"xp_per_min\": 214,\n" +
            "                \"ultimate_state\": 3,\n" +
            "                \"ultimate_cooldown\": 0,\n" +
            "                \"item0\": 36,\n" +
            "                \"item1\": 180,\n" +
            "                \"item2\": 218,\n" +
            "                \"item3\": 0,\n" +
            "                \"item4\": 0,\n" +
            "                \"item5\": 181,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": -1205.272216796875,\n" +
            "                \"position_y\": -870.2720947265625,\n" +
            "                \"net_worth\": 2451\n" +
            "              },\n" +
            "              {\n" +
            "                \"player_slot\": 5,\n" +
            "                \"account_id\": 73887511,\n" +
            "                \"hero_id\": 50,\n" +
            "                \"kills\": 0,\n" +
            "                \"death\": 2,\n" +
            "                \"assists\": 12,\n" +
            "                \"last_hits\": 26,\n" +
            "                \"denies\": 1,\n" +
            "                \"gold\": 1921,\n" +
            "                \"level\": 11,\n" +
            "                \"gold_per_min\": 199,\n" +
            "                \"xp_per_min\": 262,\n" +
            "                \"ultimate_state\": 3,\n" +
            "                \"ultimate_cooldown\": 0,\n" +
            "                \"item0\": 187,\n" +
            "                \"item1\": 29,\n" +
            "                \"item2\": 44,\n" +
            "                \"item3\": 40,\n" +
            "                \"item4\": 188,\n" +
            "                \"item5\": 0,\n" +
            "                \"respawn_timer\": 0,\n" +
            "                \"position_x\": 5268.21630859375,\n" +
            "                \"position_y\": -2137.558349609375,\n" +
            "                \"net_worth\": 3851\n" +
            "              }\n" +
            "            ],\n" +
            "            \"abilities\": [\n" +
            "              {\n" +
            "                \"ability_id\": 5233,\n" +
            "                \"ability_level\": 1\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5234,\n" +
            "                \"ability_level\": 4\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5235,\n" +
            "                \"ability_level\": 4\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5236,\n" +
            "                \"ability_level\": 1\n" +
            "              },\n" +
            "              {\n" +
            "                \"ability_id\": 5965,\n" +
            "                \"ability_level\": 1\n" +
            "              }\n" +
            "            ]\n" +
            "          }\n" +
            "        }\n" +
            "      \n" +
            "      }\n" +
            "    ],\n" +
            "    \"status\": 200\n" +
            "  }\n" +
            "}";


}