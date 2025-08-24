package afterlifeshop.afshop

import net.neoforged.fml.ModLoadingContext
import net.neoforged.fml.config.ModConfig
import net.neoforged.neoforge.common.ModConfigSpec

object Config {
    private val builder = ModConfigSpec.Builder()
    val spec: ModConfigSpec = builder.build()

    init {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, spec)
    }}
