package com.ironlabs.moregems.client.entity.render;

import com.ironlabs.moregems.MoreGems;
import com.ironlabs.moregems.client.entity.model.DuckModel;
import com.ironlabs.moregems.entities.DuckEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class DuckRenderer extends MobRenderer<DuckEntity, DuckModel<DuckEntity>> {

    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(MoreGems.MOD_ID, "textures/entity/duck.png");

    public DuckRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new DuckModel<>() , 0.2f);
    }

    @Override
    public ResourceLocation getEntityTexture(DuckEntity entity) {
        return TEXTURE;
    }
}
