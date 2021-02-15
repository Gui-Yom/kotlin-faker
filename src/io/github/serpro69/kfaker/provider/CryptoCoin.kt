package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.FakerService
import io.github.serpro69.kfaker.dictionary.CategoryName
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [CategoryName.CRYPTO_COIN] category.
 */
@Suppress("unused")
class CryptoCoin internal constructor(fakerService: FakerService) : AbstractFakeDataProvider<CryptoCoin>(fakerService) {
    override val categoryName = CategoryName.CRYPTO_COIN
    override val localUniqueDataProvider = LocalUniqueDataProvider<CryptoCoin>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    fun coin() = resolve("coin")
}
