package io.github.serpro69.kfaker

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import com.fasterxml.jackson.module.kotlin.KotlinModule
import java.io.InputStream

internal object Mapper {
    private val mapper = ObjectMapper(YAMLFactory())

    init {
        mapper.registerModule(KotlinModule())
    }

    fun <T> readValue(inputStream: InputStream, type: Class<T>): T = mapper.readerFor(type).readValue(inputStream)
}
