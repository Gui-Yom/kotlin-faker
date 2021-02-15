package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.FakerService
import io.github.serpro69.kfaker.dictionary.CategoryName
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [CategoryName.COIN] category.
 */
@Suppress("unused")
class Coin internal constructor(fakerService: FakerService) : AbstractFakeDataProvider<Coin>(fakerService) {
    override val categoryName = CategoryName.COIN
    override val localUniqueDataProvider = LocalUniqueDataProvider<Coin>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    fun flip() = resolve("flip")
}
