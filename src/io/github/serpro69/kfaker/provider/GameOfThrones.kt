package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.FakerService
import io.github.serpro69.kfaker.dictionary.CategoryName
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [CategoryName.GAME_OF_THRONES] category.
 */
@Suppress("unused")
class GameOfThrones internal constructor(fakerService: FakerService) :
    AbstractFakeDataProvider<GameOfThrones>(fakerService) {
    override val categoryName = CategoryName.GAME_OF_THRONES
    override val localUniqueDataProvider = LocalUniqueDataProvider<GameOfThrones>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    fun characters() = resolve("characters")
    fun houses() = resolve("houses")
    fun cities() = resolve("cities")
    fun quotes() = resolve("quotes")
    fun dragons() = resolve("dragons")
}
