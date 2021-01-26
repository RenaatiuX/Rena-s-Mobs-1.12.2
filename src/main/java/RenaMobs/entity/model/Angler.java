package RenaMobs.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class Angler extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer bone;
	private final ModelRenderer Mandibula;
	private final ModelRenderer cuerpo;
	private final ModelRenderer Aleta;
	private final ModelRenderer cube_r4;
	private final ModelRenderer AletaIzqui;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cola;
	private final ModelRenderer AletaAtrasIzqui;
	private final ModelRenderer cube_r6;
	private final ModelRenderer AletaAtrasDere;
	private final ModelRenderer cube_r7;

	public Angler() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 24.0F, -3.0F);
		head.cubeList.add(new ModelBox(head, 28, 0, -4.0F, -17.0F, -6.0F, 8, 6, 7, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 28, 13, -3.0F, -18.0F, -5.0F, 6, 1, 5, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -3.0F, -16.0F, -1.0F, 6, 13, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 20, 0, -1.0F, -19.0F, -15.5F, 2, 2, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 4, 0.5F, -16.0F, -7.0F, 3, 3, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -3.5F, -16.0F, -7.0F, 3, 3, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 30, 34, -4.0F, -11.0F, -2.0F, 0, 2, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 33, 33, -4.0F, -11.0F, -4.0F, 0, 2, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 4, 31, -4.0F, -11.0F, -6.0F, 0, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 2, 31, 4.0F, -11.0F, -6.0F, 0, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 31, 32, 4.0F, -11.0F, -4.0F, 0, 2, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 29, 32, 4.0F, -11.0F, -2.0F, 0, 2, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 38, 38, -3.0F, -11.0F, -6.0F, 1, 2, 0, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 32, 0, 1.0F, -11.0F, -6.0F, 1, 3, 0, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 23, 24, -0.5F, -11.0F, -6.0F, 1, 4, 0, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 34, 38, 2.0F, -11.0F, -6.0F, 1, 2, 0, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 32, 3, -2.0F, -11.0F, -6.0F, 1, 3, 0, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -21.5F, -7.2295F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 1.7453F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 15, 27, -1.0F, -6.25F, 0.7295F, 2, 6, 0, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -21.5F, -13.5F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.5236F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 4, -1.0F, 0.3F, 0.2F, 2, 3, 0, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.0F, -17.0F, -6.0F);
		head.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 0, -2.0F, -5.4F, 0.0F, 2, 6, 0, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -3.0F, 12.0F);
		head.addChild(bone);
		

		Mandibula = new ModelRenderer(this);
		Mandibula.setRotationPoint(0.0F, 18.5F, -1.6786F);
		setRotationAngle(Mandibula, 0.1745F, 0.0F, 0.0F);
		Mandibula.cubeList.add(new ModelBox(Mandibula, 19, 19, -4.0F, -2.5207F, -9.4062F, 8, 5, 9, 0.0F, false));
		Mandibula.cubeList.add(new ModelBox(Mandibula, 32, 35, -4.0F, -4.5207F, -3.4062F, 0, 2, 1, 0.0F, false));
		Mandibula.cubeList.add(new ModelBox(Mandibula, 19, 24, -4.0F, -5.5207F, -5.4062F, 0, 3, 1, 0.0F, false));
		Mandibula.cubeList.add(new ModelBox(Mandibula, 21, 24, -4.0F, -5.5207F, -7.4062F, 0, 3, 1, 0.0F, false));
		Mandibula.cubeList.add(new ModelBox(Mandibula, 30, 36, -4.0F, -4.5207F, -9.4062F, 0, 2, 1, 0.0F, false));
		Mandibula.cubeList.add(new ModelBox(Mandibula, 32, 38, -3.0F, -5.5207F, -9.4062F, 1, 3, 0, 0.0F, false));
		Mandibula.cubeList.add(new ModelBox(Mandibula, 38, 36, -2.0F, -4.5207F, -9.4062F, 1, 2, 0, 0.0F, false));
		Mandibula.cubeList.add(new ModelBox(Mandibula, 36, 36, -0.5F, -5.5207F, -9.4062F, 1, 3, 0, 0.0F, false));
		Mandibula.cubeList.add(new ModelBox(Mandibula, 30, 39, 1.0F, -4.5207F, -9.4062F, 1, 2, 0, 0.0F, false));
		Mandibula.cubeList.add(new ModelBox(Mandibula, 37, 33, 2.0F, -5.5207F, -9.4062F, 1, 3, 0, 0.0F, false));
		Mandibula.cubeList.add(new ModelBox(Mandibula, 34, 35, 4.0F, -4.5207F, -9.4062F, 0, 2, 1, 0.0F, false));
		Mandibula.cubeList.add(new ModelBox(Mandibula, 30, 12, 4.0F, -5.5207F, -7.4062F, 0, 3, 1, 0.0F, false));
		Mandibula.cubeList.add(new ModelBox(Mandibula, 28, 12, 4.0F, -5.5207F, -5.4062F, 0, 3, 1, 0.0F, false));
		Mandibula.cubeList.add(new ModelBox(Mandibula, 35, 32, 4.0F, -4.5207F, -3.4062F, 0, 2, 1, 0.0F, false));

		cuerpo = new ModelRenderer(this);
		cuerpo.setRotationPoint(0.0F, 24.0F, 0.0F);
		cuerpo.cubeList.add(new ModelBox(cuerpo, 12, 16, 0.0F, -17.0F, -2.0F, 0, 1, 6, 0.0F, false));
		cuerpo.cubeList.add(new ModelBox(cuerpo, 0, 16, 0.0F, -18.0F, -3.0F, 0, 1, 6, 0.0F, false));
		cuerpo.cubeList.add(new ModelBox(cuerpo, 16, 16, 0.0F, -19.0F, -8.0F, 0, 1, 5, 0.0F, false));
		cuerpo.cubeList.add(new ModelBox(cuerpo, 22, 32, 0.0F, -21.0F, -8.0F, 0, 2, 1, 0.0F, false));
		cuerpo.cubeList.add(new ModelBox(cuerpo, 30, 15, 0.0F, -21.0F, -5.0F, 0, 2, 1, 0.0F, false));
		cuerpo.cubeList.add(new ModelBox(cuerpo, 13, 30, 0.0F, -20.0F, -2.0F, 0, 2, 1, 0.0F, false));
		cuerpo.cubeList.add(new ModelBox(cuerpo, 28, 15, 0.0F, -20.0F, 1.0F, 0, 2, 1, 0.0F, false));
		cuerpo.cubeList.add(new ModelBox(cuerpo, 24, 6, 0.0F, -22.0F, -7.0F, 0, 1, 1, 0.0F, false));
		cuerpo.cubeList.add(new ModelBox(cuerpo, 7, 24, 0.0F, -22.0F, -4.0F, 0, 1, 1, 0.0F, false));
		cuerpo.cubeList.add(new ModelBox(cuerpo, 5, 24, 0.0F, -21.0F, -1.0F, 0, 1, 1, 0.0F, false));
		cuerpo.cubeList.add(new ModelBox(cuerpo, 20, 0, 0.0F, -21.0F, 2.0F, 0, 1, 1, 0.0F, false));

		Aleta = new ModelRenderer(this);
		Aleta.setRotationPoint(-3.5F, 17.0F, 1.5F);
		

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.5F, 1.0F, 0.5F);
		Aleta.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.3491F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 23, -1.0F, -1.0F, -2.0F, 1, 6, 3, 0.0F, false));

		AletaIzqui = new ModelRenderer(this);
		AletaIzqui.setRotationPoint(3.5F, 17.0F, 1.5F);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		AletaIzqui.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.3491F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 33, -0.5F, 0.0F, -1.5F, 1, 6, 3, 0.0F, false));

		cola = new ModelRenderer(this);
		cola.setRotationPoint(0.0F, 15.2353F, 3.8235F);
		cola.cubeList.add(new ModelBox(cola, 0, 13, 0.0F, -6.2353F, 0.1765F, 0, 1, 8, 0.0F, false));
		cola.cubeList.add(new ModelBox(cola, 5, 18, 0.0F, -7.2353F, 0.1765F, 0, 1, 5, 0.0F, false));
		cola.cubeList.add(new ModelBox(cola, 26, 6, 0.0F, -8.2353F, 0.1765F, 0, 1, 1, 0.0F, false));
		cola.cubeList.add(new ModelBox(cola, 25, 26, 0.0F, -9.2353F, 1.1765F, 0, 1, 1, 0.0F, false));
		cola.cubeList.add(new ModelBox(cola, 26, 20, 0.0F, -8.2353F, 3.1765F, 0, 1, 1, 0.0F, false));
		cola.cubeList.add(new ModelBox(cola, 26, 0, 0.0F, -9.2353F, 4.1765F, 0, 1, 1, 0.0F, false));
		cola.cubeList.add(new ModelBox(cola, 28, 5, 0.0F, -9.2353F, 7.1765F, 0, 1, 1, 0.0F, false));
		cola.cubeList.add(new ModelBox(cola, 27, 32, 0.0F, -8.2353F, 6.1765F, 0, 2, 1, 0.0F, false));
		cola.cubeList.add(new ModelBox(cola, 5, 22, 0.0F, -4.2353F, 13.1765F, 0, 1, 2, 0.0F, false));
		cola.cubeList.add(new ModelBox(cola, 30, 5, 0.0F, -3.2353F, 12.1765F, 0, 1, 1, 0.0F, false));
		cola.cubeList.add(new ModelBox(cola, 0, 22, 0.0F, -2.2353F, 11.1765F, 0, 3, 1, 0.0F, false));
		cola.cubeList.add(new ModelBox(cola, 25, 21, 0.0F, -3.2353F, 10.1765F, 0, 5, 1, 0.0F, false));
		cola.cubeList.add(new ModelBox(cola, 13, 23, 0.0F, -4.2353F, 9.1765F, 0, 7, 1, 0.0F, false));
		cola.cubeList.add(new ModelBox(cola, 19, 20, 0.0F, -1.2353F, 12.1765F, 0, 1, 3, 0.0F, false));
		cola.cubeList.add(new ModelBox(cola, 0, 31, 0.0F, 0.7647F, 12.1765F, 0, 1, 1, 0.0F, false));
		cola.cubeList.add(new ModelBox(cola, 19, 22, 0.0F, 1.7647F, 13.1765F, 0, 1, 2, 0.0F, false));
		cola.cubeList.add(new ModelBox(cola, 0, 24, -1.0F, -5.2353F, 0.1765F, 2, 9, 9, 0.0F, false));

		AletaAtrasIzqui = new ModelRenderer(this);
		AletaAtrasIzqui.setRotationPoint(1.0F, 3.7647F, 5.1765F);
		cola.addChild(AletaAtrasIzqui);
		

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		AletaAtrasIzqui.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.3491F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 2, 0.0F, -2.0F, -1.0F, 0, 4, 2, 0.0F, false));

		AletaAtrasDere = new ModelRenderer(this);
		AletaAtrasDere.setRotationPoint(-1.0F, 3.7647F, 5.1765F);
		cola.addChild(AletaAtrasDere);
		

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		AletaAtrasDere.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.3491F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 2, 0.0F, -2.0F, -1.0F, 0, 4, 2, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		Mandibula.render(f5);
		cuerpo.render(f5);
		Aleta.render(f5);
		AletaIzqui.render(f5);
		cola.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}