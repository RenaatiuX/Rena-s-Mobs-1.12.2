package RenaMobs.entity.ai;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIWander;

public class AnglerAIWander extends EntityAIWander {

	public AnglerAIWander(EntityCreature creatureIn, double speedIn) {
		super(creatureIn, speedIn);
	}
	
	public boolean shouldExecute() {
        return !this.entity.isInWater() && super.shouldExecute();
    }

    public boolean shouldContinueExecuting() {
        return !this.entity.isInWater() && super.shouldContinueExecuting();
    }

}
