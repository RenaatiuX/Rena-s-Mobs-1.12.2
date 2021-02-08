package RenaMobs.objects.items;

import RenaMobs.Main;
import RenaMobs.init.ItemInit;
import RenaMobs.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

	public class ItemBase extends Item implements IHasModel
	{
		public ItemBase(String name, CreativeTabs tab) 
		{
			setUnlocalizedName(name);
			setRegistryName(name);
			

			ItemInit.ITEMS.add(this);
		}



		public void registerModels() 
		{
			Main.proxy.registerItemRenderer(this, 0, "inventory");
		}
		
		
	
}
