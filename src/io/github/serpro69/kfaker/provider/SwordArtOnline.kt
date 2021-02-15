package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.FakerService
import io.github.serpro69.kfaker.dictionary.CategoryName
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [CategoryName.SWORD_ART_ONLINE] category.
 */
@Suppress("unused")
class SwordArtOnline internal constructor(fakerService: FakerService) :
    AbstractFakeDataProvider<SwordArtOnline>(fakerService) {
    override val categoryName = CategoryName.SWORD_ART_ONLINE
    override val localUniqueDataProvider = LocalUniqueDataProvider<SwordArtOnline>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    fun realName() = resolve("real_name")
    fun gameName() = resolve("game_name")
    fun location() = resolve("location")
    fun item() = resolve("item")
}
