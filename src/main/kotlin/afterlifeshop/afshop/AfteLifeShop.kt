package afterlifeshop.afshop

import net.neoforged.bus.api.IEventBus
import net.neoforged.fml.common.Mod
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent

@Mod(AfteLifeShop.MOD_ID)
class AfteLifeShop(modEventBus: IEventBus) {

    init {
        // подписка на события
        modEventBus.addListener(::onClientSetup)

        println("AfteLifeShop Kotlin мод загружен (NeoForge)!")
    }

    private fun onClientSetup(event: FMLClientSetupEvent) {
        println("Клиентская часть AfteLifeShop инициализирована.")
    }

    companion object {
        const val MOD_ID = "aftelifeshop"
    }
}
