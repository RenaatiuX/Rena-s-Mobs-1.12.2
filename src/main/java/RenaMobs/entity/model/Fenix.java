package RenaMobs.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class Fenix extends ModelBase {
	private final ModelRenderer Cabeza;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer Cuerpo;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer Patas;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer AlaDerecha;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer cube_r37;
	private final ModelRenderer cube_r38;
	private final ModelRenderer cube_r39;
	private final ModelRenderer cube_r40;
	private final ModelRenderer cube_r41;
	private final ModelRenderer AlaIzquierda;
	private final ModelRenderer cube_r42;
	private final ModelRenderer cube_r43;
	private final ModelRenderer cube_r44;
	private final ModelRenderer cube_r45;
	private final ModelRenderer cube_r46;
	private final ModelRenderer cube_r47;
	private final ModelRenderer cube_r48;
	private final ModelRenderer cube_r49;
	private final ModelRenderer cube_r50;
	private final ModelRenderer cube_r51;
	private final ModelRenderer cube_r52;
	private final ModelRenderer cube_r53;
	private final ModelRenderer cube_r54;
	private final ModelRenderer cube_r55;
	private final ModelRenderer cube_r56;
	private final ModelRenderer cube_r57;
	private final ModelRenderer cube_r58;
	private final ModelRenderer cube_r59;
	private final ModelRenderer cube_r60;
	private final ModelRenderer cube_r61;
	private final ModelRenderer cube_r62;
	private final ModelRenderer cube_r63;

	public Fenix() {
		textureWidth = 64;
		textureHeight = 64;

		Cabeza = new ModelRenderer(this);
		Cabeza.setRotationPoint(0.0F, 24.0F, 0.0F);
		Cabeza.cubeList.add(new ModelBox(Cabeza, 25, 43, -2.0F, -11.0F, -5.0F, 4, 3, 4, 0.0F, false));
		Cabeza.cubeList.add(new ModelBox(Cabeza, 9, 43, -2.5F, -11.5F, -2.0F, 5, 4, 3, 0.0F, false));
		Cabeza.cubeList.add(new ModelBox(Cabeza, 27, 50, -1.0F, -9.0F, -7.0F, 2, 1, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -4.0F, 2.0F);
		Cabeza.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.5672F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 9, 35, -2.0F, -1.0F, 0.0F, 4, 1, 3, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -8.0F, -1.0F);
		Cabeza.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.5672F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 48, 0, -2.0F, -1.0F, 0.0F, 4, 5, 3, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -9.5F, -4.5F);
		Cabeza.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 37, 43, -1.0F, -0.5F, -3.5F, 2, 1, 3, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -10.5F, -1.5F);
		Cabeza.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.6981F, 0.0F, 0.6981F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 35, -0.5F, -5.0F, -0.5F, 1, 5, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -10.5F, -1.5F);
		Cabeza.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.6981F, 0.0F, -0.6981F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 39, 7, -0.5F, -5.0F, -0.5F, 1, 5, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -10.5F, -1.5F);
		Cabeza.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.6981F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 41, 22, -0.5F, -5.0F, -0.5F, 1, 5, 1, 0.0F, false));

		Cuerpo = new ModelRenderer(this);
		Cuerpo.setRotationPoint(0.0F, 24.0F, 0.0F);
		Cuerpo.cubeList.add(new ModelBox(Cuerpo, 0, 21, -3.0F, -9.0F, 2.0F, 6, 5, 5, 0.0F, false));
		Cuerpo.cubeList.add(new ModelBox(Cuerpo, 50, 33, -3.0F, -7.0F, 25.0F, 6, 1, 1, 0.0F, false));
		Cuerpo.cubeList.add(new ModelBox(Cuerpo, 22, 26, -3.0F, -8.0F, 14.0F, 6, 3, 4, 0.0F, false));
		Cuerpo.cubeList.add(new ModelBox(Cuerpo, 0, 0, -3.5F, -9.5F, 7.0F, 7, 6, 7, 0.0F, false));
		Cuerpo.cubeList.add(new ModelBox(Cuerpo, 0, 43, -0.5F, -7.0F, 18.0F, 1, 1, 7, 0.0F, false));
		Cuerpo.cubeList.add(new ModelBox(Cuerpo, 0, 35, -0.5F, -7.0F, 26.0F, 1, 1, 7, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.847F, -6.5F, 26.6903F);
		Cuerpo.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, -0.5672F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 35, -0.5F, -0.5F, -0.5F, 1, 1, 7, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(2.847F, -6.5F, 26.6903F);
		Cuerpo.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.5672F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 39, 7, -0.5F, -0.5F, -0.5F, 1, 1, 7, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.0F, -6.0F, 26.0F);
		Cuerpo.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, -0.2182F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 35, -1.0F, -1.0F, 0.0F, 1, 1, 7, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(2.0F, -6.0F, 26.0F);
		Cuerpo.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.2182F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 41, 41, 0.0F, -1.0F, 0.0F, 1, 1, 7, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-0.5356F, -6.0F, 26.3247F);
		Cuerpo.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, -0.0873F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 38, 21, -1.5F, -1.0F, -0.3247F, 1, 1, 7, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.5356F, -6.0F, 26.3247F);
		Cuerpo.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0873F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 41, 29, 0.5F, -1.0F, -0.3247F, 1, 1, 7, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, -6.5F, 21.5F);
		Cuerpo.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, -0.3054F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -0.5F, 0.0F, -0.5F, 1, 0, 5, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, -6.5F, 21.5F);
		Cuerpo.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.3054F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 23, 7, -0.5F, 0.0F, -0.5F, 1, 0, 5, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-1.0F, -6.5F, 21.5F);
		Cuerpo.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, -0.3054F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 27, 7, -0.5F, 0.0F, -3.5F, 1, 0, 8, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(1.0F, -6.5F, 21.5F);
		Cuerpo.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.3054F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 29, 7, -0.5F, 0.0F, -3.5F, 1, 0, 8, 0.0F, false));

		Patas = new ModelRenderer(this);
		Patas.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(4.0F, -2.5222F, 16.8722F);
		Patas.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.1745F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 21, -1.0F, -0.5F, 0.5F, 1, 3, 1, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 22, 26, -8.0F, -0.5F, 0.5F, 1, 3, 1, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(4.0F, -3.5716F, 13.7981F);
		Patas.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.9599F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, -1.0F, -0.5F, 0.5F, 1, 5, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 30, 7, -8.0F, -0.5F, 0.5F, 1, 5, 1, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(4.0F, -4.5F, 12.5F);
		Patas.addChild(cube_r19);
		setRotationAngle(cube_r19, 1.0472F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 47, 21, -1.5F, -0.5F, -0.5F, 2, 3, 3, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 48, 8, -8.5F, -0.5F, -0.5F, 2, 3, 3, 0.0F, false));

		AlaDerecha = new ModelRenderer(this);
		AlaDerecha.setRotationPoint(-2.876F, 16.5F, 9.8879F);
		AlaDerecha.cubeList.add(new ModelBox(AlaDerecha, 12, 41, -19.8627F, 0.0F, -3.2757F, 2, 0, 1, 0.0F, false));
		AlaDerecha.cubeList.add(new ModelBox(AlaDerecha, 32, 7, -18.8627F, 0.0F, -4.2757F, 1, 0, 1, 0.0F, false));
		AlaDerecha.cubeList.add(new ModelBox(AlaDerecha, 16, 41, -19.8627F, 0.0F, -5.2757F, 2, 0, 1, 0.0F, false));
		AlaDerecha.cubeList.add(new ModelBox(AlaDerecha, 38, 13, -20.8627F, 0.0F, -6.2757F, 3, 0, 1, 0.0F, false));
		AlaDerecha.cubeList.add(new ModelBox(AlaDerecha, 24, 41, -19.8627F, 0.0F, -7.2757F, 2, 0, 1, 0.0F, false));
		AlaDerecha.cubeList.add(new ModelBox(AlaDerecha, 8, 35, -18.8627F, 0.0F, -8.2757F, 1, 0, 1, 0.0F, false));
		AlaDerecha.cubeList.add(new ModelBox(AlaDerecha, 40, 35, -20.8627F, 0.0F, -9.2757F, 3, 0, 1, 0.0F, false));
		AlaDerecha.cubeList.add(new ModelBox(AlaDerecha, 28, 41, -19.8627F, 0.0F, -10.2757F, 2, 0, 1, 0.0F, false));
		AlaDerecha.cubeList.add(new ModelBox(AlaDerecha, 40, 49, -6.124F, -0.5F, -5.8879F, 6, 1, 1, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-5.8554F, 0.0F, -5.3096F);
		AlaDerecha.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, -0.5672F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 15, 50, -6.0F, -0.5F, -0.5F, 6, 1, 1, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-10.8157F, 0.0F, -8.4495F);
		AlaDerecha.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, -0.829F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 50, 29, -6.0F, -0.5F, -0.5F, 6, 1, 1, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-19.4468F, 0.0F, -9.7779F);
		AlaDerecha.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.5236F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 50, 31, 0.0F, -0.5F, -0.5F, 6, 1, 1, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-16.4373F, -3.0F, -4.9625F);
		AlaDerecha.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 1.5708F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 27, 12, -3.6868F, 3.0F, -2.4254F, 1, 0, 1, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-15.4373F, -3.0F, -3.9625F);
		AlaDerecha.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 1.5708F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 22, 33, -3.6868F, 3.0F, -2.4254F, 11, 0, 1, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-14.4373F, -3.0F, -3.9625F);
		AlaDerecha.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 1.5708F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 20, 6, -5.6868F, 3.0F, -2.4254F, 13, 0, 1, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-13.4373F, -3.0F, -3.9625F);
		AlaDerecha.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 1.5708F, 0.0F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 16, -8.6868F, 3.0F, -2.4254F, 17, 0, 1, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-12.4373F, -3.0F, -3.9625F);
		AlaDerecha.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 1.5708F, 0.0F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 18, -7.6868F, 3.0F, -2.4254F, 16, 0, 1, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-11.4373F, -3.0F, -3.9625F);
		AlaDerecha.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 1.5708F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 15, -9.6868F, 3.0F, -2.4254F, 17, 0, 1, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-10.4373F, -3.0F, -3.9625F);
		AlaDerecha.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 1.5708F, 0.0F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 20, -8.6868F, 3.0F, -2.4254F, 15, 0, 1, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-9.4373F, -3.0F, -3.9625F);
		AlaDerecha.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, 1.5708F, 0.0F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 20, 5, -7.6868F, 3.0F, -2.4254F, 13, 0, 1, 0.0F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-8.4373F, -3.0F, -3.9625F);
		AlaDerecha.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0F, 1.5708F, 0.0F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 20, 1, -9.6868F, 3.0F, -2.4254F, 14, 0, 1, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-7.4373F, -3.0F, -3.9625F);
		AlaDerecha.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, 1.5708F, 0.0F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 16, 24, -8.6868F, 3.0F, -2.4254F, 12, 0, 1, 0.0F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-6.4373F, -3.0F, -3.9625F);
		AlaDerecha.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, 1.5708F, 0.0F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 16, 21, -9.6868F, 3.0F, -2.4254F, 13, 0, 1, 0.0F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(-5.4373F, -3.0F, -3.9625F);
		AlaDerecha.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 1.5708F, 0.0F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 40, 37, -7.6868F, 3.0F, -2.4254F, 10, 0, 1, 0.0F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(-4.4373F, -3.0F, -3.9625F);
		AlaDerecha.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.0F, 1.5708F, 0.0F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 34, -9.1868F, 3.0F, -2.4254F, 11, 0, 1, 0.0F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(-3.4373F, -3.0F, -2.9625F);
		AlaDerecha.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.0F, 1.5708F, 0.0F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 22, 34, -8.6868F, 3.0F, -2.4254F, 11, 0, 1, 0.0F, false));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(-2.4373F, -3.0F, -2.9625F);
		AlaDerecha.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.0F, 1.5708F, 0.0F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 16, 25, -9.6868F, 3.0F, -2.4254F, 12, 0, 1, 0.0F, false));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(-1.4373F, -3.0F, -2.9625F);
		AlaDerecha.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.0F, 1.5708F, 0.0F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 40, 38, -7.6868F, 3.0F, -2.4254F, 10, 0, 1, 0.0F, false));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(1.5627F, -3.0F, -2.9625F);
		AlaDerecha.addChild(cube_r39);
		setRotationAngle(cube_r39, 0.0F, 1.5708F, 0.0F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 34, 16, -8.6868F, 3.0F, -2.4254F, 11, 0, 1, 0.0F, false));

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(-0.4373F, -3.0F, -2.9625F);
		AlaDerecha.addChild(cube_r40);
		setRotationAngle(cube_r40, 0.0F, 1.5708F, 0.0F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 34, 15, -8.6868F, 3.0F, -2.4254F, 11, 0, 1, 0.0F, false));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(0.5627F, -3.0F, -2.9625F);
		AlaDerecha.addChild(cube_r41);
		setRotationAngle(cube_r41, 0.0F, 1.5708F, 0.0F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 40, 39, -7.6868F, 3.0F, -2.4254F, 10, 0, 1, 0.0F, false));

		AlaIzquierda = new ModelRenderer(this);
		AlaIzquierda.setRotationPoint(2.876F, 16.5F, 9.8879F);
		AlaIzquierda.cubeList.add(new ModelBox(AlaIzquierda, 8, 41, 17.8627F, 0.0F, -3.2757F, 2, 0, 1, 0.0F, false));
		AlaIzquierda.cubeList.add(new ModelBox(AlaIzquierda, 3, 5, 17.8627F, 0.0F, -4.2757F, 1, 0, 1, 0.0F, false));
		AlaIzquierda.cubeList.add(new ModelBox(AlaIzquierda, 0, 41, 17.8627F, 0.0F, -5.2757F, 2, 0, 1, 0.0F, false));
		AlaIzquierda.cubeList.add(new ModelBox(AlaIzquierda, 37, 29, 17.8627F, 0.0F, -6.2757F, 3, 0, 1, 0.0F, false));
		AlaIzquierda.cubeList.add(new ModelBox(AlaIzquierda, 2, 35, 17.8627F, 0.0F, -7.2757F, 2, 0, 1, 0.0F, false));
		AlaIzquierda.cubeList.add(new ModelBox(AlaIzquierda, 2, 0, 17.8627F, 0.0F, -8.2757F, 1, 0, 1, 0.0F, false));
		AlaIzquierda.cubeList.add(new ModelBox(AlaIzquierda, 0, 6, 17.8627F, 0.0F, -9.2757F, 3, 0, 1, 0.0F, false));
		AlaIzquierda.cubeList.add(new ModelBox(AlaIzquierda, 0, 25, 17.8627F, 0.0F, -10.2757F, 2, 0, 1, 0.0F, false));
		AlaIzquierda.cubeList.add(new ModelBox(AlaIzquierda, 25, 35, 0.124F, -0.5F, -5.8879F, 6, 1, 1, 0.0F, false));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(5.8554F, 0.0F, -5.3096F);
		AlaIzquierda.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.0F, 0.5672F, 0.0F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 25, 37, 0.0F, -0.5F, -0.5F, 6, 1, 1, 0.0F, false));

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(10.8157F, 0.0F, -8.4495F);
		AlaIzquierda.addChild(cube_r43);
		setRotationAngle(cube_r43, 0.0F, 0.829F, 0.0F);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 9, 39, 0.0F, -0.5F, -0.5F, 6, 1, 1, 0.0F, false));

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(19.4468F, 0.0F, -9.7779F);
		AlaIzquierda.addChild(cube_r44);
		setRotationAngle(cube_r44, 0.0F, -0.5236F, 0.0F);
		cube_r44.cubeList.add(new ModelBox(cube_r44, 25, 39, -6.0F, -0.5F, -0.5F, 6, 1, 1, 0.0F, false));

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(16.4373F, -3.0F, -4.9625F);
		AlaIzquierda.addChild(cube_r45);
		setRotationAngle(cube_r45, 0.0F, -1.5708F, 0.0F);
		cube_r45.cubeList.add(new ModelBox(cube_r45, 2, 21, 2.6868F, 3.0F, -2.4254F, 1, 0, 1, 0.0F, false));

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(15.4373F, -3.0F, -3.9625F);
		AlaIzquierda.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.0F, -1.5708F, 0.0F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 30, 19, -7.3132F, 3.0F, -2.4254F, 11, 0, 1, 0.0F, false));

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(14.4373F, -3.0F, -3.9625F);
		AlaIzquierda.addChild(cube_r47);
		setRotationAngle(cube_r47, 0.0F, -1.5708F, 0.0F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 20, 2, -7.3132F, 3.0F, -2.4254F, 13, 0, 1, 0.0F, false));

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(13.4373F, -3.0F, -3.9625F);
		AlaIzquierda.addChild(cube_r48);
		setRotationAngle(cube_r48, 0.0F, -1.5708F, 0.0F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 0, 13, -8.3132F, 3.0F, -2.4254F, 17, 0, 1, 0.0F, false));

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(12.4373F, -3.0F, -3.9625F);
		AlaIzquierda.addChild(cube_r49);
		setRotationAngle(cube_r49, 0.0F, -1.5708F, 0.0F);
		cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 17, -8.3132F, 3.0F, -2.4254F, 16, 0, 1, 0.0F, false));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(11.4373F, -3.0F, -3.9625F);
		AlaIzquierda.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.0F, -1.5708F, 0.0F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 0, 14, -7.3132F, 3.0F, -2.4254F, 17, 0, 1, 0.0F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(10.4373F, -3.0F, -3.9625F);
		AlaIzquierda.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.0F, -1.5708F, 0.0F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 19, -6.3132F, 3.0F, -2.4254F, 15, 0, 1, 0.0F, false));

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(9.4373F, -3.0F, -3.9625F);
		AlaIzquierda.addChild(cube_r52);
		setRotationAngle(cube_r52, 0.0F, -1.5708F, 0.0F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 20, 3, -5.3132F, 3.0F, -2.4254F, 13, 0, 1, 0.0F, false));

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(8.4373F, -3.0F, -3.9625F);
		AlaIzquierda.addChild(cube_r53);
		setRotationAngle(cube_r53, 0.0F, -1.5708F, 0.0F);
		cube_r53.cubeList.add(new ModelBox(cube_r53, 20, 0, -4.3132F, 3.0F, -2.4254F, 14, 0, 1, 0.0F, false));

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(7.4373F, -3.0F, -3.9625F);
		AlaIzquierda.addChild(cube_r54);
		setRotationAngle(cube_r54, 0.0F, -1.5708F, 0.0F);
		cube_r54.cubeList.add(new ModelBox(cube_r54, 16, 22, -3.3132F, 3.0F, -2.4254F, 12, 0, 1, 0.0F, false));

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(6.4373F, -3.0F, -3.9625F);
		AlaIzquierda.addChild(cube_r55);
		setRotationAngle(cube_r55, 0.0F, -1.5708F, 0.0F);
		cube_r55.cubeList.add(new ModelBox(cube_r55, 20, 4, -3.3132F, 3.0F, -2.4254F, 13, 0, 1, 0.0F, false));

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(5.4373F, -3.0F, -3.9625F);
		AlaIzquierda.addChild(cube_r56);
		setRotationAngle(cube_r56, 0.0F, -1.5708F, 0.0F);
		cube_r56.cubeList.add(new ModelBox(cube_r56, 0, 31, -2.3132F, 3.0F, -2.4254F, 10, 0, 1, 0.0F, false));

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(4.4373F, -3.0F, -3.9625F);
		AlaIzquierda.addChild(cube_r57);
		setRotationAngle(cube_r57, 0.0F, -1.5708F, 0.0F);
		cube_r57.cubeList.add(new ModelBox(cube_r57, 30, 20, -1.8132F, 3.0F, -2.4254F, 11, 0, 1, 0.0F, false));

		cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(3.4373F, -3.0F, -2.9625F);
		AlaIzquierda.addChild(cube_r58);
		setRotationAngle(cube_r58, 0.0F, -1.5708F, 0.0F);
		cube_r58.cubeList.add(new ModelBox(cube_r58, 32, 17, -2.3132F, 3.0F, -2.4254F, 11, 0, 1, 0.0F, false));

		cube_r59 = new ModelRenderer(this);
		cube_r59.setRotationPoint(2.4373F, -3.0F, -2.9625F);
		AlaIzquierda.addChild(cube_r59);
		setRotationAngle(cube_r59, 0.0F, -1.5708F, 0.0F);
		cube_r59.cubeList.add(new ModelBox(cube_r59, 16, 23, -2.3132F, 3.0F, -2.4254F, 12, 0, 1, 0.0F, false));

		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(1.4373F, -3.0F, -2.9625F);
		AlaIzquierda.addChild(cube_r60);
		setRotationAngle(cube_r60, 0.0F, -1.5708F, 0.0F);
		cube_r60.cubeList.add(new ModelBox(cube_r60, 0, 32, -2.3132F, 3.0F, -2.4254F, 10, 0, 1, 0.0F, false));

		cube_r61 = new ModelRenderer(this);
		cube_r61.setRotationPoint(-1.5627F, -3.0F, -2.9625F);
		AlaIzquierda.addChild(cube_r61);
		setRotationAngle(cube_r61, 0.0F, -1.5708F, 0.0F);
		cube_r61.cubeList.add(new ModelBox(cube_r61, 32, 18, -2.3132F, 3.0F, -2.4254F, 11, 0, 1, 0.0F, false));

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(0.4373F, -3.0F, -2.9625F);
		AlaIzquierda.addChild(cube_r62);
		setRotationAngle(cube_r62, 0.0F, -1.5708F, 0.0F);
		cube_r62.cubeList.add(new ModelBox(cube_r62, 0, 33, -2.3132F, 3.0F, -2.4254F, 11, 0, 1, 0.0F, false));

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(-0.5627F, -3.0F, -2.9625F);
		AlaIzquierda.addChild(cube_r63);
		setRotationAngle(cube_r63, 0.0F, -1.5708F, 0.0F);
		cube_r63.cubeList.add(new ModelBox(cube_r63, 40, 40, -2.3132F, 3.0F, -2.4254F, 10, 0, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Cabeza.render(f5);
		Cuerpo.render(f5);
		Patas.render(f5);
		AlaDerecha.render(f5);
		AlaIzquierda.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}