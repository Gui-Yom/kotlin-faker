package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.FakerService
import io.github.serpro69.kfaker.dictionary.CategoryName
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [CategoryName.BARCODE] category.
 */
@Suppress("unused")
class Barcode internal constructor(fakerService: FakerService) : AbstractFakeDataProvider<Barcode>(fakerService) {
    override val categoryName = CategoryName.BARCODE
    override val localUniqueDataProvider = LocalUniqueDataProvider<Barcode>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    fun ean8() = with(fakerService) { resolve("ean_8").numerify() }
    fun ean13() = with(fakerService) { resolve("ean_13").numerify() }
    fun upcA() = with(fakerService) { resolve("upc_a").numerify() }
    fun upcE() = with(fakerService) { resolve("upc_e").numerify() }
    fun compositeSymbol() = with(fakerService) { resolve("composite_symbol").numerify().letterify() }
    fun isbn() = with(fakerService) { resolve("isbn").numerify() }
    fun ismn() = with(fakerService) { resolve("ismn").numerify() }
    fun issn() = with(fakerService) { resolve("issn").numerify() }
}