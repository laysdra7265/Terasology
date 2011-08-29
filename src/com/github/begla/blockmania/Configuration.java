/*
 * Copyright 2011 Benjamin Glatzel <benjamin.glatzel@me.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.begla.blockmania;

import com.github.begla.blockmania.utilities.VectorPool;
import javolution.util.FastMap;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.util.vector.Vector3f;

/**
 * Helper class to allow global access to properties and game settings.
 *
 * @author Benjamin Glatzel <benjamin.glatzel@me.com>
 */
public final class Configuration {

    /**
     * The initial time for new worlds.
     */
    public static final float INITIAL_TIME = 0.096f;
    /**
     * The mouse sensitivity.
     */
    public static final float MOUSE_SENS = 0.075f;
    /**
     * The title string of the game.
     */
    public static final String GAME_TITLE = "Blockmania Pre Alpha";
    /**
     * The three dimensions of a chunk.
     */
    public static final Vector3f CHUNK_DIMENSIONS = VectorPool.getVector(16, 128, 16);
    /**
     * The size of the sun.
     */
    public static final float SUN_SIZE = 64f;
    /**
     * The string used to generate the default world. If not set, a random seed is used.
     */
    public static final String DEFAULT_SEED = "cPpCzKqBpVkQpVjP";
    /**
     * The pixel format used to init. the display.
     */
    public static final PixelFormat PIXEL_FORMAT = new PixelFormat().withDepthBits(24);
    /**
     * The display mode used for window mode.
     */
    public static final DisplayMode DISPLAY_MODE = new DisplayMode(1280, 720);
    /**
     * If set to true, the game is rendered as a full screen application.
     */
    public static final boolean FULLSCREEN = false;
    /**
     * Maximum light value.
     */
    public static final byte MAX_LIGHT = 15;
    /**
     * The intensity at which the front and back side of blocks are constantly 'dimmed'.
     */
    public static final float BLOCK_SIDE_DIMMING = 0.6f;
    /**
     * TODO
     */
    public static final float OCCLUSION_INTENS = 0.65f;
    /**
     *
     */
    public static final int DL_UPDATES_PER_CYCLE = 4;
    /**
     *
     */
    public static final float PROB_COAL = -2f;
    /**
     *
     */
    public static final float PROB_GOLD = -3f;
    /* ------- */
    private static final FastMap<String, Float> _settingsNumeric = new FastMap<String, Float>();
    private static final FastMap<String, Boolean> _settingsBoolean = new FastMap<String, Boolean>();

    static {
        loadSettings();
    }

    /**
     * Returns a numeric value of a setting for a given key.
     *
     * @param key The key
     * @return The numeric value
     */
    public static Float getSettingNumeric(String key) {
        return _settingsNumeric.get(key);
    }

    /**
     * Returns the boolean value of a setting for a given key.
     *
     * @param key The key
     * @return The boolean value
     */
    public static Boolean getSettingBoolean(String key) {
        return _settingsBoolean.get(key);
    }

    /**
     * Sets a boolean value of a setting for a given key.
     *
     * @param key   The key
     * @param value The boolean value
     */
    public static void setSetting(String key, Boolean value) {
        _settingsBoolean.put(key, value);
    }

    /**
     * Sets a numeric value of a setting for a given key.
     *
     * @param key   The key
     * @param value The numeric value
     */
    public static void setSetting(String key, Float value) {
        _settingsNumeric.put(key, value);
    }

    /**
     * Loads the default values for the global settings.
     */
    private static void loadDefaults() {
        _settingsBoolean.put("PLACING_BOX", true);
        _settingsBoolean.put("CHUNK_OUTLINES", false);
        _settingsBoolean.put("DEBUG", false);
        _settingsBoolean.put("CROSSHAIR", true);
        _settingsBoolean.put("BOBBING", true);
        _settingsBoolean.put("DEMO_FLIGHT", false);
        _settingsBoolean.put("GOD_MODE", false);
        _settingsNumeric.put("JUMP_INTENSITY", 0.13f);
        _settingsNumeric.put("MAX_GRAVITY", 0.7f);
        _settingsNumeric.put("WALKING_SPEED", 0.0175f);
        _settingsNumeric.put("RUNNING_FACTOR", 1.4f);
        _settingsNumeric.put("GRAVITY", 0.0075f);
        _settingsNumeric.put("FRICTION", 0.1f);
        _settingsNumeric.put("V_DIST_X", 32f);
        _settingsNumeric.put("V_DIST_Z", 32f);
    }

    /**
     * Loads the saved settings.
     * TODO: Should not always load the default settings.
     */
    private static void loadSettings() {
        loadDefaults();
    }
}
