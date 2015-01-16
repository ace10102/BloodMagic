package WayofTime.alchemicalWizardry.common.items.routing;

import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class InputRoutingFocus extends RoutingFocus
{
	public InputRoutingFocus()
	{
		super();
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        this.itemIcon = iconRegister.registerIcon("AlchemicalWizardry:HarvestGoddessSigil_deactivated");
    }
}
