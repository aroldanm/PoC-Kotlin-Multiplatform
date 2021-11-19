package com.example.kmm_shows_demo.Modules.Shows.Data.Resources

import com.example.kmm_shows_demo.Utils.Mapper.MapperInterface
import com.example.kmm_shows_demo.Utils.Utils.guard
import com.example.kmm_shows_demo.Modules.Shows.Entities.Show

class ShowMapper: MapperInterface<ShowDto, Show> {
    override fun map(input: ShowDto): Show {
        guard(
            input.id,
            input.name,
            input.image?.medium
        )?.let { (id, name, image) ->
            return Show(
                id = id.toString(),
                name = name.toString(),
                image = image.toString(),
                rating = input.rating?.average ?: 0.0
            )
        }
        throw Exception("Failure when mapping data")
    }
}