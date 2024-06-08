package whirlpool.noslipperyice.mixin;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.IceBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(IceBlock.class)
public abstract class IceBlockMixin {
    @ModifyVariable(argsOnly = true, method = "<init>", at = @At(value = "HEAD"))
    private static AbstractBlock.Settings setSlipperiness(AbstractBlock.Settings settings) {
        // Modify the slipperiness value here (e.g., return 0.4F)
        return settings.slipperiness(0.6F).velocityMultiplier(1.0F).jumpVelocityMultiplier(1.0F);
    }
}
