package RenaMobs.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class Ammyt extends ModelBase {
	private final ModelRenderer Cabeza;
	private final ModelRenderer PataAtrasIzqui;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer Cuerpo;
	private final ModelRenderer cube_r4;
	private final ModelRenderer PataDere;
	private final ModelRenderer cube_r5;
	private final ModelRenderer PataIzqui;
	private final ModelRenderer cube_r6;
	private final ModelRenderer PataAtraDere;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;

	public Ammyt() {
		textureWidth = 128;
		textureHeight = 128;

		Cabeza = new ModelRenderer(this);
		Cabeza.setRotationPoint(0.0F, -0.9038F, -0.5962F);
		Cabeza.cubeList.add(new ModelBox(Cabeza, 0, 61, -4.5F, -5.5962F, -28.4038F, 9, 9, 7, 0.0F, false));
		Cabeza.cubeList.add(new ModelBox(Cabeza, 102, 56, -3.5F, -3.5962F, -34.4038F, 7, 4, 6, 0.0F, false));
		Cabeza.cubeList.add(new ModelBox(Cabeza, 0, 94, -4.0F, 0.4038F, -34.9038F, 8, 3, 7, 0.0F, false));
		Cabeza.cubeList.add(new ModelBox(Cabeza, 48, 90, -4.0F, 0.4038F, -41.9038F, 8, 3, 7, 0.0F, false));
		Cabeza.cubeList.add(new ModelBox(Cabeza, 6, 0, -4.0F, -0.5962F, -41.9038F, 1, 1, 0, 0.0F, false));
		Cabeza.cubeList.add(new ModelBox(Cabeza, 10, 8, -2.0F, -1.5962F, -41.9038F, 1, 2, 0, 0.0F, false));
		Cabeza.cubeList.add(new ModelBox(Cabeza, 10, 6, 1.0F, -1.5962F, -41.9038F, 1, 2, 0, 0.0F, false));
		Cabeza.cubeList.add(new ModelBox(Cabeza, 0, 0, -0.5F, -0.5962F, -41.9038F, 1, 1, 0, 0.0F, false));
		Cabeza.cubeList.add(new ModelBox(Cabeza, 4, 0, 3.0F, -0.5962F, -41.9038F, 1, 1, 0, 0.0F, false));
		Cabeza.cubeList.add(new ModelBox(Cabeza, 10, 2, 4.0F, -1.5962F, -41.9038F, 0, 2, 1, 0.0F, false));
		Cabeza.cubeList.add(new ModelBox(Cabeza, 8, 5, -4.0F, -1.5962F, -41.9038F, 0, 2, 1, 0.0F, false));
		Cabeza.cubeList.add(new ModelBox(Cabeza, 10, 4, 4.0F, -0.5962F, -39.9038F, 0, 1, 1, 0.0F, false));
		Cabeza.cubeList.add(new ModelBox(Cabeza, 6, 0, -4.0F, -0.5962F, -39.9038F, 0, 1, 1, 0.0F, false));
		Cabeza.cubeList.add(new ModelBox(Cabeza, 10, 0, 4.0F, -1.5962F, -37.9038F, 0, 2, 1, 0.0F, false));
		Cabeza.cubeList.add(new ModelBox(Cabeza, 8, 0, -4.0F, -1.5962F, -37.9038F, 0, 2, 1, 0.0F, false));
		Cabeza.cubeList.add(new ModelBox(Cabeza, 10, 10, 4.0F, -0.5962F, -35.9038F, 0, 1, 1, 0.0F, false));
		Cabeza.cubeList.add(new ModelBox(Cabeza, 4, 0, -4.0F, -0.5962F, -35.9038F, 0, 1, 1, 0.0F, false));
		Cabeza.cubeList.add(new ModelBox(Cabeza, 8, 9, 4.0F, -1.5962F, -33.9038F, 0, 2, 1, 0.0F, false));
		Cabeza.cubeList.add(new ModelBox(Cabeza, 0, 7, -4.0F, -1.5962F, -33.9038F, 0, 2, 1, 0.0F, false));
		Cabeza.cubeList.add(new ModelBox(Cabeza, 8, 2, 4.0F, -0.5962F, -31.9038F, 0, 1, 1, 0.0F, false));
		Cabeza.cubeList.add(new ModelBox(Cabeza, 0, 0, -4.0F, -0.5962F, -31.9038F, 0, 1, 1, 0.0F, false));
		Cabeza.cubeList.add(new ModelBox(Cabeza, 6, 9, 4.0F, -1.5962F, -29.9038F, 0, 2, 1, 0.0F, false));
		Cabeza.cubeList.add(new ModelBox(Cabeza, 0, 3, -4.0F, -1.5962F, -29.9038F, 0, 2, 1, 0.0F, false));
		Cabeza.cubeList.add(new ModelBox(Cabeza, 64, 13, -3.0F, -2.5962F, -40.4038F, 6, 3, 6, 0.0F, false));
		Cabeza.cubeList.add(new ModelBox(Cabeza, 0, 0, -10.0F, -10.0962F, -23.4038F, 20, 20, 12, 0.0F, false));
		Cabeza.cubeList.add(new ModelBox(Cabeza, 64, 0, -5.0F, 2.9038F, -26.4038F, 10, 8, 5, 0.0F, false));

		PataAtrasIzqui = new ModelRenderer(this);
		PataAtrasIzqui.setRotationPoint(8.0F, 5.5825F, 38.1295F);
		PataAtrasIzqui.cubeList.add(new ModelBox(PataAtrasIzqui, 42, 101, -3.0F, 15.4175F, -29.1295F, 6, 3, 7, 0.0F, false));
		PataAtrasIzqui.cubeList.add(new ModelBox(PataAtrasIzqui, 52, 4, -2.5F, 16.4175F, -31.1295F, 1, 2, 2, 0.0F, false));
		PataAtrasIzqui.cubeList.add(new ModelBox(PataAtrasIzqui, 45, 36, 1.5F, 16.4175F, -31.1295F, 1, 2, 2, 0.0F, false));
		PataAtrasIzqui.cubeList.add(new ModelBox(PataAtrasIzqui, 45, 32, -0.5F, 16.4175F, -31.1295F, 1, 2, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 3.9175F, -29.1295F);
		PataAtrasIzqui.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.4363F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 32, 67, -2.5F, -0.9226F, 1.9063F, 5, 5, 9, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.0F, 6.9175F, -22.1295F);
		PataAtrasIzqui.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 32, 0.0F, 0.5F, 0.0F, 4, 10, 4, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -1.0825F, -24.1295F);
		PataAtrasIzqui.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.4363F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 79, 79, -3.0F, -0.5F, -2.0F, 6, 11, 6, 0.0F, false));

		Cuerpo = new ModelRenderer(this);
		Cuerpo.setRotationPoint(0.0F, 24.0F, 0.0F);
		Cuerpo.cubeList.add(new ModelBox(Cuerpo, 54, 54, -8.0F, -29.0F, 10.0F, 16, 14, 8, 0.0F, false));
		Cuerpo.cubeList.add(new ModelBox(Cuerpo, 0, 32, -7.0F, -28.0F, -6.0F, 14, 12, 17, 0.0F, false));
		Cuerpo.cubeList.add(new ModelBox(Cuerpo, 56, 24, -8.0F, -29.0F, -12.0F, 16, 14, 8, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -27.0F, 16.5F);
		Cuerpo.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.7418F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 45, 39, -1.0F, -1.0F, 0.5F, 2, 2, 7, 0.0F, false));

		PataDere = new ModelRenderer(this);
		PataDere.setRotationPoint(-8.0F, 7.3333F, 15.5833F);
		PataDere.cubeList.add(new ModelBox(PataDere, 94, 96, -2.5F, 6.6667F, -26.5833F, 5, 9, 6, 0.0F, false));
		PataDere.cubeList.add(new ModelBox(PataDere, 94, 46, -3.5F, 13.6667F, -28.5833F, 7, 3, 7, 0.0F, false));
		PataDere.cubeList.add(new ModelBox(PataDere, 4, 2, -3.0F, 14.6667F, -30.5833F, 1, 2, 2, 0.0F, false));
		PataDere.cubeList.add(new ModelBox(PataDere, 0, 0, -0.5F, 14.6667F, -30.5833F, 1, 2, 2, 0.0F, false));
		PataDere.cubeList.add(new ModelBox(PataDere, 0, 8, 2.0F, 14.6667F, -30.5833F, 1, 2, 2, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -0.8333F, -25.5833F);
		PataDere.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.1745F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 88, 7, -3.0F, -0.5F, -2.0F, 6, 11, 6, 0.0F, false));

		PataIzqui = new ModelRenderer(this);
		PataIzqui.setRotationPoint(9.0F, 7.3333F, 15.5833F);
		PataIzqui.cubeList.add(new ModelBox(PataIzqui, 72, 96, -2.5F, 6.6667F, -26.5833F, 5, 9, 6, 0.0F, false));
		PataIzqui.cubeList.add(new ModelBox(PataIzqui, 95, 69, -3.5F, 13.6667F, -28.5833F, 7, 3, 7, 0.0F, false));
		PataIzqui.cubeList.add(new ModelBox(PataIzqui, 52, 8, 2.0F, 14.6667F, -30.5833F, 1, 2, 2, 0.0F, false));
		PataIzqui.cubeList.add(new ModelBox(PataIzqui, 0, 4, -0.5F, 14.6667F, -30.5833F, 1, 2, 2, 0.0F, false));
		PataIzqui.cubeList.add(new ModelBox(PataIzqui, 4, 6, -3.0F, 14.6667F, -30.5833F, 1, 2, 2, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -0.8333F, -25.5833F);
		PataIzqui.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 77, -3.0F, -0.5F, -2.0F, 6, 11, 6, 0.0F, false));

		PataAtraDere = new ModelRenderer(this);
		PataAtraDere.setRotationPoint(-8.0F, 3.5825F, 26.1295F);
		PataAtraDere.cubeList.add(new ModelBox(PataAtraDere, 23, 98, -3.0F, 17.4175F, -17.1295F, 6, 3, 7, 0.0F, false));
		PataAtraDere.cubeList.add(new ModelBox(PataAtraDere, 52, 0, -2.5F, 18.4175F, -19.1295F, 1, 2, 2, 0.0F, false));
		PataAtraDere.cubeList.add(new ModelBox(PataAtraDere, 49, 34, -0.5F, 18.4175F, -19.1295F, 1, 2, 2, 0.0F, false));
		PataAtraDere.cubeList.add(new ModelBox(PataAtraDere, 45, 40, 1.5F, 18.4175F, -19.1295F, 1, 2, 2, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.0F, 8.9175F, -10.1295F);
		PataAtraDere.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 103, 79, 0.0F, 0.5F, 0.0F, 4, 10, 4, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 5.9175F, -17.1295F);
		PataAtraDere.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.4363F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 51, 76, -2.5F, -0.9226F, 1.9063F, 5, 5, 9, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.9175F, -12.1295F);
		PataAtraDere.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.4363F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 81, -3.0F, -0.5F, -2.0F, 6, 11, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Cabeza.render(f5);
		PataAtrasIzqui.render(f5);
		Cuerpo.render(f5);
		PataDere.render(f5);
		PataIzqui.render(f5);
		PataAtraDere.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}