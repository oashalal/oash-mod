package oashmod;

import mindustry.content.*;
import mindustry.world.Block;
import mindustry.world.blocks.defense.*;
import mindustry.type.Category;
import static mindustry.type.ItemStack.with;

public class OashBlocks{
    public static Block bigCopperWall;
    
    public static void load(){
        bigCopperWall = new Wall("big-copper-wall"){{
            armor = 10f;
            size = 3;
            health = 5000;
            requirements(Category.defense, with(Items.copper, 100));
        }};
    }
}