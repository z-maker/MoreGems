package com.ironlabs.moregems.client.entity.model;

import com.ironlabs.moregems.entities.DuckEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class DuckModel <T extends DuckEntity> extends EntityModel<T> {

    private final ModelRenderer body;
    private final ModelRenderer legLeft;
    private final ModelRenderer legRight;
    private final ModelRenderer head;
    private final ModelRenderer leftWing;
    private final ModelRenderer rightWing;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r1;

    public DuckModel() {
        textureWidth = 64;
        textureHeight = 64;

        body = new ModelRenderer(this);
        body.setRotationPoint(-1.3333F, 20.5F, 0.0F);
        body.setTextureOffset(46, 0).addBox(-2.6667F, -1.5F, -2.0F, 5.0F, 3.0F, 4.0F, 0.0F, false);
        body.setTextureOffset(54, 8).addBox(2.3333F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        legLeft = new ModelRenderer(this);
        legLeft.setRotationPoint(-0.5F, 23.0F, -1.5F);
        legLeft.setTextureOffset(0, 5).addBox(-1.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        legRight = new ModelRenderer(this);
        legRight.setRotationPoint(-0.5F, 23.0F, 1.5F);
        legRight.setTextureOffset(0, 5).addBox(-1.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(-2.0F, 24.0F, -1.0F);
        head.setTextureOffset(56, 14).addBox(-3.0F, -8.0F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
        head.setTextureOffset(56, 23).addBox(-5.0F, -7.0F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

        leftWing = new ModelRenderer(this);
        leftWing.setRotationPoint(-1.25F, 20.0F, -2.5F);
        setRotationAngle(leftWing, -0.3491F, 0.0F, 0.0F);
        leftWing.setTextureOffset(0, 0).addBox(-1.75F, -1.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        leftWing.setTextureOffset(6, 0).addBox(-1.75F, 0.0F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        rightWing = new ModelRenderer(this);
        rightWing.setRotationPoint(-1.25F, 20.0F, 2.5F);
        setRotationAngle(rightWing, 0.3491F, 0.0F, 0.0F);
        rightWing.setTextureOffset(8, 0).addBox(-1.75F, -1.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        rightWing.setTextureOffset(6, 9).addBox(-1.75F, 0.0F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setRotationPoint(-1.0F, 22.0F, -2.0F);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(3.0F, -2.0F, 0.0F);
        tail.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, -0.6981F);
        cube_r1.setTextureOffset(56, 55).addBox(1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        cube_r1.setTextureOffset(52, 59).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.body.rotateAngleX = ((float)Math.PI / 2F);
        this.legRight.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.legLeft.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        body.render(matrixStack, buffer, packedLight, packedOverlay);
        legLeft.render(matrixStack, buffer, packedLight, packedOverlay);
        legRight.render(matrixStack, buffer, packedLight, packedOverlay);
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        leftWing.render(matrixStack, buffer, packedLight, packedOverlay);
        rightWing.render(matrixStack, buffer, packedLight, packedOverlay);
        tail.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
