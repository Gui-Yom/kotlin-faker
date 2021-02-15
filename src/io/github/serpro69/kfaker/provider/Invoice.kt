package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.FakerService
import io.github.serpro69.kfaker.dictionary.CategoryName
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [CategoryName.INVOICE] category.
 */
@Suppress("unused")
class Invoice internal constructor(fakerService: FakerService) : AbstractFakeDataProvider<Invoice>(fakerService) {
    override val categoryName = CategoryName.INVOICE
    override val localUniqueDataProvider = LocalUniqueDataProvider<Invoice>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    @Deprecated(level = DeprecationLevel.ERROR, message = "Not fully implemented")
    fun checkDigitMethod() = resolve("reference", "check_digit_method")

    @Deprecated(level = DeprecationLevel.ERROR, message = "Not fully implemented")
    fun pattern() = resolve("reference", "pattern")
}
