package com.michaelfotiadis.steam.provider;

import com.michaelfotiadis.steam.provider.image.ImageProvider;
import com.michaelfotiadis.steam.provider.image.Size;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImageProviderTest {

    @Test
    public void testGetItemEndpoint() throws Exception {

        final ImageProvider imageProvider = new ImageProvider();

        final String itemName1 = "item_cloak";
        final String expectedEndpoint1 = "http://cdn.dota2.com/apps/dota2/images/items/cloak_lg.png";
        final String actualEndpoint1 = imageProvider.getItemImageEndpoint(itemName1);

        assertEquals(expectedEndpoint1, actualEndpoint1);

        final String itemName2 = "cloak";
        final String expectedEndpoint2 = "http://cdn.dota2.com/apps/dota2/images/items/cloak_lg.png";
        final String actualEndpoint2 = imageProvider.getItemImageEndpoint(itemName2);

        assertEquals(expectedEndpoint2, actualEndpoint2);

        final String itemName3 = null;
        final String expectedEndpoint3 = "";
        final String actualEndpoint3 = imageProvider.getItemImageEndpoint(itemName3);

        assertEquals(expectedEndpoint3, actualEndpoint3);

        final String itemName4 = "";
        final String expectedEndpoint4 = "";
        final String actualEndpoint4 = imageProvider.getItemImageEndpoint(itemName4);

        assertEquals(expectedEndpoint4, actualEndpoint4);


    }

    @Test
    public void testGetHeroEndpoint() throws Exception {

        final ImageProvider imageProvider = new ImageProvider();

        final String heroName1 = "npc_dota_hero_antimage";
        final Size size1 = Size.LARGE_HORIZONTAL;
        final String expectedEndpoint1 = "http://cdn.dota2.com/apps/dota2/images/heroes/antimage_lg.png";
        final String actualEndpoint1 = imageProvider.getHeroImageEndpoint(heroName1, size1);

        assertEquals(expectedEndpoint1, actualEndpoint1);

        final String heroName2 = "antimage";
        final Size size2 = Size.FULL_VERTICAL;
        final String expectedEndpoint2 = "http://cdn.dota2.com/apps/dota2/images/heroes/antimage_vert.jpg";
        final String actualEndpoint2 = imageProvider.getHeroImageEndpoint(heroName2, size2);

        assertEquals(expectedEndpoint2, actualEndpoint2);

        final String heroName3 = null;
        final Size size3 = Size.FULL_VERTICAL;
        final String expectedEndpoint3 = "";
        final String actualEndpoint3 = imageProvider.getHeroImageEndpoint(heroName3, size3);

        assertEquals(expectedEndpoint3, actualEndpoint3);

    }

    @Test
    public void testGetSteamImageEndpoint() throws Exception {

        final ImageProvider imageProvider = new ImageProvider();

        final String appId = "3830";
        final String imageUrl = "460b6471db7d83ee6943c1a87f7a9f2898634952";
        final String expectedUrl = "http://media.steampowered.com/steamcommunity/public/images/apps/3830/460b6471db7d83ee6943c1a87f7a9f2898634952.jpg";
        final String actualUrl = imageProvider.getGameImageEndpoint(appId, imageUrl);
        assertEquals(actualUrl, expectedUrl);

    }

}