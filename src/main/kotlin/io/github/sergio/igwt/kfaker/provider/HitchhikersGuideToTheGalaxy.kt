package io.github.sergio.igwt.kfaker.provider

import io.github.sergio.igwt.kfaker.Faker
import io.github.sergio.igwt.kfaker.FakerService
import io.github.sergio.igwt.kfaker.dictionary.CategoryName

/**
 * [FakeDataProvider] implementation for [CategoryName.HITCHHIKERS_GUIDE_TO_THE_GALAXY] category.
 */
class HitchhikersGuideToTheGalaxy internal constructor(
    fakerService: FakerService
) : AbstractFakeDataProvider(fakerService) {
    override val categoryName = CategoryName.HITCHHIKERS_GUIDE_TO_THE_GALAXY

    val characters = resolve { fakerService.resolve(Faker, it, "characters") }
    val locations = resolve { fakerService.resolve(Faker, it, "locations") }
    val marvinQuote = resolve { fakerService.resolve(Faker, it, "marvin_quote") }
    val planets = resolve { fakerService.resolve(Faker, it, "planets") }
    val quotes = resolve { fakerService.resolve(Faker, it, "quotes") }
    val species = resolve { fakerService.resolve(Faker, it, "species") }
    val starships = resolve { fakerService.resolve(Faker, it, "starships") }
}