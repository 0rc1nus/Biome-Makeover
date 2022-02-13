package party.lemons.biomemakeover.compat.moretags.forge;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import party.lemons.biomemakeover.init.BMBlocks;

public class MoreTagsCompatImpl {
    public static boolean CropMayPlaceOn(BlockState blockState) {
        return true;
    }


    public static boolean CropIsFarmland(BlockState blockState) {
        return blockState.is(Blocks.FARMLAND) || blockState.is(BMBlocks.PEAT_FARMLAND);
    }
}