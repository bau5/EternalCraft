package eternalcraft.common.helpers;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import eternalcraft.common.Eternalcraft;
import eternalcraft.common.machines.MachineType;

public class MachineBuilderHelper {

	private static MachineBuilderHelper instance = new MachineBuilderHelper();
	
	public ItemStack makeFurnace(){
		ItemStack stack = new ItemStack(Eternalcraft.instance.settings.getMachinesID(), 1, 0);
		NBTTagCompound tag = new NBTTagCompound();
		NBTTagCompound modifierTag = new NBTTagCompound();
		NBTTagCompound stackTag = new NBTTagCompound();
		modifierTag.setString(MachineType.FURNACE.modifiers[0], "2");
		new ItemStack(1, 1, 0).writeToNBT(stackTag);
		modifierTag.setTag(MachineType.FURNACE.modifiers[1], stackTag);
		tag.setCompoundTag("machineModifiers", modifierTag);
		stack.stackTagCompound = tag;
		return stack;
	}
	
	public static MachineBuilderHelper instance(){
		return instance;
	}
}
