//
//  ShowsListView.swift
//  iOS-app
//
//  Created by Alan Roldán on 18/11/21.
//  Copyright © 2021 orgName. All rights reserved.
//

import SwiftUI

struct ShowsListView<
    ViewModel: ShowsViewModelProtocol
>: View {
    @ObservedObject private(set) var viewModel: ViewModel

    var body: some View {
        NavigationView {
            contentView
                .onAppear {
                    viewModel.onAppear()
                }
                .navigationBarTitle(Constants.title)
        }
    }
}

// MARK: - Content View
private extension ShowsListView {
    var contentView: some View {
        ShowsListContentView(isLoading: viewModel.isLoading,
                             isError: viewModel.isError,
                             model: viewModel.model)
    }
}

private extension ShowsListView {
    enum Constants {
        static var title: String {
            "Shows list"
        }
    }
}
