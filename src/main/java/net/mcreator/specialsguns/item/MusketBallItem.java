
package net.mcreator.specialsguns.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.specialsguns.SpecialsgunsModElements;

@SpecialsgunsModElements.ModElement.Tag
public class MusketBallItem extends SpecialsgunsModElements.ModElement {
	@ObjectHolder("specialsguns:musket_ball")
	public static final Item block = null;
	public MusketBallItem(SpecialsgunsModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(8));
			setRegistryName("musket_ball");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
