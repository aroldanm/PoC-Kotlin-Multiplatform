//
//  ShowListItemVoMapper.swift
//  iOS-app
//
//  Created by Alan Roldán on 19/11/21.
//  Copyright © 2021 orgName. All rights reserved.
//

import Shared

struct ShowListItemVoMapper: MapperProtocol {
    typealias Input = Show
    typealias Output = ShowListItemVo

    static func map(_ input: Show) throws -> ShowListItemVo {
        .init(name: input.name,
              imageUrl: URL(string: input.image),
              rating: Float(input.rating * 5 / 10))
    }
}
