//
//  Mapper.swift
//  iOS-app
//
//  Created by Alan Roldán on 19/11/21.
//  Copyright © 2021 orgName. All rights reserved.
//

public protocol MapperProtocol {
    associatedtype Input
    associatedtype Output

    static func map(_ input: Input) throws -> Output
    static func map(_ inputList: [Input]) -> [Output]
}

public extension MapperProtocol {
  static func map(_ inputList: [Input]) -> [Output] {
    inputList.compactMap {
      try? Self.map($0)
    }
  }
}
