/**
 * Copyright (C) Jon Rowlett. All rights reserved.
 */
package de.shittyco.morematerials;

import net.minecraft.block.BlockStairs;

/**
 * Stained brick stairs.
 * @author jrowlett
 *
 */
public class BlockStainedBrickStairs extends BlockStairs {

    /**
     * base unlocalized name of the block.
     */
    private static final String NAME = "stainedBrickStairs";

    /**
     * Color of the bricks to use.
     */
    private int color;

    /**
     * Initializes a new instance of the BlockStainedBrickStairs class.
     * @param block the stained bricks block.
     * @param brickColor the color metadata.
     */
    public BlockStainedBrickStairs(
        final BlockStainedBricks block,
        final int brickColor) {
        super(block, brickColor);
        this.color = brickColor;
        this.setBlockName(
            NAME
            + "."
            + ColorUtility.COLOR_NAMES[this.color]);
        this.useNeighborBrightness = true;
    }

    /**
     * Gets the ID to use for registration.
     * @return the unique name of the block.
     */
    public final String getId() {
       return BlockStainedBricks.ID
           + "_"
           + ColorUtility.COLOR_NAMES[this.color]
           + "_stairs";
    }
}
