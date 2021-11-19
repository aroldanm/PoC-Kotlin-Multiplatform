//
//  ShowsProtocols.swift
//  iOS-app
//
//  Created by Alan Roldán on 18/11/21.
//  Copyright © 2021 orgName. All rights reserved.
//

protocol ShowsViewModelProtocol: ViewModelProtocol {
    var isLoading: Bool { get }
    var isError: Bool { get }
    var model: [ShowListItemVo] { get }

    func onAppear()
}
