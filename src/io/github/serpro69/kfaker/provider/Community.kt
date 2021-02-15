package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.FakerService
import io.github.serpro69.kfaker.dictionary.CategoryName
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [CategoryName.COMMUNITY] category.
 */
@Suppress("unused")
class Community internal constructor(fakerService: FakerService) : AbstractFakeDataProvider<Community>(fakerService) {
    override val categoryName = CategoryName.COMMUNITY
    override val localUniqueDataProvider = LocalUniqueDataProvider<Community>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    fun characters() = resolve("characters")
    fun quotes() = resolve("quotes")
}
