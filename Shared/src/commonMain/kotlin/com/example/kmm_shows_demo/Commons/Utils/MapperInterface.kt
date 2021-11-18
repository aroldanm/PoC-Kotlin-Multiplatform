package com.example.kmm_shows_demo.Commons.Mapper

interface MapperInterface<Input, Output> {
    fun map(input: Input): Output
}