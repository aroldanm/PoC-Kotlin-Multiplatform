//
//  ShowsResolver.swift
//  iOS-app
//
//  Created by Alan Roldán on 18/11/21.
//  Copyright © 2021 orgName. All rights reserved.
//

import Shared
import SwiftUI

struct ShowsResolver: SceneResolver {
    var view: AnyView {
        ShowsListView(viewModel: resolve()).asAnyView
    }
}

private extension ShowsResolver {
    func resolve() -> ShowsViewModel<ShowsBusinessLogic> {
        ShowsViewModel(businessLogic: resolve())
    }

    func resolve() -> ShowsBusinessLogic {
        SharedModules().resolve()
    }
}
