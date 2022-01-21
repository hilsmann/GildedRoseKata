package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void updateQuality_backstagePasses_sellin_under_10_days() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 10, 48)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }

    @Test
    void updateQuality_backstagePasses_sellin_under_6_days_and_quality_is_under_50() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 5, 47)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }

    @Test
    void updateQuality_backstagePasses_sellin_is_zero() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 0, 48)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }


    @Test
    void updateQuality_sulfuras() {
        Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 10, 48)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(48, app.items[0].quality);
    }

    @Test
    void updateQuality_agedBrie() {
        Item[] items = new Item[]{new Item("Aged Brie", 10, 48)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(49, app.items[0].quality);
    }

    @Test
    void updateQuality_agedBrie_sellin_is_zero() {
        Item[] items = new Item[]{new Item("Aged Brie", 0, 48)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }

    @Test
    void updateQuality_other() {
        Item[] items = new Item[]{new Item("other", 10, 48)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("other", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(47, app.items[0].quality);
    }

    @Test
    void updateQuality_other_sellin_is_zero() {
        Item[] items = new Item[]{new Item("other", 0, 48)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("other", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(46, app.items[0].quality);
    }
}
