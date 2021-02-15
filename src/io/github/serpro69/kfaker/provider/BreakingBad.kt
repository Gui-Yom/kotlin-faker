package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.FakerService
import io.github.serpro69.kfaker.dictionary.CategoryName
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [CategoryName.BREAKING_BAD] category.
 */
@Suppress("unused")
class BreakingBad internal constructor(fakerService: FakerService) :
    AbstractFakeDataProvider<BreakingBad>(fakerService) {
    override val categoryName = CategoryName.BREAKING_BAD
    override val localUniqueDataProvider = LocalUniqueDataProvider<BreakingBad>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    fun character() = resolve("character")
    fun episode() = resolve("episode")
}
