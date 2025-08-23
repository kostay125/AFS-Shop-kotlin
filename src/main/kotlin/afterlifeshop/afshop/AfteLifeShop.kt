package afterlifeshop.afshop

import net.neoforged.fml.common.Mod
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent

@Mod(AfteLifeShop.MOD_ID)
object AfteLifeShop {
    const val MOD_ID = "aftelifeshop"

    init {
        // Регистрируем события
        val bus = FMLJavaModLoadingContext.get().modEventBus
        bus.addListener(::onClientSetup)

        println("AfteLifeShop мод инициализирован на Kotlin!")
    }

    private fun onClientSetup(event: FMLClientSetupEvent) {
        println("Клиентская часть мода AfteLifeShop загружена.")
    }
}
