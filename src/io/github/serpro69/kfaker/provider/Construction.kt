package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.FakerService
import io.github.serpro69.kfaker.dictionary.CategoryName
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [CategoryName.CONSTRUCTION] category.
 */
@Suppress("unused")
class Construction internal constructor(fakerService: FakerService) :
    AbstractFakeDataProvider<Construction>(fakerService) {
    override val categoryName = CategoryName.CONSTRUCTION
    override val localUniqueDataProvider = LocalUniqueDataProvider<Construction>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    fun materials() = resolve("materials")
}
