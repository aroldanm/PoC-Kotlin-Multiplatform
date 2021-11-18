package com.example.kmm_shows_demo.Modules.Shows.Data.Mappers

import com.example.kmm_shows_demo.Commons.Mapper.MapperInterface
import com.example.kmm_shows_demo.Commons.Utils.guard
import com.example.kmm_shows_demo.Modules.Shows.Data.Resources.ShowDto
import com.example.kmm_shows_demo.Modules.Shows.Entities.ShowDetail

class ShowDetailMapper: MapperInterface<ShowDto, ShowDetail> {
    override fun map(input: ShowDto): ShowDetail {
        guard(
            input.id,
            input.name,
            input.image?.original,
            input.summary
        )?.let { (id, name, image, summary) ->
            return ShowDetail(
                id = id.toString(),
                name = name.toString(),
                image = image.toString(),
                summary = summary.toString()
            )
        }
        throw Exception("Failure when mapping data")
    }
}