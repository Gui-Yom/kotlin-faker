package io.github.sergio.igwt.kfaker.provider

import io.github.sergio.igwt.kfaker.Faker
import io.github.sergio.igwt.kfaker.FakerService
import io.github.sergio.igwt.kfaker.dictionary.CategoryName

/**
 * [FakeDataProvider] implementation for [CategoryName.FINANCE] category.
 */
class Finance internal constructor(fakerService: FakerService) : AbstractFakeDataProvider(fakerService) {
    override val categoryName = CategoryName.FINANCE

    val creditCard: (type: String) -> String = { type ->
        resolve { fakerService.resolve(Faker, it, "credit_card", type) }.invoke()
        TODO("Not implemented") //needs custom logic to resolve expressions
    }
    val vatNumber: (countryCode: String) -> String = { countryCode ->
        resolve { fakerService.resolve(Faker, it, "vat_number", countryCode) }.invoke()
        TODO("Not implemented") //needs custom logic to resolve expressions
    }
}