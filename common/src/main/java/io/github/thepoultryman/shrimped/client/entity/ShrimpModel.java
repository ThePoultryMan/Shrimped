package io.github.thepoultryman.shrimped.client.entity;

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import io.github.thepoultryman.shrimped.entities.Shrimp;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import org.jetbrains.annotations.NotNull;

public class ShrimpModel extends EntityModel<Shrimp> {
    private final ModelPart root;
    private final ModelPart hair;
    private final ModelPart legsl;
    private final ModelPart legsr;
    private final ModelPart back;
    private final ModelPart tail;

    public ShrimpModel(@NotNull ModelPart root) {
        this.root = root.getChild("root");
        this.hair = this.root.getChild("hair");
        this.legsl = this.root.getChild("legsl");
        this.legsr = this.root.getChild("legsr");
        this.back = this.root.getChild("back");
        this.tail = this.back.getChild("tail");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 22.5F, -1.1F));

        PartDefinition hair = root.addOrReplaceChild("hair", CubeListBuilder.create().texOffs(0, 6).addBox(0.0F, -2.5F, -3.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition legsl = root.addOrReplaceChild("legsl", CubeListBuilder.create(), PartPose.offset(1.05F, 1.0F, -1.0F));

        PartDefinition legsl_r1 = legsl.addOrReplaceChild("legsl_r1", CubeListBuilder.create().texOffs(5, 4).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1309F));

        PartDefinition legsr = root.addOrReplaceChild("legsr", CubeListBuilder.create(), PartPose.offset(1.05F, 1.0F, -1.0F));

        PartDefinition legsr_r1 = legsr.addOrReplaceChild("legsr_r1", CubeListBuilder.create().texOffs(5, 3).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F));

        PartDefinition back = root.addOrReplaceChild("back", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition back_r1 = back.addOrReplaceChild("back_r1", CubeListBuilder.create().texOffs(7, 0).addBox(-0.5F, -0.4604F, -0.9424F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, 3.0F, -0.3927F, 0.0F, 0.0F));

        PartDefinition tail = back.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition tail_r1 = tail.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0351F, 0.025F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.65F, 3.75F, -0.3054F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 16, 16);
    }

    @Override
    public void setupAnim(Shrimp entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int i, int j, int k) {
        root.render(poseStack, vertexConsumer, i, j, k);
    }
}

