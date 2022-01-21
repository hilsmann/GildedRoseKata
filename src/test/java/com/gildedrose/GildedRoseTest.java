package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void updateQuality_backstagePasses() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 48) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }

    @Test
    void updateQuality_sulfuras() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 10, 48) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(48, app.items[0].quality);
    }

    @Test
    void updateQuality_agedBrie() {
        Item[] items = new Item[] { new Item("Aged Brie", 10, 48) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(49, app.items[0].quality);
    }

    @Test
    void updateQuality_other() {
        Item[] items = new Item[] { new Item("other", 10, 48) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("other", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(47, app.items[0].quality);
    }
}
