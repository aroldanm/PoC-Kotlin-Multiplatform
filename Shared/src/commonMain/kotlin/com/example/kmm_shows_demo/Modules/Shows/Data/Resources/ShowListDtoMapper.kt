package com.example.kmm_shows_demo.Modules.Shows.Data.Resources

import com.example.kmm_shows_demo.Commons.Mapper.MapperInterface
import com.example.kmm_shows_demo.Modules.Shows.Entities.Show

class ShowListDtoMapper: MapperInterface<List<ShowDto>, List<Show>> {
    override fun map(input: List<ShowDto>): List<Show> {
        return input.map {
            ShowDtoMapper().map(it)
        }
    }
}