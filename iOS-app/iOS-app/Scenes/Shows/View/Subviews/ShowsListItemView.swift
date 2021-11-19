//
//  ShowsListItemView.swift
//  iOS-app
//
//  Created by Alan Roldán on 19/11/21.
//  Copyright © 2021 orgName. All rights reserved.
//

import Kingfisher
import SwiftUI

struct ShowsListItemView: View {
    var item: ShowListItemVo

    var body: some View {
        HStack {
            KFImage.url(item.imageUrl)
                .resizable()
                .frame(width: Constants.imageSize.width,
                       height: Constants.imageSize.height)
                .padding(Constants.imageInsets)
            VStack(alignment: .leading) {
                Text(item.name)
                    .multilineTextAlignment(.leading)
                    .font(.title3)
                ratingView
            }
            
        }
    }
}

private extension ShowsListItemView {
    func assetName(by index: Int) -> String {
        let integerRating = Int(item.rating)
        let floatRating = item.rating

        if index <= integerRating {
            if index == integerRating, floatRating > Float(integerRating) {
                return Constants.starMiddle
            } else {
                return Constants.starFill
            }
        } else {
            return Constants.star
        }
    }

    var ratingView: some View {
        HStack {
            ForEach(0..<5) { index in
                Image(uiImage: UIImage(systemName: assetName(by: index))!)
                    .resizable()
                    .renderingMode(.template)
                    .scaledToFit()
                    .frame(width: Constants.startSize, height: Constants.startSize)
            }
            Text("\(String(format: "%.2f", item.rating))")
                .font(.footnote)
        }
    }
}

private extension ShowsListItemView {
    enum Constants {
        static let imageInsets = EdgeInsets(top: 10, leading: 0, bottom: 10, trailing: 12)
        static let textRightSpacing: CGFloat = 20
        static let imageSize = CGSize(width: 100, height: 150)
        static let star = "star"
        static let starFill = "star.fill"
        static let starMiddle = "star.lefthalf.fill"
        static let startSize: CGFloat = 15
    }
}
