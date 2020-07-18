package com.blueboat.simpletweaks;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.blueboat.simpletweaks.util.RegistryHandler;


@Mod("stweaks")
public class SimpleTweaks
{

    private static final Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "stweaks";
    public SimpleTweaks() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);



        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.Init();
        
        MinecraftForge.EVENT_BUS.register(this);
      

    }

    private void setup(final FMLCommonSetupEvent event)
    {


    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    
    	RenderTypeLookup.setRenderLayer(RegistryHandler.WITHERED_GLASS_BLOCK.get(), RenderType.getCutout());
    	RenderTypeLookup.setRenderLayer(RegistryHandler.WITHERED_GLASS_PANE_BLOCK.get(), RenderType.getCutout());
    }
    
   public static final ItemGroup TAB = new ItemGroup("simpleTab") {
	   
	   @Override
	   public ItemStack createIcon() {
		   return new ItemStack(RegistryHandler.GRINDING_BOWL.get());
	   }
	   
   };

}
