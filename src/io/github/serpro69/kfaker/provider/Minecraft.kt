package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.FakerService
import io.github.serpro69.kfaker.dictionary.CategoryName
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [CategoryName.GAMES] category.
 */
@Suppress("unused")
class Minecraft internal constructor(fakerService: FakerService) : AbstractFakeDataProvider<Minecraft>(fakerService) {
    override val categoryName = CategoryName.GAMES
    override val localUniqueDataProvider = LocalUniqueDataProvider<Minecraft>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    fun blocks() = resolve("minecraft", "blocks")
    fun items() = resolve("minecraft", "items")
    fun mobs() = resolve("minecraft", "mobs")
}