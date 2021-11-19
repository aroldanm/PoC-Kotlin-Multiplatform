//
//  ShowsListContentView.swift
//  iOS-app
//
//  Created by Alan Roldán on 19/11/21.
//  Copyright © 2021 orgName. All rights reserved.
//

import SwiftUI

struct ShowsListContentView: View {
    var isLoading: Bool
    var isError: Bool
    var model: [ShowListItemVo]

    var body: some View {
        ZStack {
            listView
            if model.isEmpty {
                if isLoading {
                    loadingView
                } else if isError {
                    errorView
                } else {
                    emptyView
                }
            }
        }
    }
}

private extension ShowsListContentView {
    var listView: some View {
        List {
            ForEach(model.indices, id: \.self) { index in
                let item = model[index]
                ShowsListItemView(item: item)
            }
        }
        .listStyle(InsetGroupedListStyle())
    }

    var emptyView: some View {
        Text(Constants.emptyMessage)
            .multilineTextAlignment(.center)
    }

    var errorView: some View {
        Text(Constants.errorMessage)
            .multilineTextAlignment(.center)
    }

    var loadingView: some View {
        ProgressView()
    }
}

private extension ShowsListContentView {
    enum Constants {
        static var emptyMessage: String {
            "This list is empty"
        }
        static var errorMessage: String {
            "Ops! an error has occurred.\nTry again later"
        }
    }
}
