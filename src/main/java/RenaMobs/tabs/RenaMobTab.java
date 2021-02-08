package RenaMobs.tabs;

import RenaMobs.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class RenaMobTab extends CreativeTabs
{

	public RenaMobTab(String label) {
		super("renamobtab");
			
	}
	
	public ItemStack getTabIconItem() {
		
		return new ItemStack(ItemInit.RENA_TAB);
	}
	
	

}