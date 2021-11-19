//
//  ShowsViewModel.swift
//  iOS-app
//
//  Created by Alan Roldán on 18/11/21.
//  Copyright © 2021 orgName. All rights reserved.
//

import Combine
import Shared

final class ShowsViewModel<
    BusinessLogic: ShowsBusinessLogic
>: ShowsViewModelProtocol {
    private let businessLogic: BusinessLogic
    
    // MARK: Observed Properties
    
    @Published private(set) var isLoading: Bool = false
    @Published private(set) var isError: Bool = false
    @Published private(set) var model: [ShowListItemVo] = []

    init(businessLogic: BusinessLogic) {
        self.businessLogic = businessLogic
    }

    // MARK: View Outputs
    
    func onAppear() {
        isLoading = true
    
        businessLogic.fetchList { [weak self] shows, error in
            self?.isLoading = false
            guard let shows = shows, error == nil else {
                self?.isError = true
                return
            }
            self?.isError = false
            self?.model = ShowListItemVoMapper.map(shows)
        }
    }
}
