package com.example.kmm_shows_demo.Utils.Mapper

interface MapperInterface<Input, Output> {
    fun map(input: Input): Output
}