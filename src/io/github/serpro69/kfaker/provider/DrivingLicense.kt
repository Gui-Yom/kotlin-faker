package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.FakerService
import io.github.serpro69.kfaker.dictionary.CategoryName
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [CategoryName.DRIVING_LICENCE] category.
 */
@Suppress("unused")
class DrivingLicense internal constructor(fakerService: FakerService) :
    AbstractFakeDataProvider<DrivingLicense>(fakerService) {
    override val categoryName = CategoryName.DRIVING_LICENCE
    override val localUniqueDataProvider = LocalUniqueDataProvider<DrivingLicense>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    fun license() = with(fakerService) { resolve("usa", "").numerify().letterify() }
    fun licenseByState(state: String) = with(fakerService) { resolve("usa", state).numerify().letterify() }
}