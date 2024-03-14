package wayback.content;

import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.turrets.*;

import static mindustry.type.ItemStack.with;
import static mindustry.content.Items.*;

public class WBBlocks {
  public static Block
  // turret
  binary;

  // bullet objects for turrets will be made on a separate file
  // to make balancing easier. it'll be harder if everything was inlined here.
  public static void load(){
    binary = new ItemTurret("binary"){{
      // temporary requirements, will balance later
      requirements(Category.turret, with(copper, 35, lead, 25));
    }};
  }
}
