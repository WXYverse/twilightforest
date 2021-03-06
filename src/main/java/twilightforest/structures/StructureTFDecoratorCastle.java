package twilightforest.structures;

import net.minecraft.block.BlockQuartz;
import net.minecraft.init.Blocks;
import twilightforest.block.BlockTFCastleBlock;
import twilightforest.block.BlockTFCastlePillar;
import twilightforest.block.TFBlocks;
import twilightforest.enums.CastleBrickVariant;
import twilightforest.enums.CastlePillarVariant;

public class StructureTFDecoratorCastle extends StructureTFDecorator {

	public StructureTFDecoratorCastle() {
		this.blockState = TFBlocks.castleBlock.getDefaultState();
		this.accentState = Blocks.QUARTZ_BLOCK.getDefaultState().withProperty(BlockQuartz.VARIANT, BlockQuartz.EnumType.CHISELED);
		this.roofState = TFBlocks.castleBlock.getDefaultState().withProperty(BlockTFCastleBlock.VARIANT, CastleBrickVariant.ROOF);
		this.pillarState = TFBlocks.castlePillar.getDefaultState().withProperty(BlockTFCastlePillar.VARIANT, CastlePillarVariant.BOLD);
		this.fenceState = Blocks.OAK_FENCE.getDefaultState();
		this.stairState = Blocks.QUARTZ_STAIRS.getDefaultState();
		this.randomBlocks = new StructureTFCastleBlocks();
	}

}
