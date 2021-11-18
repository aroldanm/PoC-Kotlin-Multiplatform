package com.example.kmm_shows_demo.Modules.Shows.Data.Resources

import com.example.kmm_shows_demo.Commons.Mapper.MapperInterface
import com.example.kmm_shows_demo.Commons.Utils.guard
import com.example.kmm_shows_demo.Modules.Shows.Entities.Show

class ShowDtoMapper: MapperInterface<ShowDto, Show> {
    override fun map(input: ShowDto): Show {
        guard(input.id, input.name)?.let { (id, name) ->
            return Show(
                id = id.toString(),
                name = name.toString()
            )
        }
        throw Exception("Failure when mapping data")
    }
}