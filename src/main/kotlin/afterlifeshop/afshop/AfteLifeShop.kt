package afterlifeshop.afshop

import net.neoforged.fml.common.Mod
import com.mojang.logging.LogUtils

const val MODID = "aftelifeshop"

@Mod("afterlifeshop")
object afteLifeShop {

    val logger = LogUtils.getLogger();

    init {
        logger.info("$MODID is initialized.")
    }


}
