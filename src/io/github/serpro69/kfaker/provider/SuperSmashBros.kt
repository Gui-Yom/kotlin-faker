package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.FakerService
import io.github.serpro69.kfaker.dictionary.CategoryName
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [CategoryName.GAMES] category.
 */
@Suppress("unused")
class SuperSmashBros internal constructor(fakerService: FakerService) :
    AbstractFakeDataProvider<SuperSmashBros>(fakerService) {
    override val categoryName = CategoryName.GAMES
    override val localUniqueDataProvider = LocalUniqueDataProvider<SuperSmashBros>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    fun fighter() = resolve("super_smash_bros", "fighter")
    fun stage() = resolve("super_smash_bros", "stage")
}
