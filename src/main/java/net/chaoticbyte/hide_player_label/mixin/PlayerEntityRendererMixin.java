package net.chaoticbyte.hide_player_label.mixin;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(PlayerEntityRenderer.class)
public class PlayerEntityRendererMixin {
	/**
	 * @author ChaoticByte
	 * @reason pls don't
	 */
	@Overwrite
	public void renderLabelIfPresent(
			PlayerEntityRenderState playerEntityRenderState,
			Text text,
			MatrixStack matrixStack,
			VertexConsumerProvider vertexConsumerProvider,
			int i
	) { /* do nothing. */ }
}
