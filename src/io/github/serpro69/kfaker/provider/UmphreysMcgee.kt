package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.FakerService
import io.github.serpro69.kfaker.dictionary.CategoryName
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [CategoryName.UMPHREYS_MCGEE] category.
 */
@Suppress("unused")
class UmphreysMcgee internal constructor(fakerService: FakerService) :
    AbstractFakeDataProvider<UmphreysMcgee>(fakerService) {
    override val categoryName = CategoryName.UMPHREYS_MCGEE
    override val localUniqueDataProvider = LocalUniqueDataProvider<UmphreysMcgee>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    fun song() = resolve("song")
}
